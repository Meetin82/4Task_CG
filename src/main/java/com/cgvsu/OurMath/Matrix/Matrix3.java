package com.cgvsu.OurMath.Matrix;

import ru.vsu.cs.semenov_d_s.OurMath.Vector.Vector3;

public class Matrix3 extends Matrix {
    private static final int N = 9;
    private static final int n = 3;

    public Matrix3(float[] matrix) {
        super(matrix);
    }

    public static float[] sumMatrix3(Matrix3 first, Matrix3 second) {
        return sumMatrix(first, second, N);
    }

    public static float[] subtractMatrix3(Matrix3 first, Matrix3 second) {
        return subtractMatrix(first, second, N);
    }

    public static float[] multiplyMatrix3(Matrix3 first, Matrix3 second) {
        return multiplyMatrix(first, second, N, n);
    }
    public static float[] multiplyMatrix3ToVector3(Matrix3 matrix, Vector3 vector) {
        float[] result = new float[n];

        result[0] = matrix.data[0] * vector.data[0] + matrix.data[1] * vector.data[1] + matrix.data[2] * vector.data[2];
        result[1] = matrix.data[3] * vector.data[0] + matrix.data[4] * vector.data[1] + matrix.data[5] * vector.data[2];
        result[2] = matrix.data[6] * vector.data[0] + matrix.data[7] * vector.data[1] + matrix.data[8] * vector.data[2];

        return result;
    }

    public static float[] transposeMatrix3(Matrix3 matrix) {
        return transposeMatrix(matrix, N, n);
    }

    public static float[] createUnitMatrix3() {
        return createUnitMatrix(N, n);
    }

    public static float[] createNullMatrix3() {
        return createNullMatrix(N, n);
    }

    public static Matrix3 readMatrix3() {
        System.out.println("Введите матрицу 3х3, состоящую из 9 элементов: ");

        return new Matrix3(readMatrix(N));
    }

    public static void printMatrix3(float[] matrix) {
        printMatrix(matrix, N, n);
    }
}