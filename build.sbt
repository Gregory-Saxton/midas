name := "midas"

version := "0.1"

scalaVersion := "2.13.8"

//https://stackoverflow.com/questions/55753141/intellij-exception-in-thread-main-java-lang-noclassdeffounderror-org-apache
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "3.3.0",
                            "org.apache.spark" %% "spark-sql" % "3.3.0"
)