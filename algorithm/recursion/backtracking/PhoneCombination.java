package algorithm.recursion.backtracking;
import java.util.*;

public class PhoneCombination {
	  public static String code[]= {"0","abc","def","ghi","jkl","pqr","stu","vwx","yz"};

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	String str=scanner.nextLine();
	
	System.out.println(phonecom(str)); 
	}
	
	public static List<String> phonecom(String str){
		
		List<String> result_list=new ArrayList<>();
		if(str==null||str.length()==0) {
			return result_list;
		}
		listCombination(result_list,str,"",0,code);
		return result_list;
	}
	
	public static void listCombination(List<String> result_list,String str,String curr,int index,String[] code) {
		if(index==str.length()) {
			result_list.add(curr);
			return;
		}
		
		String letter=code[str.charAt(index)-'0'];
		for(int i=0;i<letter.length();i++) {
			listCombination(result_list,str,curr+letter.charAt(i),index+1,code);
		}
	}

}
