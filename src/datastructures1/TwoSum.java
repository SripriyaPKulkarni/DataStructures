package datastructures1;

import java.util.Arrays;

public class TwoSum {

    //Given an array of integer numbers and an integer target, return indices of two numbers such that they add up to the target

    //2,11,7,15

    //Target=9

    //using brute force attack
    public static void main(String[] args) {


        int[] nums = new int[]{2, 11, 7, 15};
        TwoSum twoSum=new TwoSum();
        int target=9;
        //twoSum.two_Sum(nums,target);

        System.out.println( Arrays.toString(twoSum.two_Sum(nums,target)));

    }

    public int[] two_Sum(int[] nums,int target){
        int[] arr=new int[2];

        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;

                    return  arr;
                }
            }
        }

      return arr;
    }
    
}
