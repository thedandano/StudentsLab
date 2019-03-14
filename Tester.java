import java.util.*;
import java.io.*;
import java.util.ArrayList;
/**
 * This the Tester Class for the Student and Students Classes.
 *
 * @author (Dan Sedano)
 * @version (12/08/18)
 */
public class Tester
{
    
    public static void main (String args[]) throws IOException
    {
        String inFile = "Students.txt";
        String outFile = "output.txt";
        //Creates a new Students Class
        Students student = new Students();
        
        //Creates a PrintWriter Class and outputs to "output.txt".
        PrintWriter pw = new PrintWriter(new FileWriter(outFile));
        
        // Calls the read file Method from the Students class.
        student.readFile(inFile);
        
        //Prints the full list of Student objects to Terminal and to file.
        System.out.println("List of Students:");
        pw.println("List of Students:");
        System.out.print(student.toString());
        pw.print(student.toString());
        
        //Prints the student with the highest GPA to Terminal and to file.
        System.out.println("\nStudent with the highest GPA:");
        pw.println("\nStudent with the highest GPA:");
        System.out.println(student.bestGPA());
        pw.println(student.bestGPA());
        
        //Prints the average GPA of all the Students to Terminal and to file.
        System.out.printf("The average GPA is: %.2f\n",student.averageGPA());
        pw.printf("The average GPA is: %.2f\n",student.averageGPA());
        
        //Prints the number of students with an above average GPA to Terminal and to file.
        System.out.println("\nThere are " + student.size(student.aboveAverage(student.averageGPA())) + " students with an above average GPA.");
        pw.println("\nThere are " + student.size(student.aboveAverage(student.averageGPA())) + " students with an above average GPA.");
        
        //Prints the number of students with a below average GPA to Terminal and to file.
        System.out.println("There are " + student.size(student.belowAverage(student.averageGPA())) + " students with an below average GPA.");
        pw.println("There are " + student.size(student.belowAverage(student.averageGPA())) + " students with an below average GPA.");
        
        //Prints a list of the students with an above average GPA to Terminal and to file.
        System.out.println("\nStudents with an above average GPA:");
        pw.println("\nStudents with an above average GPA:");
        System.out.println(student.aboveAverage(student.averageGPA()).toString());
        pw.println(student.aboveAverage(student.averageGPA()).toString());
        
        //Prints the youngest student with a below average GPA to Terminal and to file.
        System.out.println("The youngest student with a below average GPA:");
        pw.println("The youngest student with a below average GPA:");
        System.out.println(student.youngest(student.belowAverage(student.averageGPA())));
        pw.println(student.youngest(student.belowAverage(student.averageGPA())));

        //Prints the average age of students with a below average GPA to Terminal and to file.
        System.out.printf("The average age of students with below average GPA: %.2f yrs\n",student.averageAge(student.belowAverage(student.averageGPA())));
        pw.printf("The average age of students with below average GPA: %.2f yrs\n",student.averageAge(student.belowAverage(student.averageGPA())));
        
        //Closes the PrintWriter File "Output.txt".
        pw.close();
    }
}
