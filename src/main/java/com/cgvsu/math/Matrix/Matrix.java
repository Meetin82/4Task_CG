package com.cgvsu.math.Matrix;

import java.util.Scanner;

public class Matrix {
    protected float[] data;
    private static final Scanner scan = new Scanner(System.in);

    protected Matrix(float[] matrix) {
        this.data = matrix;
    }

    protected Matrix(int N) {
        this.data = new float[N];
    }

    protected static float[] sumMatrix(Matrix first, Matrix second, int N) {
        float[] result = new float[N];

        for (int i = 0; i < N; i++) {
            result[i] = first.data[i] + second.data[i];
        }

        return result;
    }

    protected static float[] subtractMatrix(Matrix first, Matrix second, int N) {
        float[] result = new float[N];

        for (int i = 0; i < N; i++) {
            result[i] = first.data[i] - second.data[i];
        }

        return result;
    }

    protected static float[] multiplyMatrix(Matrix first, Matrix second, int N, int n) {
        float[] result = new float[N];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    result[i * n + j] += first.data[i * n + k] * second.data[k * n + j];
                }
            }
        }

        return result;
    }

    protected static float[] transposeMatrix(Matrix matrix, int N, int n) {
        float[] result = new float[N];
        float[][] matrixT = new float[n][n];
        float[][] matrixA = new float[n][n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix.data.length > count) {
                    matrixA[i][j] = matrix.data[count++];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixT[j][i] = matrixA[i][j];
            }
        }

        return transformMatrixToArray(n, result, matrixT);
    }

    protected static float[] createUnitMatrix(int N, int n) {
        float[] result = new float[N];
        float[][] unitMatrix = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    unitMatrix[i][j] = 1;
                } else {
                    unitMatrix[i][j] = 0;
                }
            }
        }

        return transformMatrixToArray(n, result, unitMatrix);
    }

    protected static float[] createNullMatrix(int N, int n) {
        float[] result = new float[N];
        float[][] nullMatrix = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nullMatrix[i][j] = 0;
            }
        }

        return transformMatrixToArray(n, result, nullMatrix);
    }

    public static float[] readMatrix(int N) {
        float[] result = new float[N];

        while (true) {
            try {
                for (int i = 0; i < N; i++) {
                    result[i] = scan.nextFloat();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные! Попробуйте ввести матрицу ещё раз: ");
                scan.next();
            }
        }
    }

    public static void printMatrix(float[] matrix, int N, int n) {
        for (int i = 0, j = 0; i < N; i++, j++) {
            if (j == n) {
                System.out.println();
                j = 0;
            }
            System.out.print(matrix[i] + " ");
        }
    }

    private static float[] transformMatrixToArray(int n, float[] array, float[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i * matrix[0].length + j;
                array[k] = matrix[i][j];
            }
        }

        return array;
    }
}