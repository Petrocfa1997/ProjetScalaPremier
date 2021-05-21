import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {
  def sessionSpark(): Unit = {
    //.enableHiveSupport()
    System.setProperty("hadoop.home.dir","C:\\hadoop")
    val ss = SparkSession.builder()
      .master("local[*]")
      .appName("MaPremierApplicationSpark")
      .getOrCreate()

    val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application spark. Je suis un etudiant de l'INP HB heureux"))
    rdd1.foreach(l=>println(l))
    val df_1 = ss.read
      .format("csv")
      .option("inferSchema","true")
      .option("header","true")
      .option("delimiter",";")
      .csv("E:\\dossier cours\\semestre 2\\HADOOP\\orders_csv.csv")
    df_1.show(18)
    df_1.printSchema()
    df_1.createOrReplaceTempView("orders")
    ss.sql("SELECT * FROM orders WHERE city = 'NEWTON'").show()//.explain pour connaitre le plan d'execution

  }

  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
}
