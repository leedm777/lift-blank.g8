name := "$name$"

version := "0.0.1"

organization := "$package$"

scalaVersion := "2.10.0"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

seq(com.github.siasia.WebPlugin.webSettings :_*)

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "$lift_version$"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile",
    "net.liftmodules"   %% "lift-jquery-module" % (liftVersion + "-2.1"),
    "org.eclipse.jetty" % "jetty-webapp"        % "9.0.0.M5"         % "container; test",
    "ch.qos.logback"    % "logback-classic"     % "1.0.9",
    "org.specs2"        %% "specs2"             % "1.11"             % "test"
  )
}
