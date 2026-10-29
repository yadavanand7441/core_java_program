package com.java.interview.practice1.array;

public class MinSubarray {

    static int minLenPositive(int[] arr, int target) {
        int left = 0;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            currSum += arr[right];              // window badhao

            while (currSum > target && left <= right) {   // sum zyada? peeche se kaato
                currSum -= arr[left];
                left++;
            }

            if (currSum == target) {            // mil gaya
                minLen = Math.min(minLen, right - left + 1);
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(minLenPositive(arr, 9));   // 2
    }
}