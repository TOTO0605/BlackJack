package Asztal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.GridBagLayout;

import javax.swing.border.EtchedBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JTextField;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nevek extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel uzenet_1;
	private JLabel uzenet_2;
	public int jatekosSzam=7;
	public String[] nevek;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public Nevek(int jatekosSzam) {
		
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("blackJack.jpg"));
		setBounds(100, 100, 310, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 128, 0));
		contentPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{70, 100, 0};
		gbl_contentPanel.rowHeights = new int[]{30, 25, 25, 25, 25, 25, 25, 25, 25, 25, 23, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		JLabel lblNewLabel = new JLabel("Add meg a j\u00E1t\u00E9kosok nev\u00E9t!");
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(8, 7, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		{
			JLabel jatekos_1 = new JLabel("1. J\u00E1t\u00E9kos: ");
			jatekos_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
			jatekos_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			jatekos_1.setForeground(new Color(0, 0, 0));
			jatekos_1.setHorizontalTextPosition(SwingConstants.CENTER);
			jatekos_1.setHorizontalAlignment(SwingConstants.CENTER);
			jatekos_1.setBackground(new Color(0, 128, 0));
			GridBagConstraints gbc_jatekos_1 = new GridBagConstraints();
			gbc_jatekos_1.anchor = GridBagConstraints.EAST;
			gbc_jatekos_1.insets = new Insets(0, 6, 5, 5);
			gbc_jatekos_1.fill = GridBagConstraints.VERTICAL;
			gbc_jatekos_1.gridx = 0;
			gbc_jatekos_1.gridy = 1;
			contentPanel.add(jatekos_1, gbc_jatekos_1);
		}
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setToolTipText("Maximum 19 karakter lehet!!");
		textField_1.setEnabled(false);
		textField_1.setBackground(new Color(102, 205, 170));
		textField_1.setForeground(new Color(0, 0, 51));
		textField_1.setFont(new Font("Sylfaen", Font.BOLD, 12));
		textField_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(20);
		
		JLabel jatekos_2 = new JLabel("2. J\u00E1t\u00E9kos: ");
		jatekos_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		jatekos_2.setHorizontalTextPosition(SwingConstants.CENTER);
		jatekos_2.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos_2.setForeground(Color.BLACK);
		jatekos_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		jatekos_2.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_jatekos_2 = new GridBagConstraints();
		gbc_jatekos_2.anchor = GridBagConstraints.EAST;
		gbc_jatekos_2.insets = new Insets(0, 6, 5, 5);
		gbc_jatekos_2.gridx = 0;
		gbc_jatekos_2.gridy = 2;
		contentPanel.add(jatekos_2, gbc_jatekos_2);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setToolTipText("Maximum 19 karakter lehet!!");
		textField_2.setEnabled(false);
		textField_2.setForeground(new Color(0, 0, 51));
		textField_2.setFont(new Font("Sylfaen", Font.BOLD, 12));
		textField_2.setColumns(20);
		textField_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		textField_2.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		contentPanel.add(textField_2, gbc_textField_2);
		
		JLabel jatekos_3 = new JLabel("3. J\u00E1t\u00E9kos: ");
		jatekos_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		jatekos_3.setHorizontalTextPosition(SwingConstants.CENTER);
		jatekos_3.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos_3.setForeground(Color.BLACK);
		jatekos_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		jatekos_3.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_jatekos_3 = new GridBagConstraints();
		gbc_jatekos_3.anchor = GridBagConstraints.EAST;
		gbc_jatekos_3.insets = new Insets(0, 6, 5, 5);
		gbc_jatekos_3.gridx = 0;
		gbc_jatekos_3.gridy = 3;
		contentPanel.add(jatekos_3, gbc_jatekos_3);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setToolTipText("Maximum 19 karakter lehet!!");
		textField_3.setEnabled(false);
		textField_3.setForeground(new Color(0, 0, 51));
		textField_3.setFont(new Font("Sylfaen", Font.BOLD, 12));
		textField_3.setColumns(20);
		textField_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		textField_3.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.BOTH;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		contentPanel.add(textField_3, gbc_textField_3);
		
		JLabel jatekos_4 = new JLabel("4. J\u00E1t\u00E9kos: ");
		jatekos_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		jatekos_4.setHorizontalTextPosition(SwingConstants.CENTER);
		jatekos_4.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos_4.setForeground(Color.BLACK);
		jatekos_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		jatekos_4.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_jatekos_4 = new GridBagConstraints();
		gbc_jatekos_4.anchor = GridBagConstraints.EAST;
		gbc_jatekos_4.insets = new Insets(0, 6, 5, 5);
		gbc_jatekos_4.gridx = 0;
		gbc_jatekos_4.gridy = 4;
		contentPanel.add(jatekos_4, gbc_jatekos_4);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setToolTipText("Maximum 19 karakter lehet!!");
		textField_4.setEnabled(false);
		textField_4.setForeground(new Color(0, 0, 51));
		textField_4.setFont(new Font("Sylfaen", Font.BOLD, 12));
		textField_4.setColumns(20);
		textField_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		textField_4.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		contentPanel.add(textField_4, gbc_textField_4);
		
		JLabel jatekos_5 = new JLabel("5. J\u00E1t\u00E9kos: ");
		jatekos_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		jatekos_5.setHorizontalTextPosition(SwingConstants.CENTER);
		jatekos_5.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos_5.setForeground(Color.BLACK);
		jatekos_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		jatekos_5.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_jatekos_5 = new GridBagConstraints();
		gbc_jatekos_5.anchor = GridBagConstraints.EAST;
		gbc_jatekos_5.insets = new Insets(0, 6, 5, 5);
		gbc_jatekos_5.gridx = 0;
		gbc_jatekos_5.gridy = 5;
		contentPanel.add(jatekos_5, gbc_jatekos_5);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setToolTipText("Maximum 19 karakter lehet!!");
		textField_5.setEnabled(false);
		textField_5.setForeground(new Color(0, 0, 51));
		textField_5.setFont(new Font("Sylfaen", Font.BOLD, 12));
		textField_5.setColumns(20);
		textField_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		textField_5.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.BOTH;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		contentPanel.add(textField_5, gbc_textField_5);
		
		JLabel jatekos_6 = new JLabel("6. J\u00E1t\u00E9kos: ");
		jatekos_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		jatekos_6.setHorizontalTextPosition(SwingConstants.CENTER);
		jatekos_6.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos_6.setForeground(Color.BLACK);
		jatekos_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		jatekos_6.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_jatekos_6 = new GridBagConstraints();
		gbc_jatekos_6.anchor = GridBagConstraints.EAST;
		gbc_jatekos_6.insets = new Insets(0, 6, 5, 5);
		gbc_jatekos_6.gridx = 0;
		gbc_jatekos_6.gridy = 6;
		contentPanel.add(jatekos_6, gbc_jatekos_6);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setToolTipText("Maximum 19 karakter lehet!!");
		textField_6.setEnabled(false);
		textField_6.setForeground(new Color(0, 0, 51));
		textField_6.setFont(new Font("Sylfaen", Font.BOLD, 12));
		textField_6.setColumns(20);
		textField_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		textField_6.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.BOTH;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		contentPanel.add(textField_6, gbc_textField_6);
		
		JLabel jatekos_7 = new JLabel("7. J\u00E1t\u00E9kos: ");
		jatekos_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		jatekos_7.setHorizontalTextPosition(SwingConstants.CENTER);
		jatekos_7.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos_7.setForeground(Color.BLACK);
		jatekos_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		jatekos_7.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_jatekos_7 = new GridBagConstraints();
		gbc_jatekos_7.anchor = GridBagConstraints.EAST;
		gbc_jatekos_7.insets = new Insets(0, 6, 5, 5);
		gbc_jatekos_7.gridx = 0;
		gbc_jatekos_7.gridy = 7;
		contentPanel.add(jatekos_7, gbc_jatekos_7);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setToolTipText("Maximum 19 karakter lehet!!");
		textField_7.setEnabled(false);
		textField_7.setForeground(new Color(0, 0, 51));
		textField_7.setFont(new Font("Sylfaen", Font.BOLD, 12));
		textField_7.setColumns(20);
		textField_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		textField_7.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.BOTH;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 7;
		contentPanel.add(textField_7, gbc_textField_7);
		
		JButton kezdes = new JButton("Kezd\u00E9s");
		kezdes.setMaximumSize(new Dimension(80, 23));
		kezdes.setMinimumSize(new Dimension(80, 23));
		kezdes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		kezdes.setPreferredSize(new Dimension(80, 23));
		kezdes.setFont(new Font("Tahoma", Font.BOLD, 12));
		kezdes.setForeground(new Color(0, 0, 0));
		kezdes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		kezdes.setBackground(new Color(100, 149, 237));
		GridBagConstraints gbc_kezdes = new GridBagConstraints();
		gbc_kezdes.insets = new Insets(0, 0, 5, 0);
		gbc_kezdes.fill = GridBagConstraints.VERTICAL;
		gbc_kezdes.gridwidth = 2;
		gbc_kezdes.gridx = 0;
		gbc_kezdes.gridy = 8;
		contentPanel.add(kezdes, gbc_kezdes);
		
		uzenet_1 = new JLabel("");
		uzenet_1.setPreferredSize(new Dimension(135, 23));
		uzenet_1.setHorizontalTextPosition(SwingConstants.CENTER);
		uzenet_1.setHorizontalAlignment(SwingConstants.CENTER);
		uzenet_1.setForeground(Color.BLACK);
		uzenet_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		uzenet_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		GridBagConstraints gbc_uzenet_1 = new GridBagConstraints();
		gbc_uzenet_1.fill = GridBagConstraints.BOTH;
		gbc_uzenet_1.gridwidth = 2;
		gbc_uzenet_1.insets = new Insets(0, 8, 5, 0);
		gbc_uzenet_1.gridx = 0;
		gbc_uzenet_1.gridy = 9;
		contentPanel.add(uzenet_1, gbc_uzenet_1);
		
		uzenet_2 = new JLabel("");
		uzenet_2.setPreferredSize(new Dimension(135, 23));
		uzenet_2.setHorizontalTextPosition(SwingConstants.CENTER);
		uzenet_2.setHorizontalAlignment(SwingConstants.CENTER);
		uzenet_2.setForeground(Color.BLACK);
		uzenet_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		uzenet_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		GridBagConstraints gbc_uzenet_2 = new GridBagConstraints();
		gbc_uzenet_2.fill = GridBagConstraints.BOTH;
		gbc_uzenet_2.gridwidth = 2;
		gbc_uzenet_2.insets = new Insets(0, 8, 0, 0);
		gbc_uzenet_2.gridx = 0;
		gbc_uzenet_2.gridy = 10;
		contentPanel.add(uzenet_2, gbc_uzenet_2);
		
		switch(jatekosSzam){
		
			case 7: textField_7.setEnabled(true);
			case 6: textField_6.setEnabled(true);
			case 5: textField_5.setEnabled(true);
			case 4: textField_4.setEnabled(true);
			case 3: textField_3.setEnabled(true);
			case 2: textField_2.setEnabled(true);
			case 1: textField_1.setEnabled(true);
		
		}
		
		kezdes.addActionListener(this);
		this.jatekosSzam=jatekosSzam;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String hibas="Nem írtad be a(z) ";
		boolean ures_e=false;
		
		switch(jatekosSzam){
		
			case 7: if (textField_7.getText().equals("")){
				
				hibas+=" 7. ";
				ures_e=true;
				
			}
			case 6: if (textField_6.getText().equals("")){
				
				hibas+=" 6. ";
				ures_e=true;
			}
			case 5: if (textField_5.getText().equals("")){
				
				hibas+=" 5. ";
				ures_e=true;
				
			}
			case 4: if (textField_4.getText().equals("")){
				
				hibas+=" 4. ";
				ures_e=true;
				
			}
			case 3: if (textField_3.getText().equals("")){
				
				hibas+=" 3. ";
				ures_e=true;
				
			}
			case 2: if (textField_2.getText().equals("")){
				
				hibas+=" 2. ";
				ures_e=true;
				
			}
			case 1: if (textField_1.getText().equals("")){
				
				hibas+=" 1. ";
				ures_e=true;
				
			}
		
		}
		
		hibas+=" nevét!";
		
		boolean hosszu_e=false;
		String hosszu="A(z) ";
		
		switch(jatekosSzam){
		
			case 7: if (textField_7.getText().length()>19){
				
				hosszu+=" 7. ";
				hosszu_e=true;
				
			}
			case 6: if (textField_6.getText().length()>19){
				
				hosszu+=" 6. ";
				hosszu_e=true;
			}
			case 5: if (textField_5.getText().length()>19){
				
				hosszu+=" 5. ";
				hosszu_e=true;
				
			}
			case 4: if (textField_4.getText().length()>19){
				
				hosszu+=" 4. ";
				hosszu_e=true;
				
			}
			case 3: if (textField_3.getText().length()>19){
				
				hosszu+=" 3. ";
				hosszu_e=true;
				
			}
			case 2: if (textField_2.getText().length()>19){
				
				hosszu+=" 2. ";
				hosszu_e=true;
				
			}
			case 1: if (textField_1.getText().length()>19){
				
				hosszu+=" 1. ";
				hosszu_e=true;
				
			}
	
		}
		
			hosszu+=" jatekos neve hosszú!";
			
			if (ures_e){
				
				uzenet_1.setText(hibas);
				
				if (hosszu_e){
					
					uzenet_2.setText(hosszu);
					
				}
				
				return;
			}
			
			else if (hosszu_e){
				
				uzenet_2.setText("");
				uzenet_1.setText(hosszu);
				return;
			}
			
			
			nevek=new String[jatekosSzam];
			
		switch(jatekosSzam){
			
			case 7: nevek[6]=textField_7.getText();
			case 6: nevek[5]=textField_6.getText();
			case 5: nevek[4]=textField_5.getText();
			case 4: nevek[3]=textField_4.getText();
			case 3: nevek[2]=textField_3.getText();
			case 2: nevek[1]=textField_2.getText();
			case 1: nevek[0]=textField_1.getText();
	
		}
		
		for(int i=jatekosSzam-1; i>0;i--){
			boolean alj=false;
			switch(i+1){
			 
				case 7: if(nevek[i].equals(nevek[5])){
					
					uzenet_1.setText("A(z) "+(i+1)+". és a 6. játékos neve megegyezik!");
					uzenet_2.setText("Add meg újra a játékosok nevét!");
					alj=true;
					break;
					
				}
				case 6: if(nevek[i].equals(nevek[4])){
					
					uzenet_1.setText("A(z) "+(i+1)+". és a 5. játékos neve megegyezik!");
					uzenet_2.setText("Add meg újra a játékosok nevét!");
					alj=true;
					break;
					
				}
				case 5: if(nevek[i].equals(nevek[3])){
					
					uzenet_1.setText("A(z) "+(i+1)+". és a 4. játékos neve megegyezik!");
					uzenet_2.setText("Add meg újra a játékosok nevét!");
					alj=true;
					break;
					
				}
				case 4: if(nevek[i].equals(nevek[2])){
					
					uzenet_1.setText("A(z) "+(i+1)+". és a 3. játékos neve megegyezik!");
					uzenet_2.setText("Add meg újra a játékosok nevét!");
					alj=true;
					break;
					
				}
				case 3: if(nevek[i].equals(nevek[1])){
					
					uzenet_1.setText("A(z) "+(i+1)+". és a 2. játékos neve megegyezik!");
					uzenet_2.setText("Add meg újra a játékosok nevét!");
					alj=true;
					break;
					
				}
				case 2: if(nevek[i].equals(nevek[0])){
					
					uzenet_1.setText("A(z) "+(i+1)+". és a 1. játékos neve megegyezik!");
					uzenet_2.setText("Add meg újra a játékosok nevét!");
					alj=true;
					break;
					
				}
			
			}
			
			if(alj) {
				
				return;
				
			}
			
		}
		
		setVisible(false);
		dispose();
		
	}
	
	public String[] showDialog(){
		setVisible(true);
		return nevek;
	}

}
