package math_Exam;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Toolkit;

//00C000 Green for Icons
//LittleBits for Font

public class UserInterface {
	/**Main JFrame for the program*/
	private JFrame frmMain;
	/**JPanels used for the programs Menus*/
	private JPanel pnlStart, pnlMathSelect, pnlAddition, pnlSubtraction, pnlMultiplication, pnlDivision, pnlAverages;
	/**Custom Exam Panel for Whole Number Addition Panel*/
	private EasyAddition easyAdditionPanel;
	/**Custom Exam Panel for Decimal Addition Panel*/
	private AddDecimals addDecimalsPanel;
	/**Custom Exam Panel for Negative Addition Panel*/
	private AddNegatives addNegativesPanel;
	/**Constant int to track total Menu Panels for layer management*/
	private final int totalMenuPanels = 7;
	/**Constant int to track total Exam Panels for layer management*/
	private final int totalExamPanels = 3;
	/**integer to count down the layers for placing panels in the intended order*/
	private int panelsLocationCount = ((totalMenuPanels + totalExamPanels) - 1);
	/**JPanel to store the menu panels used in layer management*/
	private JPanel[] menuPanels;
	/**JPanel to store the exam panels used in layer management*/
	private JPanel[] examPanels;
	/**JLayeredPane to contain and manage all the panels in the program*/
	private JLayeredPane testPane;
	/**ImageIcon for the back arrow icon used on the Back button*/
	private ImageIcon backIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Back 100x30.png"));
	/**ImageIcon for the addNegatives icon used on the Negative menu button*/
	private ImageIcon addNegatives = new ImageIcon(UserInterface.class.getResource("/math_Exam/Negative Numbers 200x50.png"));
	/**ImageIcon for the addDecimals icon used on the Decimals menu button*/
	private ImageIcon addDecimals = new ImageIcon(UserInterface.class.getResource("/math_Exam/Decimals 200x50.png"));
	/**ImageIcon for the addWholeNumbers icon used on the Whole Numbers menu button*/
	private ImageIcon addWholeNumIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Whole Numbers 200x50.png"));
	
	/**Creates the user interface for the program*/
	public UserInterface(){
		
		startMenu();
		mathSelectMenu();
		additionMenu();
		subtractionMenu();
		multiplicationMenu();
		averagesMenu();
		pnlDivison();
		
		examMenus();

		layerManagement();
		
		frmMain.setVisible(true);
	}
	
	/**Controls when everything sits in the JLayeredPane*/
	private void layerManagement(){
		
		menuPanels = new JPanel[totalMenuPanels];
		menuPanels[0] = pnlStart;
		menuPanels[1] = pnlMathSelect;
		menuPanels[2] = pnlAddition;
		menuPanels[3] = pnlSubtraction;
		menuPanels[4] = pnlMultiplication;
		menuPanels[5] = pnlDivision;
		menuPanels[6] = pnlAverages;
		
		examPanels = new JPanel[totalExamPanels];
		examPanels[2] = addNegativesPanel;
		examPanels[1] = addDecimalsPanel;
		examPanels[0] = easyAdditionPanel;
		
		
		for (int i= 0; i < totalMenuPanels;i++){
			testPane.add(menuPanels[i],panelsLocationCount);
			panelsLocationCount--;
		}
			
		for (int i = 0; i < totalExamPanels; i++){
			testPane.setLayer(examPanels[i], javax.swing.JLayeredPane.MODAL_LAYER);
			testPane.add(examPanels[i], panelsLocationCount);
			panelsLocationCount--;
		}
	}
	
	/**Where the exam Menu objects are created*/
	private void examMenus(){
		
		easyAdditionPanel = new EasyAddition();
		easyAdditionPanel.setVisible(false);

		addDecimalsPanel = new AddDecimals();
		addDecimalsPanel.setVisible(false);

		addNegativesPanel = new AddNegatives();
		addNegativesPanel.setVisible(false);
		
	}
	
