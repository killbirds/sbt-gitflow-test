
lazy val root = (project in file(".")).dependsOn(gitFlowPlugin)

//lazy val gitFlowPlugin = RootProject(file("../sbt-gitflow").toURI)
lazy val gitFlowPlugin = RootProject(uri("https://github.com/killbirds/sbt-gitflow.git"))

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")
