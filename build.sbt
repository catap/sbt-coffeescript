sbtPlugin := true

organization := "com.typesafe.sbt"

name := "sbt-coffeescript"

version := "1.0.1"

scalaVersion := "2.10.6"

scalacOptions += "-feature"

libraryDependencies ++= Seq(
  "org.webjars" % "coffee-script-node" % "1.10.0",
  "org.webjars" % "mkdirp" % "0.5.0"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-js-engine" % "1.1.3")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization in bintray := None

scriptedSettings

scriptedLaunchOpts <+= version apply { v => s"-Dproject.version=$v" }
