package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste1 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste1 frame = new Teste1();
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
	public Teste1() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Ola mundo");
		lblNewLabel.setBounds(0, 0, 434, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JButton btnNewButton = new JButton("Feche");
		btnNewButton.setBounds(249, 61, 61, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			
			}
		});
		getContentPane().setLayout(null);
		
		JButton btnTeste = new JButton("Teste");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bom dia amigos");
			}
		});
		btnTeste.setBounds(26, 50, 59, 23);
		getContentPane().add(btnTeste);
		getContentPane().add(lblNewLabel);
		getContentPane().add(btnNewButton);
		
		JButton btnTeste2 = new JButton("Teste2");
		btnTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null,"Voce esta gostando de programar?",
						"Confirmacao", JOptionPane.YES_NO_OPTION);
		System.out.println(resposta);
			}
		});
		btnTeste2.setBounds(111, 50, 89, 23);
		getContentPane().add(btnTeste2);
		
		JButton btnmotivo = new JButton("motivo");
		btnmotivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = 0;
				if (resposta == 0) {
					JOptionPane.showConfirmDialog(null,"Voce esta entendendo a aula?", "resposta SIM", JOptionPane.INFORMATION_MESSAGE );
				}else {
					JOptionPane.showConfirmDialog(null, "Que pena", "resposta NÃO", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnmotivo.setBounds(26, 137, 89, 23);
		getContentPane().add(btnmotivo);

	}
}
