package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Context;
import io.advantageous.reakt.io.http.HttpServer;
import io.advantageous.reakt.io.options.http.HttpServerOptions;
import io.advantageous.reakt.io.spi.HttpServerFactory;

public class HttpServerFactoryImpl implements HttpServerFactory {

    @Override
    public HttpServer createHttpServer(HttpServerOptions options) {
        return null;
    }

    @Override
    public HttpServer createHttpServer(Context context, HttpServerOptions options) {
        return null;
    }
}
