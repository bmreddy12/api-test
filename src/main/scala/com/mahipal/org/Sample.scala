package com.mahipal.org

import org.apache.spark.{SparkConf, SparkContext}

object Sample {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("DemoOne")
    val sc = new SparkContext(conf)



  }

}
