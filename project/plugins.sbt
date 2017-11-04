
lazy val root = (project in file(".")).dependsOn(gitFlowPlugin)

lazy val gitFlowPlugin = RootProject(file("../sbt-gitflow").toURI)

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")
