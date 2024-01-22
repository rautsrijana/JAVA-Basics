package com.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDuplicateExample {
    public List<Integer> findDuplicates(int[] nums) {

        Set<Integer> store = new HashSet<Integer>();
        List<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (store.contains(current)) {
                output.add(current);
            } else {
                store.add(current);
            }
        }
        return output;  
    }
}
