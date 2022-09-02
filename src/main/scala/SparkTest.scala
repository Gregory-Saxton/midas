
import org.apache.spark.sql.SparkSession

/*
Problems compiling due to issues with Java 17 support being new
https://stackoverflow.com/questions/73465937/spark-3-3-0-breaks-on-java-17-with-cannot-access-class-sun-nio-ch-directbuffer
*/

object SparkTest {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val ss = SparkSession
      .builder()
      .appName("Spark Test")
      .master("local[*]")
      .getOrCreate()

    ss.sparkContext.setLogLevel("ERROR")

    val tech_names_list = List("spark1", "spark2", "spark3", "hadoop1", "hadoop2", "spark4")
    val names_rdd = ss.sparkContext.parallelize(tech_names_list, 3)
    val names_upper_case_rdd = names_rdd.map(ele => ele.toUpperCase())
    names_upper_case_rdd.collect().foreach(println)

    ss.stop()
    println("Completed")
  }

}
