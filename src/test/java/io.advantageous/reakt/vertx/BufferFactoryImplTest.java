package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Buffer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class BufferFactoryImplTest {


    @Test
    public void testCreateBuffer() throws Exception {

        final Buffer buffer = Buffer.getBufferFactory().createBuffer();
        assertNotNull(buffer);
    }

    @Test
    public void testCreateBufferString() throws Exception {

        final Buffer buffer = Buffer.getBufferFactory().createBuffer("Buffer");
        assertNotNull(buffer);
    }

    @Test
    public void testCreateBufferStringEncoding() throws Exception {

        final Buffer buffer = Buffer.getBufferFactory().createBuffer("Buffer", StandardCharsets.ISO_8859_1);
        assertNotNull(buffer);
    }

    @Test
    public void testCreateBuffer3() throws Exception {

        final Buffer buffer = Buffer.getBufferFactory().createBuffer("Buffer".getBytes(StandardCharsets.UTF_8));
        assertNotNull(buffer);
    }

    @Test
    public void testCreateBufferSize() throws Exception {

        final Buffer buffer = Buffer.getBufferFactory().createBuffer(1024);
        assertNotNull(buffer);
    }

    @Test
    public void testCreateBuffer5() throws Exception {


        final Buffer buffer1 = Buffer.getBufferFactory().createBuffer("Buffer");
        final Buffer buffer2 = Buffer.getBufferFactory().createBuffer(buffer1);
        assertNotNull(buffer2);
    }
}