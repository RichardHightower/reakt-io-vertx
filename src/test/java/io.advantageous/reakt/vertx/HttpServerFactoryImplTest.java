package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.http.HttpServer;
import io.advantageous.reakt.io.options.http.HttpServerOptions;
import org.junit.Test;

import static org.junit.Assert.*;

public class HttpServerFactoryImplTest {

    @Test
    public void testCreateHttpServer() throws Exception {

        HttpServer.getHttpServerFactory().createHttpServer(new HttpServerOptions().setPort(8080));
    }

    @Test
    public void testCreateHttpServer1() throws Exception {

    }
}