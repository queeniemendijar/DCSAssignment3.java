public class Assignment3JOptionPane {
    public static void main(String[] args) {

        String nsatInput = JOptionPane.showInputDialog("Enter applicant's NSAT Score:");
        String salaryInput = JOptionPane.showInputDialog("Enter parents' Monthly Salary:");
        String examInput = JOptionPane.showInputDialog("Enter applicant's Entrance Exam Score:");

        double nsat = Double.parseDouble(nsatInput);
        double salary = Double.parseDouble(salaryInput);
        double entranceExam = Double.parseDouble(examInput);

        double averageScore = (nsat + entranceExam) / 2.0;
        String status = "";

        if (salary > 10000 || nsat < 90 || entranceExam < 85) {
            status = "Rejected";
        } else if (salary <= 3500 && averageScore >= 91) {
            status = "Accepted";
        } else {
            status = "For Further Study";
        }

        JOptionPane.showMessageDialog(null, "Application Status Result: " + status);
    }
}
