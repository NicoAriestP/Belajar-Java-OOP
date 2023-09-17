import javax.swing.JOptionPane;

public class KonverterSuhu {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan suhu dalam Celcius:");
        
        // Mengubah input string menjadi double
        double celcius = Double.parseDouble(input);

        double fahrenheit = (celcius * 9/5) + 32;

        String output = "Suhu dalam Fahrenheit: " + fahrenheit;

        JOptionPane.showMessageDialog(null, output);
    }
}
