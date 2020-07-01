public int commonTwo(String[] a, String[] b) {
  int A=0;
  String B="";
  for(int i=0; i<b.length; i++){
    for(int n=0; n<a.length; n++){
      if(a[n].equals(b[i]) && !B.contains(a[n])){
        B+=a[n];
        A++;
      }
    }
  }
  return A;
}

//Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

//commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
//commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
//commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
