package io.advantageous.reakt.vertx;

import io.advantageous.reakt.Observer;
import io.advantageous.reakt.Stream;
import io.advantageous.reakt.io.Buffer;
import io.advantageous.reakt.io.MultiMap;
import io.advantageous.reakt.io.http.websocket.ServerWebSocket;
import io.advantageous.reakt.io.http.websocket.WebSocketFrame;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;
import java.net.SocketAddress;

/**
 * Created by rick on 4/19/16.
 */
public class ServerWebSocketImpl implements ServerWebSocket {
    private final io.vertx.core.http.ServerWebSocket serverWebSocket;

    public ServerWebSocketImpl(io.vertx.core.http.ServerWebSocket serverWebSocket) {
        this.serverWebSocket = serverWebSocket;
    }

    @Override
    public ServerWebSocket setTextMessageObserver(Observer<String> bufferStream) {
        return null;
    }

    @Override
    public ServerWebSocket setMessageTextStream(Stream<String> bufferStream) {
        return null;
    }

    @Override
    public ServerWebSocket setMessageObserver(Observer<Buffer> bufferStream) {
        return null;
    }

    @Override
    public ServerWebSocket setMessageStream(Stream<Buffer> bufferStream) {
        return null;
    }

    @Override
    public ServerWebSocket setFrameStream(Stream<WebSocketFrame> frameStream) {
        return null;
    }

    @Override
    public ServerWebSocket setFrameObserver(Observer<WebSocketFrame> bufferStream) {
        return null;
    }

    @Override
    public ServerWebSocket pause() {
        return null;
    }

    @Override
    public ServerWebSocket resume() {
        return null;
    }

    @Override
    public ServerWebSocket write(Buffer data) {
        return null;
    }

    @Override
    public ServerWebSocket write(String data) {
        return null;
    }

    @Override
    public ServerWebSocket setWriteQueueMaxSize(int maxSize) {
        return null;
    }

    @Override
    public ServerWebSocket writeFrame(WebSocketFrame frame) {
        return null;
    }

    @Override
    public ServerWebSocket writeFinalTextFrame(String text) {
        return null;
    }

    @Override
    public ServerWebSocket writeFinalBinaryFrame(Buffer data) {
        return null;
    }

    @Override
    public ServerWebSocket writeBinaryMessage(Buffer data) {
        return null;
    }

    @Override
    public ServerWebSocket closeHandler(Runnable handler) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public SocketAddress getRemoteAddress() {
        return null;
    }

    @Override
    public SocketAddress getLocalAddress() {
        return null;
    }

    @Override
    public String getUri() {
        return null;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public String getQuery() {
        return null;
    }

    @Override
    public MultiMap<String, String> getHeaders() {
        return null;
    }

    @Override
    public void reject() {

    }

    @Override
    public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
        return new X509Certificate[0];
    }
}
