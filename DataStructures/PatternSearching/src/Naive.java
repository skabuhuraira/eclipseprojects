/*
 * Naive algorithm for Pattern Searching
Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m.
Examples:

Input:  txt[] = "THIS IS A TEST TEXT"
        pat[] = "TEST"
Output: Pattern found at index 10

Input:  txt[] =  "AABAACAADAABAABA"
        pat[] =  "AABA"
Output: Pattern found at index 0
        Pattern found at index 9
        Pattern found at index 12
Worst case: Time Complexity = 0(m*n)
m=length of haystack
n=length of needle
Best case: O(length of haystack)
 */
public class Naive {
	
	public static int search(String haystack, String needle) {
	    if (null == haystack || null == needle || needle.length() == 0)
	    	return 0;
	    
	    for(int i =0 ; i< haystack.length() ; i++) {
	    	if(i+ needle.length() > haystack.length())
	    		return -1;
	    	int m = i;
	    	for(int j =0; j< needle.length(); j++) {
	    		if(haystack.charAt(m) == needle.charAt(j)) {
	    			if(j == needle.length() - 1) {
	    				return i;
	    			} else {
	    				m++;
	    			}
	    		}else {
	    			break;
	    		}
	    	}
	    }
	 
	    return -1;
	}
	
	public static void main(String[] args) 
    { 
        String txt = "ZZZZAABAACAADAABAAABAA"; 
        String pat = "AABA";
        //String pat = "Z";
        System.out.println(search(txt, pat)); 
    } 
	

}
