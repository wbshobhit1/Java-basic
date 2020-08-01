package oops.interfac;

public abstract interface Youtuber {

	public abstract void makevideo();
	
	default void uploadvideo() {
		System.out.println("upload video");
	}
}
