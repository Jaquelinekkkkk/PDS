package Aula6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 public  class Conversao {
    public double calcularTemperatura(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class ConversorTemperatura extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField campoFahrenheit;
    private JLabel resultadoCelsius;
   private Conversao conversao;

    public ConversorTemperatura() {
        setTitle("Conversor de Temperatura");
        setSize(476, 238);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        JLabel labelFahrenheit = new JLabel("Temperatura em Fahrenheit:");
        labelFahrenheit.setBounds(5, 9, 215, 17);
        getContentPane().add(labelFahrenheit);

        campoFahrenheit = new JTextField(10); 
        campoFahrenheit.setBounds(244, 6, 86, 20);
        getContentPane().add(campoFahrenheit);

        JButton botaoConverter = new JButton("Converter");
        botaoConverter.setBounds(21, 51, 139, 29);
        getContentPane().add(botaoConverter);

        resultadoCelsius = new JLabel("Temperatura em Celsius: ");
        resultadoCelsius.setBounds(21, 113, 184, 20);
        getContentPane().add(resultadoCelsius);

        conversao = new Conversao();

        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(campoFahrenheit.getText());
                    double celsius = conversao.calcularTemperatura(fahrenheit);
                    resultadoCelsius.setText("Temperatura em Celsius: " + String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!");
                }
            }
        });
    }

    public static void main(String[] args) {
        ConversorTemperatura frame = new ConversorTemperatura();
        frame.setVisible(true);
    }
}
