package math_Exam;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class AddDecimals extends ExamPanel{
	
	private String[] eaq;
	private BigDecimal[] eaa;
	private int[] questionsChosen;
	private final int upper = 99;
	private final int lower = 1;
	private QuestionGenerator gen;
	
	public AddDecimals() {
		super();
		
		eaq = new String[10];
		eaa = new BigDecimal[10];
		
		gen = new QuestionGenerator(upper, lower, eaq, eaa, '+');
		gen.randomiseDecimal();
		eaa = gen.getFloatAnswers();
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
				gen.randomiseDecimal();
				eaq = gen.getQuestions();
				setQuestions(eaq);
				reset();
			}
		});
	}
}
