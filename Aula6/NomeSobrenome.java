package Aula6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NomeSobrenome extends JFrame {

	private static final long serialVersionUID = -5773614986122296386L;
	private JTextField campoNome;
    private JTextField campoSobrenome;
    private JLabel resultadoNomeSobrenome;

    // Construtor da interface gráfica
    public NomeSobrenome() {
        setTitle("Exibir Nome Completo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(10, 10, 100, 25);
        add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(120, 10, 200, 25);
        add(campoNome);

        JLabel labelSobrenome = new JLabel("Sobrenome:");
        labelSobrenome.setBounds(10, 40, 100, 25);
        add(labelSobrenome);

        campoSobrenome = new JTextField();
        campoSobrenome.setBounds(120, 40, 200, 25);
        add(campoSobrenome);

        JButton botaoExibir = new JButton("Exibir:");
        botaoExibir.setBounds(10, 80, 180, 25);
        add(botaoExibir);

        resultadoNomeSobrenome = new JLabel("Nome completo: ");
        resultadoNomeSobrenome.setBounds(10, 120, 300, 25);
        add(resultadoNomeSobrenome);

        //  botão
        botaoExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String sobrenome = campoSobrenome.getText();
                resultadoNomeSobrenome.setText("Nome completo: " + nome + " " + sobrenome);
            }
        });
    }

    public static void main(String[] args) {
        NomeSobrenome frame = new NomeSobrenome();
        frame.setVisible(true);
    }
}
