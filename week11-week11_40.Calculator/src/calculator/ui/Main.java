package calculator.ui;



import calculator.applicationlogic.SimpleCalculator;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new GraphicCalculator(new SimpleCalculator()));
    }
}
