package textbookquestions;

/**
 * This program encapsulates the concept of a grade, with attributes code, a
 * description, and a number of credits.Include a constuctor, accessors and
 * mutators, and methods toString and equals. Write a client class to test.
 *
 * @author Ali Zoubeidi
 */
public class Course {

    private String code;
    private String description;
    private double credits;

    public Course() {
        code = "unknown";
        description = "No description entered";
    }

    public Course(String startCode, String startDescription, double startCredits) {
        code = startCode;
        description = startDescription;
        if (startCredits >= 0.0) {
            credits = startCredits;
        }
    }

    public String getCode() {
        return code;
    }

    public String getDescritption() {
        return description;
    }

    public double getCredits() {
        return credits;
    }

    public Course setCode(String code) {
        this.code = code;
        return this;
    }

    public Course setDescription(String description) {
        this.description = description;
        return this;
    }

    public Course setCredits(double credits) {
        this.credits = credits;
        return this;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nCode: " + code + "\nDescription: " + description
                + "\nCredits: " + credits;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course)) {
            return false;
        } else {
            Course objCourse = (Course) o;
            if (code.equals(objCourse.code) && credits == objCourse.credits) {
                return true;
            } else {
                return false;
            }
        }
    }
}
