public boolean haveThree(int[] nums) {
  int count = 0;
 boolean A = false;
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 3)
  A = false;
	    if (nums[i] == 3 && A== true)
	    return false;
if (nums[i] == 3 && A == false) {
  A = true;
  count++;
    }
	  }
	  return(count == 3);
}

//Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

//haveThree([3, 1, 3, 1, 3]) → true
//haveThree([3, 1, 3, 3]) → false
//haveThree([3, 4, 3, 3, 4]) → false
