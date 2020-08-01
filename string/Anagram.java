package string;

public class Anagram {

	public static void main(String[] args) {
		
		String a="aabdcb#@";
		String b="aabbcd@#";
		
		boolean isAnagram=true;
	
		
		//// 1ST METHOD-o(n^2)
//		boolean isAnagram=false ;
//		boolean visited[]=new boolean[b.length()];
//		if(a.length() == b.length()) {
//			
//			for(int j=0;j<a.length();j++) {
//				char c=a.charAt(j);
//				isAnagram=false;
//				
//				for(int i=0;i<b.length();i++) {
//					if(b.charAt(i)==c && !visited[i]) {
//						visited[i]=true;
//						isAnagram=true;
//						break;
//					}
//				}
//				if(!isAnagram) 
//					break;
//				
//			}
//		}
		
//		///2ND METHOD WITH LESS COMPLAXCITY-(o(nlogn) )
//		
//		int al[]=new int[256];
//		int bl[]=new int[256];
//		
//		for(char c:a.toCharArray()) {
//			int index=(int)c;// Inially sab me phele se 0 store hoga jo malum hai.
//			al[index]++;// aur yaha 1 se increment hoga aur 2 baar koi element hoga to 2hojayega .
//		}
//		
//		for(char c:b.toCharArray()) {
//			int index=(int)c;// Inially sab me phele se 0 store hoga jo malum hai.
//			bl[index]++;// aur yaha 1 se increment hoga aur 2 baar koi element hoga to 2hojayega .
//		}
//		
//		for(int i=0;i<256;i++) {
//			if(al[i] != bl[i]) {
//				isAnagram=false;
//				break;
//			}
//		}
		
		///3RD METHOD WITH BEST LESS COMPLAXCITY-(o(n) )
		
				int al[]=new int[256];
				
				
				for(char c:a.toCharArray()) {
					int index=(int)c;// Inially sab me phele se 0 store hoga jo malum hai.
					al[index]++;// aur yaha 1 se increment hoga aur 2 baar koi element hoga to 2hojayega .
				}
				
				for(char c:b.toCharArray()) {
					int index=(int)c;// yaha actually array me change string ko sirf a wale ko rahe hai b ko nahi
					al[index]--;// mtlb agar anagram hoga a array me jitna character hoga wo 1 baar store karega then
					}// al[index]-- se wapas usko remove karega agr zero aayegya to anagram	
				
				for(int i=0;i<256;i++) {
					if(al[i] != 0) {
						isAnagram=false;
						break;
					}
				}
		
		if(isAnagram) {
			System.out.println("ANAGRAM");
		}
		else {
			System.out.println("NOT ANAGRAM");
		}
	}

}
