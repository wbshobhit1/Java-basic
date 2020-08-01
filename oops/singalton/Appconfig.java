package oops.singalton;

public class Appconfig  {
	
	private Appconfig() {
		
	}
	private static Appconfig obj=null;
	
	public static Appconfig getinstance() {
		if(obj==null) {
			obj=new Appconfig();
		}
		return obj;
	}

}
