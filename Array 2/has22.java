public boolean has22(int[] nums) {
  	boolean A=false;
	for(int i=0; i<nums.length; i++) {
		if(nums[i]==2 && i>0 && nums[i-1]==2) {
			A=true;
		}
		if(nums[i]==2 && i<(nums.length-1)&& nums[i+1]==2) {
			A=true;
		}
	}return A;
}

//Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

//has22([1, 2, 2]) → true
//has22([1, 2, 1, 2]) → false
//has22([2, 1, 2]) → false
