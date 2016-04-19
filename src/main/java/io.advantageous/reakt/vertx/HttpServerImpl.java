package io.advantageous.reakt.vertx;

import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Stream;
import io.advantageous.reakt.io.http.HttpServer;
import io.advantageous.reakt.io.http.HttpServerRequest;
import io.advantageous.reakt.io.http.websocket.ServerWebSocket;

public class HttpServerImpl implements HttpServer {

    private final io.vertx.core.http.HttpServer httpServer;


    public HttpServerImpl(io.vertx.core.http.HttpServer httpServer) {
        this.httpServer = httpServer;
    }

    @Override
    public HttpServer setRequestStream(final Stream<HttpServerRequest> stream) {
        httpServer.requestHandler(request -> stream.reply(new HttpServerRequestImpl(request)));
        return this;
    }

    @Override
    public HttpServer setWebSocketStream(Stream<ServerWebSocket> stream) {
        httpServer.websocketHandler(serverWebSocket -> stream.reply(new ServerWebSocketImpl(serverWebSocket)));
        return this;
    }

    @Override
    public HttpServer listen(Callback<HttpServer> listenHandler) {
        httpServer.listen(event -> {
            if (event.failed()) {
                listenHandler.reject(event.cause());
            } else {
                listenHandler.resolve(HttpServerImpl.this);
            }
        });
        return this;
    }

    @Override
    public void close(Callback<Void> closedHandler) {
        httpServer.close(event -> {
            if (event.failed()) {
                closedHandler.reject(event.cause());
            }else {
                closedHandler.replyDone();
            }
        });
    }

    @Override
    public void close() {
        httpServer.close();
    }
}
