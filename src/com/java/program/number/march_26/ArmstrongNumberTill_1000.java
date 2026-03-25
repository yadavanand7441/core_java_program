package com.java.program.number.march_26;

public class ArmstrongNumberTill_1000 {
    public static void main(String[] args) {

        int n1=1,n2=1000,sum=0,r,n;

        for (int i=n1;i<=n2;i++)
        {
            n=i;
            while (n>0)
            {
                r=n%10;
                sum=sum+r*r*r;
                n=n/10;
            }
            if (sum==i)
            {
                System.out.println(i+" ");
            }
            sum=0;
        }

    }
}
