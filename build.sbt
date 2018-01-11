
name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.4.19"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "1.0.0-RC7",
  "io.kamon" %% "kamon-akka-2.4" % "1.0.0-RC7",
  "io.kamon" %% "kamon-jmx" % "0.6.7",
  "io.kamon" %% "kamon-prometheus" % "1.0.0-RC7"
  // "io.kamon" %% "kamon-zipkin" % "1.0.0-RC7"
)

// enablePlugins(JavaAppPackaging)

lazy val root = (project in file(".")).enablePlugins(JavaAppPackaging, JavaAgent) // (1)
javaAgents += "org.aspectj" % "aspectjweaver" % "1.8.13" // (2)
javaOptions in Universal += "-Dorg.aspectj.tracing.factory=default" // (3)

enablePlugins(DockerPlugin)
dockerExposedPorts := Seq(9000, 9095)
