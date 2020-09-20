
/*
 * Copyright (c) 2020. Mohammed A. Shehab
 * Website: https://users.encs.concordia.ca/~m_shehab/
 * Contact: m_shehab@encs.concordia.ca or mohammed_shihab@daad-alumni.de
 */

import javax.swing.*;
import java.util.Random;

public class Driver {

    static int[][] A;
    static int[][] B;
    static int[][] C;

    void measure_time(int n)
    {

    }

    static int[][] generate_dummy_data(int n)
    {
        // This function is used to generate dummy data with size of n * n
        int[][] arr = new int[n][n];
        // Use random object
        Random rn = new Random();
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
            {
                arr[i][j] = rn.nextInt(100); // The range of random numbers [0, 100]
            }
        return arr;
    }

    public static void main(String[] args)
    {
        String data_size= JOptionPane.showInputDialog("Please input data size: ");
        int n = Integer.parseInt(data_size);

        ComplexityExamples tester = new ComplexityExamples();
        A = generate_dummy_data(n);
        B = generate_dummy_data(n);
        C = new int[n][n];

        // Start test cases
        for (int example_id = 1; example_id <= 6; ++example_id)
        {
            long time_s = 0;
            long time_e = 0;
            time_s = System.nanoTime();

            switch (example_id)
            {
                case 1: tester.example_1(n);break;
                case 2: tester.example_2(A,B,C,n);break;
                case 3: tester.example_3(A,B,C,n);break;
                case 4: tester.example_4(n);break;
                case 5: tester.example_5(n);break;
                case 6: tester.example_6(n);break;
            }

            time_e = System.nanoTime();
            double execution_time = (time_e - time_s);

            System.out.printf("-> Example # %d, execution time = %.2f Nano second.", example_id, execution_time);
            System.out.println("\n-----------------------------------------------------");
        }
    }


}
