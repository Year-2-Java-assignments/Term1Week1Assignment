package nl.inholland;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main myMain = new Main ();
        myMain.Start();

        Week1Assignment2 assignment = new Week1Assignment2();
        assignment.assignment2();
      Week1Assignment3 assignment3 = new Week1Assignment3();
      assignment3.assignment3();
    }

    void Start()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter name: ");
        String name  = scanner.next();
        System.out.println("please enter age: ");
        int age = scanner.nextInt();
        System.out.println("your name is "+ name + " " +"you are "+ age + " years old");
        scanner.close();
    }
}
