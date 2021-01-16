package javaclass;

public class myuser {
	
	Database  database;
	
	public myuser(Database database) {
		this.database = database; 
	}
	
	public void add(String data) {
		database.persist("storing in db ..." + data);
	}

}
