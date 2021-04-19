package com.win.spark;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.apache.orc.OrcProto.Metadata;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.api.java.function.VoidFunction2;
import org.apache.spark.sql.AnalysisException;
import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.catalog.Function;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import scala.Function1;
import scala.Tuple2;

public class SparkComp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2316005686786586276L;
	static JavaSparkContext jSpark;
	static SparkSession ss;
	public static void main(String args[]) throws AnalysisException{
		new SparkComp();
		SparkImplemutils spI = new SparkImplemutils(ss, jSpark);
		//spI.readJson();
		//spI.connectToPostgres();
		//spI.readJsonwithSql();
		spI.providemeBestOffer();
		//new SparkComp().operation();
	}

	public SparkComp(){
		ss = SparkSession.builder().master("local[*]").getOrCreate();
		jSpark = JavaSparkContext.fromSparkContext(ss.sparkContext());
		/*SparkConf spark=new SparkConf().setAppName("Reading").setMaster("local[*]");
		jSpark= new JavaSparkContext(spark); */
		
	}
	
	public void operation(){
		String schemaString="timeStamp thread level className message";
		StructType rfSchema = new StructType(new StructField[]{
				new StructField("timeStamp", DataTypes.TimestampType, false, org.apache.spark.sql.types.Metadata.empty()),
				new StructField("thread", DataTypes.StringType, false, org.apache.spark.sql.types.Metadata.empty()),
				new StructField("level", DataTypes.StringType, false, org.apache.spark.sql.types.Metadata.empty()),
				new StructField("className", DataTypes.StringType, false, org.apache.spark.sql.types.Metadata.empty()),
				new StructField("message", DataTypes.StringType, false, org.apache.spark.sql.types.Metadata.empty())
		});
		/*JavaRDD<String> jrdd = jSpark.textFile("C:\\Work\\files.txt");
		JavaPairRDD<String, Integer> j = jrdd.flatMap(s -> Arrays.asList(s.split(" ")[3]).iterator()).mapToPair(word -> new Tuple2<>(word, 1))
	    .reduceByKey((a, b) -> a + b);;
	    System.out.println(j.collect());*/
		List l=new ArrayList<>();
		l.add(1);
		l.add(2);
		JavaRDD<String> jrdd=jSpark.parallelize(l);
		jrdd.map(s->s+5).collect();
		String schemaStringStructType ="LogType Version Mode StartTime ServiceTag $.ActivityLogs.LineNo";
		 List<StructField> fields = new ArrayList<>();
	        for (String fieldName : schemaStringStructType.split(" ")) {
	            StructField field = DataTypes.createStructField(fieldName, DataTypes.StringType, true);
	            fields.add(field);
	        }
	        StructType schema = DataTypes.createStructType(fields);
	        Dataset<String> das2 = ss.read().textFile("C:\\Work\\files.txt");
	   Dataset<String> das1 = ss.read().textFile("C:\\Work\\files.txt");
	   das1.withColumn("word",functions.split(das1.col("value")," ")).groupBy("word").count().sort(functions.asc("word")).show();
	   das1.select(functions.sum(das1.col("value"))).collect();
	   das1.join(das2);
	   
	  // Dataset<Row>  ds1=ss.read().json("C:\\Work\\json\\jsonfile.json");
	   //textFile("C:\\Work\\files.txt");
	  // ds1.printSchema();; 
	   //Dataset<Row> ds= ds1.withColumn("PotentialRecoveryInMB",  functions.explode(ds1.col("Result")));
	   //ds.show();
	  // Dataset<Row> ds = ds1.select(org.apache.spark.sql.functions.explode(ds1.col("Details")).as("pos"));
	  // ds.show();;
	  // ds.printSchema();
	   
	  // ds.select(ds.col("AvailableCount:"),ds.col("Description:"),ds.col("ID"),ds.col("PotentialRecoveryInMB"),ds.col("ReclaimedInMB"),ds.col("SuccessCount")).show();;
	  
	   //ds1.select(ds1.col("ActivityLogs"));
	  // ds1.select(functions.get_json_object(ds1.col("Result",), "$.Result.PotentialRecoveryInMB").cast(DataTypes.StringType));
	   
	}
	
	
}
