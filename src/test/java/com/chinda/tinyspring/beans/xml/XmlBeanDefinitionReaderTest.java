package com.chinda.tinyspring.beans.xml;

import com.chinda.tinyspring.beans.BeanDefinition;
import com.chinda.tinyspring.beans.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size() > 0);
    }
}
