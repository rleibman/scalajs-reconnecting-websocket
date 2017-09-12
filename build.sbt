
name := "reconnecting-websocket"

organization := "net.leibman"

scalaVersion := "2.12.2"

version := "1.1.0"

libraryDependencies += "org.scala-js" % "scalajs-dom_sjs0.6_2.12" % "0.9.3"

enablePlugins(ScalaJSPlugin)

scalaJSStage in Global := FastOptStage

scalaJSUseMainModuleInitializer in Compile := true

artifactPath in (Compile, fastOptJS) := ((crossTarget in (Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

publishMavenStyle := true

homepage := Some(url("https://github.com/rleibman/scalajs-reconnecting-websocket"))

licenses := Seq("MIT" -> url("https://github.com/rleibman/scalajs-reconnecting-websocket/blob/master/LICENSE"))

scmInfo := Some(ScmInfo(
    url("https://github.com/rleibman/scalajs-reconnecting-websocket"),
    "scm:git:git@github.com/rleibman/scalajs-reconnecting-websocket.git",
    Some("scm:git:git@github.com/rleibman/scalajs-reconnecting-websocket.git")))

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

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
