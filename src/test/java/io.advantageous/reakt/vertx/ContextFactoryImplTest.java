package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Context;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContextFactoryImplTest {

    @Test
    public void testCreateContext() throws Exception {
        final Context context = Context.getContextFactory().createContext();
        assertNotNull(context);
    }
}