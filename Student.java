    
    /**
     * Class that represents a student object.
     *
     * @author (Dan Sedano)
     * @version (12/8/18)
     */
    public class Student
    {
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    private double gpa;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String n, int a, double g)
    {
        // initialise instance variables
        name = n;
        age = a;
        gpa = g;
    }
    
    /**
     * Returns the name.
     * @ return the name
     */ 
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the age.
     * @return the age.
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * Returns the GPA.
     * @return the GPA.
     */
    public double getGPA()
    {
        return gpa;
    }
    
    /**
     * Returns the object as a String representation.
     * 
     */
    public String toString()
    {
        return String.format("%10s %5d %10.2f \n", name, age, gpa);
    }
}
