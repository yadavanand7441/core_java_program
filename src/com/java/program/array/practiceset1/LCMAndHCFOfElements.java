package com.java.program.array.practiceset1;

public class LCMAndHCFOfElements {
    public static void main(String[] args) {

        int a[] = {8, 4, 2, 16,24};
        int lcm=a[0];
        int gcd=a[0];
        for (int i=0;i<a.length;i++)
        {
            gcd=findGCD(a[i],lcm);
            lcm=(lcm*a[i])/gcd;
        }
        System.out.println("GCD/HCF: "+gcd);
        System.out.println("LCM: "+lcm);
    }
    public static int findGCD(int a, int b)
    {
        if (b==0)
            return a;
        return findGCD(b,a%b);
    }
}
