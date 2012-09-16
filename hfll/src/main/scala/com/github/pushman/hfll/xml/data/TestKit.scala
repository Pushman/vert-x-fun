package com.github.pushman.hfll.xml.data

import reflect.BeanProperty
import scala.collection.JavaConversions._

object TestKit {
  val Data = "data"
  val Ignore = "ignore"
}

case class TestKit(@BeanProperty var data: java.util.List[java.lang.Object],
                   @BeanProperty var ignore: Boolean) {

  def this(data: List[AnyRef]) = this(data, false)

  def this() = this(List(), false)
}