	/**User Interface for the start menu*/
	private void startMenu(){

		frmMain = new JFrame();
		frmMain.setBounds(100, 100, 496, 499);
		frmMain.setTitle("Math Exam");
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		frmMain.setIconImage(Toolkit.getDefaultToolkit().getImage(UserInterface.class.getResource("/math_Exam/Math Symbols 60x60.png")));
		
		testPane = new JLayeredPane();
		testPane.setBounds(0, 0, 500, 500);
		frmMain.add(testPane);
		
		pnlStart = new JPanel();
		pnlStart.setBackground(Color.DARK_GRAY);
		pnlStart.setBounds(0, 0, 480, 460);
		pnlStart.setLayout(null);
		
		ImageIcon vetnurseBanner = new ImageIcon(UserInterface.class.getResource("/math_Exam/Veterinary Nursing 300x100.png"));
		JLabel topBanner = new JLabel();
		topBanner.setBounds(90, 50, 300, 100);
		topBanner.setIcon(vetnurseBanner);
		pnlStart.add(topBanner);
		
		ImageIcon mathExamBanner = new ImageIcon(UserInterface.class.getResource("/math_Exam/Math Exam 240x60.png"));
		JLabel bottumBanner = new JLabel();
		bottumBanner.setBounds(120, 150, 240, 60);
		bottumBanner.setIcon(mathExamBanner);
		pnlStart.add(bottumBanner);
		
		ImageIcon startIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Start 200x90.png"));
		JButton btnStart = new JButton();
		btnStart.setBackground(Color.DARK_GRAY);
		btnStart.setIcon(startIcon);
		pnlStart.add(btnStart);
		
				btnStart.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						pnlStart.setVisible(false);
						pnlMathSelect.setVisible(true);
						
						
					}
				});
		btnStart.setBounds(140, 260, 200, 90);
	
		
		
		
	}
	
	/**User Interface for the math select menu*/
	private void mathSelectMenu(){
		
		pnlMathSelect = new JPanel();
		pnlMathSelect.setBackground(Color.DARK_GRAY);
		pnlMathSelect.setLayout(null);
		pnlMathSelect.setBounds(0, 0, 480, 460);
		
		ImageIcon additionIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Addition 160x50.png"));
		JButton btnAddition = new JButton();
		btnAddition.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(false);
				pnlAddition.setVisible(true);
			}
		});
		btnAddition.setBounds(45, 50, 160, 60);
		btnAddition.setBackground(Color.DARK_GRAY);
		btnAddition.setIcon(additionIcon);
		
		ImageIcon subtractionIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Subtraction 160x50.png"));
		JButton btnSubtraction = new JButton();
		btnSubtraction.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlSubtraction.setVisible(true);
				pnlMathSelect.setVisible(false);
			}
		});
		btnSubtraction.setBounds(45, 150, 160, 60);
		btnSubtraction.setBackground(Color.DARK_GRAY);
		btnSubtraction.setIcon(subtractionIcon);
		
		ImageIcon multiplicationIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Multiplication 160x50.png"));
		JButton btnMultiplication = new JButton();
		btnMultiplication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMultiplication.setVisible(true);
				pnlMathSelect.setVisible(false);
			}
		});
		btnMultiplication.setBounds(45, 250, 160, 60);
		btnMultiplication.setBackground(Color.DARK_GRAY);
		btnMultiplication.setIcon(multiplicationIcon);
		
		ImageIcon divisionIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Division 160x50.png"));
		JButton btnDivision = new JButton();
		btnDivision.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(false);
				pnlDivision.setVisible(true);
			}
		});
		btnDivision.setBounds(45, 350, 160, 60);
		btnDivision.setBackground(Color.DARK_GRAY);
		btnDivision.setIcon(divisionIcon);
		
		ImageIcon fractionsIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Fractions 160x50.png"));
		JButton btnFractions = new JButton();
		btnFractions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnFractions.setBounds(275, 50, 160, 60);
		btnFractions.setBackground(Color.DARK_GRAY);
		btnFractions.setIcon(fractionsIcon);
		
		ImageIcon percentagesIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Percentages 160x50.png"));
		JButton btnPercentages = new JButton();
		btnPercentages.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPercentages.setBounds(275, 150, 160, 60);
		btnPercentages.setBackground(Color.DARK_GRAY);
		btnPercentages.setIcon(percentagesIcon);
		
		ImageIcon averagesIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Averages 160x50.png"));
		JButton btnAverages = new JButton();
		btnAverages.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlAverages.setVisible(true);
				pnlMathSelect.setVisible(false);
			}
		});
		btnAverages.setBounds(275, 250, 160, 60);
		btnAverages.setBackground(Color.DARK_GRAY);
		btnAverages.setIcon(averagesIcon);
		
		ImageIcon measurementsIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Measurements 160x50.png"));
		JButton btnMeasurements = new JButton();
		btnMeasurements.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMeasurements.setBounds(275, 350, 160, 60);
		btnMeasurements.setBackground(Color.DARK_GRAY);
		btnMeasurements.setIcon(measurementsIcon);
		
		
		JButton btnBack = new JButton();
		btnBack.setBounds(10, 10, 100, 30);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(false);
				pnlStart.setVisible(true);
			}
		});
		btnBack.setIcon(backIcon);
		
		pnlMathSelect.add(btnBack);
		pnlMathSelect.add(btnSubtraction);
		pnlMathSelect.add(btnAddition);
		pnlMathSelect.add(btnMultiplication);
		pnlMathSelect.add(btnDivision);
		pnlMathSelect.add(btnFractions);
		pnlMathSelect.add(btnPercentages);
		pnlMathSelect.add(btnAverages);
		pnlMathSelect.add(btnMeasurements);
		pnlMathSelect.setVisible(false);
		
		}
	
	/**User Interface for the addition menu*/
	private void additionMenu(){
		
		pnlAddition = new JPanel();
		pnlAddition.setBackground(Color.DARK_GRAY);
		pnlAddition.setLayout(null);
		pnlAddition.setBounds(0, 0, 480, 460);
		
		
		JButton btnWholeNum = new JButton();
		btnWholeNum.setBounds(140, 80, 200, 60);
		btnWholeNum.setBackground(Color.DARK_GRAY);
		btnWholeNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				easyAdditionPanel.setVisible(true);
			}
		});
		btnWholeNum.setIcon(addWholeNumIcon);
		
		
		JButton btnDecimals = new JButton();
		btnDecimals.setBounds(140, 200, 200, 60);
		btnDecimals.setBackground(Color.DARK_GRAY);
		btnDecimals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addDecimalsPanel.setVisible(true);
			}
		});
		btnDecimals.setIcon(addDecimals);
		
		
		JButton btnNegatives = new JButton();
		btnNegatives.setBounds(140, 320, 200, 60);
		btnNegatives.setBackground(Color.DARK_GRAY);
		btnNegatives.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addNegativesPanel.setVisible(true);
			}
		});
		btnNegatives.setIcon(addNegatives);

		JButton btnBack = new JButton();
		btnBack.setBounds(10, 10, 100, 30);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(true);
				pnlAddition.setVisible(false);
			}
		});
		btnBack.setIcon(backIcon);
		
		pnlAddition.add(btnBack);
		pnlAddition.add(btnWholeNum);
		pnlAddition.add(btnDecimals);
		pnlAddition.add(btnNegatives);
		pnlAddition.setVisible(false);
		
	}
	
	/**User Interface for the subtraction menu*/
	private void subtractionMenu(){
		
		pnlSubtraction = new JPanel();
		pnlSubtraction.setBackground(Color.DARK_GRAY);
		pnlSubtraction.setLayout(null);
		pnlSubtraction.setBounds(0, 0, 480, 460);
		
		JButton btnWholeNum = new JButton();
		btnWholeNum.setBounds(140, 80, 200, 60);
		btnWholeNum.setBackground(Color.DARK_GRAY);
		btnWholeNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnWholeNum.setIcon(addWholeNumIcon);
		
		JButton btnDecimals = new JButton();
		btnDecimals.setBounds(140, 200, 200, 60);
		btnDecimals.setBackground(Color.DARK_GRAY);
		btnDecimals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnDecimals.setIcon(addDecimals);
		
		JButton btnNegatives = new JButton();
		btnNegatives.setBounds(140, 320, 200, 60);
		btnNegatives.setBackground(Color.DARK_GRAY);
		btnNegatives.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNegatives.setIcon(addNegatives);
		
		JButton btnBack = new JButton();
		btnBack.setBounds(10, 10, 100, 30);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(true);
				pnlSubtraction.setVisible(false);
			}
		});
		btnBack.setIcon(backIcon);
		
		pnlSubtraction.add(btnWholeNum);
		pnlSubtraction.add(btnDecimals);
		pnlSubtraction.add(btnNegatives);
		pnlSubtraction.add(btnBack);
		pnlSubtraction.setVisible(false);
	}
	
	/**User Interface for the multiplication menu*/
	private void multiplicationMenu(){
		
		pnlMultiplication = new JPanel();
		pnlMultiplication.setBackground(Color.DARK_GRAY);
		pnlMultiplication.setLayout(null);
		pnlMultiplication.setBounds(0, 0, 480, 460);
		
		JButton btnWholeNum = new JButton();
		btnWholeNum.setBounds(140, 80, 200, 60);
		btnWholeNum.setBackground(Color.DARK_GRAY);
		btnWholeNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnWholeNum.setIcon(addWholeNumIcon);
		
		JButton btnDecimals = new JButton();
		btnDecimals.setBounds(140, 200, 200, 60);
		btnDecimals.setBackground(Color.DARK_GRAY);
		btnDecimals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnDecimals.setIcon(addDecimals);
		
		JButton btnNegatives = new JButton();
		btnNegatives.setBounds(140, 320, 200, 60);
		btnNegatives.setBackground(Color.DARK_GRAY);
		btnNegatives.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNegatives.setIcon(addNegatives);
		
		pnlMultiplication = new JPanel();
		pnlMultiplication.setBackground(Color.DARK_GRAY);
		pnlMultiplication.setLayout(null);
		pnlMultiplication.setBounds(0, 0, 480, 460);
		
		JButton btnBack = new JButton();
		btnBack.setBounds(10, 10, 100, 30);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(true);
				pnlMultiplication.setVisible(false);
			}
		});
		btnBack.setIcon(backIcon);
		
		pnlMultiplication.add(btnWholeNum);
		pnlMultiplication.add(btnDecimals);
		pnlMultiplication.add(btnNegatives);
		pnlMultiplication.add(btnBack);
		pnlMultiplication.setVisible(false);
	}
	
	/**User Interface for the division menu*/
	private void pnlDivison() {
		
		pnlDivision = new JPanel();
		pnlDivision.setBackground(Color.DARK_GRAY);
		pnlDivision.setLayout(null);
		pnlDivision.setBounds(0, 0, 480, 460);
		
		JButton btnWholeNum = new JButton();
		btnWholeNum.setBounds(140, 80, 200, 60);
		btnWholeNum.setBackground(Color.DARK_GRAY);
		btnWholeNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnWholeNum.setIcon(addWholeNumIcon);
		
		JButton btnDecimals = new JButton();
		btnDecimals.setBounds(140, 200, 200, 60);
		btnDecimals.setBackground(Color.DARK_GRAY);
		btnDecimals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnDecimals.setIcon(addDecimals);
		
		JButton btnNegatives = new JButton();
		btnNegatives.setBounds(140, 320, 200, 60);
		btnNegatives.setBackground(Color.DARK_GRAY);
		btnNegatives.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNegatives.setIcon(addNegatives);
		
		JButton btnBack = new JButton();
		btnBack.setBounds(10, 10, 100, 30);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(true);
				pnlDivision.setVisible(false);
			}
		});
		btnBack.setIcon(backIcon);
		
		pnlDivision.add(btnWholeNum);
		pnlDivision.add(btnDecimals);
		pnlDivision.add(btnNegatives);
		pnlDivision.add(btnBack);
	}
	
	/**User Interface for the averages menu*/
	private void averagesMenu(){
		
		pnlAverages = new JPanel();
		pnlAverages.setBackground(Color.DARK_GRAY);
		pnlAverages.setLayout(null);
		pnlAverages.setBounds(0, 0, 480, 460);
		
		JButton btnBack = new JButton();
		btnBack.setBounds(10, 10, 100, 30);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMathSelect.setVisible(true);
				pnlAverages.setVisible(false);
			}
		});
		btnBack.setIcon(backIcon);
		
		ImageIcon meanIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Mean 160x50.png"));
		JButton btnMean = new JButton();
		btnMean.setBounds(160, 50, 160, 60);
		btnMean.setBackground(Color.DARK_GRAY);
		btnMean.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMean.setIcon(meanIcon);
		
		ImageIcon medianIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Median 160x50.png"));
		JButton btnMedian = new JButton();
		btnMedian.setBounds(160, 150, 160, 60);
		btnMedian.setBackground(Color.DARK_GRAY);
		btnMedian.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMedian.setIcon(medianIcon);
		
		ImageIcon modeIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Mode 160x50.png"));
		JButton btnMode = new JButton();
		btnMode.setBounds(160, 250, 160, 60);
		btnMode.setBackground(Color.DARK_GRAY);
		btnMode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnMode.setIcon(modeIcon);
		
		ImageIcon RangeIcon = new ImageIcon(UserInterface.class.getResource("/math_Exam/Range 160x50.png"));
		JButton btnRange = new JButton();
		btnRange.setBounds(160, 350, 160, 60);
		btnRange.setBackground(Color.DARK_GRAY);
		btnRange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnRange.setIcon(RangeIcon);
		
		pnlAverages.add(btnBack);
		pnlAverages.add(btnMean);
		pnlAverages.add(btnMedian);
		pnlAverages.add(btnMode);
		pnlAverages.add(btnRange);
		pnlAverages.setVisible(false);
	}
	
	
	
}
