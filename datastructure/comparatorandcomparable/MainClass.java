package datastructure.comparatorandcomparable;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Compare> com=new ArrayList<>();
		com.add(new Compare(23,"Ram"));
		com.add(new Compare(13,"shyam"));
		com.add(new Compare(3,"Ram"));
		com.add(new Compare(3,"Aaam"));
		com.add(new Compare(43,"Bam"));
		com.add(new Compare(28,"Tanya"));
		
//		2: INSTEAD OF MAKING NEW CLASS WE CAN MAKE A COMPARATOR FUNCTION HERE ONLY BECAUSE ITS WANTS ONLY OBJECT
		
//		Collections.sort(com,new Comparator<Compare>(){
//			@Override
//			public int compare(Compare o1,Compare o2) {
//				if(o1.name.equals(o2.name)) {
//					return (o2.marks-o1.marks);
//				}
//				else {
//					return o1.name.compareTo(o2.name);
//				}
//				
//			}
//			
//		});
		
//  3:ANANOMOUS TYPE LAMDA TYPE

//	Collections.sort(com, ( o1, o2) -> {
//			if(o1.name.equals(o2.name)) {
//				return (o2.marks-o1.marks);
//			}
//			else {
//				return o1.name.compareTo(o2.name);
//			}
//			});
		
		
//    4:KEYFACTOR METHOD ONE LINE METHOD (COMAPRE.COMPARING->THEN COMPARING-> REVEERSEORDER() )
		
		Collections.sort(com,Comparator.comparing(Compare::getName).thenComparing(Compare::getMarks).reversed());
		
		com.forEach(System.out::println);
	}	
}

//         1: WE ARE CREATING A NEW CLASS HERE FOR COMAPARATOR FUNCTION TO EXECUTE
         
//		class SortbyNamethenMarks implements Comparator<Compare>{
//			
//		@Override
//		public int compare(Compare o1,Compare o2) {
//			if(o1.name.equals(o2.name)) {
//				return (o2.marks-o1.marks);
//			}
//			else {
//				return o1.name.compareTo(o2.name);
//			}
//			
//		}
//		}
	

