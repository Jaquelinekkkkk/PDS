package Interfaces;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fomelandia extends JFrame {
	
	    private JTextField pesoField;
	    private JTextField precoQuiloField;
	    private JLabel resultadoLabel;

	    public Fomelandia() {
	        setTitle("Restaurante Fomelândia");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);

	        JLabel pesoLabel = new JLabel("Peso do Prato (kg):");
	        pesoLabel.setBounds(50, 50, 150, 30);
	        add(pesoLabel);

	        pesoField = new JTextField();
	        pesoField.setBounds(200, 50, 150, 30);
	        add(pesoField);

	        JLabel precoQuiloLabel = new JLabel("Preço por Quilo (R$):");
	        precoQuiloLabel.setBounds(50, 100, 150, 30);
	        add(precoQuiloLabel);

	        precoQuiloField = new JTextField();
	        precoQuiloField.setBounds(200, 100, 150, 30);
	        add(precoQuiloField);

	        JButton calcularButton = new JButton("Calcular");
	        calcularButton.setBounds(150, 150, 100, 30);
	        add(calcularButton);

	        resultadoLabel = new JLabel("Total a Pagar: ");
	        resultadoLabel.setBounds(50, 200, 300, 30);
	        add(resultadoLabel);

	        calcularButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                calcularValor();
	            }
	        });
	    }

	    private void calcularValor() {
	        try {
	            float peso = Float.parseFloat(pesoField.getText());
	            float precoQuilo = Float.parseFloat(precoQuiloField.getText());

	            Calculadora calculadora = new Calculadora(precoQuilo, peso);
	            float valorTotal = calculadora.calcularValor();

	            resultadoLabel.setText(String.format("Total a Pagar: R$ %.2f", valorTotal));
	        } catch (NumberFormatException e) {
	            resultadoLabel.setText("Por favor, insira valores válidos.");
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new Fomelandia().setVisible(true);
	            }
	        });
	    }
	}
