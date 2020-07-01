public int[] shiftLeft(int[] nums) {
  int A=0;
	for(int i=0; i<nums.length-1; i++) {
		int B=nums[i];
		nums[i]=nums[i+1];
		nums[i+1]=B;
	}
	return nums;
}

//Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

//shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//shiftLeft([1, 2]) → [2, 1]
//shiftLeft([1]) → [1]
