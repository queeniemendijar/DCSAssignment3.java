import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment3BufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter NSAT Score: ");
            double nsat = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter Parents' Monthly Salary: ");
            double salary = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter Entrance Exam Score: ");
            double entranceExam = Double.parseDouble(dataIn.readLine());


            double averageScore = (nsat + entranceExam) / 2.0;


            if (salary > 10000 || nsat < 90 || entranceExam < 85) {
                System.out.println("Application Status: Rejected");
            } else if (salary <= 3500 && averageScore >= 91) {
                System.out.println("Application Status: Accepted");
            } else {
                System.out.println("Application Status: For Further Study");
            }

        } catch (IOException e) {
            System.out.println("Error reading keyboard input stream data.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input! Please enter valid numbers.");
        }
    }
}
