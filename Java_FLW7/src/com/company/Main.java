package com.company;
        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

        import static java.lang.System.*;

public class Main {
    public static int nk(int x)
    {
        if (x>2) return nk(x -= 1) + x--;
        else return 1;
    }
    public static void main(String[] args) {
        // write your code here
        //////////////////////////1//////////////////////////
        int s = 0;
        boolean found = false;
        int[] array = { -1, 2, -3, -4, 5 -6};
        for (int i=0; i< array.length; i++) {
            if (!found && array[i] > 0) {
                found = true;
                continue;
            } else if (found) {
                if (array[i] > 0) break;
                s += array[i];
            }
        }
        System.out.println(s);
        //////////////////////////2//////////////////////////
        System.out.println("Enter pls size of array");
        Scanner scan = new Scanner(in);
        int a = scan.nextInt(), sumII = 0, nI = 0;
        int [] arr = new int [a];
        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (i%2==0) sumII+=i;
            if (i%2==1 && arr[i]<0) nI++;
        }
        String massageI = "sumII = " + sumII + "\nnI < 0 = " + nI;
        System.out.println(massageI);
        //////////////////////////3//////////////////////////
        out.println("Enter count point");
        int x = scan.nextInt();
        int [][] Arr = new int [2][x];
        for (int i = 0; i < x; i++)
        {
            out.printf("A%d(y) = ", i);
            Arr[0][i] = scan.nextInt();
            out.printf("A%d(x) = ", i);
            Arr[1][i] = scan.nextInt();
        }
        int n = nk(x);
        double [] Ak = new double[n];
        String [] AnAm = new String[n];
        int xI = 0, xII = xI+1;
        for (int i = 0; i < n; i++)
        {
            double px = Math.pow((double) Arr[0][xI] + (double) Arr[0][xII], 2);
            double py = Math.pow((double) Arr[1][xI] + (double) Arr[1][xII], 2);
            Ak[i] = Math.sqrt(px + py);
            AnAm[i] = "A" + xI + "A" + xII;
            xII++;
            if (xII >= x) { xI++; xII=xI+1;}
        }
        int nkmax = nk(n);
        int AkI=0, AkII=AkI+1, Akn = 0;
        double res = Ak[0];
        for (int i = 0; i < nkmax; i++)
        {
            double resx = Math.max(Ak[AkI], Ak[AkII]);
            if (resx > res) {res = resx; Akn = i;}
            AkII++;
            if (AkII >= n) {AkI++; AkII=AkI+1;}
        }
        out.println("kmax between " + AnAm[Akn]);
    }
}
