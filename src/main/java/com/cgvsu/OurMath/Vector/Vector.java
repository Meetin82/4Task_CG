package com.cgvsu.OurMath.Vector;

import java.util.Scanner;

public class Vector {
    public float[] data;
    private static final Scanner scan = new Scanner(System.in);

    public Vector(float[] vector) {
        this.data = vector;
    }

    public Vector(int n) {
        this.data = new float[n];
    }

    public static float[] sumVectors(Vector first, Vector second, int n) {
        checkLengths(first, second);
        float[] result = new float[n];

        for (int i = 0; i < n; i++) {
            result[i] = first.data[i] + second.data[i];
        }

        return result;
    }

    public static float[] scaleVector(Vector first, Vector second, float k, int n) {
        float[] distanceVectors = new float[n];

        for (int i = 0; i < n; i++) {
            distanceVectors[i] = Math.abs(first.data[i] - second.data[i]);
        }
        Vector vectorDistanceVectors = new Vector(distanceVectors);

        float vectorLength = countVectorLength(vectorDistanceVectors);
        float[] vectorWithUnitLengthInArr = divideVectorByScalar(vectorDistanceVectors, vectorLength, n);
        Vector vectorWithUnitLength = new Vector(vectorWithUnitLengthInArr);

        return multiplyVectorToScalar(vectorWithUnitLength, k, n);
    }

    public static float[] subtractVectors(Vector first, Vector second, int n) {
        checkLengths(first, second);
        float[] result = new float[n];

        for (int i = 0; i < n; i++) {
            result[i] = first.data[i] - second.data[i];
        }

        return result;
    }

    public static float[] multiplyVectorToScalar(Vector vector, float scalar, int n) {
        float[] result = new float[n];

        for (int i = 0; i < n; i++) {
            result[i] = vector.data[i] * scalar;
        }

        return result;
    }

    public static float[] divideVectorByScalar(Vector vector, float scalar, int n) {
        float[] result = new float[n];

        while (scalar == 0) {
            System.out.println("Деление на 0 невозможно! Попробуйте ещё раз: ");
            scalar = readScalar();
        }

        for (int i = 0; i < n; i++) {
            result[i] = vector.data[i] / scalar;
        }

        return result;
    }

    public static float countVectorLength(Vector vector) {
        float temp = 0;

        for (int i = 0; i < vector.data.length; i++) {
            temp += vector.data[i] * vector.data[i];
        }

        return (float) Math.sqrt(temp);
    }

    public static float[] normalizeVector(Vector vector) {
        float[] result = vector.data;
        float temp = 0;

        for (int i = 0; i < vector.data.length; i++) {
            temp += result[i];
        }

        for (int i = 0; i < vector.data.length; i++) {
            result[i] = result[i] / temp;
        }

        return result;
    }

    public static float scalarMultiplyVectors(Vector first, Vector second, int n) {
        checkLengths(first, second);
        float result = 0;

        for (int i = 0; i < n; i++) {
            result += first.data[i] * second.data[i];
        }

        return result;
    }

    public static float[] readVector(int n) {
        float[] result = new float[n];

        while (true) {
            try {
                for (int i = 0; i < n; i++) {
                    result[i] = scan.nextFloat();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные! Попробуйте ввести вектор ещё раз: ");
                scan.next();
            }
        }
    }

    public static String printVector(float[] vector, int n) {
        StringBuilder str = new StringBuilder("(");
        String sep = ",\n ";

        for (int i = 0; i < n; i++) {
            str.append(vector[i]);

            if (i < (n - 1)) {
                str.append(sep);
            }
        }

        return str + ")";
    }

    private static float readScalar() {
        System.out.println("введите скалярное значение: ");

        while (true) {
            try {
                return scan.nextFloat();
            } catch (Exception e) {
                System.out.println("Введены некорректные данные! Попробуйте ввести скалярное значение ещё раз: ");
                scan.next();
            }
        }
    }

    private static void checkLengths(Vector first, Vector second) {
        if (first.data.length != second.data.length) {
            throw new IllegalArgumentException("Вектора разной длины!");
        }
    }
}