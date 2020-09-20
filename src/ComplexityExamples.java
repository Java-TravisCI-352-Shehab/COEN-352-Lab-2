
/*
 * Copyright (c) 2020. Mohammed A. Shehab
 * Website: https://users.encs.concordia.ca/~m_shehab/
 * Contact: m_shehab@encs.concordia.ca or mohammed_shihab@daad-alumni.de
 */

public class ComplexityExamples {

    public ComplexityExamples() {
        System.out.println("+ Start testing.");
    }

    public void example_1(int n)
    {
        int number_of_operations = 1;
        for (int i = 0; i < n; ++i)
        {
            // Do progress.
            number_of_operations++;
        }

        System.out.println("+ # of operations = " + number_of_operations);
        System.out.println("+ example 1 is finished.");
    }

    public void example_2(int[][] A, int[][] B,int[][] C,int n)
    {
        int number_of_operations = 1;
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j) {
                // Do progress.
                C[i][j] = A[i][j] + B[i][j];
                number_of_operations++;
            }
        }
        System.out.println("+ # of operations = " + number_of_operations);
        System.out.println("+ example 2 is finished.");
    }

    public void example_3(int[][] A, int[][] B,int[][] C,int n)
    {
        int number_of_operations = 1;
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j) {
                // Do progress.
                C[i][j] = 0;
                for (int k = 0; k < n; ++k)
                {
                    C[i][j] += A[i][k] * B[k][j];
                    number_of_operations++;
                }
            }
        }
        System.out.println("+ # of operations = " + number_of_operations);
        System.out.println("+ example 3 is finished.");
    }

    public void example_4(int n)
    {
        int number_of_operations = 1;
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < i; ++j) {
                // Do progress.
                number_of_operations++;
            }
        }

        System.out.println("+ # of operations = " + number_of_operations);
        System.out.println("+ example 4 is finished.");
    }

    public void example_5(int n)
    {
        int number_of_operations = 1;
        int p = 0;
        for (int i = 1; p <= n; ++i)
        {
            // Do progress.
            p += i;
            number_of_operations++;
        }

        System.out.println("+ # of operations = " + number_of_operations);
        System.out.println("+ example 5 is finished.");
    }

    public void example_6(int n)
    {
        int number_of_operations = 1;
        int p = 0;
        for (int i = 1; i < n; i*=2)
        {
            p++;
        }

        for (int j = 1; j < p; j*=2)
        {
            // Do progress.
            number_of_operations++;
        }

        System.out.println("+ # of operations = " + number_of_operations);
        System.out.println("+ example 6 is finished.");
    }
}
