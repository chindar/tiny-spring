package com.chinda.tinyspring.beans.io;

import java.io.InputStream;

/**
 * 获取数据流
 *
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public interface Resource {
    /**
     * 获取数据流
     * @return
     */
    InputStream getInputStream();
}
