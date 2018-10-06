package com.chen.practice_01;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTwoNumber {

    public static void main(String[] args){
        int target = 13 ;
        int[] numberArray = {15, 11, 2, 7};

        int[] results = twoSumHash(numberArray, target);
        if (results != null) {
            System.out.println(Arrays.toString(results));
        }

    }

    public static int[] twoSumHash(int[] numberArray, int target) {
        Map<Integer, Integer> valueKeyMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numberArray.length; i++) {
            int thisValue = numberArray[ i ];
            int targetValue = target - thisValue ;
            if (valueKeyMap.keySet().contains(targetValue) && valueKeyMap.get(targetValue) != i) {
                return new int[]{valueKeyMap.get(targetValue), i};
            }
            valueKeyMap.put(thisValue, i);
        }
        throw new RuntimeException(" There is no such two number");
    }


}
