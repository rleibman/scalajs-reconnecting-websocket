enablePlugins(ScalaJSPlugin)

name := "reconnecting-websocket"

organization := "net.leibman"

scalaVersion := "2.11.8"

version := "1.0.0"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"  withSources()

scalaJSStage in Global := FastOptStage

persistLauncher in Compile := true

artifactPath in (Compile, fastOptJS) := ((crossTarget in (Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))
