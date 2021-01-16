package javaclass;

public class mysqldatabase implements Database {
	
	public void persist(String data) {
		System.out.print("my sql data persistent" + data);
	}

}
