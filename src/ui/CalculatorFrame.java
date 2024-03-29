package ui;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import application.CalculatorPresenter;
import application.CalculatorPresenter.OperationType;

public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	public final int MAX_DISPLAY_NUMBERS = 12;
	private boolean isAddingNumberToDisplay;
	private JLabel DisplayText;

	/**
	 * Presenter
	 */
	private CalculatorPresenter presenter;

	/**
	 * Operations stack
	 */
	private CalculatorPresenter.OperationType operationQueued;
	private List<Float> numbersStack;

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
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		presenter = new CalculatorPresenter();
		numbersStack = new ArrayList<Float>();

		JPanel DisplayPanel = new JPanel();
		DisplayPanel.setBounds(10, 11, 242, 48);
		DisplayPanel.setBackground(new Color(240, 248, 255));
		DisplayPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		DisplayText = new JLabel("0");
		DisplayText.setAlignmentX(Component.RIGHT_ALIGNMENT);
		DisplayText.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayText.setFont(new Font("Arial", Font.BOLD, 20));
		GroupLayout gl_DisplayPanel = new GroupLayout(DisplayPanel);
		gl_DisplayPanel.setHorizontalGroup(gl_DisplayPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_DisplayPanel.createSequentialGroup().addContainerGap()
						.addComponent(DisplayText, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE).addContainerGap()));
		gl_DisplayPanel.setVerticalGroup(gl_DisplayPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(DisplayText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE));
		DisplayPanel.setLayout(gl_DisplayPanel);
		contentPane.add(DisplayPanel);

		JPanel NumbersPanel = new JPanel();
		NumbersPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		NumbersPanel.setBounds(10, 80, 242, 170);
		contentPane.add(NumbersPanel);
		NumbersPanel.setLayout(new GridLayout(4, 3, 1, 1));

		JButton btnSeven = new JButton("7");
		btnSeven.setFocusable(false);
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnSeven.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnSeven);

		JButton btnEight = new JButton("8");
		btnEight.setFocusable(false);
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnEight.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnEight);

		JButton btnNine = new JButton("9");
		btnNine.setFocusable(false);
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnNine.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnNine);

		JButton btnFour = new JButton("4");
		btnFour.setFocusable(false);
		btnFour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnFour.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnFour);

		JButton btnFive = new JButton("5");
		btnFive.setFocusable(false);
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnFive.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnFive);

		JButton btnSix = new JButton("6");
		btnSix.setFocusable(false);
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnSix.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnSix);

		JButton btnOne = new JButton("1");
		btnOne.setFocusable(false);
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnOne.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnOne);

		JButton btnTwo = new JButton("2");
		btnTwo.setFocusable(false);
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnTwo.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnTwo);

		JButton btnThree = new JButton("3");
		btnThree.setFocusable(false);
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnThree.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnThree);

		JButton btnCE = new JButton("CE");
		btnCE.setFocusable(false);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClearEntry();
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NumbersPanel.add(btnCE);

		JButton btnZero = new JButton("0");
		btnZero.setFocusable(false);
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetNumberTodisplay(btnZero.getText());
				isAddingNumberToDisplay = true;
			}
		});
		NumbersPanel.add(btnZero);

		JButton btnAns = new JButton("=");
		btnAns.setFocusable(false);
		btnAns.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowSolution();
			}
		});
		NumbersPanel.add(btnAns);

		JPanel OperationsPanel = new JPanel();
		OperationsPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		OperationsPanel.setBackground(SystemColor.controlHighlight);
		OperationsPanel.setBounds(262, 80, 162, 170);
		contentPane.add(OperationsPanel);
		OperationsPanel.setLayout(new GridLayout(3, 2, 1, 1));

		JButton btnSum = new JButton("+");
		btnSum.setFocusable(false);
		btnSum.setForeground(UIManager.getColor("Button.foreground"));
		btnSum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSum.setBackground(new Color(204, 204, 255));
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnOperation(OperationType.Sum);
			}
		});
		OperationsPanel.add(btnSum);

		JButton btnSubs = new JButton("-");
		btnSubs.setFocusable(false);
		btnSubs.setForeground(UIManager.getColor("Button.foreground"));
		btnSubs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubs.setBackground(new Color(204, 204, 255));
		btnSubs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnOperation(OperationType.Subs);
			}
		});
		OperationsPanel.add(btnSubs);

		JButton btnMult = new JButton("x");
		btnMult.setFocusable(false);
		btnMult.setForeground(UIManager.getColor("Button.foreground"));
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMult.setBackground(new Color(204, 204, 255));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnOperation(OperationType.Mult);
			}
		});
		OperationsPanel.add(btnMult);

		JButton btnDiv = new JButton("/");
		btnDiv.setFocusable(false);
		btnDiv.setForeground(UIManager.getColor("Button.foreground"));
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBackground(new Color(204, 204, 255));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BtnOperation(OperationType.Div);
			}
		});
		OperationsPanel.add(btnDiv);

		JButton btnExp = new JButton("Exp 2");
		btnExp.setFocusable(false);
		btnExp.setForeground(UIManager.getColor("Button.foreground"));
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExp.setBackground(new Color(204, 204, 255));
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				BtnOperation(OperationType.Mult);
				ShowSolution();
			}
		});
		OperationsPanel.add(btnExp);
		
		
		JButton btnReset = new JButton("AC");
		btnReset.setFocusable(false);
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(240, 128, 128));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AllClear();
			}
		});
		OperationsPanel.add(btnReset);
	}

	/**
	 * UI Methods
	 */
	private void SetTextInDisplay(String text) {
		if (DisplayText.getText().length() <= MAX_DISPLAY_NUMBERS) {
			DisplayText.setText(text);
		}
	}

	private float GetDisplayNumber() {
		String displayText = DisplayText.getText();
		return Float.valueOf(displayText);
	}

	private void SetNumberTodisplay(String num) {

		String displayText = isAddingNumberToDisplay ? DisplayText.getText() + num : num;
		SetTextInDisplay(displayText);
	}

	private void ResetDisplay() {
		isAddingNumberToDisplay = false;
		DisplayText.setText("0");
	}
	
	private void ClearEntry() {
		String displayTextString = DisplayText.getText();
		if (displayTextString.length() <= 1) ResetDisplay();
		else {
			displayTextString = displayTextString.substring(0, displayTextString.length() - 1);
			SetTextInDisplay(displayTextString);
		}
	}

	private void BtnOperation(OperationType operationType) {
		if (operationQueued != null)
			ShowSolution();
		AddDisplayedNumberToStack();
		operationQueued = operationType;
		isAddingNumberToDisplay = false;
	}

	/**
	 * Operations Management
	 */
	private void AddDisplayedNumberToStack() {
		float currentDisplayNumber = Float.parseFloat(DisplayText.getText());
		numbersStack.add(currentDisplayNumber);
	}

	private void ClearNumbersStack() {
		if (!numbersStack.isEmpty()) {
			numbersStack.clear();
		}
	}
	
	private void AllClear() {
		ResetDisplay();
		ResetQueuedOperation();
	}
	
	private void ResetQueuedOperation() {
		if (operationQueued != null)
			operationQueued = null;
	}

	private float ResolveOperation() {

		if (numbersStack.isEmpty() || operationQueued == null)
			return GetDisplayNumber();
		int lastNumberStackIndex = numbersStack.size() - 1;
		float stackedNumber = numbersStack.get(lastNumberStackIndex);
		float solution;
		try {
			solution = presenter.Operation(stackedNumber, GetDisplayNumber(), operationQueued);
		} catch (Exception e) {
			solution = 0;
			ShowMessageError();
		}
		ClearNumbersStack();
		ResetQueuedOperation();

		return solution;
	}

	private void ShowSolution() {

		String displaySolution = GetFormattedSolution(ResolveOperation());
		DisplayText.setText(displaySolution);
		isAddingNumberToDisplay = false;

	}

	private String GetFormattedSolution(float numericSolution) {
		
		String decimalSolution = "";
		String roundSolution = "";
		int decimalPart = 0;
		String formattedSolution = "";
		
		try {
			decimalSolution = String.valueOf(numericSolution);
			roundSolution = String.valueOf((int) numericSolution);
			decimalPart = Integer.parseInt(decimalSolution.substring(decimalSolution.indexOf('.') + 1));
			formattedSolution = decimalPart > 0 ? decimalSolution : roundSolution;
		} catch (NumberFormatException e) {
			formattedSolution = String.valueOf(numericSolution);
			ShowMessageError();
		}

		return formattedSolution;
	}

	private void ShowMessageError() {

	}
}
