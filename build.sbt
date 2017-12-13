organization := "com.github.krasserm"

name := "akka-persistence-kafka"

version := "0.7-SNAPSHOT"

scalaVersion := "2.12.3"

crossScalaVersions := Seq("2.12.3")

resolvers += "krasserm at bintray" at "http://dl.bintray.com/krasserm/maven"

parallelExecution in Test := false

publishArtifact in Test := true

val AKKA_VERSION="2.5.8"
val KAFKA_VERSION="1.0.0"
libraryDependencies ++= Seq(
  "com.google.protobuf"    % "protobuf-java"          % "3.5.0",
  "com.typesafe.akka"     %% "akka-persistence"       % AKKA_VERSION,
  "com.typesafe.akka"     %% "akka-persistence-tck"   % AKKA_VERSION    % Test,
  "com.typesafe.akka"     %% "akka-testkit"           % AKKA_VERSION    % Test,
  "org.apache.kafka"      %% "kafka"                  % KAFKA_VERSION,
  "org.apache.kafka"      %% "kafka"                  % KAFKA_VERSION   % Test classifier "test",
  "org.apache.kafka"       % "kafka-clients"          % KAFKA_VERSION,
  "org.apache.kafka"       % "kafka-clients"          % KAFKA_VERSION   % Test classifier "test",
  "org.apache.curator"     % "curator-test"           % "4.0.0"         % Test,
  "org.slf4j" 		          % "slf4j-log4j12" 		      % "1.7.25"	       % Test,
  "com.typesafe.akka"     %% "akka-slf4j" 		          % AKKA_VERSION	   % Test
)

/*artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  val lastCommit = git.gitHeadCommit.value
  val suffix = {
    if (module.revision.trim.endsWith("-SNAPSHOT") && lastCommit.isDefined)
      s"${module.revision.split('-')(0)}-${lastCommit.get}"
    else module.revision
  }

  artifact.name + "_" + sv.binary + "-" + suffix + "." + artifact.extension
}*/

publishTo := Some("Bintray API Realm" at "https://api.bintray.com/maven/worldline-messaging-org/maven/akka-persistence-kafka")
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
