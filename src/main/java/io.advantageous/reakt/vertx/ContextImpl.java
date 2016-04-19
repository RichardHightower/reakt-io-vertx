package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Context;
import io.vertx.core.Vertx;

/**
 * Created by rick on 4/19/16.
 */
public class ContextImpl implements Context {

    private final Vertx vertx;

    public ContextImpl(Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public <T> T getUnderlyingContext() {
        return (T) vertx;
    }
}
