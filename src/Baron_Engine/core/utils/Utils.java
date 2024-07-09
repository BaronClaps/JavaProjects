package Baron_Engine.core.utils;

import java.nio.FloatBuffer;

public class Utils {
    public static FloatBuffer storeDataInFloatBuffer(float[] data) {
        FloatBuffer buffer = FloatBuffer.allocate(data.length);
        buffer.put(data).flip();
        return buffer;
    }
}
