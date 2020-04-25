package textbookquestions;

/**
 * This class encapsulates the concept of a course grade with attributes course
 * name and a letter grade. Include a constructor, accessors and mutators, and
 * methods toString and equals. Write a client class to test.
 *
 * @author Ali Zoubeidi
 */
public class CourseGrade {

    private String courseName;
    private char courseGrade;

    public CourseGrade() {
        courseName = "unknown";
        courseGrade = '?';
    }

    public CourseGrade(String startCourseName, char startCourseGrade) {
        courseName = startCourseName;
        if (Character.isLetter(startCourseGrade)) {
            courseGrade = startCourseGrade;
        } else {
            courseGrade = '?';
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public char getCourseGrade() {
        return courseGrade;
    }

    public CourseGrade setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public CourseGrade setCourseGrade(char courseGrade) {
        if (Character.isLetter(courseGrade)) {
            this.courseGrade = courseGrade;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName
                + "; Grade: " + courseGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CourseGrade)) {
            return false;
        } else {
            CourseGrade objCourseGrade = (CourseGrade) o;
            if (courseName.equals(objCourseGrade.courseName) && courseGrade == objCourseGrade.courseGrade) {
                return true;
            } else {
                return false;
            }
        }
    }

}
