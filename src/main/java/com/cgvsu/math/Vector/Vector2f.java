package com.cgvsu.math.Vector;

public class Vector2f extends Vector {
    private static final int n = 2;
    private static final float scalar = 5;

    public Vector2f(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors2(Vector2f first, Vector2f second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors2(Vector2f first, Vector2f second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors2ToScalar(Vector2f vector, float scalar) {
        return multiplyVectorToScalar(vector, scalar, n);
    }

    public static float[] divideVector2ByScalar(Vector2f vector, float scalar) {
        return divideVectorByScalar(vector, scalar, n);
    }

    public static float countVector2Length(Vector2f vector) {
        return countVectorLength(vector);
    }

    public static float[] normalizeVector2(Vector2f vector) {
        return normalizeVector(vector);
    }

    public static float scalarMultiplyVectors2(Vector2f first, Vector2f second) {
        return scalarMultiplyVectors(first, second, n);
    }

    public static float[] scaleVectors2(Vector2f first, Vector2f second, float k) {
        return scaleVector(first, second, k, n);
    }

    public static Vector2f readVector2() {
        System.out.println("Введите вектор размерности 2, состоящий из двух координат (x, y): ");

        return new Vector2f(readVector(n));
    }

    public static void printVector2(float[] vector) {
        System.out.println(printVector(vector, n));
    }
}