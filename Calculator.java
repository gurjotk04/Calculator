import java.awt.EventQueue;

import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	Font font = new Font("MS PGothic", Font.BOLD, 18);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 311, 524);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton logButton = new JButton("log");
		logButton.setFont(font);
		logButton.setMargin( new Insets(5, 5, 5, 5));
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("log("));
			}
		});
		logButton.setBounds(10, 137, 47, 47);
		frmCalculator.getContentPane().add(logButton);
		
		JButton cbrtButton = new JButton("∛");
		cbrtButton.setMargin( new Insets(5, 5, 5, 5) );
		cbrtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("cbrt("));
			}
		});
		cbrtButton.setFont(new Font("MS PGothic", Font.BOLD, 22));
		cbrtButton.setMargin( new Insets(5, 5, 5, 5));
		cbrtButton.setBounds(10, 195, 47, 47);
		frmCalculator.getContentPane().add(cbrtButton);
		
		JButton absButton = new JButton("abs");
		absButton.setMargin( new Insets(5, 5, 5, 5));
		absButton.setFont(font);
		absButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("abs("));
			}
		});
		absButton.setBounds(10, 253, 47, 47);
		frmCalculator.getContentPane().add(absButton);
		
		JButton sinButton = new JButton("sin");
		sinButton.setFont(font);
		sinButton.setMargin( new Insets(5, 5, 5, 5));
		sinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("sin("));
			}
		});
		sinButton.setBounds(10, 311, 47, 47);
		frmCalculator.getContentPane().add(sinButton);
		
		JButton cosButton = new JButton("cos");
		cosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("cos("));
			}
		});
		cosButton.setFont(font);
		cosButton.setMargin( new Insets(5, 5, 5, 5));
		cosButton.setBounds(10, 369, 47, 47);
		frmCalculator.getContentPane().add(cosButton);
		
		JButton tanButton = new JButton("tan");
		tanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("tan("));
			}
		});
		tanButton.setFont(font);
		tanButton.setMargin( new Insets(5, 5, 5, 5));
		tanButton.setBounds(10, 427, 47, 47);
		frmCalculator.getContentPane().add(tanButton);
		
		JButton powButton = new JButton("^");
		powButton.setVerticalAlignment(SwingConstants.BOTTOM);
		powButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("^"));
			}
		});
		powButton.setFont(font);
		powButton.setMargin( new Insets(5, 5, 5, 5));
		powButton.setBounds(67, 137, 47, 47);
		frmCalculator.getContentPane().add(powButton);
		
		JButton eButton = new JButton("e");
		eButton.setFont(font);
		eButton.setMargin( new Insets(5, 5, 5, 5));
		eButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("e"));
			}
		});
		eButton.setBounds(124, 137, 47, 47);
		frmCalculator.getContentPane().add(eButton);
		
		JButton piButton = new JButton("\u03C0");
		piButton.setFont(new Font("MS PGothic", Font.BOLD, 16));
		piButton.setMargin( new Insets(5, 5, 5, 5));
		piButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("pi"));
			}
		});
		piButton.setBounds(181, 137, 47, 47);
		frmCalculator.getContentPane().add(piButton);
		
		JButton sqrtButton = new JButton("\u221A");
		sqrtButton.setFont(font);
		sqrtButton.setMargin( new Insets(5, 5, 5, 5));
		sqrtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("sqrt("));
			}
		});
		sqrtButton.setBounds(238, 137, 47, 47);
		frmCalculator.getContentPane().add(sqrtButton);
		
		JButton backButton = new JButton("\u2190");
		backButton.setBackground(SystemColor.scrollbar);
		backButton.setFont(font);
		backButton.setMargin( new Insets(5, 5, 5, 5));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.backspace());
			}
		});
		backButton.setBounds(238, 79, 47, 47);
		frmCalculator.getContentPane().add(backButton);
		
		JButton lParButton = new JButton("(");
		lParButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("("));
			}
		});
		lParButton.setFont(font);
		lParButton.setMargin( new Insets(5, 5, 5, 5));
		lParButton.setBounds(67, 195, 47, 47);
		frmCalculator.getContentPane().add(lParButton);
		
		JButton rParButton = new JButton(")");
		rParButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext(")"));
			}
		});
		rParButton.setFont(font);
		rParButton.setMargin( new Insets(5, 5, 5, 5));
		rParButton.setBounds(124, 195, 47, 47);
		frmCalculator.getContentPane().add(rParButton);
		
		JButton modButton = new JButton("%");
		modButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("%"));
			}
		});
		modButton.setFont(font);
		modButton.setMargin( new Insets(5, 5, 5, 5));
		modButton.setBounds(181, 195, 47, 47);
		frmCalculator.getContentPane().add(modButton);
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("+"));
			}
		});
		addButton.setFont(font);
		addButton.setMargin( new Insets(5, 5, 5, 5));
		addButton.setBounds(238, 195, 47, 47);
		frmCalculator.getContentPane().add(addButton);
		
		JButton button7 = new JButton("7");
		button7.setBackground(Color.GRAY);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("7"));
			}
		});
		button7.setFont(font);
		button7.setMargin( new Insets(5, 5, 5, 5));
		button7.setBounds(67, 253, 47, 47);
		frmCalculator.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBackground(Color.GRAY);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("8"));
			}
		});
		button8.setFont(font);
		button8.setMargin( new Insets(5, 5, 5, 5));
		button8.setBounds(124, 253, 47, 47);
		frmCalculator.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBackground(Color.GRAY);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("9"));
			}
		});
		button9.setFont(font);
		button9.setMargin( new Insets(5, 5, 5, 5));
		button9.setBounds(181, 253, 47, 47);
		frmCalculator.getContentPane().add(button9);
		
		JButton subButton = new JButton("-");
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("-"));
			}
		});
		subButton.setFont(font);
		subButton.setMargin( new Insets(5, 5, 5, 5));
		subButton.setBounds(238, 253, 47, 47);
		frmCalculator.getContentPane().add(subButton);
		
		JButton button4 = new JButton("4");
		button4.setBackground(Color.GRAY);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("4"));
			}
		});
		button4.setFont(font);
		button4.setMargin( new Insets(5, 5, 5, 5));
		button4.setBounds(67, 311, 47, 47);
		frmCalculator.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBackground(Color.GRAY);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("5"));
			}
		});
		button5.setFont(font);
		button5.setMargin( new Insets(5, 5, 5, 5));
		button5.setBounds(124, 311, 47, 47);
		frmCalculator.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBackground(Color.GRAY);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("6"));
			}
		});
		button6.setFont(font);
		button6.setMargin( new Insets(5, 5, 5, 5));
		button6.setBounds(181, 311, 47, 47);
		frmCalculator.getContentPane().add(button6);
		
		JButton multButton = new JButton("*");
		multButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("*"));
			}
		});
		multButton.setFont(font);
		multButton.setMargin( new Insets(5, 5, 5, 5));
		multButton.setBounds(238, 311, 47, 47);
		frmCalculator.getContentPane().add(multButton);
		
		JButton button1 = new JButton("1");
		button1.setBackground(Color.GRAY);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("1"));
			}
		});
		button1.setFont(font);
		button1.setMargin( new Insets(5, 5, 5, 5));
		button1.setBounds(67, 369, 47, 47);
		frmCalculator.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBackground(Color.GRAY);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("2"));
			}
		});
		button2.setFont(font);
		button2.setMargin( new Insets(5, 5, 5, 5));
		button2.setBounds(124, 369, 47, 47);
		frmCalculator.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBackground(Color.GRAY);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("3"));
			}
		});
		button3.setFont(font);
		button3.setMargin( new Insets(5, 5, 5, 5));
		button3.setBounds(181, 369, 47, 47);
		frmCalculator.getContentPane().add(button3);
		
		JButton decButton = new JButton(".");
		decButton.setBackground(Color.GRAY);
		decButton.setVerticalAlignment(SwingConstants.TOP);
		decButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("."));
			}
		});
		decButton.setFont(font);
		decButton.setMargin( new Insets(5, 5, 5, 5));
		decButton.setBounds(67, 427, 47, 47);
		frmCalculator.getContentPane().add(decButton);
		
		JButton button0 = new JButton("0");
		button0.setBackground(Color.GRAY);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("0"));
			}
		});
		button0.setFont(font);
		button0.setMargin( new Insets(5, 5, 5, 5));
		button0.setBounds(124, 427, 47, 47);
		frmCalculator.getContentPane().add(button0);
		
		JButton ansButton = new JButton("Ans");
		ansButton.setBackground(SystemColor.scrollbar);
		ansButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.getResult());
			}
		});
		ansButton.setFont(font);
		ansButton.setMargin( new Insets(5, 5, 5, 5));
		ansButton.setBounds(181, 427, 47, 47);
		frmCalculator.getContentPane().add(ansButton);
		
		JButton divButton = new JButton("/");
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.setNext("/"));
			}
		});
		divButton.setFont(font);
		divButton.setMargin( new Insets(5, 5, 5, 5));
		divButton.setBounds(238, 369, 47, 47);
		frmCalculator.getContentPane().add(divButton);
		
		JButton equalButton = new JButton("=");
		equalButton.setBackground(SystemColor.scrollbar);
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField.setText(Control.solveExp());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		equalButton.setFont(font);
		equalButton.setMargin( new Insets(5, 5, 5, 5));
		equalButton.setBounds(238, 427, 47, 47);
		frmCalculator.getContentPane().add(equalButton);
		
		JButton clrButton = new JButton("CLR");
		clrButton.setBackground(SystemColor.scrollbar);
		clrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Control.clear());
			}
		});
		clrButton.setFont(new Font("MS PGothic", Font.BOLD, 15));
		clrButton.setMargin( new Insets(5, 5, 5, 5));
		clrButton.setBounds(181, 79, 47, 47);
		frmCalculator.getContentPane().add(clrButton);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.textHighlightText);
		textField.setFont(new Font("MS PGothic", Font.BOLD, 16));
		textField.setEditable(false);
		textField.setBounds(10, 11, 275, 57);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
