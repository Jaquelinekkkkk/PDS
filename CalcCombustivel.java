package Interfaces;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcCombustivel extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2607695913894176772L;
	private JTextField precoLitroField;
    private JTextField valorPagamentoField;
    private JLabel resultadoLabel;

    public CalcCombustivel() {
        setTitle("Calculadora de Combustível");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel precoLitroLabel = new JLabel("Preço por Litro:");
        precoLitroLabel.setBounds(50, 50, 150, 30);
        add(precoLitroLabel);

        precoLitroField = new JTextField();
        precoLitroField.setBounds(200, 50, 150, 30);
        add(precoLitroField);

        JLabel valorPagamentoLabel = new JLabel("Valor a Pagar:");
        valorPagamentoLabel.setBounds(50, 100, 150, 30);
        add(valorPagamentoLabel);

        valorPagamentoField = new JTextField();
        valorPagamentoField.setBounds(200, 100, 150, 30);
        add(valorPagamentoField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(150, 150, 100, 30);
        add(calcularButton);

        resultadoLabel = new JLabel("Litros de gasolina: ");
        resultadoLabel.setBounds(50, 200, 300, 30);
        add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularLitros();
            }
        });
    }

    private void calcularLitros() {
        try {
            float precoLitro = Float.parseFloat(precoLitroField.getText());
            float valorPagamento = Float.parseFloat(valorPagamentoField.getText());

            CalculoLitros calculoLitros = new CalculoLitros(precoLitro, valorPagamento);
            float litros = calculoLitros.calcularLitros();

            resultadoLabel.setText(String.format("Litros de gasolina: %.2f", litros));
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Por favor, insira valores válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalcCombustivel().setVisible(true);
            }
        });
    }
}
