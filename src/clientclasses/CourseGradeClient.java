package clientclasses;

import textbookquestions.CourseGrade;

/**
 * This is the client program of the CourseGrade Class.
 *
 * @author Ali Zoubeidi
 */
public class CourseGradeClient {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        CourseGrade grade = new CourseGrade();
        char note = grade.getCourseGrade();
        String course = grade.getCourseName();
        grade.setCourseName("Math Concepts");
        grade.setCourseGrade('B');
        System.out.println(grade);
        
        CourseGrade grade2 = new CourseGrade("Math Concepts", 'A');
        System.out.println(grade2);
        
        if (grade.equals(grade2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        
    }
}
