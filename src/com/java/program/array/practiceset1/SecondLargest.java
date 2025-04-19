package com.java.program.array.practiceset1;

public class SecondLargest {

    public static int secondLargest(int a[],int total)
    {
        int tmp;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        return a[total-1];
    }

    public static void main(String[] args) {

        int a[]={12,34,23,8,38,16};
        int total=a.length;
        System.out.println("second largest elements: "+secondLargest(a,total));


    }
}
