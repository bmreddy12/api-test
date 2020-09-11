package com.mahipal.org

import org.apache.spark.{SparkConf, SparkContext}
import java.util.Collections
object Sample {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("DemoOne")
    val sc = new SparkContext(conf)
    val li = sc.parallelize(Seq(1,2,5,3))
    println(li.count())
    println(li.first())



  }

}
