package com.github.pushman.hfll.xml.properties

import org.springframework.beans.factory.xml.NamespaceHandlerSupport

class TestPropertiesNamespaceHandler extends NamespaceHandlerSupport {

  def init() {
    registerBeanDefinitionDecorator("name", new NamePropertyDefinitionParser)
    registerBeanDefinitionDecorator("set", new CollectionBeanPropertyDecorator)
    registerBeanDefinitionDecorator("list", new CollectionBeanPropertyDecorator)
  }
}