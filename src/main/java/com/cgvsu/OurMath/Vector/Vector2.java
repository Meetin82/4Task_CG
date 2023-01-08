package com.cgvsu.OurMath.Vector;

public class Vector2 extends Vector {
    private static final int n = 2;
    private static final float scalar = 5;

    public Vector2(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors2(Vector2 first, Vector2 second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors2(Vector2 first, Vector2 second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors2ToScalar(Vector2 vector, float scalar) {
        return multiplyVectorToScalar(vector, scalar, n);
    }

    public static float[] divideVector2ByScalar(Vector2 vector, float scalar) {
        return divideVectorByScalar(vector, scalar, n);
    }

    public static float countVector2Length(Vector2 vector) {
        return countVectorLength(vector);
    }

    public static float[] normalizeVector2(Vector2 vector) {
        return normalizeVector(vector);
    }

    public static float scalarMultiplyVectors2(Vector2 first, Vector2 second) {
        return scalarMultiplyVectors(first, second, n);
    }

    public static float[] scaleVectors2(Vector2 first, Vector2 second, float k) {
        return scaleVector(first, second, k, n);
    }

    public static Vector2 readVector2() {
        System.out.println("Введите вектор размерности 2, состоящий из двух координат (x, y): ");

        return new Vector2(readVector(n));
    }

    public static void printVector2(float[] vector) {
        System.out.println(printVector(vector, n));
    }
}