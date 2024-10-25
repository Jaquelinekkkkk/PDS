package Pizzaria;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

	public class PizzariaJB extends JFrame {

	
		private static final long serialVersionUID = 1L;
		
		private JCheckBox  cbFrangoCatupiry, cbMarguerita, cbAtum;
	    private JRadioButton rbComBorda, rbSemBorda;
	    private JComboBox<String> cbTipoEntrega;
	    private JCheckBox cbOpcional1, cbOpcional2, cbOpcional3;
	    private JButton btnCalcular;
	    private JLabel lblTotal;
	    private ButtonGroup bordaGroup;

	    private Pizza pizza;

	    public PizzariaJB() {
	    	getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    	setFont(new Font("Times New Roman", Font.PLAIN, 14));
	        setTitle("Pizzaria");
	        setSize(718, 414);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        pizza = new Pizza();

	        JPanel panelSabores = new JPanel();
	        panelSabores.setBackground(new Color(188, 121, 255));
	        panelSabores.setBounds(0, 0, 702, 100);
	        panelSabores.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, 
	        		new Color(255, 255, 255), new Color(160, 160, 160)), 
	        		"Sabores dison\u00EDveis( escolha no m\u00E1ximo 3 sabores)", 
	        		TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	        cbMarguerita = new JCheckBox("Marguerita (R$67,00)");
	        cbMarguerita.setBounds(40, 47, 177, 23);
	        cbMarguerita.setBackground(new Color(209, 164, 255));
	        cbMarguerita.setFont(new Font("Times New Roman", Font.PLAIN, 12));

	        ItemListener saborListener = e -> {
	            JCheckBox source = (JCheckBox) e.getSource();
	            pizza.toggleSabor(source.getText(), source.isSelected());
	        };
	        cbMarguerita.addItemListener(saborListener);
	        getContentPane().setLayout(null);
	        cbFrangoCatupiry = new JCheckBox("Frango com Catupiry (R$25,00)");
	        cbFrangoCatupiry.setBounds(268, 21, 228, 23);
	        cbFrangoCatupiry.setBackground(new Color(209, 164, 255));
	        cbFrangoCatupiry.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        cbFrangoCatupiry.addItemListener(saborListener);
	        cbAtum = new JCheckBox("Calabresa (R$20,00)");
	        cbAtum.setBounds(40, 21, 177, 23);
	        cbAtum.setBackground(new Color(209, 164, 255));
	        cbAtum.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        cbAtum.addItemListener(saborListener);
	        
	       	        
	        	        	        panelSabores.setLayout(null);
	        	        
	        panelSabores.add(cbAtum);
	        panelSabores.add(cbFrangoCatupiry);
	        panelSabores.add(cbMarguerita);
	        getContentPane().add(panelSabores);
	        
	        
	        JPanel panelBorda = new JPanel();
	        panelBorda.setBackground(new Color(176, 98, 255));
	        panelBorda.setBounds(0, 98, 702, 55);
	        panelBorda.setBorder(BorderFactory.createTitledBorder("Borda"));
	        rbComBorda = new JRadioButton("Com Borda (R$15,00)");
	        rbComBorda.setForeground(new Color(0, 0, 0));
	        rbComBorda.setBackground(new Color(209, 164, 255));
	        rbComBorda.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        rbSemBorda = new JRadioButton("Sem Borda (Gratuita)");
	        rbSemBorda.setBackground(new Color(209, 164, 255));
	        rbSemBorda.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        bordaGroup = new ButtonGroup();
	        bordaGroup.add(rbComBorda);
	        bordaGroup.add(rbSemBorda);
	        rbSemBorda.setSelected(true);

	        rbComBorda.addActionListener(e -> pizza.setBorda(true));
	        rbSemBorda.addActionListener(e -> pizza.setBorda(false));

	        panelBorda.add(rbComBorda);
	        panelBorda.add(rbSemBorda);
	        getContentPane().add(panelBorda);

	        JPanel panelEntrega = new JPanel();
	        panelEntrega.setBackground(new Color(158, 62, 255));
	        panelEntrega.setBounds(0, 153, 702, 66);
	        panelEntrega.setBorder(BorderFactory.createTitledBorder("Tipo de Entrega"));
	        cbTipoEntrega = new JComboBox<>(new String[] { "Tele Entrega (+R$10)", "Retira (Grátis)", "No Local (Grátis)" });
	        cbTipoEntrega.setForeground(new Color(0, 0, 0));
	        cbTipoEntrega.setBounds(271, 21, 212, 21);
	        cbTipoEntrega.setBackground(new Color(209, 164, 255));
	        cbTipoEntrega.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        cbTipoEntrega.setModel(new DefaultComboBoxModel<String>(new String[] {"Entrega delevery (R$10,00)", "Retirada no balcão (Grátis)", "Consumir no local (Grátis)"}));
	        cbTipoEntrega.addActionListener(e -> pizza.setTipoEntrega(cbTipoEntrega.getSelectedItem().toString()));
	        panelEntrega.setLayout(null);

	        panelEntrega.add(cbTipoEntrega);
	        getContentPane().add(panelEntrega);

	        JPanel panelOpcionais = new JPanel();
	        panelOpcionais.setBackground(new Color(143, 32, 255));
	        panelOpcionais.setBounds(0, 216, 702, 94);
	        panelOpcionais.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Adicionais(n\u00E3o obrigat\u00F3rio)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	        cbOpcional1 = new JCheckBox("Azeitonas (R$3,00)");
	        cbOpcional1.setBackground(new Color(209, 164, 255));
	        cbOpcional1.setBounds(179, 21, 121, 23);
	        cbOpcional1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        cbOpcional2 = new JCheckBox("Orégano (R$2,00)");
	        cbOpcional2.setBackground(new Color(209, 164, 255));
	        cbOpcional2.setBounds(305, 21, 111, 23);
	        cbOpcional2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        cbOpcional3 = new JCheckBox("Bacon (R$5,00)");
	        cbOpcional3.setBackground(new Color(209, 164, 255));
	        cbOpcional3.setBounds(421, 21, 101, 23);
	        cbOpcional3.setFont(new Font("Times New Roman", Font.PLAIN, 12));

	        cbOpcional1.addItemListener(e -> pizza.toggleOpcional(cbOpcional1.getText(), cbOpcional1.isSelected()));
	        cbOpcional2.addItemListener(e -> pizza.toggleOpcional(cbOpcional2.getText(), cbOpcional2.isSelected()));
	        cbOpcional3.addItemListener(e -> pizza.toggleOpcional(cbOpcional3.getText(), cbOpcional3.isSelected()));
	        panelOpcionais.setLayout(null);

	        panelOpcionais.add(cbOpcional1);
	        panelOpcionais.add(cbOpcional2);
	        panelOpcionais.add(cbOpcional3);
	        getContentPane().add(panelOpcionais);

	        btnCalcular = new JButton("Calcular Total");
	        btnCalcular.setBounds(243, 5, 121, 23);
	        btnCalcular.setBackground(new Color(209, 164, 255));
	        btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        lblTotal = new JLabel("Total: R$ 0,00");
	        lblTotal.setBounds(369, 9, 108, 15);
	        lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	        btnCalcular.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                calcularTotal();
	            }
	        });

	        JPanel panelTotal = new JPanel();
	        panelTotal.setBackground(new Color(117, 0, 234));
	        panelTotal.setBounds(0, 309, 702, 66);
	        panelTotal.setLayout(null);
	        panelTotal.add(btnCalcular);
	        panelTotal.add(lblTotal);
	        getContentPane().add(panelTotal);
	    }

	    private void calcularTotal() {
	        CalculadoraPizza calculadora = new CalculadoraPizza();
	        double total = calculadora.calcular(pizza);
	        lblTotal.setText("Total: R$ " + String.format("%.2f", total));
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new PizzariaJB().setVisible(true);
	        });
	    }

		
	}