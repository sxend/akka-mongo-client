import bintray.Keys._

organization := "arimitsu.sf"

name := "akka-mongo-client"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.2")

resolvers += "sxend repo releases" at "http://dl.bintray.com/sxend/releases"

resolvers += "sxend repo snapshots" at "http://dl.bintray.com/sxend/snapshots"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
	"org.mongodb" % "mongo-java-driver" % "3.0.0-beta3",
	"com.typesafe.akka" %% "akka-actor" % "2.3.9"
)

publishMavenStyle := true

Seq(bintraySettings: _*)

repository in bintray := {
  if (version.value.matches("^[0-9]\\.[0-9]*\\.[0-9]*$")) "releases" else "snapshots"
}

// licenses +=("MIT", url("http://opensource.org/licenses/MIT"))
