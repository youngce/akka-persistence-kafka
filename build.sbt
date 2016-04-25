organization := "com.github.krasserm"

name := "akka-persistence-kafka"

version := "0.5-ad2f6df24dd76def58d255203befaed71732625c"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.6")

scalacOptions += "-target:jvm-1.7"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

resolvers += "krasserm at bintray" at "http://dl.bintray.com/krasserm/maven"

parallelExecution in Test := false

publishArtifact in Test := true

libraryDependencies ++= Seq(
  "com.google.protobuf"  % "protobuf-java"                 % "2.5.0",
  "com.typesafe.akka"   %% "akka-persistence"              % "2.4.0",
  "com.typesafe.akka"   %% "akka-persistence-tck"          % "2.4.0" % Test,
  "com.typesafe.akka"   %% "akka-testkit"                  % "2.4.0" % Test,
  "commons-io"           % "commons-io"                    % "2.4"      % Test,
  "org.apache.kafka"    %% "kafka"                         % "0.8.2.1",
  "org.apache.curator"   % "curator-test"                  % "2.7.1"    % Test,
  "org.slf4j" 		 % "slf4j-log4j12" 		   % "1.7.21"	% Test,
  "com.typesafe.akka" 	%% "akka-slf4j" 		   % "2.4.0"	% Test
)

publishTo := Some("Bintray API Realm" at "https://api.bintray.com/maven/worldline-messaging-org/maven/akka-persistence-kafka")
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
