package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class ValidarIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textNome;
	private JTextField textIdade;
	private JLabel txtNome;
	private JLabel txtIdade;
	private JLabel lblResposta;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarIdade frame = new ValidarIdade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ValidarIdade() {
		setTitle("Validador");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
	//	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	//	tabbedPane.setBounds(0, 0, 5, 262);
		//getContentPane().add(tabbedPane);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(72, 66, 46, 14);
		getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(136, 63, 86, 20);
		getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(136, 102, 86, 20);
		getContentPane().add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(10, 219, 414, 14);
		getContentPane().add(lblResposta);

		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			private String idadeStr;

			public void actionPerformed(ActionEvent e) {
			//	mostrarResultado();
			 String nome = textNome.getText();
			 String idadeStr = textIdade.getText();
			 
			 if(nome.isEmpty()){
				 lblResposta.setText("Por favor insira o nome!");
				 return;
			 }

			 try {
			 
			 int idade = Integer.parseInt(idadeStr);
			 
			 String mensagem =  "Nome: " + nome + ", Idade: " + idade;

			 if(idade < 18) {
				 mensagem += "(Menor de idade!)";
			 }else {
				 mensagem += "(Maior de idade!)";
			 }
			 
			 if(idade < 0) {
				 mensagem += "(Idade inferior a 0! Insira uma idade verdadeira! Superior a 0)";
			 }
			 
			// String mensagem =  "Nome: " + nome + ", Idade: " + idade;
			 
			 lblResposta.setText(mensagem);
			 }catch(NumberFormatException ex) {
			 
				 lblResposta.setText("Por favor, insira uma idade válida");
				 
			 }
			}});
		btnValidar.setBounds(160, 174, 89, 23);
		getContentPane().add(btnValidar);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(72, 105, 46, 14);
		getContentPane().add(lblIdade);
		
	
		
		
	}
	
//	private void mostrarResultado() {
	  //String nome = txtNome.getText();
	 // String idade = txtIdade.getText();
	  
	 // lblResposta.setText(nome);
	//}
}
