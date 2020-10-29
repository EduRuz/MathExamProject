package math_Exam;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EasyAddition extends ExamPanel {
	
	private String[] eaq;
	private int[] eaa;
	private int[] questionsChosen;
	private final int upper = 99;
	private final int lower = 1;
	private QuestionGenerator gen;
	
	public EasyAddition() {
		super();
		
		eaq = new String[10];
		eaa = new int[10];
		
		gen = new QuestionGenerator(upper, lower, eaq, eaa, '+');
		gen.randomiseInt();
		eaa = gen.getIntAnswers();
		eaq = gen.getQuestions();

		setQuestions(eaq);
		mouseListeners();
					
	}
	

	private void mouseListeners(){
		
		check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				checkAnswer(eaa);
			}
		});
		
		Randomise.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gen.randomiseInt();
				eaq = gen.getQuestions();
				setQuestions(eaq);
				reset();
			}
		});
	}
}
