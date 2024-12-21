package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class EquationSolver {

    public static void main(String[] args) {
        String[] options = {"First-degree equation", "System of first-degree equations", "Second-degree equation"};
        int choice = JOptionPane.showOptionDialog(null, "Select the equation to solve:", "Equation Solver",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:
                solveFirstDegreeEquation();
                break;
            case 1:
                solveSystemOfEquations();
                break;
            case 2:
                solveSecondDegreeEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice!");
        }
    }

    // Solves the first-degree equation ax + b = 0
    private static void solveFirstDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a (a ≠ 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input: 'a' must not be 0!");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }
    }

    // Solves the system of first-degree equations
    private static void solveSystemOfEquations() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant b2:"));

        // Calculate determinants
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "The solution is x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Solves the second-degree equation ax^2 + bx + c = 0
    private static void solveSecondDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient a (a ≠ 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter coefficient b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter constant c:"));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input: 'a' must not be 0!");
        } else {
            // Calculate the discriminant
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has two real roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has one double root: x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no real roots.");
            }
        }
    }
}
