lazy val root = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    organization := "$organization$",
    name := "$name$",
    version := "$version$",
    versionScheme := Some("$version-scheme$"),

    scalaVersion := "3.0.0-RC1",
    scalacOptions ++= Seq(
      "-Ycheck-init",
      "-Yindent-colons"
    )
  )
  .jsSettings(
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "shaka" % "0.2.0",
      "org.getshaka" %%% "native-converter" % "0.4.0"
    )
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "io.vertx" % "vertx-web" % "4.0.3"
    )
  )