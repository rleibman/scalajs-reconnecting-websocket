enablePlugins(ScalaJSPlugin)

name := "reconnecting-websocket"

organization := "net.leibman"

scalaVersion := "2.11.8"

version := "1.0.1"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"  withSources()

scalaJSStage in Global := FastOptStage

persistLauncher in Compile := true

artifactPath in (Compile, fastOptJS) := ((crossTarget in (Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

import SonatypeKeys._

sonatypeSettings

publishMavenStyle := true

scmInfo := Some(ScmInfo(
    url("https://github.com/rleibman/scalajs-reconnecting-websocket"),
    "scm:git:git@github.com/rleibman/scalajs-reconnecting-websocket.git",
    Some("scm:git:git@github.com/rleibman/scalajs-reconnecting-websocket.git")))

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>rleibman</id>
      <name>Roberto Leibman</name>
      <url>https://github.com/rleibman</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }  