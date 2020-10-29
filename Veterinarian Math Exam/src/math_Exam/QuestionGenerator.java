package math_Exam;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class QuestionGenerator {

		/**The X value for the question and answer*/
		int x = 0;
		/**The Y value for the question and answer*/
		int y = 0;
		/**The decimal x Value for the questions and answers */
		BigDecimal value1;
		/**The decimal y Value for the questions and answers */
		BigDecimal value2;
		/**The Array for the BigDecimal answers*/
		BigDecimal[] floatAnswers;
		/**The Array for the integer answers*/
		int[] intAnswers;
		/**The Array for the questions*/
		String[] questions;
		/**Char for the operator*/
		char operator;
		/**Random for the Random Number Generator*/
		Random r;
		/**Upper limit for ints in the Random Number Generator*/
		int upperInt;
		/**Lower limit for ints in the Random Number Generator*/
		int lowerInt;
		
	/**Ready's the variables needed to generate 10 random integer questions */
	public QuestionGenerator(int upper, int lower, String[] questions, int[] answers, char operator ){
		this.intAnswers = new int[10];
		this.intAnswers = answers;
				
		this.questions = new String[10];
		this.questions = questions;
		
		this.operator = operator;
		
		this.upperInt = upper;
		this.lowerInt = lower;
		
		r = new Random();

	}
	
	/**Ready's the variables needed to generate 10 random Decimal point questions */
	public QuestionGenerator(int upper, int lower, String[] questions, BigDecimal[] answers, char operator ){
		this.floatAnswers = new BigDecimal[10];
		this.floatAnswers = answers;
				
		this.questions = new String[10];
		this.questions = questions;
		
		this.operator = operator;
		
		this.upperInt = upper;
		this.lowerInt = lower;
		
		r = new Random();

		
	}
	
	/**Generates an array of randomized questions and an array of matching answers*/
	public void randomiseInt(){
		
		for (int i = 0; i < 10; i++){
			
			x = r.nextInt(upperInt - lowerInt + 1) + lowerInt;
			y = r.nextInt(upperInt - lowerInt + 1) + lowerInt;
			
			calculateIntAnswer(i);
			
			this.questions[i] = x + " " + operator + " " + y + " = "; 
		}
		
	}
	
	/**Randomizes the answers and questions array for negative numbers*/
	public void randomiseNegInt(){
		
		for (int i = 0; i < 10; i++){
			
			x = r.nextInt(upperInt - lowerInt + 1) + lowerInt;
			
			y = r.nextInt(upperInt - lowerInt + 1) + lowerInt;

			switch(r.nextInt(3 - 1 + 1) + 1){
			
			case 1:
				x *= -1;
				break;
				
			case 2:
				y *= -1;
				break;
				
			case 3:
				x *= -1;
				y *= -1;
			break;
			}
			
			calculateIntAnswer(i);
			
			this.questions[i] = x + " " + operator + " " + y + " = "; 
		}
		
	}
	
	/**Randomizes the answers and questions array for Decimal numbers*/
	public void randomiseDecimal(){
		
		String stringValue1 = "";
		String stringValue2 = "";
		
		for (int i = 0; i < 10; i++){
			
			stringValue1 = (r.nextInt(upperInt - lowerInt + 1) + lowerInt + "." + (r.nextInt(99 - 10 + 1) + 10));
			
			stringValue2 = (r.nextInt(upperInt - lowerInt + 1) + lowerInt + "." + (r.nextInt(99 - 10 + 1) + 10));
			
			this.value1 = new BigDecimal(stringValue1);

			this.value2 = new BigDecimal(stringValue2);
			
			System.out.println("int a: " + this.value1.toString());
			System.out.println("int b: " + this.value2.toString());
			calculateFloatAnswer(i);
			
			this.questions[i] = this.value1.toString() + " " + operator + " " + this.value2.toString() + " = "; 
		
		}
	}
	
	/**Calculates the answers for the arrays current integer question*/
	public void calculateIntAnswer(int i){
	
		switch (operator) {
		case '+':
			intAnswers[i] = x + y;
			break;
		
		case '-':
			intAnswers[i] = x - y;
			break;
		
		case '*':
			intAnswers[i] = x * y;
			break;

		case '/':
			intAnswers[i] = x / y;
			break;
		}
		
	}
	
	/**Calculates the answers for the arrays current BigDecimal question*/
	public void calculateFloatAnswer(int i){
		
		switch (operator) {
		case '+':
			floatAnswers[i] = value1.add(value2);
			break;
		
		case '-':
			floatAnswers[i] = value1.subtract(value2);
			break;
		
		case '*':
			floatAnswers[i] = value1.multiply(value2);
			break;

		case '/':
			floatAnswers[i] = value1.divide(value2);
			break;
		}
		System.out.println("a + b = " + floatAnswers[i].toString());
	}
	
	/**Get the random questions*/
	public String[] getQuestions(){
		return this.questions;
	}
	
	/**Get the answers for the integer questions*/
	public int[] getIntAnswers(){
		return this.intAnswers;
	}
	
	/**Get the answers for the decimal questions*/
	public BigDecimal[] getFloatAnswers(){
		return this.floatAnswers;
	}
	
}
