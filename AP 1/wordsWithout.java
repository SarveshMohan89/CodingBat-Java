public String[] wordsWithout(String[] words, String target) {
   int A= 0;
	 	  for (int i = 0; i < words.length; i++) {
	 	    if (words[i].equals(target))
	 	      A++;
	 	  }
	 A = words.length - A;
	 int B= 0;
	 String[] str = new String[A];
	 for (int j = 0; j < words.length; j++) {
	 if (!words[j].equals(target)) {
	 str[B] = words[j];
	B++;
	  }
	 }
	 return str;
}

//Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.

//wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
//wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
//wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
