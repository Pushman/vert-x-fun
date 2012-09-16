package com.github.pushman.hfll.xml

import com.google.common.collect.Sets
import reflect.BeanProperty

class XMLTestSuite {

  @BeanProperty
  var fixtures: java.util.Set[XMLTestFixture] = Sets.newHashSet()
}
