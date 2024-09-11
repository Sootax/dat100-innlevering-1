import static javax.swing.JOptionPane.showInputDialog;

public class O2 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            int gradeNumber = input("Poengsum: ");
            String grade = calculateGrade(gradeNumber);
            System.out.println(grade);
        }
    }

    static int input(String inputText) {
        boolean validInput = false;
        int gradeNumber = 0;
        do {
            String userInput = showInputDialog(inputText);
            try {
                gradeNumber = Integer.parseInt(userInput);
                if (100 >= gradeNumber && gradeNumber >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Input needs to be between 0 and 100");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input can only contain numbers.");
            }
        } while (!validInput);
        return gradeNumber;
    }

    static String calculateGrade(int gradeNumber) {
        String grade = "";
        if (gradeNumber > 90) {
            grade = "A";
        } else if (gradeNumber > 80) {
            grade = "B";
        } else if (gradeNumber > 60) {
            grade = "C";
        } else if (gradeNumber > 50) {
            grade = "D";
        } else if (gradeNumber > 40) {
            grade = "E";
        } else if (gradeNumber > 0) {
            grade = "F";
        }
        return grade;
    }
}
