// give the user a nice default project!
ThisBuild / organization := "com.openelectrons"
ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  settings(
    name := "openelectrons-scala-template",
    libraryDependencies ++= Seq(
      "com.github.vagmcs" %% "optimus" % "3.4.3",
      "com.github.vagmcs" %% "optimus-solver-oj" % "3.4.3",
      "com.github.vagmcs" %% "optimus-solver-lp" % "3.4.3"
    )
  )
