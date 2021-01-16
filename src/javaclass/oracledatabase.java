package javaclass;

public class oracledatabase implements Database{
	
	public void persist(String data) {
		System.out.print("oracle data persistent" + data);
	}

}
