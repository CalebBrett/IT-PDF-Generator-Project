import javax.swing.*;

import com.docmosis.SystemManager;
import com.docmosis.document.DocumentProcessor;
import com.docmosis.template.population.DataProviderBuilder;
import com.docmosis.util.Configuration;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class Main {

	
	
	public static JFrame mainWindow = new JFrame();
	public static JPanel mainPanel = new JPanel();
	public static GridBagConstraints control = new GridBagConstraints();
	public static CardLayout cards = new CardLayout();
	
	public static boolean inProgress = true;
	public static JButton previous = new JButton("PREVIOUS");
	public static JButton next = new JButton("NEXT");
	public static JButton preview = new JButton("GENERATE");
	public static JLabel label = new JLabel("Big Brothers Big Sisters Application Form");
	
	
	public static String[] answers = new String[54];
	
	
	
	public static JPanel bioQuestions = new JPanel();
	public static JPanel oppQuestions = new JPanel();
	public static JPanel crimeQuestions = new JPanel();
	public static JPanel Refference1 = new JPanel();
	public static JPanel Refference2 = new JPanel();
	public static JPanel Refference3 = new JPanel();
	
	public static JLabel Q1 = new JLabel();
	public static JTextField text1 = new JTextField("",20);

	public static JLabel Q2 = new JLabel();
	public static JTextField text2 = new JTextField("",20);
	
	public static JLabel Q3 = new JLabel();
	public static JTextField text3 = new JTextField("",20);
	
	public static JLabel Q3W = new JLabel();
	public static JTextField text3W = new JTextField("",20);
	
	public static JLabel Q4 = new JLabel();
	public static JTextField text4 = new JTextField("",20);
	
	public static JLabel Q5 = new JLabel();
	public static JTextField text5 = new JTextField("",20);
	
	public static JLabel Q6 = new JLabel();
	public static JTextField text6 = new JTextField("",20);
	
	public static JLabel Q7 = new JLabel();
	public static JTextField text7 = new JTextField("",20);
	
	public static JLabel Q8 = new JLabel();
	public static JLabel Q85 = new JLabel();
	public static JTextField text8 = new JTextField("",20);
	
	public static JLabel Q9 = new JLabel();
	public static JTextField text9 = new JTextField("",20);
	
	public static JLabel Q10 = new JLabel();
	public static JTextField text10 = new JTextField("",20);
	
	public static JLabel Q11 = new JLabel();
	public static JTextField text11 = new JTextField("",20);
	
	public static JLabel Q12 = new JLabel();
	public static JRadioButton inSchool = new JRadioButton("In school Mentor");
	public static JRadioButton group = new JRadioButton("Group programs");
	public static JRadioButton couple = new JRadioButton("Big Couple");
	public static JRadioButton bro = new JRadioButton("Big Brother");
	public static JRadioButton sis = new JRadioButton("Big Sister");

	public static ButtonGroup prgmChoice = new ButtonGroup();
	
	public static JLabel Q13 = new JLabel();
	public static JTextField text13 = new JTextField("",20);
	
	public static JLabel Q14 = new JLabel();
	public static JTextField text14 = new JTextField("",20);
	
	public static JLabel Q15 = new JLabel();
	public static JLabel Q155 = new JLabel();
	public static JTextArea text15 = new JTextArea("",3,43);
	
	public static JLabel Q16 = new JLabel();
	public static JTextArea text16 = new JTextArea("",3,43);
	
	public static JLabel Q17 = new JLabel();
	public static JLabel Q173 = new JLabel();
	public static JLabel Q178 = new JLabel();
	public static JTextArea text17 = new JTextArea("",3,43);
	
	public static JLabel Q18 = new JLabel();
	public static JTextArea text18 = new JTextArea("",3,43);

	
	
	public static JLabel Q19 = new JLabel();
	public static JTextArea text19 = new JTextArea("",3,43);
	
	public static JLabel Q20 = new JLabel();
	public static JTextField text20 = new JTextField("",43);
	
	public static JLabel Q21 = new JLabel();
	public static JRadioButton crimeY = new JRadioButton("Yes");
	public static JRadioButton crimeN = new JRadioButton("No");

	public static ButtonGroup crimeYN = new ButtonGroup();
	
	public static JLabel Q22 = new JLabel();
	public static JLabel Q225 = new JLabel();
	public static JRadioButton offY = new JRadioButton("Yes");
	public static JRadioButton offN = new JRadioButton("No");

	public static ButtonGroup offYN = new ButtonGroup();
	

	public static JLabel Q235 = new JLabel();
	public static JLabel Q236 = new JLabel();
	public static JLabel Q237 = new JLabel();
	
	public static JLabel Q23 = new JLabel();
	public static JTextField text23 = new JTextField("",20);

	public static JLabel Q24 = new JLabel();
	public static JTextField text24 = new JTextField("",20);
	
	public static JLabel Q25 = new JLabel();
	public static JTextField text25 = new JTextField("",20);
	
	public static JLabel Q26 = new JLabel();
	public static JTextField text26 = new JTextField("",20);
	
	public static JLabel Q27 = new JLabel();
	public static JTextField text27 = new JTextField("",20);
	
	public static JLabel Q28 = new JLabel();
	public static JTextField text28 = new JTextField("",20);
	
	public static JLabel Q29 = new JLabel();
	public static JTextField text29 = new JTextField("",20);
	
	public static JLabel Q30 = new JLabel();
	public static JTextField text30 = new JTextField("",20);
	
	public static JLabel Q31 = new JLabel();
	public static JTextField text31 = new JTextField("",20);
	
	public static JLabel Q32 = new JLabel();
	public static JTextField text32 = new JTextField("",20);
	
	
	
	
	public static JLabel Q335 = new JLabel();
	public static JLabel Q336 = new JLabel();
	
	public static JLabel Q33 = new JLabel();
	public static JTextField text33 = new JTextField("",20);

	public static JLabel Q34 = new JLabel();
	public static JTextField text34 = new JTextField("",20);
	
	public static JLabel Q35 = new JLabel();
	public static JTextField text35 = new JTextField("",20);
	
	public static JLabel Q36 = new JLabel();
	public static JTextField text36 = new JTextField("",20);
	
	public static JLabel Q37 = new JLabel();
	public static JTextField text37 = new JTextField("",20);
	
	public static JLabel Q38 = new JLabel();
	public static JTextField text38 = new JTextField("",20);
	
	public static JLabel Q39 = new JLabel();
	public static JTextField text39 = new JTextField("",20);
	
	public static JLabel Q40 = new JLabel();
	public static JTextField text40 = new JTextField("",20);
	
	public static JLabel Q41 = new JLabel();
	public static JTextField text41 = new JTextField("",20);
	
	public static JLabel Q42 = new JLabel();
	public static JTextField text42 = new JTextField("",20);
	
	
	
	
	public static JLabel Q435 = new JLabel();
	public static JLabel Q436 = new JLabel();
	
	public static JLabel Q43 = new JLabel();
	public static JTextField text43 = new JTextField("",20);

	public static JLabel Q44 = new JLabel();
	public static JTextField text44 = new JTextField("",20);
	
	public static JLabel Q45 = new JLabel();
	public static JTextField text45 = new JTextField("",20);
	
	public static JLabel Q46 = new JLabel();
	public static JTextField text46 = new JTextField("",20);
	
	public static JLabel Q47 = new JLabel();
	public static JTextField text47 = new JTextField("",20);
	
	public static JLabel Q48 = new JLabel();
	public static JTextField text48 = new JTextField("",20);
	
	public static JLabel Q49 = new JLabel();
	public static JTextField text49 = new JTextField("",20);
	
	public static JLabel Q50 = new JLabel();
	public static JTextField text50 = new JTextField("",20);
	
	public static JLabel Q51 = new JLabel();
	public static JTextField text51 = new JTextField("",20);
	
	public static JLabel Q52 = new JLabel();
	public static JTextField text52 = new JTextField("",20);
	
	public static JLabel Q53 = new JLabel();
	public static JTextField text53 = new JTextField("",20);
	
	

	
	public static void main(String[] args) {		
		System.out.println("Runnning...");
		
		

	
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setTitle("Big Brothers Big Sisters Application");
		
		
		mainWindow.setVisible(true);
		mainWindow.setBounds(0,0,500,500);
		mainWindow.setLayout(new GridBagLayout());
		mainWindow.setBackground(new Color(0,0,0));
		mainWindow.getContentPane().setBackground(Color.WHITE);
		//bioQuestions.setBackground(Color.WHITE);
		
		label.setFont(new Font("Verdana", Font.PLAIN, 26));
		
		control.insets = new Insets(10,10,10,10);
		

		control.gridx = 1;
		control.gridy = 1;
		control.weightx = 1;
		mainWindow.add(mainPanel, control);
		
		control.gridx = 0;
		control.gridy = 2;
		mainWindow.add(previous, control);
		
		control.gridx = 2;
		control.gridy = 2;
		mainWindow.add(next, control);
		
		control.gridx = 1;
		control.gridy = 0;
		mainWindow.add(label, control);
		
		control.gridx = 1;
		control.gridy = 2;
		mainWindow.add(preview, control);
		
		mainPanel.setLayout(cards);
		mainPanel.setPreferredSize(new Dimension(490, 450));
		
		
		Q1.setText("What is your full name?");
		Q2.setText("What is your home phone number?");
		Q3.setText("What is your cell phone number?");
		Q3W.setText("What is your work phone number?");
		Q4.setText("What is your address?");
		Q5.setText("What is your postal code?");
		Q6.setText("How long have you lived at this address?");
		Q7.setText("How long have you lived in the area?");
		Q8.setText("If you have lived in Saint John area for less than a year, please provide");
		Q85.setText("the city/town where you previously lived and for how long.");
		Q9.setText("What is your birthday? (yyyy-mm-dd)");
		Q10.setText("What is your email?");
		Q11.setText("Do you check e-mail regularly?");
		Q12.setText("Enrollment form volunteer with the following program (check one):");
		

	    prgmChoice.add(inSchool);
	    prgmChoice.add(group);
	    prgmChoice.add(couple);
	    prgmChoice.add(bro);
	    prgmChoice.add(sis);
	    
	    Q13.setText("What is your gender?");
	    
	    
	    
		Q14.setText("Have you ever applied to become a volunteer with a youth-serving organization before?");
		Q15.setText("Are you anticipating changes in your life over the next year?");
		Q155.setText("Job, moving, marital status, children) If yes describe:");
		Q16.setText("Explain why you want to volunteer with Big Brothers Big Sisters now:");
		Q17.setText("Describe any training, education, paid or unpaid work or personal"); 
		Q173.setText("experience that would assist you in your position as a mentor,");
		Q178.setText("i.e., any experience you have with children between the ages of 6 and 15 years of age:");
		Q18.setText("Are you a member of any clubs, affiliations or organizations?");
		
		
		Q19.setText("What are your interests, hobbies or activities?");
		Q20.setText("Are you interested in volunteering in other areas of the agency? If so, where?");
		Q21.setText("Have you been arrested, charged, convicted or pardoned of a criminal offence?");
		Q22.setText("Have you ever been accused, arrested, convicted or pardoned of a sexual offense");
		Q225.setText("involving a child or children?");
		
		Q235.setText("A vulnerable sector reference (if volunteered with children or seniors) or");
		Q236.setText("employer/supervisor reference (if unemployed, an instructor) who has known you");
		Q237.setText("for at least TWO years:                                                                             ");
		Q23.setText("What is the name of this reference?");
		Q24.setText("What is their E-mail?");
		Q25.setText("What is their Fax number?");
		Q26.setText("What is their phone number?");
		Q27.setText("What is their work phone number?");
		Q28.setText("What is their postal code?");
		Q29.setText("Which City/Prov do they live in?");
		Q30.setText("What is their occupation/profession?");
		Q31.setText("How long has she/he known you?");
		Q32.setText("What is their address?");


		Q335.setText("A Significant Other or Family Member reference who has known you");
		Q336.setText("for at least TWO years:                                                                             ");                                                              
		Q33.setText("What is the name of this reference?");
		Q34.setText("What is their E-mail?");
		Q35.setText("What is their Fax number?");
		Q36.setText("What is their phone number?");
		Q37.setText("What is their work phone number?");
		Q38.setText("What is their postal code?");
		Q39.setText("Which City/Prov do they live in?");
		Q40.setText("What is their relationship to you?");
		Q41.setText("How long has she/he known you?");
		Q42.setText("What is their address?");
		
		
		Q435.setText("A Personal reference (a person, not related to you) who has known you");
		Q436.setText("for at least TWO years:                                                                             ");                                                              
		Q43.setText("What is the name of this reference?");
		Q44.setText("What is their E-mail?");
		Q45.setText("What is their Fax number?");
		Q46.setText("What is their phone number?");
		Q47.setText("What is their work phone number?");
		Q48.setText("What is their postal code?");
		Q49.setText("Which City/Prov do they live in?");
		Q50.setText("What is their relationship to you?");
		Q51.setText("How long has she/he known you?");
		Q52.setText("What is their address?");
		Q53.setText("In what capacity do you know them?");
		
		

		crimeYN.add(crimeY);
		crimeYN.add(crimeN);
		
		offYN.add(offY);
		offYN.add(offN);
		
		bioQuestions.add(Q1);
		bioQuestions.add(text1);
		bioQuestions.add(Q13);
		bioQuestions.add(text13);
		bioQuestions.add(Q2);
		bioQuestions.add(text2);
		bioQuestions.add(Q3);
		bioQuestions.add(text3);
		bioQuestions.add(Q3W);
		bioQuestions.add(text3W);
		bioQuestions.add(Q4);
		bioQuestions.add(text4);
		bioQuestions.add(Q5);
		bioQuestions.add(text5);
		bioQuestions.add(Q6);
		bioQuestions.add(text6);
		bioQuestions.add(Q7);
		bioQuestions.add(text7);
		bioQuestions.add(Q9);
		bioQuestions.add(text9);
		bioQuestions.add(Q10);
		bioQuestions.add(text10);
		bioQuestions.add(Q11);
		bioQuestions.add(text11);
		bioQuestions.add(Q8);
		bioQuestions.add(Q85);
		bioQuestions.add(text8);
		bioQuestions.add(Q12);
		bioQuestions.add(inSchool);
		bioQuestions.add(sis);
		bioQuestions.add(couple);
		bioQuestions.add(bro);
		bioQuestions.add(group);
		
		
		oppQuestions.add(Q14);
		oppQuestions.add(text14);
		oppQuestions.add(Q15);
		oppQuestions.add(Q155);
		oppQuestions.add(text15);
		text15.setLineWrap(true);
		oppQuestions.add(Q16);
		oppQuestions.add(text16);
		text16.setLineWrap(true);
		oppQuestions.add(Q17);
		oppQuestions.add(Q173);
		oppQuestions.add(Q178);
		oppQuestions.add(text17);
		text17.setLineWrap(true);
		oppQuestions.add(Q18);
		oppQuestions.add(text18);
		text18.setLineWrap(true);
		
		crimeQuestions.add(Q19);
		crimeQuestions.add(text19);
		text19.setLineWrap(true);
		crimeQuestions.add(Q20);
		crimeQuestions.add(text20);
		crimeQuestions.add(Q21);
		crimeQuestions.add(crimeY);
		crimeQuestions.add(crimeN);
		crimeQuestions.add(Q22);
		crimeQuestions.add(Q225);
		crimeQuestions.add(offY);
		crimeQuestions.add(offN);
		
		Refference1.add(Q235);
		Refference1.add(Q236);
		Refference1.add(Q237);
		Refference1.add(Q23);
		Refference1.add(text23);
		Refference1.add(Q24);
		Refference1.add(text24);
		Refference1.add(Q25);
		Refference1.add(text25);
		Refference1.add(Q26);
		Refference1.add(text26);
		Refference1.add(Q27);
		Refference1.add(text27);
		Refference1.add(Q28);
		Refference1.add(text28);
		Refference1.add(Q29);
		Refference1.add(text29);
		Refference1.add(Q30);
		Refference1.add(text30);
		Refference1.add(Q31);
		Refference1.add(text31);
		Refference1.add(Q32);
		Refference1.add(text32);
		
		Refference2.add(Q335);
		Refference2.add(Q336);
		Refference2.add(Q33);
		Refference2.add(text33);
		Refference2.add(Q34);
		Refference2.add(text34);
		Refference2.add(Q35);
		Refference2.add(text35);
		Refference2.add(Q36);
		Refference2.add(text36);
		Refference2.add(Q37);
		Refference2.add(text37);
		Refference2.add(Q38);
		Refference2.add(text38);
		Refference2.add(Q39);
		Refference2.add(text39);
		Refference2.add(Q40);
		Refference2.add(text40);
		Refference2.add(Q41);
		Refference2.add(text41);
		Refference2.add(Q42);
		Refference2.add(text42);
		
		Refference3.add(Q435);
		Refference3.add(Q436);
		Refference3.add(Q43);
		Refference3.add(text43);
		Refference3.add(Q44);
		Refference3.add(text44);
		Refference3.add(Q45);
		Refference3.add(text45);
		Refference3.add(Q46);
		Refference3.add(text46);
		Refference3.add(Q47);
		Refference3.add(text47);
		Refference3.add(Q48);
		Refference3.add(text48);
		Refference3.add(Q49);
		Refference3.add(text49);
		Refference3.add(Q50);
		Refference3.add(text50);
		Refference3.add(Q51);
		Refference3.add(text51);
		Refference3.add(Q53);
		Refference3.add(text53);
		Refference3.add(Q52);
		Refference3.add(text52);
		
		
		
		mainPanel.add(bioQuestions);
		mainPanel.add(oppQuestions);
		mainPanel.add(crimeQuestions);
		mainPanel.add(Refference1);
		mainPanel.add(Refference2);
		mainPanel.add(Refference3);
		
		mainWindow.pack();

		
		
		next.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				updateAll();
				
				System.out.println("Nexting...");
				cards.next(mainPanel);

			}
				
		 });
		 
		 previous.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				updateAll();
				
				System.out.println("LASTING>..<");
				cards.previous(mainPanel);

				
				
			}
		 });
		 
		 preview.addActionListener(new ActionListener()
		 {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				updateAll();
				System.out.println("PREVIEWING");	
				
				String key = new String("0OAD-KLWH-JAKO-LLIA-DBDE-1ELH-WBKQ-GS91-23ED-8-D3FA");
		        String site = new String("Free Trial License");
		        String officePath = new String("C:/Program Files (x86)/LibreOffice 5");
		        
		        if (key.startsWith("XXXX")) {
		            System.err.println("\nPlease set your license key");
		            System.exit(1);
		        }
		        if (!new File(officePath).isDirectory() || !new File(officePath).canRead()) {
		            System.err.println("\nPlease check \"officePath\" is set to the " +
		                               "install dir for OpenOffice or LibreOffice"); 
		            System.exit(1);
		        }

		        // Create the initialisation configuration
		        Configuration config = new Configuration(key, site, officePath);

		        // Tell Docmosis to use one embedded converter
		        config.setConverterPoolConfiguration("-1");
		        
		        // Use the DataProviderBuilder to build the data provider from a String array.
		        DataProviderBuilder dpb = new DataProviderBuilder();
				
		        dpb.add("Name", answers[0]);
		        dpb.add("HomePhone", answers[1]);
		        dpb.add("CellPhone", answers[2]);
		        dpb.add("WorkPhone", answers[53]);
		        dpb.add("Birthday", answers[8]);
		        dpb.add("Address", answers[3]);
		        dpb.add("PostalCode", answers[4]);
		        dpb.add("AddressTime", answers[5]);
		        dpb.add("AreaTime", answers[6]);
		        dpb.add("AltAddress", answers[7]);
		        dpb.add("Email", answers[9]);
		        dpb.add("EmailYN", answers[10]);
		        
		        if(answers[11].equals("I"))
		        {
			        dpb.add("InSchool", "X");
		        }
		        if(answers[11].equals("G"))
		        {
			        dpb.add("Group", "X");
		        }
		        if(answers[11].equals("B"))
		        {
			        dpb.add("BigBrother", "X");
		        }
		        if(answers[11].equals("S"))
		        {
			        dpb.add("BigSister", "X");
		        }
		        if(answers[11].equals("C"))
		        {
			        dpb.add("BigCouple", "X");
		        }

		        dpb.add("Gender", answers[12]);
		        dpb.add("Before", answers[13]);
		        dpb.add("Changes", answers[14]);
		        dpb.add("Why", answers[15]);
		        dpb.add("Experience", answers[16]);
		        dpb.add("Clubs", answers[17]);
		        dpb.add("Interests", answers[18]);
		        dpb.add("Other", answers[19]);
		        
		        
		        if(answers[20].equals("Y"))
		        {
			        dpb.add("CrimeY", "X");
		        }
		        if(answers[20].equals("N"))
		        {
			        dpb.add("CrimeN", "X");
		        }
		        if(answers[21].equals("Y"))
		        {
			        dpb.add("offY", "X");
		        }
		        if(answers[21].equals("N"))
		        {
			        dpb.add("offN", "X");
		        }
		        
		        dpb.add("R1Name", answers[22]);
		        dpb.add("R1Email", answers[23]);
		        dpb.add("R1Fax", answers[24]);
		        dpb.add("R1Phone", answers[25]);
		        dpb.add("R1Work", answers[26]);
		        dpb.add("R1PostalCode", answers[27]);
		        dpb.add("R1City", answers[28]);
		        dpb.add("R1Job", answers[29]);
		        dpb.add("R1Known", answers[30]);
		        dpb.add("R1Address", answers[31]);
		        
		        dpb.add("R2Name", answers[32]);
		        dpb.add("R2Email", answers[33]);
		        dpb.add("R2Fax", answers[34]);
		        dpb.add("R2Phone", answers[35]);
		        dpb.add("R2Work", answers[36]);
		        dpb.add("R2PostalCode", answers[37]);
		        dpb.add("R2City", answers[38]);
		        dpb.add("R2Rel", answers[39]);
		        dpb.add("R2Known", answers[40]);
		        dpb.add("R2Address", answers[41]);
		        
		        dpb.add("R3Name", answers[42]);
		        dpb.add("R3Email", answers[43]);
		        dpb.add("R3Fax", answers[44]);
		        dpb.add("R3Phone", answers[45]);
		        dpb.add("R3Work", answers[46]);
		        dpb.add("R3PostalCode", answers[47]);
		        dpb.add("R3City", answers[48]);
		        dpb.add("R3Rel", answers[49]);
		        dpb.add("R3Known", answers[50]);
		        dpb.add("R3Address", answers[51]);
		        dpb.add("R3Capacity", answers[52]);
		  	
		    	try {

		            // Initialise the system based on configuration
		    	    SystemManager.initialise(config);
						
		            File templateFile = new File("Volunteer Application Package.docx");
		            File outputFile = new File("Volunteer Application Package.pdf");
					
		            if (!templateFile.canRead()) {
		                System.err.println("\nCannot find '" + templateFile + "' in: " + new File("").getCanonicalPath());
		                text17.setText("Cannot find '" + templateFile + "' in: " + new File("").getCanonicalPath());
		            } else {

		                // Create the document
		                DocumentProcessor.renderDoc(templateFile, outputFile, dpb.getDataProvider());

		                System.out.println("\nCreated: " + outputFile.getCanonicalPath());
		                text17.setText(text17.getText() + "Created: " + outputFile.getCanonicalPath());
		            }
		            
		            
		    	} catch (Exception e){
		            System.err.println("\nPlease check the following: " + e.getMessage());
		            text17.setText(text17.getText() + " -\nPlease check the following: " + e.getMessage());
		            
		        } finally {
		            // shutdown the system
		            SystemManager.release();
		        }
		    	
				
		    	
		    	  try{
		    		  text16.setText(Paths.get("").toAbsolutePath().toString().replace("\\", "/") + "/Volunteer Application Package.pdf");
		    	        if ((new File(Paths.get("").toAbsolutePath().toString().replace("\\", "/") + "/Volunteer Application Package.pdf").exists())) {

		    				
		    	        	String currentRelativePath = "rundll32 url.dll,FileProtocolHandler " + Paths.get("").toAbsolutePath().toString().replace("\\", "/") + "/Volunteer Application Package.pdf";
		    	        	
		    	            Process p = Runtime.getRuntime().exec(currentRelativePath);
		    	            p.waitFor();
		    	            
		    	            
		  		          Path FROM = Paths.get(Paths.get("").toAbsolutePath().toString().replace("\\", "/") + "/Volunteer Application Package.pdf");
				          Path TO = Paths.get(Paths.get("").toAbsolutePath().toString().replace("\\", "/") + "/" + answers[0] + "'s Volunteer Application Package.pdf");
				          CopyOption[] options = new CopyOption[]{
				            StandardCopyOption.REPLACE_EXISTING,
				            StandardCopyOption.COPY_ATTRIBUTES
				          }; 
				          Files.copy(FROM, TO, options);

		    	        } else {

		    	            System.out.println("File does not exist");
		    	        }

		    	      } catch (Exception ex) {
		    	        ex.printStackTrace();
		    	      }

			}
		 });
	}
	static void updateAll()
	{
		updateAnswers(text1,1);
		updateAnswers(text2,2);
		updateAnswers(text3,3);
		updateAnswers(text4,4);
		updateAnswers(text5,5);
		updateAnswers(text6,6);
		updateAnswers(text7,7);
		updateAnswers(text8,8);
		updateAnswers(text9,9);
		updateAnswers(text10,10);
		updateAnswers(text11,11);
		if(inSchool.isSelected())
		{
			answers[11] = "I";
		}
		if(group.isSelected())
		{
			answers[11] = "G";
		}
		if(bro.isSelected())
		{
			answers[11] = "B";
		}
		if(sis.isSelected())
		{
			answers[11] = "S";
		}
		if(couple.isSelected())
		{
			answers[11] = "C";
		}
		
		updateAnswers(text13,13);
		updateAnswers(text14,14);
		updateAnswersField(text15,15);
		updateAnswersField(text16,16);
		updateAnswersField(text17,17);
		updateAnswersField(text18,18);
		updateAnswersField(text19,19);
		updateAnswers(text20,20);
		
		if(crimeY.isSelected())
		{
			answers[20] = "Y";
		}
		if(crimeN.isSelected())
		{
			answers[20] = "N";
		}
		
		if(offY.isSelected())
		{
			answers[21] = "Y";
		}
		if(offN.isSelected())
		{
			answers[21] = "N";
		}
		
		updateAnswers(text23,23);
		updateAnswers(text24,24);
		updateAnswers(text25,25);
		updateAnswers(text26,26);
		updateAnswers(text27,27);
		updateAnswers(text28,28);
		updateAnswers(text29,29);
		updateAnswers(text30,30);
		updateAnswers(text31,31);
		updateAnswers(text32,32);
		
		updateAnswers(text33,33);
		updateAnswers(text34,34);
		updateAnswers(text35,35);
		updateAnswers(text36,36);
		updateAnswers(text37,37);
		updateAnswers(text38,38);
		updateAnswers(text39,39);
		updateAnswers(text40,40);
		updateAnswers(text41,41);
		updateAnswers(text42,42);
		
		updateAnswers(text43,43);
		updateAnswers(text44,44);
		updateAnswers(text45,45);
		updateAnswers(text46,46);
		updateAnswers(text47,47);
		updateAnswers(text48,48);
		updateAnswers(text49,49);
		updateAnswers(text50,50);
		updateAnswers(text51,51);
		updateAnswers(text52,52);
		updateAnswers(text53,53);
		updateAnswers(text3W, 54);
		
		
		
		System.out.println(Arrays.toString(answers));
	}
	
	 static void updateAnswers(JTextField textBox, int questionNum)
	{
		if(textBox.getText() != answers[questionNum-1])
		{
			answers[questionNum-1] = textBox.getText(); 
		}
	}
	
	 static void updateAnswersField(JTextArea textBox, int questionNum)
	{
		if(textBox.getText() != answers[questionNum-1])
		{
			answers[questionNum-1] = textBox.getText(); 
		}
	}
}
