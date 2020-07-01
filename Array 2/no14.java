public boolean no14(int[] nums) {
boolean res = true;
	for (int i = 0; i < nums.length; i++) {
	for (int j = 0; j < nums.length; j++) {
	if (nums[i] == 1 && nums[j] == 4)
	res = false;
	}
	}
	return res;
}

//Given an array of ints, return true if it contains no 1's or it contains no 4's.

//no14([1, 2, 3]) → true
//no14([1, 2, 3, 4]) → false
//no14([2, 3, 4]) → true
