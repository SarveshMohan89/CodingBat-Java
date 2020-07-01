public int[] squareUp(int n) {
  int[] A=new int[n*n];
	int B=n-1; int pass=1; int index=0;
	if(n==0) {
		return A;
}
	for(int i=n-1;i<A.length; i+=n) {
		index=i;
		for(int k=1;k<=pass;k++) {
			if(k==0)
				break;
			A[index]=k;
			index--;
		}
		pass++;
	}
	return A;
}

//Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

//squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
//squareUp(2) → [0, 1, 2, 1]
//squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
