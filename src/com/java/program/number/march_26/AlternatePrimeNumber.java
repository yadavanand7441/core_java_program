package com.java.program.number.march_26;

public class AlternatePrimeNumber {
    public static void printAlternatePrimeNumber(int number)
    {
        int temp=2;
        for (int i=2;i<=number;i++)
        {
            if(checkPrime(i)==1)
            {
                if(temp%2==0)
                {
                    System.out.print(i+" ");
                }
                temp++;
            }
        }
    }
    public static int checkPrime(int n)
    {
        int flag=1;
        for (int i=2;i<=n/2;i++)
        {
            if (n%i==0)
            {
                flag=0;
                break;
            }
        }
        if (flag==1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        int totalNumber=100;
        printAlternatePrimeNumber(totalNumber);


    }
}
