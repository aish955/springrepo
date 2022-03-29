package discussion3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


class MyBean {
	private String firstname;
	private String lastname;

	@Override
	public String toString() {
		return "MyBean [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public static MyBean createObject() {
		
	return new MyBean();
}

public class FileReading {

	public static void main(String[] args) {
		File f=new File("src/discussion3/user_data.xml");	
		try {
			
			Scanner filereader=new Scanner(f);
			MyBean obj1=MyBean.createObject();
			obj1.setFirstname(filereader.nextLine());
			obj1.setLastname(filereader.nextLine());
			System.out.println(obj1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
			
		}

	}

}
