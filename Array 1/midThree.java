public int[] midThree(int[] nums) {
	int[] A=new int[3];
	int mid=nums.length/2;
	A[0]=nums[mid-1];
	A[1]=nums[mid];
	A[2]=nums[mid+1];

	return A;
}

//Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

//midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//midThree([1, 2, 3]) → [1, 2, 3]
