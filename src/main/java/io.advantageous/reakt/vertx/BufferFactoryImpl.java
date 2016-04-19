package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Buffer;
import io.advantageous.reakt.io.spi.BufferFactory;

import java.nio.charset.Charset;

public class BufferFactoryImpl implements BufferFactory {

    @Override
    public Buffer createBuffer(int initialSize) {
        return new BufferImpl(io.vertx.core.buffer.Buffer.buffer(initialSize));
    }

    @Override
    public Buffer createBuffer() {
        return new BufferImpl(io.vertx.core.buffer.Buffer.buffer());
    }

    @Override
    public Buffer createBuffer(String string) {
        return new BufferImpl(io.vertx.core.buffer.Buffer.buffer(string));
    }

    @Override
    public Buffer createBuffer(String string, Charset encoding) {
        return new BufferImpl(io.vertx.core.buffer.Buffer.buffer(string, encoding.toString()));
    }

    @Override
    public Buffer createBuffer(byte[] bytes) {
        return new BufferImpl(io.vertx.core.buffer.Buffer.buffer(bytes));
    }

    @Override
    public Buffer createBuffer(Buffer buffer) {
        return buffer.copy();
    }
}
