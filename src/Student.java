import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	static DateFormat formatter = new SimpleDateFormat("MM dd yyyy");
	private String name;
	public String lastname;
	public Date dateOfBirth;
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	public Student(String name, String lastname, String date) throws ParseException {
		this.name = name;
		this.lastname = lastname;
		dateOfBirth = formatter.parse(date);
	}


	public String toString(){
		return "{Czeœæ! Jestem " + name + " " + lastname + ". Urodzi³em siê " + dateOfBirth + ".} ";
	}

}
