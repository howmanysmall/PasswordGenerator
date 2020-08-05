// been a hot minute since I did Java
// here's my rusty code

package com.hms;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author howmanysmall
 */
public class PasswordGenerator extends JPanel {
	public PasswordGenerator() {
		initComponents();
	}

	public static void main(String[] args) {
		new PasswordGenerator();
	}

	private boolean uppercaseEnabled = true;
	private boolean lowercaseEnabled = true;
	private boolean numbersEnabled = true;
	private boolean symbolsEnabled = true;

	private int length = 10;

	private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMERALS = "0123456789";
	private static final String SYMBOLS = "!@#$%^&*";
	private static final String ERROR_STRING = "You need to check some options.";

	private void generatePassword() {
		if (!(this.uppercaseEnabled && this.lowercaseEnabled && this.numbersEnabled && this.symbolsEnabled))
			this.password.setText(ERROR_STRING);
		else {
			// the reason for a new random object is for better results.
			Random random = new Random();
			StringBuilder characters = new StringBuilder();
			StringBuilder passwordBuilder = new StringBuilder(this.length);

			if (this.uppercaseEnabled)
				characters.append(UPPERCASE);

			if (this.lowercaseEnabled)
				characters.append(LOWERCASE);

			if (this.numbersEnabled)
				characters.append(NUMERALS);

			if (this.symbolsEnabled)
				characters.append(SYMBOLS);

			int charactersLength = characters.length();
			int i;

			for (i = this.length; i > 0; i++) {
				int index = (int)Math.floor(random.nextDouble() * charactersLength);
				passwordBuilder.append(characters.substring(index, index + 1));
			}

			this.password.setText(passwordBuilder.toString());
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - unknown
		main = new JFrame();
		panel = new JPanel();
		password = new JTextField();
		frameTitle = new JLabel();
		generate = new JButton();
		passwordLength = new JSlider();
		lengthLabel = new JLabel();
		optionsTitle = new JLabel();
		lowercase = new JCheckBox();
		uppercase = new JCheckBox();
		numbers = new JCheckBox();
		symbols = new JCheckBox();

		//======== main ========
		{
			main.setResizable(false);
			main.setTitle("Password Generator");
			main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			main.setIconImage(new ImageIcon("C:\\Users\\Studi\\OneDrive\\Pictures\\AsteriskFontAwesome.png").getImage());
			Container mainContentPane = main.getContentPane();

			//======== panel ========
			{
				panel.setMinimumSize(new Dimension(310, 290));
				panel.setMaximumSize(new Dimension(310, 290));
				panel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
				swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border
				. TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg"
				, java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,panel. getBorder
				() ) ); panel. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
				. beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException
				( ) ;} } );

				//---- password ----
				password.setText("Password123");
				password.setToolTipText("Your generated password.");
				password.setEditable(false);
				password.setFont(password.getFont().deriveFont(password.getFont().getSize() + 2f));
				password.setMaximumSize(new Dimension(304, 35));
				password.setDoubleBuffered(true);

				//---- frameTitle ----
				frameTitle.setText("Password Generator");
				frameTitle.setFont(frameTitle.getFont().deriveFont(frameTitle.getFont().getStyle() | Font.BOLD, frameTitle.getFont().getSize() + 6f));

				//---- generate ----
				generate.setText("Generate");

				//---- passwordLength ----
				passwordLength.setValue(10);
				passwordLength.setMaximum(50);
				passwordLength.setMinimum(10);
				passwordLength.setMajorTickSpacing(10);
				passwordLength.setSnapToTicks(true);
				passwordLength.setPaintTicks(true);
				passwordLength.setMinorTickSpacing(5);

				//---- lengthLabel ----
				lengthLabel.setText("10");
				lengthLabel.setLabelFor(passwordLength);
				lengthLabel.setFont(lengthLabel.getFont().deriveFont(lengthLabel.getFont().getSize() + 2f));
				lengthLabel.setHorizontalAlignment(SwingConstants.TRAILING);

				//---- optionsTitle ----
				optionsTitle.setText("Options");
				optionsTitle.setFont(optionsTitle.getFont().deriveFont(optionsTitle.getFont().getStyle() & ~Font.BOLD, optionsTitle.getFont().getSize() + 4f));

				//---- lowercase ----
				lowercase.setText("Lowercase");
				lowercase.setSelected(true);

				//---- uppercase ----
				uppercase.setText("Uppercase");
				uppercase.setSelected(true);

				//---- numbers ----
				numbers.setText("Numbers");
				numbers.setSelected(true);

				//---- symbols ----
				symbols.setText("Symbols");
				symbols.setSelected(true);

				GroupLayout panelLayout = new GroupLayout(panel);
				panel.setLayout(panelLayout);
				panelLayout.setHorizontalGroup(
					panelLayout.createParallelGroup()
						.addGroup(panelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(generate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(panelLayout.createSequentialGroup()
									.addComponent(lengthLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(passwordLength, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addContainerGap())
						.addGroup(panelLayout.createSequentialGroup()
							.addGap(14, 14, 14)
							.addComponent(optionsTitle, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(password, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
						.addGroup(panelLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panelLayout.createParallelGroup()
								.addComponent(uppercase, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
								.addComponent(lowercase, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
								.addComponent(numbers, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
								.addComponent(symbols, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
								.addComponent(frameTitle, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(197, Short.MAX_VALUE))
				);
				panelLayout.setVerticalGroup(
					panelLayout.createParallelGroup()
						.addGroup(panelLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(frameTitle, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(password, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(3, 3, 3)
							.addComponent(optionsTitle)
							.addGap(4, 4, 4)
							.addGroup(panelLayout.createParallelGroup()
								.addComponent(lengthLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(panelLayout.createSequentialGroup()
									.addGap(4, 4, 4)
									.addComponent(passwordLength, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(uppercase)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(lowercase)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(numbers)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(symbols)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(generate)
							.addContainerGap())
				);
			}

			GroupLayout mainContentPaneLayout = new GroupLayout(mainContentPane);
			mainContentPane.setLayout(mainContentPaneLayout);
			mainContentPaneLayout.setHorizontalGroup(
				mainContentPaneLayout.createParallelGroup()
					.addGroup(mainContentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, mainContentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap()))
					.addGap(0, 513, Short.MAX_VALUE)
			);
			mainContentPaneLayout.setVerticalGroup(
				mainContentPaneLayout.createParallelGroup()
					.addGroup(mainContentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, mainContentPaneLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(0, 303, Short.MAX_VALUE)
			);
			main.pack();
			main.setLocationRelativeTo(main.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - unknown
	private JFrame main;
	private JPanel panel;
	private JTextField password;
	private JLabel frameTitle;
	private JButton generate;
	private JSlider passwordLength;
	private JLabel lengthLabel;
	private JLabel optionsTitle;
	private JCheckBox lowercase;
	private JCheckBox uppercase;
	private JCheckBox numbers;
	private JCheckBox symbols;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
