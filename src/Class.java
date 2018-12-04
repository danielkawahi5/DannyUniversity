import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Class {
	
	private List<Student>listOfStudents = new ArrayList<>();
	private Date dateOfBirth;
	
	public Class() {
	}
	
	public void add(Student student) {
		listOfStudents.add(student);
	}
	
	public void showList() {
		for(Student s : listOfStudents) {
			System.out.println(s);
			//System.out.println(listOfStudents);
		}
	}
	
	public void alphabeticSort() {
	Collections.sort(listOfStudents, new Comparator() {

		@Override
		public int compare(Object student1, Object student2) {
			return ((Student)student1).lastname.compareTo(((Student)student2).lastname);
			}
		});
	for(Student s : listOfStudents) {
		System.out.println(s);
	}
	//System.out.println(listOfStudents);
	}
	
	public void dateLessThanDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		List<Student>dateSortStudents = new ArrayList<>();
		for(Student s : listOfStudents) {
			if(dateOfBirth.getTime() < s.getDateOfBirth().getTime()) {
				dateSortStudents.add(s);
			}
		}
		for(Student s : dateSortStudents) {
			System.out.println(s);
		}
	}
	
	public void dateBiggerThanDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		List<Student>dateSortStudents = new ArrayList<>();
		for(Student s : listOfStudents) {
			if(dateOfBirth.getTime() > s.getDateOfBirth().getTime()) {
				dateSortStudents.add(s);
			}
		}
		System.out.println(dateSortStudents);
	}
	public String toString() {
		return listOfStudents.toString();
	}
}
