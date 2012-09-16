package com.github.pushman.hfll.xml.data

import org.junit.Test
import org.junit.Assert._
import org.springframework.context.support.ClassPathXmlApplicationContext
import java.util.Locale
import scala.collection.JavaConversions._

class DataBeanDefinitionTest {

  @Test
  def shouldCreateSimpleEntity() {
    // given
    val expectedEntity = new TestKit(List("hello world", new Locale("pl")))

    // when
    val entity = loadEntityFromXml("simpleEntity")

    // then
    assertEquals(expectedEntity, entity)
  }

  @Test
  def shouldCreateIgnoredEntity() {
    // given
    val expectedEntity = new TestKit(List(), true)

    // when
    val entity = loadEntityFromXml("ignoredEntity")

    // then
    assertEquals(expectedEntity, entity)
  }

  private def loadEntityFromXml(entityId: String) = {
    val classPath = "classpath:/com/github/pushman/hfll/xml/data/DataBeanDefinitionTest.xml"
    new ClassPathXmlApplicationContext(classPath).getBean(entityId, classOf[TestKit])
  }
}
