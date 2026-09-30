import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter distance from university (km): ");
        double distance = sc.nextDouble();
        int fee;
        if (distance <= 5) {
            fee = 2000;
        } else if (distance <= 10) {
            fee = 3500;
        } else if (distance <= 20) {
            fee = 5000;
        } else {
            fee = 7000;
        }

        System.out.println("Transport Fee");
        System.out.println("Name: " + name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Monthly Fee: Rs. " + fee);
    }
}
