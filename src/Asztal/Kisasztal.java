package Asztal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class Kisasztal extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField jatekosNeve;
	private List<JatekosJack> jatekosok = new ArrayList<JatekosJack>();
	private JTextField korSzama;
	private JLabel uzenet;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	
	public Kisasztal(String kiaz, List<JatekosJack> jatekosok) {
		
		
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("blackJack.jpg"));
		setBounds(100, 100, 340, 510);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 128, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{29, 29, 29, 80, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		label = new JLabel();
		label.setMinimumSize(new Dimension(98, 116));
		label.setPreferredSize(new Dimension(98, 116));
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(12, 12, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		contentPanel.add(label, gbc_label);
		
		label_1 = new JLabel();
		label_1.setMinimumSize(new Dimension(98, 116));
		label_1.setPreferredSize(new Dimension(98, 116));
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(13, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		contentPanel.add(label_1, gbc_label_1);
		
		label_2 = new JLabel();
		label_2.setMinimumSize(new Dimension(98, 116));
		label_2.setPreferredSize(new Dimension(98, 116));
		label_2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(13, 0, 5, 7);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 0;
		contentPanel.add(label_2, gbc_label_2);
		
		label_3 = new JLabel();
		label_3.setMinimumSize(new Dimension(98, 116));
		label_3.setPreferredSize(new Dimension(98, 116));
		label_3.setHorizontalTextPosition(SwingConstants.CENTER);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.insets = new Insets(0, 12, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		contentPanel.add(label_3, gbc_label_3);
		
		label_4 = new JLabel();
		label_4.setMinimumSize(new Dimension(98, 116));
		label_4.setPreferredSize(new Dimension(98, 116));
		label_4.setHorizontalTextPosition(SwingConstants.CENTER);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 1;
		contentPanel.add(label_4, gbc_label_4);
		
		label_5 = new JLabel();
		label_5.setMinimumSize(new Dimension(98, 116));
		label_5.setPreferredSize(new Dimension(98, 116));
		label_5.setHorizontalTextPosition(SwingConstants.CENTER);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.fill = GridBagConstraints.BOTH;
		gbc_label_5.insets = new Insets(0, 0, 5, 7);
		gbc_label_5.gridx = 2;
		gbc_label_5.gridy = 1;
		contentPanel.add(label_5, gbc_label_5);
		
		label_6 = new JLabel();
		label_6.setMinimumSize(new Dimension(98, 116));
		label_6.setPreferredSize(new Dimension(98, 116));
		label_6.setHorizontalTextPosition(SwingConstants.CENTER);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.BOTH;
		gbc_label_6.insets = new Insets(0, 12, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 2;
		contentPanel.add(label_6, gbc_label_6);
		
		label_7 = new JLabel();
		label_7.setMinimumSize(new Dimension(98, 116));
		label_7.setPreferredSize(new Dimension(98, 116));
		label_7.setHorizontalTextPosition(SwingConstants.CENTER);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.BOTH;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 2;
		contentPanel.add(label_7, gbc_label_7);
		
		label_8 = new JLabel();
		label_8.setMinimumSize(new Dimension(98, 116));
		label_8.setPreferredSize(new Dimension(98, 116));
		label_8.setHorizontalTextPosition(SwingConstants.CENTER);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.BOTH;
		gbc_label_8.insets = new Insets(0, 0, 5, 7);
		gbc_label_8.gridx = 2;
		gbc_label_8.gridy = 2;
		contentPanel.add(label_8, gbc_label_8);
		
		label.setIcon(new ImageIcon("blackJackH.jpg"));
		label_1.setIcon(new ImageIcon("blackJackH.jpg"));
		label_2.setIcon(new ImageIcon("blackJackH.jpg"));
		label_3.setIcon(new ImageIcon("blackJackH.jpg"));
		label_4.setIcon(new ImageIcon("blackJackH.jpg"));
		label_5.setIcon(new ImageIcon("blackJackH.jpg"));
		label_6.setIcon(new ImageIcon("blackJackH.jpg"));
		label_7.setIcon(new ImageIcon("blackJackH.jpg"));
		label_8.setIcon(new ImageIcon("blackJackH.jpg"));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 80));
		panel.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 12, 0, 7);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		contentPanel.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{24, 24, 24, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("J\u00E1t\u00E9kos neve: ");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setMaximumSize(new Dimension(46, 30));
		lblNewLabel.setMinimumSize(new Dimension(46, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 3, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		jatekosNeve = new JTextField();
		jatekosNeve.setHorizontalAlignment(SwingConstants.CENTER);
		jatekosNeve.setPreferredSize(new Dimension(240, 20));
		jatekosNeve.setFont(new Font("Sylfaen", Font.BOLD, 12));
		jatekosNeve.setForeground(new Color(0, 0, 51));
		jatekosNeve.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		jatekosNeve.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_jatekosNeve = new GridBagConstraints();
		gbc_jatekosNeve.insets = new Insets(0, 0, 5, 0);
		gbc_jatekosNeve.fill = GridBagConstraints.BOTH;
		gbc_jatekosNeve.gridx = 1;
		gbc_jatekosNeve.gridy = 0;
		panel.add(jatekosNeve, gbc_jatekosNeve);
		jatekosNeve.setColumns(20);
		
		JLabel lblHanyadikKr = new JLabel("Hanyadik k\u00F6r: ");
		lblHanyadikKr.setForeground(Color.BLACK);
		lblHanyadikKr.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		lblHanyadikKr.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHanyadikKr.setHorizontalAlignment(SwingConstants.CENTER);
		lblHanyadikKr.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblHanyadikKr = new GridBagConstraints();
		gbc_lblHanyadikKr.fill = GridBagConstraints.BOTH;
		gbc_lblHanyadikKr.insets = new Insets(0, 3, 5, 5);
		gbc_lblHanyadikKr.gridx = 0;
		gbc_lblHanyadikKr.gridy = 1;
		panel.add(lblHanyadikKr, gbc_lblHanyadikKr);
		
		korSzama = new JTextField();
		korSzama.setHorizontalAlignment(SwingConstants.CENTER);
		korSzama.setFont(new Font("Sylfaen", Font.BOLD, 12));
		korSzama.setForeground(new Color(0, 0, 51));
		korSzama.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		korSzama.setBackground(new Color(102, 205, 170));
		GridBagConstraints gbc_korSzama = new GridBagConstraints();
		gbc_korSzama.anchor = GridBagConstraints.WEST;
		gbc_korSzama.insets = new Insets(0, 0, 5, 0);
		gbc_korSzama.fill = GridBagConstraints.VERTICAL;
		gbc_korSzama.gridx = 1;
		gbc_korSzama.gridy = 1;
		panel.add(korSzama, gbc_korSzama);
		korSzama.setColumns(4);
		
		JButton megnez = new JButton("Megn\u00E9zem!");
		megnez.setForeground(Color.BLACK);
		megnez.setBackground(new Color(100, 149, 237));
		megnez.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		megnez.setMinimumSize(new Dimension(80, 23));
		megnez.setMaximumSize(new Dimension(80, 23));
		megnez.setHorizontalTextPosition(SwingConstants.CENTER);
		megnez.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_megnez = new GridBagConstraints();
		gbc_megnez.fill = GridBagConstraints.BOTH;
		gbc_megnez.insets = new Insets(0, 3, 0, 5);
		gbc_megnez.gridx = 0;
		gbc_megnez.gridy = 2;
		panel.add(megnez, gbc_megnez);
		
		uzenet = new JLabel("K\u00E1rty\u00E1k kilist\u00E1zva!");
		uzenet.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		uzenet.setHorizontalTextPosition(SwingConstants.CENTER);
		uzenet.setHorizontalAlignment(SwingConstants.CENTER);
		uzenet.setForeground(new Color(128, 0, 0));
		uzenet.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_uzenet = new GridBagConstraints();
		gbc_uzenet.fill = GridBagConstraints.BOTH;
		gbc_uzenet.gridx = 1;
		gbc_uzenet.gridy = 2;
		panel.add(uzenet, gbc_uzenet);
		
		megnez.addActionListener(this);
		this.jatekosok=jatekosok;
		
		for(int i=0; i<this.jatekosok.size();i++){
			
			if(kiaz.equals(jatekosok.get(i).getNev())){
				
				korSzama.setText(Integer.toString(this.jatekosok.get(i).Korszam()));
				
				switch(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).size()){
				
				case 9:	label_8.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(8).getKepe());
				case 8:	label_7.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(7).getKepe());
				case 7: label_6.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(6).getKepe());
				case 6: label_5.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(5).getKepe());
				case 5: label_4.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(4).getKepe());
				case 4: label_3.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(3).getKepe());
				case 3: label_2.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(2).getKepe());
				case 2: label_1.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(1).getKepe());
				case 1: label.setIcon(this.jatekosok.get(i).Megnez(this.jatekosok.get(i).Korszam()-1).get(0).getKepe());break;
				case 0: uzenet.setText("Ezt a kört passzoltad!");
				
				}
				break;
			}
			
		}
		
		jatekosNeve.setText(kiaz);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		label.setIcon(new ImageIcon("blackJackH.jpg"));
		label_1.setIcon(new ImageIcon("blackJackH.jpg"));
		label_2.setIcon(new ImageIcon("blackJackH.jpg"));
		label_3.setIcon(new ImageIcon("blackJackH.jpg"));
		label_4.setIcon(new ImageIcon("blackJackH.jpg"));
		label_5.setIcon(new ImageIcon("blackJackH.jpg"));
		label_6.setIcon(new ImageIcon("blackJackH.jpg"));
		label_7.setIcon(new ImageIcon("blackJackH.jpg"));
		label_8.setIcon(new ImageIcon("blackJackH.jpg"));
		
		if(korSzama.getText().equals("")){
			
			uzenet.setText("Nem adtál meg játékosszámot!!");
			return;
		}
		if(korSzama.getText().equals("0")){
			uzenet.setText("0. kör nincs!!");
			return;
		}
		
		int szam;
		try{
			
			szam=Integer.parseInt(korSzama.getText(),10);
			
		}
		catch(NumberFormatException ex){
			
			uzenet.setText("Egész ARAB számot adj meg!");
			return;
			
		}
		
		int hanyadikKor=szam;
		boolean nincs=true;
		for(int i=0; i<this.jatekosok.size();i++){
			
			if(jatekosNeve.getText().equals(jatekosok.get(i).getNev())){
				
				if(jatekosok.get(i).Korszam()<hanyadikKor){
					
					uzenet.setText("A(z) "+hanyadikKor+". körnél még nem jársz!");
					return;
					
				}
				
				switch(this.jatekosok.get(i).Megnez(hanyadikKor-1).size()){
				
				case 9:	label_8.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(8).getKepe());
				case 8:	label_7.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(7).getKepe());
				case 7: label_6.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(6).getKepe());
				case 6: label_5.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(5).getKepe());
				case 5: label_4.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(4).getKepe());
				case 4: label_3.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(3).getKepe());
				case 3: label_2.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(2).getKepe());
				case 2: label_1.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(1).getKepe());
				case 1: label.setIcon(this.jatekosok.get(i).Megnez(hanyadikKor-1).get(0).getKepe());break;
				case 0: {uzenet.setText("Ezt a kört passzoltad!"); return;}
				}
				nincs=false;
				break;
			}
			
		}
		
		if(nincs){
			
			uzenet.setText("Nincs ilyen nevû játékos!");
			return;
		}
		
		uzenet.setText("Kártyák kilistázva!");
	}

}
