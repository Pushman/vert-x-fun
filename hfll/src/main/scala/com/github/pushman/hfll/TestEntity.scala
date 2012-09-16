package com.github.pushman.hfll

import reflect.BeanProperty
import scala.collection.JavaConversions._

case class TestEntity(@BeanProperty var name: String,
                      @BeanProperty var itemsAsSet: java.util.Set[String],
                      @BeanProperty var itemsAsList: java.util.List[String]) {

  def this() = this(null, setAsJavaSet(Set()), List())
}
