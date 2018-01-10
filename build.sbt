name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "1.0.0-RC7",
  "io.kamon" %% "kamon-akka-2.5" % "1.0.0-RC7",
  "io.kamon" %% "kamon-prometheus" % "1.0.0-RC7",
  "io.kamon" %% "kamon-zipkin" % "1.0.0-RC7"
)
