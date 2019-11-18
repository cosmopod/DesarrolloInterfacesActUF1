package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CalculatorFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
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
	public CalculatorFrame() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel DisplayPanel = new JPanel();
		DisplayPanel.setBounds(10, 11, 242, 48);
		DisplayPanel.setBackground(new Color(240, 248, 255));
		DisplayPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel DisplayText = new JLabel("0");
		DisplayText.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayText.setFont(new Font("Arial", Font.BOLD, 20));
		GroupLayout gl_DisplayPanel = new GroupLayout(DisplayPanel);
		gl_DisplayPanel.setHorizontalGroup(
			gl_DisplayPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_DisplayPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(DisplayText, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_DisplayPanel.setVerticalGroup(
			gl_DisplayPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(DisplayText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
		);
		DisplayPanel.setLayout(gl_DisplayPanel);
		contentPane.add(DisplayPanel);
		
		JPanel NumbersPanel = new JPanel();
		NumbersPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		NumbersPanel.setBounds(10, 80, 242, 170);
		contentPane.add(NumbersPanel);
		NumbersPanel.setLayout(new GridLayout(4, 3, 1, 1));
		
		JButton btnSeven = new JButton("7");
		NumbersPanel.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		NumbersPanel.add(btnEight);
		
		JButton btnNine = new JButton("9");
		NumbersPanel.add(btnNine);
		
		JButton btnFour = new JButton("4");
		NumbersPanel.add(btnFour);
		
		JButton btnFive = new JButton("5");
		NumbersPanel.add(btnFive);
		
		JButton btnSix = new JButton("6");
		NumbersPanel.add(btnSix);
		
		JButton btnOne = new JButton("1");
		NumbersPanel.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		NumbersPanel.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		NumbersPanel.add(btnThree);
		
		JButton btnCE = new JButton("CE");
		NumbersPanel.add(btnCE);
		
		JButton btnZero = new JButton("0");
		NumbersPanel.add(btnZero);
		
		JButton btnAns = new JButton("=");
		NumbersPanel.add(btnAns);
		
		JPanel OperationsPanel = new JPanel();
		OperationsPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		OperationsPanel.setBackground(SystemColor.controlHighlight);
		OperationsPanel.setBounds(262, 80, 162, 170);
		contentPane.add(OperationsPanel);
		OperationsPanel.setLayout(new GridLayout(3, 2, 1, 1));
		
		JButton btnSum = new JButton("+");
		OperationsPanel.add(btnSum);
		
		JButton btnSubs = new JButton("-");
		OperationsPanel.add(btnSubs);
		
		JButton btnMult = new JButton("x");
		OperationsPanel.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		OperationsPanel.add(btnDiv);
		
		JButton btnExp = new JButton("Exp 2");
		OperationsPanel.add(btnExp);
	}
}
