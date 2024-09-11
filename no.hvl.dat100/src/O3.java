import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
    public static void main(String[] args) {
        int number = input("Number: ");
        int faculty = calculateFaculty(number);
        System.out.println("Faculty: " + faculty);
    }

    static int input(String inputText) {
        while (true) {
            try {
                String userInput = showInputDialog(inputText);
                int number = Integer.parseInt(userInput);
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Number needs to be higher than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ugyldig input. Vennligst skriv inn et gyldig tall.");
            }
        }
    }

    static int calculateFaculty(int number) {
        int faculty = 1;
        for (int i = 2; i <= number; i++) {
            faculty *= i;
        }
        return faculty;
    }
}
