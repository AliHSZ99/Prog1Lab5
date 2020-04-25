package clientclasses;

import textbookquestions.Student;

/**
 * This is a program to test Student Class.
 *
 * @author Ali Zoubeidi
 */
public class StudentClient {
    
    public static void main(String[] args) {
        
        Student student = new Student();
        student.setName("Ali Zoubeidi").setGPA(-1).setSocialSecNum("111-11-1111");
        String name = student.getName();
        System.out.println(student);
        System.out.println(name);
        
        Student student2 = new Student("Ali Zoubeidi", "111-11-1111", 3.4);
        System.out.println(student2);
        
        if (student.equals(student2)) {
            System.out.println("\nThey are equal");
        } else {
            System.out.println("\nThey are NOT equal...");
        }
    }
}
