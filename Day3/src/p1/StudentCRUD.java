package p1;

import java.util.LinkedList;
public class StudentCRUD {
	public static void main(String[] args) {	
		LinkedList<String> students = new LinkedList<>();
			// CREATE with duplicate checking
			addStudent(students, "Rahul");
			addStudent(students, "Priya");
			addStudent(students, "Amit");
			addStudent(students, "Rahul"); // duplicate

			System.out.println("\nStudents : " + students);
			students.addFirst("Principal Recommendation");
			students.addLast("Late Admission");
			System.out.println("\nAfter addFirst() and addLast() : " + students);
			if (!students.isEmpty()) {
					System.out.println("\nFirst Student : " + students.getFirst());
					System.out.println("Last Student : " + students.getLast());
			}
			searchStudent(students, "Priya");
			updateStudent(students, "Priya", "Rohan");
			deleteStudent(students, "Amit");
			if (!students.isEmpty()) {
				System.out.println("\nRemoved First : " + students.removeFirst());
			}
			if (!students.isEmpty()) {
				System.out.println("Removed Last : " + students.removeLast());
			}
			System.out.println("\nCurrent Students:");
			for (String student : students) {
					System.out.println(student);
			}
			System.out.println("\nTotal Students : " + students.size());
			students.clear();

			System.out.println("\nAfter clear() : " + students);
			System.out.println("Is List Empty? " + students.isEmpty());
	}
	static void addStudent(LinkedList<String> students, String name) {
		if (students.contains(name)) {
			System.out.println(name + " already exists. Duplicate not allowed.");
		} else {
			students.add(name);
			System.out.println(name + " added successfully.");
		}
	}

	static void searchStudent(LinkedList<String> students, String name) {
		if (students.contains(name)) {
			System.out.println("\n" + name + " is enrolled.");
		} else {
			System.out.println("\n" + name + " is not enrolled.");
		}
	}
	static void updateStudent(LinkedList<String> students, String oldName, String newName) {
		int index = students.indexOf(oldName);
		if (index != -1) {
			students.set(index, newName);
			System.out.println("\nUpdated " + oldName + " to " + newName);
		} else {
			System.out.println("\nCannot update. " + oldName + " not found.");
		}
		System.out.println("After Update : " + students);
	}
	static void deleteStudent(LinkedList<String> students, String name) {
		if (students.remove(name)) {
			System.out.println("\n" + name + " removed successfully.");
		} else {
			System.out.println("\nCannot delete. " + name + " not found.");
		}
		System.out.println("After Delete : " + students);
	}
}