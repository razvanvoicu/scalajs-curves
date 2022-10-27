ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scalajs-curves",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.2.0"
    ),
    scalaJSUseMainModuleInitializer := true,
    mainClass := Some("CurveDemo")
  )
