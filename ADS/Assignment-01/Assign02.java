import java.util.Scanner;
class Assign02{

	static boolean isAnagram(String s1, String s2){
		int[] res = new int[26];
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		for(int i=0; i<s1.length(); i++){
			res[s1.charAt(i)-'a']++;
		}
		for(int i=0; i<s2.length(); i++){
			res[s2.charAt(i)-'a']--;
		}
		
		for(int i=0; i<res.length; i++){
			if(res[i] != 0){
				return false;
			}
		}
		
		return true;
	}
	
	static String longestWord(String str){
		String arr[] = str.split(" ");
		String longer = "";
		for(String s : arr){
			if(s.length()>longer.length()){
				longer = s;
			}
		}
		return longer;
	}
	
	static void count(String str){
		String arr[] = str.toLowerCase().split(" ");
		int v = 0;
		int co = 0;
		for(String s: arr){
			for(int i=0; i<s.length(); i++){
				char c = s.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
					v++;
				}else{
					co++;
				}
			}
		}
		System.out.println("Vowels: "+v+", Consonants: "+co);
	}
	
	public static void main(String[] args){
		String s1 = "listen";
		String s2 = "silent";
		String sentence = "Practice makes a man perfect";
		System.out.println("Are '"+s1+"' and '"+s2+"' anagrams?"+" = "+ isAnagram(s1,s2));
		System.out.println("Longest word: "+ longestWord(sentence));
		count(sentence);
	}
}