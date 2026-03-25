package com.java.program.number.march_26;

public class AlternateArmstrongNumber {

    public static void alternateArmstrong(int totalNumber)
    {
        int temp=0;
        for (int i=1;i<totalNumber;i++)
        {
            if (checkArmstrong(i)==1)
            {
                temp++;
                if (temp%2!=0)
                {
                    System.out.println(i+" ");
                }
            }
        }
    }
    public static int checkArmstrong(int n)
    {
        int sum=0,r,number=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if (sum==number)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int totalNumberRange=1000;
        System.out.println("Alternate armstrong number: ");
        alternateArmstrong(totalNumberRange);

    }
}
