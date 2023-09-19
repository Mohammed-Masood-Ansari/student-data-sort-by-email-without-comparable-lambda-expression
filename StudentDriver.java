package lambda_expression.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		
		
		Student student1 = new Student(123, "najim", "najim1997@gmail.com");
		Student student2 = new Student(12376, "ali", "anmol@gmail.com");
		Student student3 = new Student(1234, "chauhan", "maliha1997@gmail.com");
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		/*
		 * sort the students details by his/her id lambda expression
		 */
		//Collections.sort(students,(s1,s2)->(s1.getId()<s2.getId())?-1:(s1.getId()>s2.getId())?1:-0);
		
		/*
		 * sort students details by using his/her name lambda expression
		 */
		Collections.sort(students,(s1,s2)->(s2.getName().compareTo(s1.getName())));
		
		for (Student student : students) {
			
			System.out.println("studentId= "+student.getId());
			System.out.println("studentName= "+student.getName());
			System.out.println("studentEmail= "+student.getEmail());
		}
	}
}
