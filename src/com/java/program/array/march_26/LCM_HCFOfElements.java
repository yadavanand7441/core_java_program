package com.java.program.array.march_26;

public class LCM_HCFOfElements {
    public static void main(String[] args) {

        int a[]={8, 4, 2, 16,24};
        int LCM=a[0];
        int GCD=a[0];

        for (int i=0;i<a.length;i++)
        {
            GCD=findGCD(a[i],LCM);
            LCM=(LCM*a[i])/GCD;
        }
        System.out.println("GCD/HCF: "+GCD);
        System.out.println("LCM: "+LCM);
    }
    public static int findGCD(int a, int b)
    {
        if(b==0)
            return a;
        return findGCD(b, a%b);

    }
}
