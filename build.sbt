organization := "org.yourorganization"

name := "liftfromscratch"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.3"

libraryDependencies ++= {
  val liftVersion = "3.1.0"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile",
    "org.eclipse.jetty" % "jetty-webapp" % "9.4.7.v20170914"  %
      "container,test",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" %
      "container,compile" artifacts Artifact("javax.servlet", "jar", "jar")
  )
}

enablePlugins(JettyPlugin)
