package io.advantageous.reakt.vertx;

import io.advantageous.reakt.io.Buffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class BufferImpl implements Buffer{

    final io.vertx.core.buffer.Buffer buffer;

    public BufferImpl(io.vertx.core.buffer.Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public String toString(Charset encoding) {
        return buffer.toString(encoding);
    }

    @Override
    public byte getByte(int position) {
        return buffer.getByte(position);
    }

    @Override
    public short getUnsignedByte(int position) {
        return buffer.getUnsignedByte(position);
    }

    @Override
    public int getInt(int position) {
        return buffer.getInt(position);
    }

    @Override
    public long getUnsignedInt(int position) {
        return buffer.getUnsignedInt(position);
    }

    @Override
    public long getLong(int position) {
        return buffer.getLong(position);
    }

    @Override
    public double getDouble(int position) {
        return buffer.getDouble(position);
    }

    @Override
    public float getFloat(int position) {
        return buffer.getFloat(position);
    }

    @Override
    public short getShort(int position) {
        return buffer.getShort(position);
    }

    @Override
    public int getUnsignedShort(int position) {
        return buffer.getUnsignedShort(position);
    }

    @Override
    public byte[] getBytes() {
        return buffer.getBytes();
    }

    @Override
    public byte[] getBytes(int startPosition, int endPosition) {
        return buffer.getBytes(startPosition, endPosition);
    }

    @Override
    public Buffer getBytes(byte[] destination) {
        buffer.getBytes(destination);
        return this;
    }

    @Override
    public Buffer getBytes(byte[] destination, int destinationIndex) {
        buffer.getBytes(destination, destinationIndex);
        return this;
    }

    @Override
    public Buffer getBytes(int startPosition, int endPosition, byte[] destination) {
        buffer.getBytes(startPosition, endPosition, destination);
        return this;
    }

    @Override
    public Buffer getBytes(int startPosition, int endPosition, byte[] destination, int destinationIndex) {
        buffer.getBytes(startPosition, endPosition, destination, destinationIndex);
        return this;
    }

    @Override
    public Buffer getBuffer(int startPosition, int endPosition) {
        return new BufferImpl(buffer.getBuffer(startPosition, endPosition));
    }

    @Override
    public String getString(int startPosition, int endPosition, Charset encoding) {
        return buffer.getString(startPosition, endPosition, encoding.toString());
    }

    @Override
    public String getString(int startPosition, int endPosition) {
        return buffer.getString(startPosition, endPosition);
    }

    @Override
    public Buffer appendBuffer(Buffer otherBuffer) {

        io.vertx.core.buffer.Buffer vertxOtherBuffer = otherBuffer.getUnderlyingBuffer();
        buffer.appendBuffer(vertxOtherBuffer);
        return this;
    }

    @Override
    public Buffer appendBuffer(Buffer otherBuffer, int offset, int length) {

        io.vertx.core.buffer.Buffer vertxOtherBuffer = otherBuffer.getUnderlyingBuffer();
        buffer.appendBuffer(vertxOtherBuffer, offset, length);
        return this;
    }

    @Override
    public Buffer appendBytes(byte[] bytes) {
        buffer.appendBytes(bytes);
        return this;
    }

    @Override
    public Buffer appendBytes(byte[] bytes, int offset, int length) {
        buffer.appendBytes(bytes, offset, length);
        return this;
    }

    @Override
    public Buffer appendByte(byte value) {
        buffer.appendByte(value);
        return this;

    }

    @Override
    public Buffer appendUnsignedByte(short value) {
        buffer.appendUnsignedByte(value);
        return this;
    }

    @Override
    public Buffer appendInt(int value) {
        buffer.appendInt(value);
        return this;
    }

    @Override
    public Buffer appendUnsignedInt(long value) {
        buffer.appendUnsignedInt(value);
        return this;
    }

    @Override
    public Buffer appendLong(long value) {
        buffer.appendLong(value);
        return this;
    }

    @Override
    public Buffer appendShort(short value) {
        buffer.appendShort(value);
        return this;
    }

    @Override
    public Buffer appendUnsignedShort(int value) {
        buffer.appendUnsignedShort(value);
        return this;
    }

    @Override
    public Buffer appendFloat(float value) {
        buffer.appendFloat(value);
        return this;
    }

    @Override
    public Buffer appendDouble(double value) {
        buffer.appendDouble(value);
        return this;
    }

    @Override
    public Buffer appendString(String value, Charset encoding) {
        buffer.appendString(value, encoding.toString());
        return this;
    }

    @Override
    public Buffer appendString(String value) {
        buffer.appendString(value);
        return this;
    }

    @Override
    public Buffer setByte(int position, byte value) {
        buffer.setByte(position, value);
        return this;
    }

    @Override
    public Buffer setUnsignedByte(int position, short value) {
        buffer.setUnsignedByte(position, value);
        return this;
    }

    @Override
    public Buffer setInt(int position, int value) {
        buffer.setInt(position, value);
        return this;
    }

    @Override
    public Buffer setUnsignedInt(int position, long value) {
        buffer.setUnsignedInt(position, value);
        return this;
    }

    @Override
    public Buffer setLong(int position, long value) {
        buffer.setLong(position, value);
        return this;
    }

    @Override
    public Buffer setDouble(int position, double value) {
        buffer.setDouble(position, value);
        return this;
    }

    @Override
    public Buffer setFloat(int position, float value) {
        buffer.setFloat(position, value);
        return this;
    }

    @Override
    public Buffer setShort(int position, short value) {
        buffer.setShort(position, value);
        return this;
    }

    @Override
    public Buffer setUnsignedShort(int position, int value) {
        buffer.setUnsignedShort(position, value);
        return this;
    }

    @Override
    public Buffer setString(int position, String string) {
        buffer.setString(position, string);
        return this;
    }

    @Override
    public Buffer setString(int position, String string, Charset encoding) {
        buffer.setString(position, string, encoding.toString());
        return this;
    }

    @Override
    public Buffer setBuffer(int position, Buffer otherBuffer) {
        buffer.setBuffer(position, otherBuffer.getUnderlyingBuffer());
        return this;
    }

    @Override
    public Buffer setBuffer(int position, Buffer otherBuffer, int offset, int length) {
        buffer.setBuffer(position, otherBuffer.getUnderlyingBuffer(), offset, length);
        return this;
    }

    @Override
    public Buffer setBytes(int position, ByteBuffer byteBuffer) {
        buffer.setBytes(position, byteBuffer);
        return this;
    }

    @Override
    public Buffer setBytes(int position, byte[] bytes) {
        buffer.setBytes(position, bytes);
        return this;
    }

    @Override
    public Buffer setBytes(int position, byte[] bytes, int offset, int length) {
        buffer.setBytes(position, bytes, offset, length);
        return this;
    }

    @Override
    public int length() {
        return buffer.length();
    }

    @Override
    public Buffer copy() {
        return new BufferImpl(buffer.copy());
    }

    @Override
    public Buffer slice() {
        return new BufferImpl(buffer.slice());
    }

    @Override
    public Buffer slice(int startPosition, int endPosition) {
        return new BufferImpl(buffer.slice(startPosition, endPosition));
    }

    @Override
    public <T> T getUnderlyingBuffer() {
        return (T) buffer;
    }

}
