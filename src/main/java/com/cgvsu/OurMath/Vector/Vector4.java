package com.cgvsu.OurMath.Vector;

public class Vector4 extends Vector {
    private static final int n = 4;

    public Vector4(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors4(Vector4 first, Vector4 second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors4(Vector4 first, Vector4 second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors4ToScalar(Vector4 vector, float scalar) {
        return multiplyVectorToScalar(vector, scalar, n);
    }

    public static float[] divideVector4ByScalar(Vector4 vector, float scalar) {
        return divideVectorByScalar(vector, scalar, n);
    }
    public static float[] scaleVectors4(Vector2 first, Vector2 second, float k) {
        return scaleVector(first, second, k, n);
    }


    public static float countVector4Length(Vector4 vector) {
        return countVectorLength(vector);
    }
    public static float[] normalizeVector4(Vector4 vector) {
        return normalizeVector(vector);
    }

    public static float scalarMultiplyVectors4(Vector4 first, Vector4 second) {
        return scalarMultiplyVectors(first, second, n);
    }

    public static Vector4 readVector4() {
        System.out.println("Введите вектор размерности 4, состоящий из четырёх координат (x, y, z, k): ");

        return new Vector4(readVector(n));
    }

    public static void printVector4(float[] vector) {
        System.out.println(printVector(vector, n));
    }
}
