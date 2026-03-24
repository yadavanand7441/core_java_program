package com.java.program.array.march_26;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {

        int a[]={1,2,3,4,2,1,6,7,8,3};
        int frq[]= new int[a.length];

        int visited=-1,count;
        for (int i=0;i<a.length;i++)
        {
            count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    count++;
                    frq[j]=visited;
                }
            }
            if (frq[i]!=visited)
            {
                frq[i]=count;
            }
        }
        for (int i=0;i<frq.length;i++)
        {
            if (frq[i]!=visited)
            {
                System.out.println(a[i]+"    |    "+frq[i]);
            }
        }
    }
}
