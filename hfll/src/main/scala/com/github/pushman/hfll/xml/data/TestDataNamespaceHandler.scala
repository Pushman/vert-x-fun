package com.github.pushman.hfll.xml.data

import org.springframework.beans.factory.xml.NamespaceHandlerSupport

class TestDataNamespaceHandler extends NamespaceHandlerSupport {
  def init() {
    registerBeanDefinitionParser("kit", new KitBeanDefinitionParser)
  }
}
