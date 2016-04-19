package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Context;
import io.advantageous.reakt.io.http.HttpServer;
import io.advantageous.reakt.io.options.http.HttpServerOptions;
import io.advantageous.reakt.io.spi.HttpServerFactory;
import io.vertx.core.Vertx;

public class HttpServerFactoryImpl implements HttpServerFactory {

    @Override
    public HttpServer createHttpServer(HttpServerOptions options) {
        return new HttpServerImpl(Vertx.vertx()
                .createHttpServer(new io.vertx.core.http.HttpServerOptions().setPort(options.getPort())));
    }

    @Override
    public HttpServer createHttpServer(Context context, HttpServerOptions options) {

        final Vertx vertx = context.getUnderlyingContext();

        return new HttpServerImpl(vertx
                .createHttpServer(new io.vertx.core.http.HttpServerOptions().setPort(options.getPort())));
    }
}
