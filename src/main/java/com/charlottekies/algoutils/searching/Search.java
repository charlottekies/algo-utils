package com.charlottekies.algoutils.searching;

public interface Search {
    public int search(String[] strs, String target);
    public int search(int[] nums, int target);
    public int search(Integer[] nums, Integer target);

    public boolean includes(String[] strs, String target);
    public boolean includes(int[] nums, int target);
    public boolean includes(Integer[] nums, Integer target);

}
