package com.github.pushman.hfll.xml

import reflect.BeanProperty
import scala.collection.JavaConversions.setAsJavaSet
import com.github.pushman.hfll.xml.data.TestKit

class XMLTestFixture {

  @BeanProperty
  var dataSets: java.util.Set[TestKit] = setAsJavaSet(Set())
}
