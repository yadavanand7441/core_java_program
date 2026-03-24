package com.java.program.array.march_26;

public class LargestSecondElements {

    public static int secondLargest(int a[], int total)
    {
        int temp;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int total=a.length;
        System.out.println("second largest elements of array: "+secondLargest(a,total));
    }
}
