package prog1lab5;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * This program reads a file containing a list of names and scores. The program
 * should identify and output the names with the highest and lowest score, the
 * total amount of grades processed, and the average score of all processed.
 *
 * @author Ali Zoubeidi
 */
public class TestScoresFile {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        
        File inputFile = new File("/Users/hussein/Desktop/NameAndScore.txt");
        Scanner file = new Scanner(inputFile);
        
        int countGrades = 0;
        double total = 0;
        double average;
        double min = 100, max = 0;
        
        String minName = "", maxName = "";
        String name;
        String record;
        String grade;
        
        int space;
        double gradeDouble;
        
        if (!file.hasNext()) {
            System.out.println("\nNo Records Available...");
            System.exit(0);
        }
        
        while (file.hasNext()) {
            record = file.nextLine();
            space = record.indexOf(" ");
            name = record.substring(0, space);
            
            grade = record.substring(space);
            gradeDouble = Double.parseDouble(grade);
            
            if (gradeDouble >= max) {
                maxName = name;
                max = gradeDouble;
            } else if (gradeDouble <= min) {
                minName = name;
                min = gradeDouble;
            }
            total += gradeDouble;
            countGrades++;  
        }
        DecimalFormat formatAll = new DecimalFormat("0.0#");
        average = total/countGrades;
        
        System.out.println("\nTotal Number of Grades: " + countGrades);
        System.out.println("Lowest Grade: " + minName + " " + formatAll.format(min) + "%");
        System.out.println("Highest Grade: " + maxName + " " + formatAll.format(max) + "%");
        System.out.println("Average: " + formatAll.format(average) + "%");
        

    }
}
