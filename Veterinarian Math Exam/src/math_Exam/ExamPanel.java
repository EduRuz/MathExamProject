package math_Exam;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ExamPanel extends JPanel {

	/**JLabels for the questions*/
	protected JLabel question1, question2, question3, question4, question5, question6, question7, question8, question9, question10;
	/**JTextFields for the panel*/
	protected JTextField q1Input, q2Input, q3Input, q4Input, q5Input, q6Input, q7Input, q8Input, q9Input, q10Input;
	/**JButtons for the panel*/
	protected JButton check, Randomise, back;
	/**JLabels for the Check Icons*/
	protected JLabel checkIcon1, checkIcon2, checkIcon3, checkIcon4, checkIcon5, checkIcon6, checkIcon7, checkIcon8, checkIcon9, checkIcon10;
	/**ImageIcon for the tick image */
	protected ImageIcon Tick = new ImageIcon(UserInterface.class.getResource("/math_Exam/Tick 30x30.png"));
	/**ImageIcon for the Cross image*/
	protected ImageIcon X = new ImageIcon(UserInterface.class.getResource("/math_Exam/X 30x30.png"));
	/**ImageIcon for the Question mark image*/
	protected ImageIcon RandomQMark = new ImageIcon(UserInterface.class.getResource("/math_Exam/Question mark G 30x30.png"));
	/**ImageIcon for the the Back image*/
	protected ImageIcon backIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Back 100x30.png"));
	/** array to store the input fields for less coding*/
	protected JTextField[] InputFields;
	/** array to store the check icon labels for less coding*/
	protected JLabel[] checkIcons;
	/** array to store the question labels for less coding*/
	protected JLabel[] questionLabels;
	
	/**Creates the custom exam panel*/
	public ExamPanel(){
		super();
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		setBounds(0, 0, 480, 460);
		
		panelComponents();
		componentArrays();
		reset();
	}
	
	/**Panel Components for the exam panel*/
	private void panelComponents() {
		
		question1 = new JLabel();
		question1.setHorizontalAlignment(SwingConstants.CENTER);
		question1.setForeground(Color.WHITE);
		question1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question1.setBounds(5, 25, 120, 50);
		add(question1);
		
		question2 = new JLabel();
		question2.setHorizontalAlignment(SwingConstants.CENTER);
		question2.setForeground(Color.WHITE);
		question2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question2.setBounds(5, 105, 120, 50);
		add(question2);
		
		question3 = new JLabel();
		question3.setHorizontalAlignment(SwingConstants.CENTER);
		question3.setForeground(Color.WHITE);
		question3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question3.setBounds(5, 185, 120, 50);
		add(question3);
		
		question4 = new JLabel();
		question4.setHorizontalAlignment(SwingConstants.CENTER);
		question4.setForeground(Color.WHITE);
		question4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question4.setBounds(5, 265, 120, 50);
		add(question4);
		
		question5 = new JLabel();
		question5.setHorizontalAlignment(SwingConstants.CENTER);
		question5.setForeground(Color.WHITE);
		question5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question5.setBounds(5, 345, 120, 50);
		add(question5);
		
		question6 = new JLabel();
		question6.setHorizontalAlignment(SwingConstants.CENTER);
		question6.setForeground(Color.WHITE);
		question6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question6.setBounds(240, 25, 120, 50);
		add(question6);
		
		question7 = new JLabel();
		question7.setHorizontalAlignment(SwingConstants.CENTER);
		question7.setForeground(Color.WHITE);
		question7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question7.setBounds(240, 105, 120, 50);
		add(question7);
		
		question8 = new JLabel();
		question8.setHorizontalAlignment(SwingConstants.CENTER);
		question8.setForeground(Color.WHITE);
		question8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question8.setBounds(240, 185, 120, 50);
		add(question8);
		
		question9 = new JLabel();
		question9.setHorizontalAlignment(SwingConstants.CENTER);
		question9.setForeground(Color.WHITE);
		question9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question9.setBounds(240, 265, 120, 50);
		add(question9);
		
		question10 = new JLabel();
		question10.setHorizontalAlignment(SwingConstants.CENTER);
		question10.setForeground(Color.WHITE);
		question10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		question10.setBounds(240, 345, 120, 50);
		add(question10);
		
		q1Input = new JTextField();
		q1Input.setBounds(145, 35, 50, 30);
		add(q1Input);
		
		q2Input = new JTextField();
		q2Input.setBounds(145, 115, 50, 30);
		add(q2Input);
		
		q3Input = new JTextField();
		q3Input.setBounds(145, 195, 50, 30);
		add(q3Input);
		
		q4Input = new JTextField();
		q4Input.setBounds(145, 275, 50, 30);
		add(q4Input);
		
		q5Input = new JTextField();
		q5Input.setBounds(145, 355, 50, 30);
		add(q5Input);
		
		q6Input = new JTextField();
		q6Input.setBounds(370, 35, 50, 30);
		add(q6Input);
		
		q7Input = new JTextField();
		q7Input.setBounds(370, 115, 50, 30);
		add(q7Input);
		
		q8Input = new JTextField();
		q8Input.setBounds(370, 195, 50, 30);
		add(q8Input);
		
		q9Input = new JTextField();
		q9Input.setBounds(370, 275, 50, 30);
		add(q9Input);
		
		q10Input = new JTextField();
		q10Input.setBounds(370, 355, 50, 30);
		add(q10Input);
		
		checkIcon1 = new JLabel();
		checkIcon1.setBounds(200, 35, 30, 30);
		add(checkIcon1);
		
		checkIcon2 = new JLabel();
		checkIcon2.setBounds(200, 115, 30, 30);
		add(checkIcon2);
		
		checkIcon3 = new JLabel();
		checkIcon3.setBounds(200, 195, 30, 30);
		add(checkIcon3);
		
		checkIcon4 = new JLabel();
		checkIcon4.setBounds(200, 275, 30, 30);
		add(checkIcon4);
		
		checkIcon5 = new JLabel();
		checkIcon5.setBounds(200, 355, 30, 30);
		add(checkIcon5);
		
		checkIcon6 = new JLabel();
		checkIcon6.setBounds(425, 35, 30, 30);
		add(checkIcon6);
		
		checkIcon7 = new JLabel();
		checkIcon7.setBounds(425, 115, 30, 30);
		add(checkIcon7);
		
		checkIcon8 = new JLabel();
		checkIcon8.setBounds(425, 195, 30, 30);
		add(checkIcon8);
		
		checkIcon9 = new JLabel();
		checkIcon9.setBounds(425, 275, 30, 30);
		add(checkIcon9);
		
		checkIcon10 = new JLabel();
		checkIcon10.setBounds(425, 355, 30, 30);
		add(checkIcon10);
		
		
		JLabel q1 = new JLabel("Question 1:");
		q1.setForeground(Color.WHITE);
		q1.setBackground(Color.WHITE);
		q1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q1.setBounds(23, 0, 80, 50);
		add(q1);
		
		JLabel q2 = new JLabel("Question 2:");
		q2.setForeground(Color.WHITE);
		q2.setBackground(new Color(0, 204, 0));
		q2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q2.setBounds(23, 80, 80, 50);
		add(q2);
		
		JLabel q3 = new JLabel("Question 3:");
		q3.setForeground(Color.WHITE);
		q3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q3.setBounds(23, 160, 80, 50);
		add(q3);
		
		JLabel q4 = new JLabel("Question 4:");
		q4.setForeground(Color.WHITE);
		q4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q4.setBounds(23, 240, 80, 50);
		add(q4);
		
		JLabel q5 = new JLabel("Question 5:");
		q5.setForeground(Color.WHITE);
		q5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q5.setBounds(23, 320, 80, 50);
		add(q5);
		
		JLabel q6 = new JLabel("Question 6:");
		q6.setForeground(Color.WHITE);
		q6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q6.setBounds(258, 0, 80, 50);
		add(q6);
		
		JLabel q7 = new JLabel("Question 7:");
		q7.setForeground(Color.WHITE);
		q7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q7.setBounds(258, 80, 80, 50);
		add(q7);
		
		JLabel q8 = new JLabel("Question 8:");
		q8.setForeground(Color.WHITE);
		q8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q8.setBounds(258, 160, 80, 50);
		add(q8);
		
		JLabel q9 = new JLabel("Question 9:");
		q9.setForeground(Color.WHITE);
		q9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q9.setBounds(258, 240, 80, 50);
		add(q9);
		
		JLabel q10 = new JLabel("Question 10:");
		q10.setForeground(Color.WHITE);
		q10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q10.setBounds(258, 320, 90, 50);
		add(q10);
		
		
		back = new JButton();
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		back.setBackground(Color.DARK_GRAY);
		back.setBounds(80, 410, 100, 40);
		back.setIcon(backIcon);
		add(back);
		
		
		Randomise = new JButton();
		Randomise.setBackground(Color.DARK_GRAY);
		Randomise.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Randomise.setBounds(200, 410, 40, 40);
		Randomise.setIcon(RandomQMark);
		add(Randomise);
		
		
		ImageIcon StartIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Check Answers 130x30.png"));
		check = new JButton();
		check.setBackground(Color.DARK_GRAY);
		check.setForeground(Color.DARK_GRAY);
		check.setBounds(260, 410, 130, 40);
		//check.setFont(new Font("Tahoma", Font.PLAIN, 15));
		check.setIcon(StartIcon);
		add(check);
		
		
	}
	
	/**Places the components into same type arrays*/
	private void componentArrays(){
		
		questionLabels = new JLabel[10];
		questionLabels[0] = question1;
		questionLabels[1] = question2;
		questionLabels[2] = question3;
		questionLabels[3] = question4;
		questionLabels[4] = question5;
		questionLabels[5] = question6;
		questionLabels[6] = question7;
		questionLabels[7] = question8;
		questionLabels[8] = question9;
		questionLabels[9] = question10;
		
		InputFields = new JTextField[10];
		InputFields[0] = q1Input;
		InputFields[1] = q2Input;
		InputFields[2] = q3Input;
		InputFields[3] = q4Input;
		InputFields[4] = q5Input;
		InputFields[5] = q6Input;
		InputFields[6] = q7Input;
		InputFields[7] = q8Input;
		InputFields[8] = q9Input;
		InputFields[9] = q10Input;
		
		checkIcons = new JLabel[10];
		checkIcons[0] = checkIcon1;
		checkIcons[1] = checkIcon2;
		checkIcons[2] = checkIcon3;
		checkIcons[3] = checkIcon4;
		checkIcons[4] = checkIcon5;
		checkIcons[5] = checkIcon6;
		checkIcons[6] = checkIcon7;
		checkIcons[7] = checkIcon8;
		checkIcons[8] = checkIcon9;
		checkIcons[9] = checkIcon10;
	}
	
	/**Randomizes Hard coded questions so no question appears twice*/
	protected int[] questionstest(int[] questionsChosen, int upper, int lower){
		
		Random r = new Random();
		
		for(int i = 0; i < 10; i++){
			
			switch (i){
			
			case 0: 
				questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				break;
			case 1:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0]);
				break;
			case 2:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1]);
				break;	
			case 3:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1] || questionsChosen[i] == questionsChosen[2]);
				break;
			case 4:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1] || questionsChosen[i] == questionsChosen[2] || 
						questionsChosen[i] == questionsChosen[3]);
				break;
			case 5:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1] || questionsChosen[i] == questionsChosen[2] || 
						questionsChosen[i] == questionsChosen[3] || questionsChosen[i] == questionsChosen[4]);
				break;
			case 6:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1] || questionsChosen[i] == questionsChosen[2] || 
						questionsChosen[i] == questionsChosen[3] || questionsChosen[i] == questionsChosen[4] || questionsChosen[i] == questionsChosen[5]);
				break;
			case 7:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1] || questionsChosen[i] == questionsChosen[2] || 
						questionsChosen[i] == questionsChosen[3] || questionsChosen[i] == questionsChosen[4] || questionsChosen[i] == questionsChosen[5] ||
						questionsChosen[i] == questionsChosen[6]);
				break;
			case 8:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1] || questionsChosen[i] == questionsChosen[2] || 
						questionsChosen[i] == questionsChosen[3] || questionsChosen[i] == questionsChosen[4] || questionsChosen[i] == questionsChosen[5] ||
						questionsChosen[i] == questionsChosen[6] || questionsChosen[i] == questionsChosen[7]);
				break;
			case 9:
				do {
					questionsChosen[i] = r.nextInt(upper - lower + 1) + lower;
				}while (questionsChosen[i] == questionsChosen[0] || questionsChosen[i] == questionsChosen[1] || questionsChosen[i] == questionsChosen[2] || 
						questionsChosen[i] == questionsChosen[3] || questionsChosen[i] == questionsChosen[4] || questionsChosen[i] == questionsChosen[5] ||
						questionsChosen[i] == questionsChosen[6] || questionsChosen[i] == questionsChosen[7] ||  questionsChosen[i] == questionsChosen[8]);
				break;
		
			}		
		}
		return questionsChosen;
	}
	
	/**Checks the answer when the answers have been hard coded*/
	protected void checkAnswer(int[] questionsChosen, double[] answerSet){ 
		
		for (int i = 0; i<10; i++){
			
			if (Integer.parseInt(InputFields[i].getText()) == answerSet[questionsChosen[i]]){
				System.out.println("Yasss");
				checkIcons[i].setIcon(Tick);
			}
			else {
				System.out.println("Shite!");
				checkIcons[i].setIcon(X);
			}	
		}	
	}
	
	/**Checks the int answers when the answers have been randomly generated*/
	protected void checkAnswer(int[] answers){
		
		for (int i = 0; i<10; i++){
			
			if (Integer.parseInt(InputFields[i].getText()) == answers[i]){
				System.out.println("Yasss");
				checkIcons[i].setIcon(Tick);
			}
			else {
				System.out.println("Shite!");
				checkIcons[i].setIcon(X);
			}
		}
		
	}
	
	/**Checks the BigDecimal answers when the answers have been randomly generated*/
	protected void checkAnswer(BigDecimal[] answers){
		
		for (int i = 0; i < 10; i++){
			
			BigDecimal a = new BigDecimal(InputFields[i].getText());
			if (a.equals(answers[i])){
				checkIcons[i].setIcon(Tick);}
			else{
				checkIcons[i].setIcon(X);}
		}
	}
	
	/**Resets check icons and input boxes*/
	protected void reset(){
		
		for (int i =0; i< 10; i++){
			InputFields[i].setText("0");
		}
		
		for (int i =0; i< 10; i++){
			checkIcons[i].setIcon(null);		
		}
	}
	
	/**Sets the questions when the questions are hard coded*/
	protected void setQuestions(String[] questions, int[] questionsChosen){

		for (int i = 0; i<10; i++){
		questionLabels[i].setText(questions[questionsChosen[i]]);
		}
		
	}
	
	/**Sets the Questions when the questions have been randomly generated*/
	protected void setQuestions(String[] questions){
		
		for (int i = 0; i<10; i++){
			questionLabels[i].setText(questions[i]);
		}

	}


}