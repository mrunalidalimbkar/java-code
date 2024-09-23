
import java.io.*;
import java.util.*;
class Demo1
{
    public static void main(String[] args)
    {
        int[][] a = new int[2][2];
        int m, n, k = 0;
        for (m = 0; m < 2; m++)
            for (n = 0; n < 2; n++)
            {
                a[m][n] = k;
                k++;
            }

            //display array elements
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    System.out.println(a[i][j]);
                }
            }
    }
}
