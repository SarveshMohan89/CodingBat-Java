public int[] maxEnd3(int[] nums) {
  	int A= Math.max(nums[0], nums[2]);
		nums[0]=A;
		nums[1]=A;
		nums[2]=A;
		return nums;
}

//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

//maxEnd3([1, 2, 3]) → [3, 3, 3]
//maxEnd3([11, 5, 9]) → [11, 11, 11]
//maxEnd3([2, 11, 3]) → [3, 3, 3]
