package org.scalafmt

/**
  * Classload ScalaFmt210 to run ScalaFmt from Scala 2.10, for example sbt
  * plugin.
  */
class ScalaFmt210 {
  def format(code: String): String = {
    ScalaFmt.format(code)
  }
}
