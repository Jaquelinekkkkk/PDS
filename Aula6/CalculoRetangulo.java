package Aula6;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculoRetangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPan;// deu certo mas esta sublinhdo


	private JTextField campoBase;
    private JTextField campoAltura;
    private JLabel resultadoPerimetro;
    private JLabel resultadoArea;

	    // Construtor 
	    public CalculoRetangulo() {
	         setTitle("Cálculo do Retângulo");
	        setSize(350, 250);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);

	        JLabel labelBase = new JLabel("Base:");
	        labelBase.setBounds(10, 10, 100, 25);
	        add(labelBase);

	        campoBase = new JTextField();
	         campoBase.setBounds(120, 10, 100, 25);
	        add(campoBase);

	        JLabel labelAltura = new JLabel("Altura:");
	        labelAltura.setBounds(10, 50, 100, 25);
	        add(labelAltura);

	        campoAltura = new JTextField();
	        campoAltura.setBounds(120, 50, 100, 25);
	        add(campoAltura);

	        JButton botaoCalcular = new JButton("Calcular");
	        botaoCalcular.setBounds(10, 90, 100, 25);
	        add(botaoCalcular);

	          resultadoPerimetro = new JLabel("Perímetro: ");
	          resultadoPerimetro.setBounds(10, 130, 250, 25);
	          add(resultadoPerimetro);

	        resultadoArea = new JLabel("Área: ");
	        resultadoArea.setBounds(10, 160, 250, 25);
	        add(resultadoArea);

	        botaoCalcular.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    //  base e altura 
	                    double base = Double.parseDouble(campoBase.getText());
	                     double altura = Double.parseDouble(campoAltura.getText());

	                    //  instância  Retangulo
	                    Retangulo retangulo = new Retangulo(base, altura);

	                    // Calculo
	                    double perimetro = retangulo.calcularPerimetro();
	                    double area = retangulo.calcularArea();

	                    // Exibir 
	                    resultadoPerimetro.setText("Perímetro: " + String.format("%.2f", perimetro));
	                    resultadoArea.setText("Área: " + String.format("%.2f", area));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para a base e altura!");
	                }
	            }
	        });
	    }

	    public static void main(String[] args) {
	        CalculoRetangulo frame = new CalculoRetangulo();
	        frame.setVisible(true);
	    }

		public JPanel getContentPan() {
			return contentPan;
		}

		public void setContentPan(JPanel contentPan) {
			this.contentPan = contentPan;
		}
	}
