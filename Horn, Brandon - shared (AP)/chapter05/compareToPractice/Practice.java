package compareToPractice;

import java.util.Arrays;

public class Practice
{

    public static void main(String[] args)
    {
        String strA = "Brandon";
        String strB = "Horn";
        
        // write code to determine which string comes first
        // test with all 3 options (strA comes first, strB comes first, strA and strB are equal)
        
        
        Integer intA = new Integer(10);
        Integer intB = new Integer(5);
        
        // write code to determine which Integer object comes first
        // test with all 3 options
        
        
        Double doubleA = new Double(5.2);
        Double doubleB = new Double(7.3);
        
        // write code to determine which Double object comes first
        // test with all 3 options
        
        
        // implement the compareTo method in the Student class
        // do not modify the code below
        
        Student[] students = new Student[4];
        students[0] = new Student("Brandon", "Horn", 3.7);
        students[1] = new Student("Gregg", "Smith", 4.0);
        students[2] = new Student("Paul", "Hamnett", 3.6);
        students[3] = new Student("Dennis", "Lepold", 3.6);
        
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

}
