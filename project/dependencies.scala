object Version {
  final val Scala: String = "2.12.4"
  final val logbackVersion: String = "0.9.16"
  final val scalaTest : String = "3.0.1"
}

object Library {
  object LogBack {
    val logbackclassic
      : ModuleID = "ch.qos.logback" % "logback-classic" % Version.logbackVersion
  }

  object Test {
    val scalaTest : ModuleID = "org.scalatest" %% "scalatest" % Version.scalaTest % "test"
  }
}
