package project;
import java.util.*;

class Student{
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("------------------------------------------------------");
		
	}
}

public class StudentManagement {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student>list = new ArrayList<>();
		
		while(true) {
			System.out.println("\n------------Student Management System------------");
			System.out.println("1.Add Student");
			System.out.println("2.View Students");
			System.out.println("3.Search Student");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter name:");
				String name = sc.nextLine();
				
				System.out.println("Enter marks:");
				int marks = sc.nextInt();
				
				list.add(new Student(id, name, marks));
				System.out.println("Student Added Successfully");
				break;
			case 2:
				if(list.isEmpty()) {
					System.out.println("No students found!");
				}
				else {
					for(Student s:list) {
						s.display();
					}
				}
				break;
			case 3:
				System.out.println("Enter Student ID to Search:");
				int searchId = sc.nextInt();
				boolean found = false;
				for(Student s : list) {
					if(s.id == searchId) {
						s.display();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Student Not Found!");
				}
				break;
			case 4:
				System.out.println("Thank You!");
				sc.close();
				System.exit(0);
				
				default:
					System.out.println("Invalid Choice!");
			}
		}
	}

}
