import java.util.Scanner;

public class Assignment3Scanner {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        double nsat = inputDevice.nextDouble();

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = inputDevice.nextDouble();

        System.out.print("Enter Entrance Exam Score: ");
        double entranceExam = inputDevice.nextDouble();

        double averageScore = (nsat + entranceExam) / 2.0;

        if (salary > 10000 || nsat < 90 || entranceExam < 85) {
            System.out.println("Application Status: Rejected");
        } else if (salary <= 3500 && averageScore >= 91) {
            System.out.println("Application Status: Accepted");
        } else {
            System.out.println("Application Status: For Further Study");
        }

        inputDevice.close();
    }
}
