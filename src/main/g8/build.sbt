lazy val root = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    organization := "$organization$",
    name := "$name$",
    version := "$version$",
    versionScheme := Some("$version-scheme$"),

    scalaVersion := "3.3.0",
  )
  .jsSettings(
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "shaka" % "0.6.0"
    )
  )
  .jvmSettings(
    // just stubs so that `derives NativeConverter` works in `shared` directory
    libraryDependencies ++= Seq(
      "org.getshaka" %% "native-converter" % "0.9.0"
    )
  )
