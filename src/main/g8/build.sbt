lazy val root = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    organization := "$organization$",
    name := "$name$",
    version := "$version$",
    versionScheme := Some("$version-scheme$"),

    scalaVersion := "3.1.2",
  )
  .jsSettings(
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "shaka" % "0.5.0"
    )
  )
  .jvmSettings(
    
  )
