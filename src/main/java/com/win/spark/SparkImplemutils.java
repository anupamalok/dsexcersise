package com.win.spark;

import java.util.List;
import java.util.ArrayList;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.sql.AnalysisException;
import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import static org.apache.spark.sql.functions.broadcast;

public class SparkImplemutils {
	
	SparkSession spark;
	JavaSparkContext jsc;
	JavaRDD jRdd;
	public SparkImplemutils(SparkSession sp, JavaSparkContext jsc){
		spark = sp;
		this.jsc = jsc;
		jRdd = jsc.textFile("C:\\Work\\Spark\\emp.json");
	}

	public void readJson(){
		jRdd.foreach(item -> {
            System.out.println(item); 
        });
	}
	
	public void readJsonwithSql(){
		Dataset<Row> ds = spark.read().option("allowUnquotedFieldNames", "true").json("C:\\Work\\json\\jsonfile.json");
		ds.printSchema();
		//Read A nested Json we have to use . for that 
		ds.select(functions.explode(ds.col("ActivityLogs.LogEntry")).as("Temp")).show();
		}
	
	public void reverseString(){
		List<String> a=new ArrayList<String>();
		a.add("new");
		JavaRDD jd = jsc.parallelize(a);
		jd.map(new Function<List, String>() {

			@Override
			public String call(List arg0) throws Exception {
				arg0.get(0);
				//String Reverse Logic
				return null;
			}
		});
	}
	
	public void providemeBestOffer() throws AnalysisException{
		String schemaStringStructType = "cno name cat\n";
		Dataset<Row> ds2 = spark.read().option("header", "true").option("delimiter", " ").csv("C:\\Person\\Learn\\Datasets\\transation.txt");
		List<StructField> fields = new ArrayList<>();
        for (String fieldName : schemaStringStructType.split(" ")) {
            StructField field = DataTypes.createStructField(fieldName, DataTypes.StringType, true);
            fields.add(field);
        }
        StructType schema = DataTypes.createStructType(fields);
        Dataset<Row> ds1 = spark.read().option("header", "true").option("delimiter", " ").csv("C:\\Person\\Learn\\Datasets\\cardDetail.txt");
        Dataset<Row> newDs = ds1.join(broadcast(ds2)).where(ds1.col("cno").equalTo(ds2.col("cno")));
        ds1.createTempView("cust");
        ds2.createTempView("transaction");
        newDs.sqlContext().sql("select t.cno, sum(t.amount) from transaction as t inner join cust as c on t.cno = c.cno group by t.cno").show();;
        
	}
	
	public void connectToPostgres(){
		List<String> lst=new ArrayList<>();
		lst.add("student");
		lst.add("details");
		lst.add("marks");
		Dataset<Row> jdbcDF = spark.read()
				  .format("jdbc")
				  .option("url", "jdbc:postgresql://localhost:58805/")
				  .option("dbtable", "student")
				  .option("dbTable", "details")
				  .option("dbTable", "marks")
				  .option("user", "anupam")
				  .option("password", "anupam")
				  .load()
				  ;
		System.out.println("Connected"+ jdbcDF.count());
		jdbcDF.printSchema();
	}
	
	public void selectExpr(){
		//spark.
	}
}
