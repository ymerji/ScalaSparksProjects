package org.yus.ScalaSparkProjects
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Main {
  
  def main(args:Array[String]) = {
    
    
    val conf = new SparkConf().setAppName("HelloSpark").setMaster("local")
    val sc  = new SparkContext(conf)
    val hellostr = sc.parallelize(Array("Hello","World"), 2)
    hellostr.saveAsTextFile("hdfs://quickstart.cloudera:8020/tmp/HelloSpark.txt")
    
    
  }
  
}
