package com.win.spark;

import java.util.Arrays;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.streaming.Seconds;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import scala.Tuple2;
public class SparkStreaming {
	public SparkConf sc;
	JavaStreamingContext  ssc;
	public SparkStreaming() throws InterruptedException{
		sc = new SparkConf().setAppName("streaming").setMaster("local[*]");
		//sContext = new SparkContext(sc);
		ssc= new JavaStreamingContext (sc, Seconds.apply(3));
		JavaReceiverInputDStream<String> jrdd= ssc.socketTextStream("127.0.0.1", 2222);
		JavaDStream<String> words = jrdd.flatMap( str -> Arrays.asList(str.split(" ")).iterator());
		JavaPairDStream<String, Integer> j=words.mapToPair(word -> new Tuple2<>(word, 1)).reduceByKey((a, b) -> a + b);
		ssc.start();
		ssc.awaitTermination();
		words.print();
	}
	
	public static void main(String args[]) throws InterruptedException{
		new SparkStreaming();
		
	}
}
