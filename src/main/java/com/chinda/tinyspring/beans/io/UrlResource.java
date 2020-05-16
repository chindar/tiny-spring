package com.chinda.tinyspring.beans.io;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Wang Chinda
 * @date 2020/5/16
 * @see
 * @since 1.0
 */
public class UrlResource implements Resource {
    private URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @SneakyThrows
    @Override
    public InputStream getInputStream() {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
