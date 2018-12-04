import java.util.List;

public class School {
	public List<Class> listOfClassStudents;
	
	public void showClass() {
		for(Class c : listOfClassStudents) {
			System.out.println(listOfClassStudents);
		}
	}
	public School() {};
}
