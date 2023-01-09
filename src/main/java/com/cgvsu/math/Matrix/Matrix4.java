package com.cgvsu.math.Matrix;


import com.cgvsu.math.Vector.Vector4f;

public class Matrix4 extends Matrix {
    private static final int N = 16;
    private static final int n = 4;

    public Matrix4(float[] matrix) {
        super(matrix);
    }

    public static float[] sumMatrix4(Matrix4 first, Matrix4 second) {
        return sumMatrix(first, second, N);
    }

    public static float[] subtractMatrix4(Matrix4 first, Matrix4 second) {
        return subtractMatrix(first, second, N);
    }

    public static float[] multiplyMatrix4(Matrix4 first, Matrix4 second) {
        return multiplyMatrix(first, second, N, n);
    }

    public static float[] multiplyMatrix4ToVector4(Matrix4 matrix, Vector4f vector) {
        float[] result = new float[n];

        result[0] = matrix.data[0] * vector.data[0] + matrix.data[1] * vector.data[1] + matrix.data[2] * vector.data[2] + matrix.data[3] * vector.data[3];
        result[1] = matrix.data[4] * vector.data[0] + matrix.data[5] * vector.data[1] + matrix.data[6] * vector.data[2] + matrix.data[7] * vector.data[3];
        result[2] = matrix.data[8] * vector.data[0] + matrix.data[9] * vector.data[1] + matrix.data[10] * vector.data[2] + matrix.data[11] * vector.data[3];
        result[3] = matrix.data[12] * vector.data[0] + matrix.data[13] * vector.data[1] + matrix.data[14] * vector.data[2] + matrix.data[15] * vector.data[3];

        return result;
    }

    public static float[] transposeMatrix4(Matrix4 matrix) {
        return transposeMatrix(matrix, N, n);
    }

    public static float[] createUnitMatrix4() {
        return createUnitMatrix(N, n);
    }

    public static float[] createNullMatrix4() {
        return createNullMatrix(N, n);
    }

    public static Matrix4 readMatrix4() {
        System.out.println("Введите матрицу 4х4, состоящую из 16 элементов: ");

        return new Matrix4(readMatrix(N));
    }

    public static void printMatrix4(float[] matrix) {
        printMatrix(matrix, N, n);
    }
}