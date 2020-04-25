package textbookquestions;

/**
 * This is a class encapsulating the concept of a student with attributes name,
 * Social-Security number, and a GPA. Include a constructor, the accessors and
 * mutators, and methods toString and equals. Test in client class.
 *
 * @author Ali Zoubeidi
 */
public class Student {

    private String name;
    private String socialSecNum;
    private double gpa;

    public Student() {
        name = "unknown";
        socialSecNum = "unknown";
    }

    public Student(String startName, String startSocialSecNum, double startGPA) {
        name = startName;
        socialSecNum = startSocialSecNum;
        if (startGPA >= 0.0 && startGPA <= 4.0) {
            gpa = startGPA;
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecNum() {
        return socialSecNum;
    }

    public double getGPA() {
        return gpa;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
        return this;
    }

    public Student setGPA(double gpa) {
        this.gpa = gpa;
        return this;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nSocial-Security number: " + socialSecNum
                + "\nGPA: " + gpa;
    }
   
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) {
            return false;
        } else {
            Student objStudent = (Student) o;
            if (socialSecNum.equals(objStudent.socialSecNum)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
