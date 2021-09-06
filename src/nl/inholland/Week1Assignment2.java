package nl.inholland;
import java.util.Scanner;

public class Week1Assignment2 {
void assignment2() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter course name: ");
    String course = scanner.nextLine();
    System.out.print("Enter number of students: ");
    int nrOfStudents = scanner.nextInt();
    System.out.println();

    String [] students = new String[nrOfStudents];
    int [] grades = new int[nrOfStudents];
    for(int i = 0; i< nrOfStudents; i++)
   {
       System.out.print("Enter name of student " + (i+1) + ": ");
       students[i] = scanner.next();
   }
    System.out.println();

    int gradesAddition = 0;
    int maxGrade = grades[0];
    String maxStudent = "";
    String maxLine = "";

    for (int i = 0; i< nrOfStudents; i++)
    {
        System.out.print("Enter Grade of " + students[i]+ ": ");
        grades[i] = scanner.nextInt();

        gradesAddition += grades[i];

        if (grades[i]> maxGrade)
        {
            maxGrade = grades[i];
            maxStudent = students[i];
        }
    }
    System.out.println();

    int average = gradesAddition/nrOfStudents;

    System.out.println("Average grade: " + average);
    System.out.println("Student " + maxStudent + " has maximum grade: "+ maxGrade );
    System.out.println();

    for (int i= 0;i<nrOfStudents; i++)
    {
        System.out.println("Grade for student "+ students[i]+" (course " + course + "):" + grades[i]);
    }
    scanner.close();

}

}
