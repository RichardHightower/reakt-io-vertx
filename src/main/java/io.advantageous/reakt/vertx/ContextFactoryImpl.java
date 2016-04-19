package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Context;
import io.advantageous.reakt.io.spi.ContextFactory;
import io.vertx.core.Vertx;

public class ContextFactoryImpl implements ContextFactory {

    @Override
    public Context createContext() {
        return new ContextImpl(Vertx.vertx());
    }
}
