// give the user a nice default project!
ThisBuild / organization := "com.openelectrons"
ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  settings(
    name := "openelectrons-optimizer",
    // The two lines below are used to generate header license copyright text information
    startYear := Some(2021),
    licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt")),
    libraryDependencies ++= Seq(
      "com.github.vagmcs" %% "optimus" % "3.4.3",
      "com.github.vagmcs" %% "optimus-solver-oj" % "3.4.3",
      "com.github.vagmcs" %% "optimus-solver-lp" % "3.4.3"
    )
  )
