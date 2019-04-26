import Dependencies._

addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.0")

ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val `hangman` = (project in file("."))
  .settings(
    inThisBuild(Seq(
      organization := "alandevlin",
      scalaVersion := "2.12.8",
    )),
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-zio" % "1.0-RC4",
      "org.scalaz" %% "scalaz-core" % "7.2.27",
      scalaTest % Test
    )
  )
