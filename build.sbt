name := "lucene4s"
organization := "com.outr"
version := "1.2.0-SNAPSHOT"
scalaVersion := "2.11.8"
sbtVersion := "0.13.11"
parallelExecution in Test := false
fork := true

libraryDependencies += "com.outr.scribe" %% "scribe-slf4j" % "1.2.5"

libraryDependencies += "org.apache.lucene" % "lucene-core" % "6.3.0"
libraryDependencies += "org.apache.lucene" % "lucene-analyzers-common" % "6.3.0"
libraryDependencies += "org.apache.lucene" % "lucene-queryparser" % "6.3.0"
libraryDependencies += "org.apache.lucene" % "lucene-facet" % "6.3.0"
libraryDependencies += "org.apache.lucene" % "lucene-highlighter" % "6.3.0"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.11"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oF")