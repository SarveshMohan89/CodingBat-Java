public boolean either24(int[] nums) {
  boolean A=false;
	boolean B=false;
	for(int i=0; i<nums.length; i++) {
		if(nums[i]==2 && i<nums.length-1&& nums.length>1 && nums[i+1]==2)
			A=true;
		if(nums[i]==4 && i<nums.length-1&& nums.length>1 && nums[i+1]==4)
			B=true;
	}
		if(A==B)
			return false;
		else if(!A&& !B)
			return false;
		else
			return true;
}

//Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

//either24([1, 2, 2]) → true
//either24([4, 4, 1]) → true
//either24([4, 4, 1, 2, 2]) → false
