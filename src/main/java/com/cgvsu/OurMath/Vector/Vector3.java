package com.cgvsu.OurMath.Vector;

public class Vector3 extends Vector {
    private static final int n = 3;

    public Vector3(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors3(Vector3 first, Vector3 second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors3(Vector3 first, Vector3 second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors3ToScalar(Vector3 vector, float scalar) {
        return multiplyVectorToScalar(vector, scalar, n);
    }

    public static float[] divideVector3ByScalar(Vector3 vector, float scalar) {
        return divideVectorByScalar(vector, scalar, n);
    }

    public static float[] scaleVectors3(Vector2 first, Vector2 second, float k) {
        return scaleVector(first, second, k, n);
    }

    public static float countVector3Length(Vector3 vector) {
        return countVectorLength(vector);
    }
    public static float[] normalizeVector3(Vector3 vector) {
        return normalizeVector(vector);
    }

    public static float scalarMultiplyVectors3(Vector3 first, Vector3 second) {
        return scalarMultiplyVectors(first, second, n);
    }

    public static float[] vectorMultiplyVectors3(Vector3 first, Vector3 second) {
        float[] result = new float[n];

        result[0] = first.data[1] * second.data[2] - first.data[2] * second.data[1];
        result[1] = first.data[2] * second.data[0] - first.data[0] * second.data[2];
        result[2] = first.data[0] * second.data[1] - first.data[1] * second.data[0];

        return result;
    }
    public static Vector3 readVector3() {
        System.out.println("Введите вектор размерности 3, состоящий из трёх координат (x, y, z): ");

        return new Vector3(readVector(n));
    }

    public static void printVector3(float[] vector) {
        System.out.println(printVector(vector, n));
    }
}
