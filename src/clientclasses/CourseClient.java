package clientclasses;

import textbookquestions.Course;

/**
 * This is the client class for Course class.
 *
 * @author Ali Zoubeidi
 */
public class CourseClient {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Course course = new Course();
        course = course.setCode("CO6").setCredits(2).setDescription("An easy 3rd grade Math course!");
        System.out.println(course);
        
        Course course2 = new Course("CO6", "EVERYTONE", 2);
        String code = course2.getCode();
        String description = course2.getDescritption();
        double credz = course2.getCredits();
        System.out.println(course2.toString());
        
        if (course.equals(course2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different...");
        }
        
    }
}
