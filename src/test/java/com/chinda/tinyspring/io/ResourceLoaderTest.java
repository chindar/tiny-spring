package com.chinda.tinyspring.io;

import com.chinda.tinyspring.beans.io.Resource;
import com.chinda.tinyspring.beans.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class ResourceLoaderTest {

    @Test
    public void test() {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
