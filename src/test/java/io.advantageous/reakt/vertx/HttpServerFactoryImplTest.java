package io.advantageous.reakt.vertx;

import io.advantageous.reakt.Callback;
import io.advantageous.reakt.Result;
import io.advantageous.reakt.Stream;
import io.advantageous.reakt.StreamResult;
import io.advantageous.reakt.io.http.HttpServer;
import io.advantageous.reakt.io.http.HttpServerRequest;
import io.advantageous.reakt.io.options.http.HttpServerOptions;
import org.junit.Test;

import static org.junit.Assert.*;

public class HttpServerFactoryImplTest {

    @Test
    public void testCreateHttpServer() throws Exception {

        HttpServer.getHttpServerFactory().createHttpServer(new HttpServerOptions().setPort(8080)).setRequestStream(new Stream<HttpServerRequest>() {
            @Override
            public void onNext(StreamResult<HttpServerRequest> result) {
                
            }
        }).listen(new Callback<HttpServer>() {
            @Override
            public void onResult(Result<HttpServer> result) {
                System.out.println("Listening on port 8080");
            }
        });

        Thread.sleep(1000);
    }

    @Test
    public void testCreateHttpServer1() throws Exception {

    }
}