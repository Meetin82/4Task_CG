package com.cgvsu.math.Vector;

public class Vector3f extends Vector {
    private static final int n = 3;

    public Vector3f(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors3(Vector3f first, Vector3f second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors3(Vector3f first, Vector3f second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors3ToScalar(Vector3f vector, float scalar) {
        return multiplyVectorToScalar(vector, scalar, n);
    }

    public static float[] divideVector3ByScalar(Vector3f vector, float scalar) {
        return divideVectorByScalar(vector, scalar, n);
    }

    public static float[] scaleVectors3(Vector2f first, Vector2f second, float k) {
        return scaleVector(first, second, k, n);
    }

    public static float countVector3Length(Vector3f vector) {
        return countVectorLength(vector);
    }
    public static float[] normalizeVector3(Vector3f vector) {
        return normalizeVector(vector);
    }

    public static float scalarMultiplyVectors3(Vector3f first, Vector3f second) {
        return scalarMultiplyVectors(first, second, n);
    }

    public static float[] vectorMultiplyVectors3(Vector3f first, Vector3f second) {
        float[] result = new float[n];

        result[0] = first.data[1] * second.data[2] - first.data[2] * second.data[1];
        result[1] = first.data[2] * second.data[0] - first.data[0] * second.data[2];
        result[2] = first.data[0] * second.data[1] - first.data[1] * second.data[0];

        return result;
    }
    public static Vector3f readVector3() {
        System.out.println("Введите вектор размерности 3, состоящий из трёх координат (x, y, z): ");

        return new Vector3f(readVector(n));
    }

    public static void printVector3(float[] vector) {
        System.out.println(printVector(vector, n));
    }
}
