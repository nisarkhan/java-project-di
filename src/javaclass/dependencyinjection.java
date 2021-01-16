package javaclass;

public class dependencyinjection {

	public static void main(String[] args) { 
	 
		
		//myuser usr = new myuser (new mysqldatabase());
		myuser usr = new myuser (new oracledatabase() );
		
		
		//myuser = usr = new myuser(db);
		usr.add("store this data");
	}

}
