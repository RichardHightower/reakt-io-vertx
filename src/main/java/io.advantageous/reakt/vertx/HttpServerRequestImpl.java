package io.advantageous.reakt.vertx;

import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Observer;
import io.advantageous.reakt.Stream;
import io.advantageous.reakt.io.Buffer;
import io.advantageous.reakt.io.MultiMap;
import io.advantageous.reakt.io.http.HttpMethod;
import io.advantageous.reakt.io.http.HttpServerRequest;
import io.advantageous.reakt.io.http.HttpServerResponse;
import io.advantageous.reakt.io.http.HttpVersion;
import io.advantageous.reakt.io.http.websocket.ServerWebSocket;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;
import java.net.SocketAddress;

public class HttpServerRequestImpl implements HttpServerRequest {

    private final io.vertx.core.http.HttpServerRequest httpServerRequest;

    public HttpServerRequestImpl(io.vertx.core.http.HttpServerRequest httpServerRequest) {
        this.httpServerRequest = httpServerRequest;
    }

    @Override
    public HttpServerRequest setBodyStream(Stream<Buffer> bodyStream) {
        return null;
    }

    @Override
    public HttpServerRequest setBodyObserver(Observer<Buffer> bodyObserver) {
        return null;
    }

    @Override
    public HttpServerRequest getBody(Callback<Buffer> bodyCallback) {
        return null;
    }

    @Override
    public HttpServerRequest getBodyAsText(Callback<String> bodyCallback) {
        return null;
    }

    @Override
    public HttpVersion getVersion() {
        return null;
    }

    @Override
    public HttpMethod getMethod() {
        return null;
    }

    @Override
    public boolean isSSL() {
        return false;
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
    public HttpServerResponse getResponse() {
        return null;
    }

    @Override
    public MultiMap<String, String> getHeaders() {
        return null;
    }

    @Override
    public String getHeader(String headerName) {
        return null;
    }

    @Override
    public String getHeader(CharSequence headerName) {
        return null;
    }

    @Override
    public MultiMap<String, String> getParams() {
        return null;
    }

    @Override
    public String getParam(String paramName) {
        return null;
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
    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        return new X509Certificate[0];
    }

    @Override
    public String getAbsoluteURI() {
        return null;
    }

    @Override
    public boolean isExpectMultipart() {
        return false;
    }

    @Override
    public HttpServerRequest setExpectMultipart(boolean expect) {
        return null;
    }

    @Override
    public MultiMap<String, String> getFormAttributes() {
        return null;
    }

    @Override
    public String getFormAttribute(String attributeName) {
        return null;
    }

    @Override
    public ServerWebSocket upgrade() {
        return null;
    }

    @Override
    public boolean isEnded() {
        return false;
    }
}
