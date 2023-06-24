package estudo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraWindow {

	private JFrame frame;
	private JTextField textField;
	public Calculadora calc = new Calculadora();
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraWindow window = new CalculadoraWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 243, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(10, 11, 207, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(String.valueOf(calc.resultadoAcumulado));

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				calc.operação= "+";
				String textoDaTela = "";
				textoDaTela = textField.getText();
				textField.setText("");
				calc.numero1 = Double.valueOf(textoDaTela);
				//calc.Somar(calc.numero1, calc.numero2);
			}
		});
		btnNewButton.setBounds(10, 71, 44, 23);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.operação= "-";
				String textoDaTela = "";
				textoDaTela = textField.getText();
				textField.setText("");
				calc.numero1 = Double.valueOf(textoDaTela);
			}
		});
		btnNewButton_1.setBounds(64, 71, 44, 23);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.operação= "*";
				String textoDaTela = "";
				textoDaTela = textField.getText();
				textField.setText("");
				calc.numero1 = Double.valueOf(textoDaTela);
			}
		});
		btnNewButton_2.setBounds(117, 71, 44, 23);
		frame.getContentPane().add(btnNewButton_2);

		btnNewButton_3 = new JButton("\\");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.operação= "\\";
				String textoDaTela = "";
				textoDaTela = textField.getText();
				textField.setText("");
				calc.numero1 = Double.valueOf(textoDaTela);
			}
		});
		btnNewButton_3.setBounds(171, 71, 44, 23);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(9));
				} else {
					textField.setText(textoDaTela + String.valueOf(9));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(9));
				}
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(10, 105, 60, 40);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(8));
				} else {
					textField.setText(textoDaTela + String.valueOf(8));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(8));
				}
			}
		});
		btnNewButton_5.setBounds(81, 105, 60, 40);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(7));
				} else {
					textField.setText(textoDaTela + String.valueOf(7));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(7));
				}
			}
		});
		btnNewButton_6.setBounds(151, 105, 60, 40);
		frame.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_4_1 = new JButton("6");
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(6));
				} else {
					textField.setText(textoDaTela + String.valueOf(6));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(6));
				}
			}
		});
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1.setBounds(10, 156, 60, 40);
		frame.getContentPane().add(btnNewButton_4_1);

		JButton btnNewButton_4_2 = new JButton("5");
		btnNewButton_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(5));
				} else {
					textField.setText(textoDaTela + String.valueOf(5));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(5));
				}
			}
		});
		btnNewButton_4_2.setBounds(81, 156, 60, 40);
		frame.getContentPane().add(btnNewButton_4_2);

		JButton btnNewButton_4_3 = new JButton("4");
		btnNewButton_4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(4));
				} else {
					textField.setText(textoDaTela + String.valueOf(4));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(4));
				}
			}
		});
		btnNewButton_4_3.setBounds(151, 156, 60, 40);
		frame.getContentPane().add(btnNewButton_4_3);

		JButton btnNewButton_4_4 = new JButton("3");
		btnNewButton_4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(3));
				} else {
					textField.setText(textoDaTela + String.valueOf(3));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(3));
				}
			}
		});
		btnNewButton_4_4.setBounds(10, 207, 60, 40);
		frame.getContentPane().add(btnNewButton_4_4);

		JButton btnNewButton_4_5 = new JButton("2");
		btnNewButton_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(2));
				} else {
					textField.setText(textoDaTela + String.valueOf(2));
				}
			}
		});
		btnNewButton_4_5.setBounds(81, 207, 60, 40);
		frame.getContentPane().add(btnNewButton_4_5);

		JButton btnNewButton_4_6 = new JButton("1");
		btnNewButton_4_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(1));
				} else {
					textField.setText(textoDaTela + String.valueOf(1));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(1));
				}
			}
		});
		btnNewButton_4_6.setBounds(151, 207, 60, 40);
		frame.getContentPane().add(btnNewButton_4_6);

		JButton btnNewButton_4_7 = new JButton("0");
		btnNewButton_4_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String textoDaTela = "";
				textoDaTela = textField.getText();
				if (textoDaTela.equals("0.0") || textoDaTela.equals("0")) {
					textField.setText(String.valueOf(0));
				} else {
					textField.setText(textoDaTela + String.valueOf(0));
					calc.resultadoAcumulado = Double.valueOf(textoDaTela + String.valueOf(0));
				}
			}
		});
		btnNewButton_4_7.setBounds(10, 258, 60, 40);
		frame.getContentPane().add(btnNewButton_4_7);

		JButton btnNewButton_4_8 = new JButton("CE");
		btnNewButton_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(0));
			}
		});
		btnNewButton_4_8.setBounds(81, 258, 60, 40);
		frame.getContentPane().add(btnNewButton_4_8);

		JButton btnNewButton_4_9 = new JButton("=");
		btnNewButton_4_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoDaTela;
				textoDaTela = textField.getText();
				textField.setText("");
				calc.numero2 = Double.valueOf(textoDaTela);
				
				if(calc.operação.equals("+")) {
					calc.resultadoAcumulado= calc.Somar(calc.numero1, calc.numero2);
					textField.setText(String.valueOf(calc.resultadoAcumulado));
				}
				else if(calc.operação.equals("-")) {
					calc.resultadoAcumulado= calc.Subtracao(calc.numero1, calc.numero2);
					textField.setText(String.valueOf(calc.resultadoAcumulado));
				}
				else if(calc.operação.equals("*")) {
					calc.resultadoAcumulado= calc.Multiplicacao(calc.numero1, calc.numero2);
					textField.setText(String.valueOf(calc.resultadoAcumulado));
				}	
				else if(calc.operação.equals("\\")) {
					calc.resultadoAcumulado= calc.Divisao(calc.numero1, calc.numero2);
					textField.setText(String.valueOf(calc.resultadoAcumulado));
				}
			}
		});
		btnNewButton_4_9.setBounds(151, 258, 60, 40);
		frame.getContentPane().add(btnNewButton_4_9);
	}
}
