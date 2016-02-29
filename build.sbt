sbtPlugin := true

organization := "com.typesafe.sbt"

name := "sbt-coffeescript"

version := "1.0.1-SNAPSHOT"

scalaVersion := "2.10.4"

scalacOptions += "-feature"

libraryDependencies ++= Seq(
  "org.webjars" % "coffee-script-node" % "1.10.0",
  "org.webjars" % "mkdirp" % "0.5.0"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-js-engine" % "1.1.3")

publishMavenStyle := false

publishTo := {
  if (isSnapshot.value) Some(Classpaths.sbtPluginSnapshots)
  else Some(Classpaths.sbtPluginReleases)
}

scriptedSettings

scriptedLaunchOpts <+= version apply { v => s"-Dproject.version=$v" }
