import Library.{Test, LogBack}

lazy val root = (project in file("."))

name := "CtCI-6Th"

version := "0.1"

libraryDependencies ++= Seq(
  LogBack.logbackclassic,
  Test.scalaTest
)

//scalaVersion := Version.Scala
scalaVersion := Version.Scala