public boolean tripleUp(int[] nums) {
  boolean A=false;
	int B=0;
	for(int i=0; i<nums.length; i++) {
		if(i<nums.length-1) {
			int sum=nums[i+1]-nums[i];
			if(sum==1)
				B++;
			else
				B=0;}
		if (B==2)
			A=true;
		}
	return A;
}

//Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

//tripleUp([1, 4, 5, 6, 2]) → true
//tripleUp([1, 2, 3]) → true
//tripleUp([1, 2, 4]) → false
