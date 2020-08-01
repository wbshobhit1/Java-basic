package datastructure.comparatorandcomparable;

public class Compare implements Comparable<Compare> {

	int marks;
	String name;
	
	
	public Compare(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
       @Override
       public String toString() {
	   return "Compare [marks=" + marks + ", name=" + name + "]";
}
       public int getMarks() {
    	   return marks;
       }
       public void SetMarks(int marks) {
    	   this.marks=marks;
       }
       public String getName() {
    	   return name;
       }
       public void SetName(String name) {
    	   this.name=name;
       }

	@Override
	public int compareTo(Compare obj) {
		if(obj.marks-this.marks==0) {
			return this.name.compareTo(obj.name);
		}
		return (obj.marks-this.marks);
		
		
	}

}