import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();

        System.out.print("Enter marks of subject 1: ");
        double subject1 = sc.nextDouble();
        System.out.print("Enter marks of subject 2: ");
        double subject2 = sc.nextDouble();
        System.out.print("Enter marks of subject 3: ");
        double subject3 = sc.nextDouble();

        double total = subject1 + subject2 + subject3;
        double percentage = (total / 300) * 100;

        char grade;
        if (percentage >= 85) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Result");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
