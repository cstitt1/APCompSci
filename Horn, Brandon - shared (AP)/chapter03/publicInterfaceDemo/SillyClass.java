package publicInterfaceDemo;

/**
 * Represents a silly class with students that do things
 * and silly students that do silly things.
 */
public class SillyClass
{
    /**
     * Constructs a class containing the specified number
     * of students and silly students.
     * @param numberOfStudents the number of students
     * @param numberOfSillyStudents the number of silly students
     */
    public SillyClass(int numberOfStudents, int numberOfSillyStudents)
    {
        /* constructor body is not part of the public interface */
    }
    
    /**
     * Returns something very important about this silly class.
     * @return something very important about this silly class
     */
    public String veryImportantPublicMethod()
    {
        /* method body is not part of the public interface */
        return null;
    }
    
    /**
     * Changes the state of this silly class in a very important way.
     * @param veryImportantParameter a very important parameter
     */
    public void changeStateInVeryImportantWay(int veryImportantParameter)
    {
        /* method body is not part of the public interface */
    }
}
