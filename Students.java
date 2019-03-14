import java.util.ArrayList;
import java.util.*;
import java.io.*;
/**
 * Represents a group of Students.
 *
 * @author (Dan Sedano)
 * @version (12/8/18)
 */
public class Students
{
    // instance variables - replace the example below with your own
    private ArrayList<Student> students;

    /**
     * Constructor for objects of class Students
     */
    public Students()
    {
        //Creates an empty ArrayList
        students = new ArrayList();
       
    }
    
    /**
     * Reads information from a file and adds it to an ArrayList of Students.
     */
    public void readFile(String file) throws IOException
    {
        String line;
        Scanner readFile = new Scanner(new File(file));
        
        while(readFile.hasNextLine())
        {
            //Reads the Name of a Student
            String name = readFile.nextLine();
            //Reads the Age line from the file and converts the String to an Integer
            line = readFile.nextLine();
            int age = Integer.parseInt(line);
            //Reads the GPA line from the file and converts the String to a double.
            line = readFile.nextLine();
            double gpa = Double.parseDouble(line);
            //Adds the read data to the ArrayList
            students.add(new Student(name,age,gpa));
        }
        readFile.close();
    }
    
    /**
     * Calculates which student has the best GPA.
     * 
     * @return the student with the best GPA.
     */
    public Students bestGPA()
    {
        Students bestGPA = new Students(); //Creates a new Students Object with an empty ArrayList (ArrayList)
        double maxValue = 0.0;
        int index = 0;
        //Traverses the original ArrayList
        for(int x = 0; x < students.size(); x++){
            if(students.get(x).getGPA() > maxValue){
                maxValue = students.get(x).getGPA();  // Every higher number will be recoreded here
                index = students.indexOf(students.get(x)); // Each time the maxValue is updated the index of the object will be recorded here
            }
        }
        bestGPA.add(students.get(index));//The highest GPA Student will be added to the empty bestGPA's ArrayList.
        
        return bestGPA;
    }
    
    /**
     * Calculates the average GPA of all the students.
     * 
     * @return returns the average GPA of all the students.
     */
    public double averageGPA()
    {
        double gpaSum = 0;
        //Adds all the GPA's together
        for(int x = 0; x < students.size();x++){
            gpaSum += students.get(x).getGPA();
        }
        //Returns the average GPA
        return gpaSum/students.size();
    }
    
    /**
     * Adds a Student to the ArrayList 
     */
    public void add(Student s)
    {
        students.add(s);
    }
    
    /**
     * Returns the number of students in a input ArrayList
     * 
     * @return the number of students.
     */
    public int size(Students input)
    {
        return input.students.size();
    }
    
    /**
     * Calculates which students have an above average GPA.
     * 
     * @return the students with an above average GPA.
     */
    public Students aboveAverage(double avgGPA)
    {
        //Creates a new Students object with an empty ArrayList
        Students aboveAverage = new Students();
        //Finds if students in the original ArrayList have a higher than average GPA
        for(int x = 0; x < students.size(); x++){
            if(students.get(x).getGPA() > avgGPA)
                aboveAverage.add(students.get(x)); //Adds students with an above average GPA to aboveAverage's ArrayList
        } 
        
        return aboveAverage;
    }
    
    /**
     * Calculate which students have a below average GPA.
     * 
     * @ return the students with a below average GPA.
     */
    public Students belowAverage(double avgGPA)
    {
        //Creats a new Students object with an empty ArrayList
        Students belowAverage = new Students();
        //Finds if students in the original ArrayList have a lower than average GPA
        for(int x = 0; x < students.size(); x++){
            if(students.get(x).getGPA() < avgGPA)
                belowAverage.add(students.get(x)); //Adds students with a below average GPA to belowAverage's ArrayList
        } 
        //System.out.print(belowAverage.students.toString());
        return belowAverage;
    }
    
    /**
     * Calculates the which student is the youngest from the passed Students object.
     * 
     * @return the youngest student.
     */
    public Students youngest(Students input)
    {
        Students output = new Students();
        int age = 100;
        int index = 0;
        
        for(int x = 0; x < input.students.size(); x++){
            if(input.students.get(x).getAge() < age){
                age = input.students.get(x).getAge(); //finds the lowest age and recordes it each time a new lower ages is found.
                index = input.students.indexOf(input.students.get(x)); // records the index of the current youngest student from the input list of Students
                //index = students.indexOf(students.get(x)); <-- Note to self: Eventhough this references all the students this works too— why...
            }
        }
        //adds the student to the empty ArrayList in the output Students object.
        output.add(input.students.get(index));
        return output;
    }
  
    /**
     * Calculates the average age of Students from a passed Students object.
     * 
     * @return the average age.
     */
    public double averageAge(Students input)
    {
        final int AGE = 100;
        double ageSum = 0;
        
        for(int x = 0; x < input.students.size(); x++){
            if(input.students.get(x).getAge() < AGE){
                ageSum += input.students.get(x).getAge(); // adds all the ages of the input list
            }
        }
        //returns the average age
        return ageSum / input.students.size();
    }
    
    /**
     * A String representation of the Students Class.
     * 
     * @return a String representation. 
     */
    public String toString()
    {
        String print = "";
        for (Student s : students){
            print += s.toString();
        }
        return print;
    }
}
