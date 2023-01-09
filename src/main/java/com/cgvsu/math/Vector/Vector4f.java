package com.cgvsu.math.Vector;

public class Vector4f extends Vector {
    private static final int n = 4;

    public Vector4f(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors4(Vector4f first, Vector4f second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors4(Vector4f first, Vector4f second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors4ToScalar(Vector4f vector, float scalar) {
        return multiplyVectorToScalar(vector, scalar, n);
    }

    public static float[] divideVector4ByScalar(Vector4f vector, float scalar) {
        return divideVectorByScalar(vector, scalar, n);
    }
    public static float[] scaleVectors4(Vector2f first, Vector2f second, float k) {
        return scaleVector(first, second, k, n);
    }


    public static float countVector4Length(Vector4f vector) {
        return countVectorLength(vector);
    }
    public static float[] normalizeVector4(Vector4f vector) {
        return normalizeVector(vector);
    }

    public static float scalarMultiplyVectors4(Vector4f first, Vector4f second) {
        return scalarMultiplyVectors(first, second, n);
    }

    public static Vector4f readVector4() {
        System.out.println("Введите вектор размерности 4, состоящий из четырёх координат (x, y, z, k): ");

        return new Vector4f(readVector(n));
    }

    public static void printVector4(float[] vector) {
        System.out.println(printVector(vector, n));
    }
}
