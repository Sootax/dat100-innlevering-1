import static javax.swing.JOptionPane.showInputDialog;

public class O1 {
    public static void main(String[] args) {
        int lønn = input("Lønn: ");
        int trinnSkatt = calculateTrinnskatt(lønn);
        System.out.println("Trinnskatt: " + trinnSkatt + "kr");
    }

    static int input(String inputText) {
        while (true) {
            try {
                String userInput = showInputDialog(inputText);
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Ugyldig input. Vennligst skriv inn et gyldig tall.");
            }
        }
    }

    static int calculateTrinnskatt(int lønn) {
        double trinnSkatt = 0;
        int[] trinnGrenser = {1350000, 937900, 670000, 292850, 208050};
        double[] trinnSatser = {0.176, 0.166, 0.136, 0.040, 0.017};
        for (int i = 0; i < trinnGrenser.length; i++) {
            if (lønn > trinnGrenser[i]) {
                trinnSkatt += (lønn - trinnGrenser[i]) * trinnSatser[i];
                lønn = trinnGrenser[i];
            }
        }
        return (int) Math.floor(trinnSkatt);
    }
}