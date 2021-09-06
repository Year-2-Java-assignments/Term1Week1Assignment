package nl.inholland;
import java.util.Locale;
import java.util.Scanner;

public class Week1Assignment3 {

    void assignment3 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of your group and press [Enter]");
        int groupSize = scanner.nextInt();
        System.out.println("group size: " + groupSize);
        Student [] students = new Student [groupSize];

        for (int i = 0;i < groupSize;i++)
        {
            System.out.println("Please enter name of student #" + (i+1)+" and press [Enter]:");
            students[i]= new Student();
            students[i].Name = scanner.next();
        }
        for(int i=0;i<groupSize;i++)
        {
            System.out.println("student #" +i+": "+ students[i].Name);
        }

        for (int i=0;i<groupSize;i++)
        {
            System.out.println("Is student #"+(i+1)+ " "+ students[i].Name + " "+ "present? [Y/N + ENTER]");
            String register = scanner.next();
            if (register.equalsIgnoreCase("n"))
            {
                students[i].register = Register.Absent;
            }
            else if (register.equalsIgnoreCase("y"))
            {
                students[i].register = Register.present;
            }
            else
            {
                System.out.println("cannot recognise letter");
            }
        }
        for (int i=0;i<groupSize;i++)
        {
            System.out.print("Student #"+i+": "+ students[i].Name+ "    "+"| Present: "+ students[i].register);
            System.out.println();
        }
    }
}
