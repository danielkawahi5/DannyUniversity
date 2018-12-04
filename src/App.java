import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

     //TODO! --> metodki

public class App {

	public static void main(String[] args) throws ParseException {
		
		School school = new School();
		
		Class class1 = new Class();
		Class class2 = new Class();
		Class class3 = new Class();
		
		Student student1 = new Student("Denny", "Kawa", "12 28 1992");
		Student student2 = new Student("Majkel", "Mytnik", "05 25 1992");
		Student student3 = new Student("Kamil", "Piotrocipski", "12 07 1992");
		Student student4 = new Student("Dejmien", "Jeleni", "01 02 1987");
		Student student5 = new Student("Bartinius", "Kuthinius", "05 05 1987");
		Student student6 = new Student("Wiesiek", "Szczezny", "01 05 1988");
		Student student7 = new Student("King", "James", "05 29 1945");
		Student student8 = new Student("Menel", "Gienek", "05 05 1999");
		Student student9 = new Student("Pici", "Polo", "02 10 1914");
		Student student10 = new Student("Szachy", "Naczas", "09 10 1982");
		class1.add(student1);
		class1.add(student2);
		class1.add(student3);
		class1.add(student4);
		class1.add(student5);
		class1.add(student6);
		class1.add(student7);
		class1.add(student8);
		class1.add(student9);
		class1.add(student10);
		//class1.showList();
		
		Student student11 = new Student("Kombo", "Kimbo", "01 28 1992");
		Student student12 = new Student("Akwo", "Akwa", "02 25 1992");
		Student student13 = new Student("Mimbo", "Mimbobo", "03 07 1992");
		Student student14 = new Student("Hhuuhu", "Kiki", "04 02 1987");
		Student student15 = new Student("Bartinius", "Penisus", "05 05 1987");
		Student student16 = new Student("Wiesiek", "Pierdzi", "06 05 1988");
		Student student17 = new Student("Babcia", "Gienia", "07 29 1945");
		Student student18 = new Student("Biznesmen", "Gienek", "08 05 1999");
		Student student19 = new Student("Pici", "Pupu", "09 10 1914");
		Student student110 = new Student("Szachy", "Srututut", "10 10 1982");
		class2.add(student11);
		class2.add(student12);
		class2.add(student13);
		class2.add(student14);
		class2.add(student15);
		class2.add(student16);
		class2.add(student17);
		class2.add(student18);
		class2.add(student19);
		class2.add(student110);
		class2.showList();
		System.out.println();
		class2.alphabeticSort();
		System.out.println();
		class2.dateLessThanDateOfBirth(student14.getDateOfBirth());
		
		
	}

}
