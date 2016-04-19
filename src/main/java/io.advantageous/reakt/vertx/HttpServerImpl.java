package io.advantageous.reakt.vertx;

import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Stream;
import io.advantageous.reakt.io.http.HttpServer;
import io.advantageous.reakt.io.http.HttpServerRequest;
import io.advantageous.reakt.io.http.websocket.ServerWebSocket;

public class HttpServerImpl implements HttpServer {

    @Override
    public HttpServer setRequestStream(Stream<HttpServerRequest> stream) {
        return null;
    }

    @Override
    public HttpServer setWebSocketStream(Stream<ServerWebSocket> handler) {
        return null;
    }

    @Override
    public HttpServer listen(Callback<HttpServer> listenHandler) {
        return null;
    }

    @Override
    public void close(Callback<Void> closedHandler) {

    }

    @Override
    public void close() {

    }
}
