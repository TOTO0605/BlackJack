/*
 * Egy olyan blackJack játék ahol büntetõpontok alapján,több körben derül ki ki lesz a gyõztes. Ha valaki eléri a 63 büntetõpontot,
 * akkor vége a játéknak és az nyer akinek a legkevesebb büntetõpontja van. A játékot maximum 7en játszhatják. 
 * Lehetõség van visszanézni a játékosok eddigi lapjait amikert az elõzõ körökben kaptak, úgy hogy a játékos nevére kattintunk.
 * */

package Asztal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Label;

import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

import java.awt.Rectangle;
import java.awt.Dimension;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;

import Kozos.Kartyajatek;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridLayout;
import java.awt.ComponentOrientation;
import java.awt.Cursor;

import javax.swing.border.TitledBorder;


public class BlackJack extends JFrame implements Kartyajatek,ActionListener{

	private JPanel contentPane;
	private JTextField jatekosSzam;
	private JButton kezdes;
	private JButton lapotKer;
	private JButton passzol;
	private JButton befejez;
	private JLabel elsoKartya;
	private JLabel masodikKartya;
	private JLabel harmadikKartya;
	private JLabel negyedikKartya;
	private JLabel otodikKartya;
	private JLabel hatodikKartya;
	private JLabel hetedikKartya;
	private JLabel nyolcadikKartya;
	private JLabel kilencedikKartya;
	private JLabel uzenet1;
	private List<FranciaKartya> pakli = new ArrayList<FranciaKartya>();
	private List<JatekosJack> jatekosok = new ArrayList<JatekosJack>();
	private JLabel uzenet2;
	private int aktualisJatekos=1;
	private int aktualisMezo=1;
	private int aktualisPont=0;
	private JButton kiurit;
	private boolean vege_e=false; // játék vége
	private boolean korVege=false;
	public int korokSzama=1;
	private JLabel hanyadikKor;
	private JPanel panel;
	private JPanel panel_1;
	private JButton elsoJ;
	private JButton masodikJ;
	private JButton harmadikJ;
	private JButton negyedikJ;
	private JButton otodikJ;
	private JButton hatodikJ;
	private JButton hetedikJ;
	private Label elsoJBpont;
	private Label masodikJBpont;
	private Label harmadikJBpont;
	private Label negyedikJBpont;
	private Label otodikJBpont;
	private Label hatodikJBpont;
	private Label hetedikJBpont;
	private Label elsoB;
	private Label elsoAk;
	private Label elsoAkpont;
	private Label masodikB;
	private Label masodikAk;
	private Label masodikAkpont;
	private Label harmadikB;
	private Label harmadikAk;
	private Label harmadikAkpont;
	private Label negyedikB;
	private Label negyedikAk;
	private Label negyedikAkpont;
	private Label otodikB;
	private Label otodikAk;
	private Label otodikAkpont;
	private Label hatodikB;
	private Label hatodikAk;
	private Label hatodikAkpont;
	private Label hetedikB;
	private Label hetedikAk;
	private Label hetedikAkpont;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack frame = new BlackJack();
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
	public BlackJack() {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("blackJack.jpg"));
		setTitle("Black Jack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 665);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 0, 0, 65};
		gbl_contentPane.rowHeights = new int[]{29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		GridBagConstraints gbc_elsoKartya = new GridBagConstraints();
		gbc_elsoKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_masodikKartya = new GridBagConstraints();
		gbc_masodikKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_harmadikKartya = new GridBagConstraints();
		gbc_harmadikKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_negyedikKartya = new GridBagConstraints();
		gbc_negyedikKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_otodikKartya = new GridBagConstraints();
		gbc_otodikKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_hatodikKartya = new GridBagConstraints();
		gbc_hatodikKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_hetedikKartya = new GridBagConstraints();
		gbc_hetedikKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_nyolcadikKartya = new GridBagConstraints();
		gbc_nyolcadikKartya.fill = GridBagConstraints.BOTH;
		GridBagConstraints gbc_kilencedikKartya = new GridBagConstraints();
		gbc_kilencedikKartya.fill = GridBagConstraints.BOTH;
		
		elsoKartya = new JLabel();
		elsoKartya.setPreferredSize(new Dimension(98, 116));
		elsoKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		elsoKartya.setHorizontalAlignment(SwingConstants.CENTER);
		elsoKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_elsoKartya.gridheight = 4;
		gbc_elsoKartya.insets = new Insets(0, 0, 5, 5);
		gbc_elsoKartya.gridx = 0;
		gbc_elsoKartya.gridy = 0;
		gbc_elsoKartya.insets = new Insets(15, 15, 5, 10);
		contentPane.add(elsoKartya, gbc_elsoKartya);
		
		masodikKartya = new JLabel();
		masodikKartya.setPreferredSize(new Dimension(98, 116));
		masodikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		masodikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		masodikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_masodikKartya.gridheight = 4;
		gbc_masodikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_masodikKartya.gridx = 1;
		gbc_masodikKartya.gridy = 0;
		gbc_masodikKartya.insets = new Insets(15, 15, 5, 10);
		contentPane.add(masodikKartya, gbc_masodikKartya);
		
		harmadikKartya = new JLabel();
		harmadikKartya.setPreferredSize(new Dimension(98, 116));
		harmadikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		harmadikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		harmadikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_harmadikKartya.gridheight = 4;
		gbc_harmadikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_harmadikKartya.gridx = 2;
		gbc_harmadikKartya.gridy = 0;
		gbc_harmadikKartya.insets = new Insets(15, 15, 5, 10);
		contentPane.add(harmadikKartya, gbc_harmadikKartya);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		panel_1.setBackground(new Color(34, 139, 34));
		panel_1.setPreferredSize(new Dimension(240, 348));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.ipady = 5;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(15, 5, 6, 0);
		gbc_panel_1.gridheight = 20;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{16, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		elsoJ = new JButton("");
		elsoJ.setEnabled(false);
		elsoJ.setMaximumSize(new Dimension(33, 20));
		elsoJ.setMinimumSize(new Dimension(33, 20));
		elsoJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		elsoJ.setPreferredSize(new Dimension(118, 20));
		elsoJ.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 139)));
		elsoJ.setHorizontalTextPosition(SwingConstants.CENTER);
		elsoJ.setHorizontalAlignment(SwingConstants.CENTER);
		elsoJ.setForeground(new Color(0, 0, 0));
		elsoJ.setFont(new Font("Arial", Font.BOLD, 12));
		elsoJ.setBackground(new Color(34, 139, 34));
		
		GridBagConstraints gbc_elsoJ = new GridBagConstraints();
		gbc_elsoJ.gridwidth = 2;
		gbc_elsoJ.fill = GridBagConstraints.BOTH;
		gbc_elsoJ.gridx = 0;
		gbc_elsoJ.gridy = 0;
		panel_1.add(elsoJ, gbc_elsoJ);
		
		masodikJ = new JButton("");
		masodikJ.setEnabled(false);
		masodikJ.setMinimumSize(new Dimension(33, 20));
		masodikJ.setMaximumSize(new Dimension(33, 20));
		masodikJ.setBackground(new Color(34, 139, 34));
		masodikJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		masodikJ.setPreferredSize(new Dimension(118, 20));
		masodikJ.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 139)));
		masodikJ.setHorizontalTextPosition(SwingConstants.CENTER);
		masodikJ.setHorizontalAlignment(SwingConstants.CENTER);
		masodikJ.setForeground(new Color(0, 0, 0));
		masodikJ.setFont(new Font("Arial", Font.BOLD, 12));
		
		elsoB = new Label("");
		elsoB.setForeground(new Color(0, 0, 0));
		elsoB.setAlignment(Label.CENTER);
		elsoB.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_elsoB = new GridBagConstraints();
		gbc_elsoB.anchor = GridBagConstraints.WEST;
		gbc_elsoB.fill = GridBagConstraints.VERTICAL;
		gbc_elsoB.insets = new Insets(0, 5, 2, 5);
		gbc_elsoB.gridx = 0;
		gbc_elsoB.gridy = 1;
		panel_1.add(elsoB, gbc_elsoB);
		
		elsoJBpont = new Label("");
		elsoJBpont.setPreferredSize(new Dimension(30, 20));
		elsoJBpont.setForeground(new Color(128, 0, 0));
		elsoJBpont.setFont(new Font("Arial Black", Font.BOLD, 12));
		elsoJBpont.setAlignment(Label.CENTER);
		GridBagConstraints gbc_elsoJBpont = new GridBagConstraints();
		gbc_elsoJBpont.fill = GridBagConstraints.BOTH;
		gbc_elsoJBpont.insets = new Insets(0, 0, 2, 8);
		gbc_elsoJBpont.gridx = 1;
		gbc_elsoJBpont.gridy = 1;
		panel_1.add(elsoJBpont, gbc_elsoJBpont);
		
		elsoAk = new Label("");
		elsoAk.setAlignment(Label.CENTER);
		elsoAk.setForeground(new Color(0, 0, 0));
		elsoAk.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_elsoAk = new GridBagConstraints();
		gbc_elsoAk.anchor = GridBagConstraints.WEST;
		gbc_elsoAk.fill = GridBagConstraints.VERTICAL;
		gbc_elsoAk.insets = new Insets(0, 5, 2, 5);
		gbc_elsoAk.gridx = 0;
		gbc_elsoAk.gridy = 2;
		panel_1.add(elsoAk, gbc_elsoAk);
		
		
		elsoAkpont = new Label("");
		elsoAkpont.setAlignment(Label.CENTER);
		elsoAkpont.setForeground(new Color(127, 255, 0));
		elsoAkpont.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_elsoAkpont = new GridBagConstraints();
		gbc_elsoAkpont.fill = GridBagConstraints.BOTH;
		gbc_elsoAkpont.insets = new Insets(0, 0, 2, 8);
		gbc_elsoAkpont.gridx = 1;
		gbc_elsoAkpont.gridy = 2;
		panel_1.add(elsoAkpont, gbc_elsoAkpont);
		GridBagConstraints gbc_masodikJ = new GridBagConstraints();
		gbc_masodikJ.gridwidth = 2;
		gbc_masodikJ.insets = new Insets(0, 0, 5, 0);
		gbc_masodikJ.fill = GridBagConstraints.BOTH;
		gbc_masodikJ.gridx = 0;
		gbc_masodikJ.gridy = 3;
		panel_1.add(masodikJ, gbc_masodikJ);
		
		masodikB = new Label("");
		masodikB.setForeground(new Color(0, 0, 0));
		masodikB.setAlignment(Label.CENTER);
		masodikB.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_masodikB = new GridBagConstraints();
		gbc_masodikB.anchor = GridBagConstraints.WEST;
		gbc_masodikB.fill = GridBagConstraints.VERTICAL;
		gbc_masodikB.insets = new Insets(0, 5, 5, 5);
		gbc_masodikB.gridx = 0;
		gbc_masodikB.gridy = 4;
		panel_1.add(masodikB, gbc_masodikB);
		
		masodikJBpont = new Label("");
		masodikJBpont.setPreferredSize(new Dimension(30, 20));
		masodikJBpont.setForeground(new Color(128, 0, 0));
		masodikJBpont.setFont(new Font("Arial Black", Font.BOLD, 12));
		masodikJBpont.setAlignment(Label.CENTER);
		GridBagConstraints gbc_masodikJBpont = new GridBagConstraints();
		gbc_masodikJBpont.fill = GridBagConstraints.BOTH;
		gbc_masodikJBpont.insets = new Insets(0, 0, 5, 8);
		gbc_masodikJBpont.gridx = 1;
		gbc_masodikJBpont.gridy = 4;
		panel_1.add(masodikJBpont, gbc_masodikJBpont);
		
		masodikAk = new Label("");
		masodikAk.setAlignment(Label.CENTER);
		masodikAk.setForeground(new Color(0, 0, 0));
		masodikAk.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_masodikAk = new GridBagConstraints();
		gbc_masodikAk.anchor = GridBagConstraints.WEST;
		gbc_masodikAk.fill = GridBagConstraints.VERTICAL;
		gbc_masodikAk.insets = new Insets(0, 5, 5, 5);
		gbc_masodikAk.gridx = 0;
		gbc_masodikAk.gridy = 5;
		panel_1.add(masodikAk, gbc_masodikAk);
		
		masodikAkpont = new Label("");
		masodikAkpont.setAlignment(Label.CENTER);
		masodikAkpont.setForeground(new Color(127, 255, 0));
		masodikAkpont.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_masodikAkpont = new GridBagConstraints();
		gbc_masodikAkpont.fill = GridBagConstraints.BOTH;
		gbc_masodikAkpont.insets = new Insets(0, 0, 5, 8);
		gbc_masodikAkpont.gridx = 1;
		gbc_masodikAkpont.gridy = 5;
		panel_1.add(masodikAkpont, gbc_masodikAkpont);
		
		harmadikJ = new JButton("");
		harmadikJ.setEnabled(false);
		harmadikJ.setMaximumSize(new Dimension(33, 20));
		harmadikJ.setMinimumSize(new Dimension(33, 20));
		harmadikJ.setBackground(new Color(34, 139, 34));
		harmadikJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		harmadikJ.setPreferredSize(new Dimension(118, 20));
		harmadikJ.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 139)));
		harmadikJ.setHorizontalTextPosition(SwingConstants.CENTER);
		harmadikJ.setHorizontalAlignment(SwingConstants.CENTER);
		harmadikJ.setForeground(new Color(0, 0, 0));
		harmadikJ.setFont(new Font("Arial", Font.BOLD, 12));
		
		GridBagConstraints gbc_harmadikJ = new GridBagConstraints();
		gbc_harmadikJ.gridwidth = 2;
		gbc_harmadikJ.insets = new Insets(0, 0, 5, 0);
		gbc_harmadikJ.fill = GridBagConstraints.BOTH;
		gbc_harmadikJ.gridx = 0;
		gbc_harmadikJ.gridy = 6;
		panel_1.add(harmadikJ, gbc_harmadikJ);
		
		harmadikB = new Label("");
		harmadikB.setForeground(new Color(0, 0, 0));
		harmadikB.setAlignment(Label.CENTER);
		harmadikB.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_harmadikB = new GridBagConstraints();
		gbc_harmadikB.anchor = GridBagConstraints.WEST;
		gbc_harmadikB.fill = GridBagConstraints.VERTICAL;
		gbc_harmadikB.insets = new Insets(0, 5, 5, 5);
		gbc_harmadikB.gridx = 0;
		gbc_harmadikB.gridy = 7;
		panel_1.add(harmadikB, gbc_harmadikB);
		
		harmadikJBpont = new Label("");
		harmadikJBpont.setPreferredSize(new Dimension(30, 20));
		harmadikJBpont.setForeground(new Color(128, 0, 0));
		harmadikJBpont.setFont(new Font("Arial Black", Font.BOLD, 12));
		harmadikJBpont.setAlignment(Label.CENTER);
		GridBagConstraints gbc_harmadikJBpont = new GridBagConstraints();
		gbc_harmadikJBpont.fill = GridBagConstraints.BOTH;
		gbc_harmadikJBpont.insets = new Insets(0, 0, 5, 8);
		gbc_harmadikJBpont.gridx = 1;
		gbc_harmadikJBpont.gridy = 7;
		panel_1.add(harmadikJBpont, gbc_harmadikJBpont);
		
		harmadikAk = new Label("");
		harmadikAk.setAlignment(Label.CENTER);
		harmadikAk.setForeground(new Color(0, 0, 0));
		harmadikAk.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_harmadikAk = new GridBagConstraints();
		gbc_harmadikAk.anchor = GridBagConstraints.WEST;
		gbc_harmadikAk.fill = GridBagConstraints.VERTICAL;
		gbc_harmadikAk.insets = new Insets(0, 5, 5, 5);
		gbc_harmadikAk.gridx = 0;
		gbc_harmadikAk.gridy = 8;
		panel_1.add(harmadikAk, gbc_harmadikAk);
		
		harmadikAkpont = new Label("");
		harmadikAkpont.setAlignment(Label.CENTER);
		harmadikAkpont.setForeground(new Color(127, 255, 0));
		harmadikAkpont.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_harmadikAkpont = new GridBagConstraints();
		gbc_harmadikAkpont.fill = GridBagConstraints.BOTH;
		gbc_harmadikAkpont.insets = new Insets(0, 0, 5, 8);
		gbc_harmadikAkpont.gridx = 1;
		gbc_harmadikAkpont.gridy = 8;
		panel_1.add(harmadikAkpont, gbc_harmadikAkpont);
		
		negyedikJ = new JButton("");
		negyedikJ.setEnabled(false);
		negyedikJ.setMinimumSize(new Dimension(33, 20));
		negyedikJ.setMaximumSize(new Dimension(33, 20));
		negyedikJ.setBackground(new Color(34, 139, 34));
		negyedikJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		negyedikJ.setPreferredSize(new Dimension(118, 20));
		negyedikJ.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 139)));
		negyedikJ.setHorizontalTextPosition(SwingConstants.CENTER);
		negyedikJ.setHorizontalAlignment(SwingConstants.CENTER);
		negyedikJ.setForeground(new Color(0, 0, 0));
		negyedikJ.setFont(new Font("Arial", Font.BOLD, 12));
		
		GridBagConstraints gbc_negyedikJ = new GridBagConstraints();
		gbc_negyedikJ.gridwidth = 2;
		gbc_negyedikJ.insets = new Insets(0, 0, 5, 0);
		gbc_negyedikJ.fill = GridBagConstraints.BOTH;
		gbc_negyedikJ.gridx = 0;
		gbc_negyedikJ.gridy = 9;
		panel_1.add(negyedikJ, gbc_negyedikJ);
		
		negyedikB = new Label("");
		negyedikB.setForeground(new Color(0, 0, 0));
		negyedikB.setAlignment(Label.CENTER);
		negyedikB.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_negyedikB = new GridBagConstraints();
		gbc_negyedikB.anchor = GridBagConstraints.WEST;
		gbc_negyedikB.fill = GridBagConstraints.VERTICAL;
		gbc_negyedikB.insets = new Insets(0, 5, 5, 5);
		gbc_negyedikB.gridx = 0;
		gbc_negyedikB.gridy = 10;
		panel_1.add(negyedikB, gbc_negyedikB);
		
		negyedikJBpont = new Label("");
		negyedikJBpont.setPreferredSize(new Dimension(30, 20));
		negyedikJBpont.setForeground(new Color(128, 0, 0));
		negyedikJBpont.setFont(new Font("Arial Black", Font.BOLD, 12));
		negyedikJBpont.setAlignment(Label.CENTER);
		GridBagConstraints gbc_negyedikJBpont = new GridBagConstraints();
		gbc_negyedikJBpont.fill = GridBagConstraints.BOTH;
		gbc_negyedikJBpont.insets = new Insets(0, 0, 5, 8);
		gbc_negyedikJBpont.gridx = 1;
		gbc_negyedikJBpont.gridy = 10;
		panel_1.add(negyedikJBpont, gbc_negyedikJBpont);
		
		negyedikAk = new Label("");
		negyedikAk.setAlignment(Label.CENTER);
		negyedikAk.setForeground(new Color(0, 0, 0));
		negyedikAk.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_negyedikAk = new GridBagConstraints();
		gbc_negyedikAk.anchor = GridBagConstraints.WEST;
		gbc_negyedikAk.fill = GridBagConstraints.VERTICAL;
		gbc_negyedikAk.insets = new Insets(0, 5, 5, 5);
		gbc_negyedikAk.gridx = 0;
		gbc_negyedikAk.gridy = 11;
		panel_1.add(negyedikAk, gbc_negyedikAk);
		
		negyedikAkpont = new Label("");
		negyedikAkpont.setAlignment(Label.CENTER);
		negyedikAkpont.setForeground(new Color(127, 255, 0));
		negyedikAkpont.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_negyedikAkpont = new GridBagConstraints();
		gbc_negyedikAkpont.fill = GridBagConstraints.BOTH;
		gbc_negyedikAkpont.insets = new Insets(0, 0, 5, 8);
		gbc_negyedikAkpont.gridx = 1;
		gbc_negyedikAkpont.gridy = 11;
		panel_1.add(negyedikAkpont, gbc_negyedikAkpont);
		
		otodikJ = new JButton("");
		otodikJ.setEnabled(false);
		otodikJ.setMaximumSize(new Dimension(33, 20));
		otodikJ.setMinimumSize(new Dimension(33, 20));
		otodikJ.setBackground(new Color(34, 139, 34));
		otodikJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		otodikJ.setPreferredSize(new Dimension(118, 20));
		otodikJ.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 139)));
		otodikJ.setHorizontalTextPosition(SwingConstants.CENTER);
		otodikJ.setHorizontalAlignment(SwingConstants.CENTER);
		otodikJ.setForeground(new Color(0, 0, 0));
		otodikJ.setFont(new Font("Arial", Font.BOLD, 12));
		
		GridBagConstraints gbc_otodikJ = new GridBagConstraints();
		gbc_otodikJ.gridwidth = 2;
		gbc_otodikJ.insets = new Insets(0, 0, 5, 0);
		gbc_otodikJ.fill = GridBagConstraints.BOTH;
		gbc_otodikJ.gridx = 0;
		gbc_otodikJ.gridy = 12;
		panel_1.add(otodikJ, gbc_otodikJ);
		
		otodikB = new Label("");
		otodikB.setForeground(new Color(0, 0, 0));
		otodikB.setAlignment(Label.CENTER);
		otodikB.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_otodikB = new GridBagConstraints();
		gbc_otodikB.anchor = GridBagConstraints.WEST;
		gbc_otodikB.fill = GridBagConstraints.VERTICAL;
		gbc_otodikB.insets = new Insets(0, 5, 5, 5);
		gbc_otodikB.gridx = 0;
		gbc_otodikB.gridy = 13;
		panel_1.add(otodikB, gbc_otodikB);
		
		otodikJBpont = new Label("");
		otodikJBpont.setPreferredSize(new Dimension(30, 20));
		otodikJBpont.setForeground(new Color(128, 0, 0));
		otodikJBpont.setFont(new Font("Arial Black", Font.BOLD, 12));
		otodikJBpont.setAlignment(Label.CENTER);
		GridBagConstraints gbc_otodikJBpont = new GridBagConstraints();
		gbc_otodikJBpont.fill = GridBagConstraints.BOTH;
		gbc_otodikJBpont.insets = new Insets(0, 0, 5, 8);
		gbc_otodikJBpont.gridx = 1;
		gbc_otodikJBpont.gridy = 13;
		panel_1.add(otodikJBpont, gbc_otodikJBpont);
		
		otodikAk = new Label("");
		otodikAk.setAlignment(Label.CENTER);
		otodikAk.setForeground(new Color(0, 0, 0));
		otodikAk.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_otodikAk = new GridBagConstraints();
		gbc_otodikAk.anchor = GridBagConstraints.WEST;
		gbc_otodikAk.fill = GridBagConstraints.VERTICAL;
		gbc_otodikAk.insets = new Insets(0, 5, 5, 5);
		gbc_otodikAk.gridx = 0;
		gbc_otodikAk.gridy = 14;
		panel_1.add(otodikAk, gbc_otodikAk);
		
		otodikAkpont = new Label("");
		otodikAkpont.setAlignment(Label.CENTER);
		otodikAkpont.setForeground(new Color(127, 255, 0));
		otodikAkpont.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_otodikAkpont = new GridBagConstraints();
		gbc_otodikAkpont.fill = GridBagConstraints.BOTH;
		gbc_otodikAkpont.insets = new Insets(0, 0, 5, 8);
		gbc_otodikAkpont.gridx = 1;
		gbc_otodikAkpont.gridy = 14;
		panel_1.add(otodikAkpont, gbc_otodikAkpont);
		
		hatodikJ = new JButton("");
		hatodikJ.setEnabled(false);
		hatodikJ.setMaximumSize(new Dimension(33, 20));
		hatodikJ.setMinimumSize(new Dimension(33, 20));
		hatodikJ.setBackground(new Color(34, 139, 34));
		hatodikJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hatodikJ.setPreferredSize(new Dimension(118, 20));
		hatodikJ.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 139)));
		hatodikJ.setHorizontalTextPosition(SwingConstants.CENTER);
		hatodikJ.setHorizontalAlignment(SwingConstants.CENTER);
		hatodikJ.setForeground(new Color(0, 0, 0));
		hatodikJ.setFont(new Font("Arial", Font.BOLD, 12));
		
		GridBagConstraints gbc_hatodikJ = new GridBagConstraints();
		gbc_hatodikJ.gridwidth = 2;
		gbc_hatodikJ.insets = new Insets(0, 0, 5, 0);
		gbc_hatodikJ.fill = GridBagConstraints.BOTH;
		gbc_hatodikJ.gridx = 0;
		gbc_hatodikJ.gridy = 15;
		panel_1.add(hatodikJ, gbc_hatodikJ);
		
		hatodikB = new Label("");
		hatodikB.setForeground(new Color(0, 0, 0));
		hatodikB.setAlignment(Label.CENTER);
		hatodikB.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_hatodikB = new GridBagConstraints();
		gbc_hatodikB.anchor = GridBagConstraints.WEST;
		gbc_hatodikB.fill = GridBagConstraints.VERTICAL;
		gbc_hatodikB.insets = new Insets(0, 5, 5, 5);
		gbc_hatodikB.gridx = 0;
		gbc_hatodikB.gridy = 16;
		panel_1.add(hatodikB, gbc_hatodikB);
		
		hatodikJBpont = new Label("");
		hatodikJBpont.setPreferredSize(new Dimension(30, 20));
		hatodikJBpont.setForeground(new Color(128, 0, 0));
		hatodikJBpont.setFont(new Font("Arial Black", Font.BOLD, 12));
		hatodikJBpont.setAlignment(Label.CENTER);
		GridBagConstraints gbc_hatodikJBpont = new GridBagConstraints();
		gbc_hatodikJBpont.fill = GridBagConstraints.BOTH;
		gbc_hatodikJBpont.insets = new Insets(0, 0, 5, 8);
		gbc_hatodikJBpont.gridx = 1;
		gbc_hatodikJBpont.gridy = 16;
		panel_1.add(hatodikJBpont, gbc_hatodikJBpont);
		
		hatodikAk = new Label("");
		hatodikAk.setAlignment(Label.CENTER);
		hatodikAk.setForeground(new Color(0, 0, 0));
		hatodikAk.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_hatodikAk = new GridBagConstraints();
		gbc_hatodikAk.anchor = GridBagConstraints.WEST;
		gbc_hatodikAk.fill = GridBagConstraints.VERTICAL;
		gbc_hatodikAk.insets = new Insets(0, 5, 5, 5);
		gbc_hatodikAk.gridx = 0;
		gbc_hatodikAk.gridy = 17;
		panel_1.add(hatodikAk, gbc_hatodikAk);
		
		hatodikAkpont = new Label("");
		hatodikAkpont.setAlignment(Label.CENTER);
		hatodikAkpont.setForeground(new Color(127, 255, 0));
		hatodikAkpont.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_hatodikAkpont = new GridBagConstraints();
		gbc_hatodikAkpont.fill = GridBagConstraints.BOTH;
		gbc_hatodikAkpont.insets = new Insets(0, 0, 5, 8);
		gbc_hatodikAkpont.gridx = 1;
		gbc_hatodikAkpont.gridy = 17;
		panel_1.add(hatodikAkpont, gbc_hatodikAkpont);
		
		hetedikJ = new JButton("");
		hetedikJ.setEnabled(false);
		hetedikJ.setMinimumSize(new Dimension(33, 20));
		hetedikJ.setMaximumSize(new Dimension(33, 20));
		hetedikJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hetedikJ.setBackground(new Color(34, 139, 34));
		hetedikJ.setPreferredSize(new Dimension(118, 20));
		hetedikJ.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(0, 0, 139)));
		hetedikJ.setHorizontalTextPosition(SwingConstants.CENTER);
		hetedikJ.setHorizontalAlignment(SwingConstants.CENTER);
		hetedikJ.setForeground(new Color(0, 0, 0));
		hetedikJ.setFont(new Font("Arial", Font.BOLD, 12));
		
		GridBagConstraints gbc_hetedikJ = new GridBagConstraints();
		gbc_hetedikJ.gridwidth = 2;
		gbc_hetedikJ.insets = new Insets(0, 0, 5, 0);
		gbc_hetedikJ.fill = GridBagConstraints.BOTH;
		gbc_hetedikJ.gridx = 0;
		gbc_hetedikJ.gridy = 18;
		panel_1.add(hetedikJ, gbc_hetedikJ);
		
		hetedikB = new Label("");
		hetedikB.setForeground(new Color(0, 0, 0));
		hetedikB.setAlignment(Label.CENTER);
		hetedikB.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_hetedikB = new GridBagConstraints();
		gbc_hetedikB.anchor = GridBagConstraints.WEST;
		gbc_hetedikB.fill = GridBagConstraints.VERTICAL;
		gbc_hetedikB.insets = new Insets(0, 5, 5, 5);
		gbc_hetedikB.gridx = 0;
		gbc_hetedikB.gridy = 19;
		panel_1.add(hetedikB, gbc_hetedikB);
		
		hetedikJBpont = new Label("");
		hetedikJBpont.setPreferredSize(new Dimension(30, 20));
		hetedikJBpont.setForeground(new Color(128, 0, 0));
		hetedikJBpont.setFont(new Font("Arial Black", Font.BOLD, 12));
		hetedikJBpont.setAlignment(Label.CENTER);
		GridBagConstraints gbc_hetedikJBpont = new GridBagConstraints();
		gbc_hetedikJBpont.insets = new Insets(0, 0, 5, 8);
		gbc_hetedikJBpont.fill = GridBagConstraints.BOTH;
		gbc_hetedikJBpont.gridx = 1;
		gbc_hetedikJBpont.gridy = 19;
		panel_1.add(hetedikJBpont, gbc_hetedikJBpont);
		
		hetedikAk = new Label("");
		hetedikAk.setAlignment(Label.CENTER);
		hetedikAk.setForeground(new Color(0, 0, 0));
		hetedikAk.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_hetedikAk = new GridBagConstraints();
		gbc_hetedikAk.anchor = GridBagConstraints.WEST;
		gbc_hetedikAk.fill = GridBagConstraints.VERTICAL;
		gbc_hetedikAk.insets = new Insets(0, 5, 0, 5);
		gbc_hetedikAk.gridx = 0;
		gbc_hetedikAk.gridy = 20;
		panel_1.add(hetedikAk, gbc_hetedikAk);
		
		hetedikAkpont = new Label("");
		hetedikAkpont.setAlignment(Label.CENTER);
		hetedikAkpont.setForeground(new Color(127, 255, 0));
		hetedikAkpont.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_hetedikAkpont = new GridBagConstraints();
		gbc_hetedikAkpont.insets = new Insets(0, 0, 0, 8);
		gbc_hetedikAkpont.fill = GridBagConstraints.BOTH;
		gbc_hetedikAkpont.gridx = 1;
		gbc_hetedikAkpont.gridy = 20;
		panel_1.add(hetedikAkpont, gbc_hetedikAkpont);
		
		negyedikKartya = new JLabel();
		negyedikKartya.setPreferredSize(new Dimension(98, 116));
		negyedikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		negyedikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		negyedikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_negyedikKartya.gridheight = 4;
		gbc_negyedikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_negyedikKartya.gridx = 0;
		gbc_negyedikKartya.gridy = 4;
		gbc_negyedikKartya.insets = new Insets(5, 15, 5, 10);
		contentPane.add(negyedikKartya, gbc_negyedikKartya);
		
		otodikKartya = new JLabel();
		otodikKartya.setPreferredSize(new Dimension(98, 116));
		otodikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		otodikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		otodikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_otodikKartya.gridheight = 4;
		gbc_otodikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_otodikKartya.gridx = 1;
		gbc_otodikKartya.gridy = 4;
		gbc_otodikKartya.insets = new Insets(5, 15, 5, 10);
		contentPane.add(otodikKartya, gbc_otodikKartya);
		
		hatodikKartya = new JLabel();
		hatodikKartya.setPreferredSize(new Dimension(98, 116));
		hatodikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		hatodikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		hatodikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_hatodikKartya.gridheight = 4;
		gbc_hatodikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_hatodikKartya.gridx = 2;
		gbc_hatodikKartya.gridy = 4;
		gbc_hatodikKartya.insets = new Insets(5, 15, 5, 10);
		contentPane.add(hatodikKartya, gbc_hatodikKartya);
		
		hetedikKartya = new JLabel();
		hetedikKartya.setPreferredSize(new Dimension(98, 116));
		hetedikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		hetedikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		hetedikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_hetedikKartya.gridheight = 4;
		gbc_hetedikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_hetedikKartya.gridx = 0;
		gbc_hetedikKartya.gridy = 8;
		gbc_hetedikKartya.insets = new Insets(5, 15, 5, 10);
		contentPane.add(hetedikKartya, gbc_hetedikKartya);
		
		nyolcadikKartya = new JLabel();
		nyolcadikKartya.setPreferredSize(new Dimension(98, 116));
		nyolcadikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		nyolcadikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		nyolcadikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_nyolcadikKartya.gridheight = 4;
		gbc_nyolcadikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_nyolcadikKartya.gridx = 1;
		gbc_nyolcadikKartya.gridy = 8;
		gbc_nyolcadikKartya.insets = new Insets(5, 15, 5, 10);
		contentPane.add(nyolcadikKartya, gbc_nyolcadikKartya);
		
		kilencedikKartya = new JLabel();
		kilencedikKartya.setPreferredSize(new Dimension(98, 116));
		kilencedikKartya.setHorizontalTextPosition(SwingConstants.CENTER);
		kilencedikKartya.setHorizontalAlignment(SwingConstants.CENTER);
		kilencedikKartya.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		gbc_kilencedikKartya.gridheight = 4;
		gbc_kilencedikKartya.insets = new Insets(0, 0, 5, 5);
		gbc_kilencedikKartya.gridx = 2;
		gbc_kilencedikKartya.gridy = 8;
		gbc_kilencedikKartya.insets = new Insets(5, 15, 5, 10);
		contentPane.add(kilencedikKartya, gbc_kilencedikKartya);
		
		panel = new JPanel();
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.setBackground(new Color(0, 128, 0));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 12;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
			
			JLabel jatekosok_1 = new JLabel("J\u00E1t\u00E9kosok sz\u00E1ma: ");
			GridBagConstraints gbc_jatekosok_1 = new GridBagConstraints();
			gbc_jatekosok_1.fill = GridBagConstraints.BOTH;
			gbc_jatekosok_1.insets = new Insets(0, 0, 0, 5);
			gbc_jatekosok_1.gridx = 0;
			gbc_jatekosok_1.gridy = 0;
			panel.add(jatekosok_1, gbc_jatekosok_1);
			jatekosok_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
			jatekosok_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			jatekosok_1.setForeground(new Color(0, 0, 0));
			jatekosok_1.setHorizontalTextPosition(SwingConstants.CENTER);
			jatekosok_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jatekosSzam = new JTextField();
		jatekosSzam.setHorizontalAlignment(SwingConstants.CENTER);
		jatekosSzam.setForeground(new Color(0, 0, 51));
		jatekosSzam.setBackground(new Color(102, 205, 170));
		jatekosSzam.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		GridBagConstraints gbc_jatekosSzam = new GridBagConstraints();
		gbc_jatekosSzam.fill = GridBagConstraints.BOTH;
		gbc_jatekosSzam.insets = new Insets(0, 0, 0, 5);
		gbc_jatekosSzam.gridx = 1;
		gbc_jatekosSzam.gridy = 0;
		panel.add(jatekosSzam, gbc_jatekosSzam);
		jatekosSzam.setToolTipText("EG\u00C9SZ sz\u00E1mmal add meg!!");
		jatekosSzam.setFont(new Font("Sylfaen", Font.BOLD, 12));
		jatekosSzam.setPreferredSize(new Dimension(10, 20));
		jatekosSzam.setMinimumSize(new Dimension(6, 8));
		jatekosSzam.setColumns(4);
		
		hanyadikKor = new JLabel("M\u00E9g nem kezd\u0151d\u00F6tt el a j\u00E1t\u00E9k!");
		hanyadikKor.setForeground(new Color(0, 0, 0));
		hanyadikKor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		hanyadikKor.setHorizontalTextPosition(SwingConstants.CENTER);
		hanyadikKor.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_hanyadikKor = new GridBagConstraints();
		gbc_hanyadikKor.fill = GridBagConstraints.BOTH;
		gbc_hanyadikKor.gridx = 2;
		gbc_hanyadikKor.gridy = 0;
		panel.add(hanyadikKor, gbc_hanyadikKor);
		hanyadikKor.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		
		kiurit = new JButton("Asztal ki\u00FCr\u00EDt\u00E9se");
		kiurit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		kiurit.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		kiurit.setEnabled(false);
		kiurit.setPreferredSize(new Dimension(115, 23));
		kiurit.setForeground(new Color(0, 0, 0));
		kiurit.setFont(new Font("Tahoma", Font.BOLD, 11));
		kiurit.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_kiurit = new GridBagConstraints();
		gbc_kiurit.fill = GridBagConstraints.BOTH;
		gbc_kiurit.insets = new Insets(0, 0, 5, 5);
		gbc_kiurit.gridx = 0;
		gbc_kiurit.gridy = 14;
		contentPane.add(kiurit, gbc_kiurit);
		
		kezdes = new JButton("J\u00E1t\u00E9k kezd\u00E9se");
		kezdes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		kezdes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		kezdes.setFont(new Font("Tahoma", Font.BOLD, 11));
		kezdes.setBackground(new Color(100, 149, 237));
		kezdes.setPreferredSize(new Dimension(115, 23));
		kezdes.setForeground(new Color(0, 0, 0));
		GridBagConstraints gbc_kezdes = new GridBagConstraints();
		gbc_kezdes.fill = GridBagConstraints.BOTH;
		gbc_kezdes.insets = new Insets(0, 0, 5, 5);
		gbc_kezdes.gridx = 0;
		gbc_kezdes.gridy = 13;
		contentPane.add(kezdes, gbc_kezdes);
		
		
		lapotKer = new JButton("Lapot k\u00E9rek");
		lapotKer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lapotKer.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		lapotKer.setEnabled(false);
		lapotKer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lapotKer.setForeground(new Color(0, 0, 0));
		lapotKer.setBackground(new Color(105, 105, 105));
		lapotKer.setPreferredSize(new Dimension(115, 23));
		GridBagConstraints gbc_lapotKer = new GridBagConstraints();
		gbc_lapotKer.fill = GridBagConstraints.BOTH;
		gbc_lapotKer.insets = new Insets(0, 0, 5, 5);
		gbc_lapotKer.gridx = 1;
		gbc_lapotKer.gridy = 13;
		contentPane.add(lapotKer, gbc_lapotKer);
		
		passzol = new JButton("Passzolok");
		passzol.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		passzol.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		passzol.setEnabled(false);
		passzol.setPreferredSize(new Dimension(115, 23));
		passzol.setBackground(new Color(105, 105, 105));
		passzol.setForeground(new Color(0, 0, 0));
		passzol.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_passzol = new GridBagConstraints();
		gbc_passzol.fill = GridBagConstraints.BOTH;
		gbc_passzol.insets = new Insets(0, 0, 5, 5);
		gbc_passzol.gridx = 2;
		gbc_passzol.gridy = 13;
		contentPane.add(passzol, gbc_passzol);
		
		befejez = new JButton("J\u00E1t\u00E9k befejez\u00E9se");
		befejez.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		befejez.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		befejez.setEnabled(false);
		befejez.setFont(new Font("Tahoma", Font.BOLD, 11));
		befejez.setForeground(new Color(0, 0, 0));
		befejez.setBackground(new Color(105, 105, 105));
		GridBagConstraints gbc_befejez = new GridBagConstraints();
		gbc_befejez.insets = new Insets(0, 0, 5, 5);
		gbc_befejez.fill = GridBagConstraints.BOTH;
		gbc_befejez.gridx = 1;
		gbc_befejez.gridy = 14;
		contentPane.add(befejez, gbc_befejez);
		
		uzenet1 = new JLabel("");
		uzenet1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		uzenet1.setHorizontalTextPosition(SwingConstants.CENTER);
		uzenet1.setPreferredSize(new Dimension(250, 23));
		uzenet1.setHorizontalAlignment(SwingConstants.CENTER);
		uzenet1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		uzenet1.setForeground(new Color(128, 0, 0));
		GridBagConstraints gbc_uzenet1 = new GridBagConstraints();
		gbc_uzenet1.insets = new Insets(0, 0, 5, 5);
		gbc_uzenet1.fill = GridBagConstraints.BOTH;
		gbc_uzenet1.gridwidth = 3;
		gbc_uzenet1.gridx = 0;
		gbc_uzenet1.gridy = 16;
		contentPane.add(uzenet1, gbc_uzenet1);
		
		uzenet2 = new JLabel("");
		uzenet2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
		uzenet2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		uzenet2.setForeground(new Color(128, 0, 0));
		uzenet2.setHorizontalTextPosition(SwingConstants.CENTER);
		uzenet2.setHorizontalAlignment(SwingConstants.CENTER);
		uzenet2.setPreferredSize(new Dimension(250, 23));
		GridBagConstraints gbc_uzenet2 = new GridBagConstraints();
		gbc_uzenet2.insets = new Insets(0, 0, 6, 5);
		gbc_uzenet2.fill = GridBagConstraints.BOTH;
		gbc_uzenet2.gridwidth = 3;
		gbc_uzenet2.gridx = 0;
		gbc_uzenet2.gridy = 18;
		contentPane.add(uzenet2, gbc_uzenet2);
		
		elsoKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		masodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		harmadikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		negyedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		otodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		hatodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		hetedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		nyolcadikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		kilencedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
		
		lblNewLabel = new JLabel("\u00A9 copyright TOTO ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 19;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		kezdes.addActionListener(this);
		befejez.addActionListener(new JatekBefejez());
		lapotKer.addActionListener(new Lapot());
		passzol.addActionListener(new Passz());
		kiurit.addActionListener(new Kiurites());
		
		
		kezdes.addMouseListener(new FeleVitel());
		befejez.addMouseListener(new FeleVitel());
		lapotKer.addMouseListener(new FeleVitel());
		passzol.addMouseListener(new FeleVitel());
		kiurit.addMouseListener(new FeleVitel());
		
		elsoJ.addMouseListener(new FeleVitel());
		masodikJ.addMouseListener(new FeleVitel());
		harmadikJ.addMouseListener(new FeleVitel());
		negyedikJ.addMouseListener(new FeleVitel());
		otodikJ.addMouseListener(new FeleVitel());
		hatodikJ.addMouseListener(new FeleVitel());
		hetedikJ.addMouseListener(new FeleVitel());
		
		elsoJ.addActionListener(new Megnez());
		masodikJ.addActionListener(new Megnez());
		harmadikJ.addActionListener(new Megnez());
		negyedikJ.addActionListener(new Megnez());
		otodikJ.addActionListener(new Megnez());
		hatodikJ.addActionListener(new Megnez());
		hetedikJ.addActionListener(new Megnez());
		
	}

	public FranciaKartya KartyafelsoLap(List<FranciaKartya> pakli){
		
		return pakli.get(pakli.size()-1);
	}
	
	public void PaklitCsinal(){
		
		pakli.add(new FranciaKartya("Karo",2,"2",new ImageIcon("kartyak\\karo2.jpg")));
		pakli.add(new FranciaKartya("Karo",3,"3",new ImageIcon("kartyak\\karo3.jpg")));
		pakli.add(new FranciaKartya("Karo",4,"4",new ImageIcon("kartyak\\karo4.jpg")));
		pakli.add(new FranciaKartya("Karo",5,"5",new ImageIcon("kartyak\\karo5.jpg")));
		pakli.add(new FranciaKartya("Karo",6,"6",new ImageIcon("kartyak\\karo6.jpg")));
		pakli.add(new FranciaKartya("Karo",7,"7",new ImageIcon("kartyak\\karo7.jpg")));
		pakli.add(new FranciaKartya("Karo",8,"8",new ImageIcon("kartyak\\karo8.jpg")));
		pakli.add(new FranciaKartya("Karo",9,"9",new ImageIcon("kartyak\\karo9.jpg")));
		pakli.add(new FranciaKartya("Karo",10,"10",new ImageIcon("kartyak\\karo10.jpg")));
		pakli.add(new FranciaKartya("Karo",10,"J",new ImageIcon("kartyak\\karoJ.jpg")));
		pakli.add(new FranciaKartya("Karo",10,"Q",new ImageIcon("kartyak\\karoQ.jpg")));
		pakli.add(new FranciaKartya("Karo",10,"K",new ImageIcon("kartyak\\karoK.jpg")));
		pakli.add(new FranciaKartya("Karo",11,"A",new ImageIcon("kartyak\\karoA.jpg")));
		
		pakli.add(new FranciaKartya("Kor",2,"2",new ImageIcon("kartyak\\kor2.jpg")));
		pakli.add(new FranciaKartya("Kor",3,"3",new ImageIcon("kartyak\\kor3.jpg")));
		pakli.add(new FranciaKartya("Kor",4,"4",new ImageIcon("kartyak\\kor4.jpg")));
		pakli.add(new FranciaKartya("Kor",5,"5",new ImageIcon("kartyak\\kor5.jpg")));
		pakli.add(new FranciaKartya("Kor",6,"6",new ImageIcon("kartyak\\kor6.jpg")));
		pakli.add(new FranciaKartya("Kor",7,"7",new ImageIcon("kartyak\\kor7.jpg")));
		pakli.add(new FranciaKartya("Kor",8,"8",new ImageIcon("kartyak\\kor8.jpg")));
		pakli.add(new FranciaKartya("Kor",9,"9",new ImageIcon("kartyak\\kor9.jpg")));
		pakli.add(new FranciaKartya("Kor",10,"10",new ImageIcon("kartyak\\kor10.jpg")));
		pakli.add(new FranciaKartya("Kor",10,"J",new ImageIcon("kartyak\\korJ.jpg")));
		pakli.add(new FranciaKartya("Kor",10,"Q",new ImageIcon("kartyak\\korQ.jpg")));
		pakli.add(new FranciaKartya("Kor",10,"K",new ImageIcon("kartyak\\korK.jpg")));
		pakli.add(new FranciaKartya("Kor",11,"A",new ImageIcon("kartyak\\korA.jpg")));
		
		pakli.add(new FranciaKartya("Treff",2,"2",new ImageIcon("kartyak\\treff2.jpg")));
		pakli.add(new FranciaKartya("Treff",3,"3",new ImageIcon("kartyak\\treff3.jpg")));
		pakli.add(new FranciaKartya("Treff",4,"4",new ImageIcon("kartyak\\treff4.jpg")));
		pakli.add(new FranciaKartya("Treff",5,"5",new ImageIcon("kartyak\\treff5.jpg")));
		pakli.add(new FranciaKartya("Treff",6,"6",new ImageIcon("kartyak\\treff6.jpg")));
		pakli.add(new FranciaKartya("Treff",7,"7",new ImageIcon("kartyak\\treff7.jpg")));
		pakli.add(new FranciaKartya("Treff",8,"8",new ImageIcon("kartyak\\treff8.jpg")));
		pakli.add(new FranciaKartya("Treff",9,"9",new ImageIcon("kartyak\\treff9.jpg")));
		pakli.add(new FranciaKartya("Treff",10,"10",new ImageIcon("kartyak\\treff10.jpg")));
		pakli.add(new FranciaKartya("Treff",10,"J",new ImageIcon("kartyak\\treffJ.jpg")));
		pakli.add(new FranciaKartya("Treff",10,"Q",new ImageIcon("kartyak\\treffQ.jpg")));
		pakli.add(new FranciaKartya("Treff",10,"K",new ImageIcon("kartyak\\treffK.jpg")));
		pakli.add(new FranciaKartya("Treff",11,"A",new ImageIcon("kartyak\\treffA.jpg")));
		
		pakli.add(new FranciaKartya("Pikk",2,"2",new ImageIcon("kartyak\\pikk2.jpg")));
		pakli.add(new FranciaKartya("Pikk",3,"3",new ImageIcon("kartyak\\pikk3.jpg")));
		pakli.add(new FranciaKartya("Pikk",4,"4",new ImageIcon("kartyak\\pikk4.jpg")));
		pakli.add(new FranciaKartya("Pikk",5,"5",new ImageIcon("kartyak\\pikk5.jpg")));
		pakli.add(new FranciaKartya("Pikk",6,"6",new ImageIcon("kartyak\\pikk6.jpg")));
		pakli.add(new FranciaKartya("Pikk",7,"7",new ImageIcon("kartyak\\pikk7.jpg")));
		pakli.add(new FranciaKartya("Pikk",8,"8",new ImageIcon("kartyak\\pikk8.jpg")));
		pakli.add(new FranciaKartya("Pikk",9,"9",new ImageIcon("kartyak\\pikk9.jpg")));
		pakli.add(new FranciaKartya("Pikk",10,"10",new ImageIcon("kartyak\\pikk10.jpg")));
		pakli.add(new FranciaKartya("Pikk",10,"J",new ImageIcon("kartyak\\pikkJ.jpg")));
		pakli.add(new FranciaKartya("Pikk",10,"Q",new ImageIcon("kartyak\\pikkQ.jpg")));
		pakli.add(new FranciaKartya("Pikk",10,"K",new ImageIcon("kartyak\\pikkK.jpg")));
		pakli.add(new FranciaKartya("Pikk",11,"A",new ImageIcon("kartyak\\pikkA.jpg")));
		
	}
	
	public void paklitKever(List<FranciaKartya> pakli){
		
		int keverve=0;
		while(keverve<=1000){
			
			
			int randomHely1=(int)(Math.random()*pakli.size());
			int randomHely2=(int)(Math.random()*pakli.size());
			FranciaKartya kartya= pakli.get(randomHely1);
			pakli.set(randomHely1, pakli.get(randomHely2));
			pakli.set(randomHely2, kartya);
			keverve++;
			
		}
		
	}
	
	public void amigKisebbMint11(){
		
		while(aktualisPont<11){
			
			jatekosok.get(aktualisJatekos-1).lapotHuz(KartyafelsoLap(pakli));
			aktualisPont+=KartyafelsoLap(pakli).getPontertek();
			
			
			switch(aktualisMezo){
			case 1: elsoKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 2: masodikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 3: harmadikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 4: negyedikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 5: otodikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 6: hatodikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 7: hetedikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 8: nyolcadikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 9: kilencedikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			}
			
			pakli.remove(pakli.size()-1);
			aktualisMezo++;
			jatekosok.get(aktualisJatekos-1).setPontszam(aktualisPont);
			switch(aktualisJatekos){
			
				case 1: elsoAkpont.setText(Integer.toString(aktualisPont));break;
				case 2: masodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 3: harmadikAkpont.setText(Integer.toString(aktualisPont));break;
				case 4: negyedikAkpont.setText(Integer.toString(aktualisPont));break;
				case 5: otodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 6: hatodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 7: hetedikAkpont.setText(Integer.toString(aktualisPont));break;
			
			}
			
		}
		
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		if(jatekosSzam.getText().equals("")){
			
			uzenet1.setText("Nem adtál meg játékosszámot!!");
			uzenet2.setText("");
			return;
		}
		
		int szam;
		try{
			
			szam=Integer.parseInt(jatekosSzam.getText(),10);
			uzenet2.setText("");
			jatekosSzam.setText("");
		}
		catch(NumberFormatException ex){
			
			uzenet1.setText("EGÉSZ számot adjál meg!(NE BETÛVEL!!)");
			uzenet2.setText(ex.getMessage());
			jatekosSzam.setText("");
			return;
			
		}
		
		if(szam>7){
			
			uzenet1.setText("Ezt a játékot maximum 7-en játszhatják!!");
			uzenet2.setText("");
			return;
			
		}
		else if(szam<2){
			
			uzenet1.setText("Ezt a játékot minimum 2 fõnek kell játszania!! ");
			uzenet2.setText("");
			return;
			
		}
		jatekosSzam.setEnabled(false);
		jatekosSzam.setBackground(new Color(105, 105, 105));

		PaklitCsinal();
		
		Nevek nevsor = null;
		

		try{
			
			nevsor = new Nevek(szam);
			nevsor.setModal(true);
			
		
	
		
			String[] nevek=nevsor.showDialog();
			
			for(int i=0;i<szam;i++){
				
				jatekosok.add(new JatekosJack(nevek[i],new ArrayList<FranciaKartya>()));
				
			}
		}
		catch (NullPointerException ex){
			
			jatekosSzam.setEnabled(true);
			jatekosSzam.setBackground(new Color(102, 205, 170));
			uzenet1.setText("Nem adtad meg a játékosok neveit!!! ");
			
			return;
		}
		
		uzenet2.setText("Jelenleg "+jatekosok.get(aktualisJatekos-1).getNev()+" játszik.");
	
		switch(aktualisJatekos){
			
			case 1: elsoJ.setBackground(new Color(0,255,51));break;
			case 2: masodikJ.setBackground(new Color(0,255,51));break;
			case 3: harmadikJ.setBackground(new Color(0,255,51));break;
			case 4: negyedikJ.setBackground(new Color(0,255,51));break;
			case 5: otodikJ.setBackground(new Color(0,255,51));break;
			case 6: hatodikJ.setBackground(new Color(0,255,51));break;
			case 7: hetedikJ.setBackground(new Color(0,255,51));break;
			
		}
		uzenet1.setText("A játék elkezdõdött!! Kérsz még lapot?");
			
			switch(jatekosok.size()){
			
				case 7: {
					
						hetedikJ.setText(jatekosok.get(6).getNev());
						hetedikB.setText("Büntetõpont: ");
						hetedikAk.setText("Aktuális pontszám: ");
						hetedikAkpont.setText("0");
						hetedikJ.setEnabled(true);
						
						}
				
				case 6: {
					
						hatodikJ.setText(jatekosok.get(5).getNev());
						hatodikB.setText("Büntetõpont: ");
						hatodikAk.setText("Aktuális pontszám: ");
						hatodikAkpont.setText("0");
						hatodikJ.setEnabled(true);
			
						}
			
				case 5: {
					
						otodikJ.setText(jatekosok.get(4).getNev());
						otodikB.setText("Büntetõpont: ");
						otodikAk.setText("Aktuális pontszám: ");
						otodikAkpont.setText("0");
						otodikJ.setEnabled(true);
			
						}
			
				case 4: {
					
						negyedikJ.setText(jatekosok.get(3).getNev());
						negyedikB.setText("Büntetõpont: ");
						negyedikAk.setText("Aktuális pontszám: ");
						negyedikAkpont.setText("0");
						negyedikJ.setEnabled(true);
		
						}
		
				case 3: {
					
						harmadikJ.setText(jatekosok.get(2).getNev());
						harmadikB.setText("Büntetõpont: ");
						harmadikAk.setText("Aktuális pontszám: ");
						harmadikAkpont.setText("0");
						harmadikJ.setEnabled(true);
		
						}
			
				case 2: {
					
						masodikJ.setText(jatekosok.get(1).getNev());
						masodikB.setText("Büntetõpont: ");
						masodikAk.setText("Aktuális pontszám: ");
						masodikAkpont.setText("0");
						masodikJ.setEnabled(true);
			
						}

				case 1: {
						
						elsoJ.setText(jatekosok.get(0).getNev());
						elsoB.setText("Büntetõpont: ");
						elsoAk.setText("Aktuális pontszám: ");
						elsoAkpont.setText("0");
						elsoJ.setEnabled(true);
				
						}
		
			}
			
		
		switch(jatekosok.size()){ //jatekosok büntetõpontjának beírása
		
			case 7: hetedikJBpont.setText(Integer.toString(jatekosok.get(6).getBuntetoPont()));
			case 6: hatodikJBpont.setText(Integer.toString(jatekosok.get(5).getBuntetoPont()));
			case 5: otodikJBpont.setText(Integer.toString(jatekosok.get(4).getBuntetoPont()));
			case 4: negyedikJBpont.setText(Integer.toString(jatekosok.get(3).getBuntetoPont()));
			case 3: harmadikJBpont.setText(Integer.toString(jatekosok.get(2).getBuntetoPont()));
			case 2: masodikJBpont.setText(Integer.toString(jatekosok.get(1).getBuntetoPont()));
			case 1: elsoJBpont.setText(Integer.toString(jatekosok.get(0).getBuntetoPont()));
			
		}
		
		paklitKever(pakli);
		
		kezdes.setEnabled(false);
		kezdes.setBackground(new Color(105, 105, 105));
		lapotKer.setEnabled(true);
		lapotKer.setBackground(new Color(100, 149, 237));
		passzol.setEnabled(true);
		passzol.setBackground(new Color(100, 149, 237));
		befejez.setEnabled(true);
		befejez.setBackground(new Color(100, 149, 237));
		hanyadikKor.setText("Jelenleg ez a(z) "+korokSzama+". kör.");
		amigKisebbMint11();
	}
	
	public class JatekBefejez implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			
			elsoKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			masodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			harmadikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			negyedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			otodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			hatodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			hetedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			nyolcadikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			kilencedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			
				switch(aktualisJatekos){
				
				case 1: elsoJ.setBackground(new Color(34,139,34));break;
				case 2: masodikJ.setBackground(new Color(34,139,34));break;
				case 3: harmadikJ.setBackground(new Color(34,139,34));break;
				case 4: negyedikJ.setBackground(new Color(34,139,34));break;
				case 5: otodikJ.setBackground(new Color(34,139,34));break;
				case 6: hatodikJ.setBackground(new Color(34,139,34));break;
				case 7: hetedikJ.setBackground(new Color(34,139,34));break;
				
				}
				switch(jatekosok.size()){ //jatékosok adatainak törlése
				
					case 7: {
					
							hetedikJ.setText("");
							hetedikB.setText("");
							hetedikJBpont.setText("");
							hetedikAk.setText("");
							hetedikAkpont.setText("");
							hetedikJ.setEnabled(false);
				
							}
						
					case 6: {
					
							hatodikJ.setText("");
							hatodikB.setText("");
							hatodikJBpont.setText("");
							hatodikAk.setText("");
							hatodikAkpont.setText("");
							hatodikJ.setEnabled(false);
				
							}
						
					case 5: {
					
							otodikJ.setText("");
							otodikB.setText("");
							otodikJBpont.setText("");
							otodikAk.setText("");
							otodikAkpont.setText("");
							otodikJ.setEnabled(false);
				
							}
						
					case 4: {
				
							negyedikJ.setText("");
							negyedikB.setText("");
							negyedikJBpont.setText("");
							negyedikAk.setText("");
							negyedikAkpont.setText("");
							negyedikJ.setEnabled(false);
			
							}
						
					case 3: {
				
							harmadikJ.setText("");
							harmadikB.setText("");
							harmadikJBpont.setText("");
							harmadikAk.setText("");
							harmadikAkpont.setText("");
							harmadikJ.setEnabled(false);
			
							}
						
					case 2: {
					
							masodikJ.setText("");
							masodikB.setText("");
							masodikJBpont.setText("");
							masodikAk.setText("");
							masodikAkpont.setText("");
							masodikJ.setEnabled(false);
				
							}
							
					case 1: {
						
							elsoJ.setText("");
							elsoB.setText("");
							elsoJBpont.setText("");
							elsoAk.setText("");
							elsoAkpont.setText("");
							elsoJ.setEnabled(false);
						
							}
					
				}
			
			aktualisJatekos=1;
			aktualisMezo=1;
			aktualisPont=0;
			jatekosok.clear();
			pakli.clear();
			korokSzama=1;
			hanyadikKor.setText("Még nem kezdõdött el a játék!");
			
			jatekosSzam.setEnabled(true);
			jatekosSzam.setBackground(new Color(100, 149, 237));
			kezdes.setEnabled(true);
			kezdes.setBackground(new Color(100, 149, 237));
			lapotKer.setEnabled(false);
			lapotKer.setBackground(new Color(105, 105, 105));
			passzol.setEnabled(false);
			passzol.setBackground(new Color(105, 105, 105));
			befejez.setEnabled(false);
			befejez.setBackground(new Color(105, 105, 105));
			kiurit.setEnabled(false);
			kiurit.setBackground(new Color(105, 105, 105));
			uzenet1.setText("A játékot felfüggesztetted!!");
			uzenet2.setText("Nem nyert senki.");
			
		}
		
	}
	
	public class Lapot implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			jatekosok.get(aktualisJatekos-1).lapotHuz(KartyafelsoLap(pakli));
			aktualisPont+=KartyafelsoLap(pakli).getPontertek();
			
			
			switch(aktualisMezo){
			case 1: elsoKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 2: masodikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 3: harmadikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 4: negyedikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 5: otodikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 6: hatodikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 7: hetedikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 8: nyolcadikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			case 9: kilencedikKartya.setIcon(KartyafelsoLap(pakli).getKepe()); break;
			}
			
			pakli.remove(pakli.size()-1);
			aktualisMezo++;
			jatekosok.get(aktualisJatekos-1).setPontszam(aktualisPont);
			switch(aktualisJatekos){
			
				case 1: elsoAkpont.setText(Integer.toString(aktualisPont));break;
				case 2: masodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 3: harmadikAkpont.setText(Integer.toString(aktualisPont));break;
				case 4: negyedikAkpont.setText(Integer.toString(aktualisPont));break;
				case 5: otodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 6: hatodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 7: hetedikAkpont.setText(Integer.toString(aktualisPont));break;
			
			}
			if(aktualisPont>21){//meg kell nézni van-e Ász nála, ha van, akkor az 1et ér
				List<FranciaKartya> kartyai = jatekosok.get(aktualisJatekos-1).getKartyak();
				int darab = kartyai.size();
				for(int i=0;i<darab;i++){
					
					if((kartyai.get(i).getNeve().equals("KorA") && kartyai.get(i).getPontertek() ==11) ||
							(kartyai.get(i).getNeve().equals("KaroA") && kartyai.get(i).getPontertek() ==11) ||
							(kartyai.get(i).getNeve().equals("TreffA") && kartyai.get(i).getPontertek() ==11) ||
							(kartyai.get(i).getNeve().equals("PikkA") && kartyai.get(i).getPontertek() ==11)){
						
						kartyai.get(i).setErtek(1);
						uzenet2.setText("Van új Ászod. Az már csak 1-et ér.");
						break;
					}
					
				}
				jatekosok.get(aktualisJatekos-1).setKartyak(kartyai);
				aktualisPont=0;
				for(int i=0;i<kartyai.size();i++){
					aktualisPont+=kartyai.get(i).getPontertek();
				}
				jatekosok.get(aktualisJatekos-1).setPontszam(aktualisPont);
				switch(aktualisJatekos){
				
				case 1: elsoAkpont.setText(Integer.toString(aktualisPont));break;
				case 2: masodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 3: harmadikAkpont.setText(Integer.toString(aktualisPont));break;
				case 4: negyedikAkpont.setText(Integer.toString(aktualisPont));break;
				case 5: otodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 6: hatodikAkpont.setText(Integer.toString(aktualisPont));break;
				case 7: hetedikAkpont.setText(Integer.toString(aktualisPont));break;
			
				}
			}
			if(aktualisPont>=21){
				
				jatekosok.get(aktualisJatekos-1).paklitKap();
				switch(aktualisJatekos){
				
				case 1: elsoJ.setBackground(new Color(34,139,34));break;
				case 2: masodikJ.setBackground(new Color(34,139,34));break;
				case 3: harmadikJ.setBackground(new Color(34,139,34));break;
				case 4: negyedikJ.setBackground(new Color(34,139,34));break;
				case 5: otodikJ.setBackground(new Color(34,139,34));break;
				case 6: hatodikJ.setBackground(new Color(34,139,34));break;
				case 7: hetedikJ.setBackground(new Color(34,139,34));break;
				
			}
				
				if(aktualisPont==21){
					
					uzenet1.setText(Integer.toString(aktualisPont)+" pontod van. A körödnek vége!");
					
				
				}
				else{
					
					uzenet1.setText(Integer.toString(aktualisPont)+" pontod van. A kört elvesztetted! A körödnek vége!");
					
				}
				
				uzenet2.setText("A játék folytatásához ki kell üríteni az asztalt!");
				
				if(aktualisJatekos==jatekosok.size()){ // Ekkor vége a körnek!
					
					boolean vanE21=false;
					korVege=true;
					
					for(int i=0;i<jatekosok.size();i++){
						
						if(jatekosok.get(i).getPontszam()==21){
							
							vanE21=true;
							break;
						
						}
						
					}
					
					if(vanE21){
						
						for(int i=0;i<jatekosok.size();i++){
							
							if(jatekosok.get(i).getPontszam()!=21){
								
								jatekosok.get(i).BuntetoPontotKap(jatekosok.get(i).getPontszam());
							
							}
							
						}
						
					}
					else{
						
						int maxPont=0;
						
						for(int i=0;i<jatekosok.size();i++){
							
							if(jatekosok.get(i).getPontszam()<21 && jatekosok.get(i).getPontszam()>maxPont){
								
								maxPont=jatekosok.get(i).getPontszam();
							
							}
							
						}
						
						for(int i=0;i<jatekosok.size();i++){
							
							if(jatekosok.get(i).getPontszam()!=maxPont){
								
								jatekosok.get(i).BuntetoPontotKap(jatekosok.get(i).getPontszam());
							
							}
							
						}
						
					}
					
					switch(jatekosok.size()){ //jatekosok büntetõpontjának beírása
					
						case 7: hetedikJBpont.setText(Integer.toString(jatekosok.get(6).getBuntetoPont()));
						case 6: hatodikJBpont.setText(Integer.toString(jatekosok.get(5).getBuntetoPont()));
						case 5: otodikJBpont.setText(Integer.toString(jatekosok.get(4).getBuntetoPont()));
						case 4: negyedikJBpont.setText(Integer.toString(jatekosok.get(3).getBuntetoPont()));
						case 3: harmadikJBpont.setText(Integer.toString(jatekosok.get(2).getBuntetoPont()));
						case 2: masodikJBpont.setText(Integer.toString(jatekosok.get(1).getBuntetoPont()));
						case 1: elsoJBpont.setText(Integer.toString(jatekosok.get(0).getBuntetoPont()));
						
					}
					
					
					//Meg kell nézni vége van-e a játéknak
					for(int i=0;i<jatekosok.size();i++){
						
						if(jatekosok.get(i).getBuntetoPont()>=63){
							
							vege_e=true;
							
						}
						
					}
					String nyertesek="NYERTES(EK): ";
					if(vege_e){ //Ekkor van vége a játéknak!
						boolean nyertek_e=false;

						for(int i=0;i<jatekosok.size();i++){// Meg kell nézni hogy nyertek-e egyáltalán
							
							if(jatekosok.get(i).getBuntetoPont()<63){// ekkor lehet csak nyertes
								
								nyertek_e=true;
								int minpont=jatekosok.get(i).getBuntetoPont(); // Ha nyertek akkor mennyi a legkevesebb büntetõ pont
								for(int j=i+1;j<jatekosok.size();j++){
									
									if(jatekosok.get(j).getBuntetoPont()<minpont){
										
										minpont=jatekosok.get(j).getBuntetoPont();
										
									}
									
								}
								
								for(int j=i;j<jatekosok.size();j++){
									
									if(jatekosok.get(j).getBuntetoPont()==minpont){
										
										nyertesek+=Integer.toString(j+1)+". ";
										
									}
									
								}
								nyertesek+="jatekos(ok).";
								break;
							}
							
						}
						
						if(nyertek_e){
							
							uzenet1.setText(nyertesek);
							
						}
						else{
							
							uzenet1.setText("A játékot mindenki elvesztette!!");
							
						}
						
						uzenet2.setText("Új játék kezdéséhez ki kell üríteni az asztalt!");
						lapotKer.setEnabled(false);
						lapotKer.setBackground(new Color(105, 105, 105));
						passzol.setEnabled(false);
						passzol.setBackground(new Color(105, 105, 105));
						kiurit.setEnabled(true);
						kiurit.setBackground(new Color(100, 149, 237));
						befejez.setEnabled(false);
						befejez.setBackground(new Color(105, 105, 105));
						
						return;
					}
				
					uzenet1.setText(Integer.toString(aktualisPont)+" pontod van. "+"A körnek vége!!");
					uzenet2.setText("A játék folytatásáshoz ürítsd ki az asztalt!");
					
					lapotKer.setEnabled(false);
					lapotKer.setBackground(new Color(105, 105, 105));
					passzol.setEnabled(false);
					passzol.setBackground(new Color(105, 105, 105));
					kiurit.setEnabled(true);
					kiurit.setBackground(new Color(100, 149, 237));
					
					
					return;
				}
				aktualisJatekos++;
				passzol.setEnabled(false);
				passzol.setBackground(new Color(105, 105, 105));
				lapotKer.setEnabled(false);
				lapotKer.setBackground(new Color(105, 105, 105));
				kiurit.setEnabled(true);
				kiurit.setBackground(new Color(100, 149, 237));
				
			}
			
			else{
				
				uzenet1.setText("Kérsz még lapot?");
				uzenet2.setText("Jelenleg "+jatekosok.get(aktualisJatekos-1).getNev()+" játszik.");
				switch(aktualisJatekos){
				
				case 1: elsoJ.setBackground(new Color(0,255,51));break;
				case 2: masodikJ.setBackground(new Color(0,255,51));break;
				case 3: harmadikJ.setBackground(new Color(0,255,51));break;
				case 4: negyedikJ.setBackground(new Color(0,255,51));break;
				case 5: otodikJ.setBackground(new Color(0,255,51));break;
				case 6: hatodikJ.setBackground(new Color(0,255,51));break;
				case 7: hetedikJ.setBackground(new Color(0,255,51));break;
				
			}
			}
		
		}
	}
	
	public class Kiurites implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
	
			aktualisPont=0;
			aktualisMezo=1;
			
			elsoKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			masodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			harmadikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			negyedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			otodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			hatodikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			hetedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			nyolcadikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			kilencedikKartya.setIcon(new ImageIcon("blackJackH.jpg"));
			
			if(korVege){

				
				pakli.clear();
				korVege=false;
				aktualisJatekos=1;
				
				lapotKer.setEnabled(true);
				lapotKer.setBackground(new Color(100, 149, 237));
				passzol.setEnabled(true);
				passzol.setBackground(new Color(100, 149, 237));
				
				uzenet1.setText("Kérsz még lapot?");
				uzenet2.setText("Az asztal kiürítve! Jelenleg "+jatekosok.get(aktualisJatekos-1).getNev()+" játszik.");
				switch(aktualisJatekos){
				
				case 1: elsoJ.setBackground(new Color(0,255,51));break;
				case 2: masodikJ.setBackground(new Color(0,255,51));break;
				case 3: harmadikJ.setBackground(new Color(0,255,51));break;
				case 4: negyedikJ.setBackground(new Color(0,255,51));break;
				case 5: otodikJ.setBackground(new Color(0,255,51));break;
				case 6: hatodikJ.setBackground(new Color(0,255,51));break;
				case 7: hetedikJ.setBackground(new Color(0,255,51));break;
				
			}
				
				if(vege_e){
					
					
					vege_e=false;
					korVege=false;
					korokSzama=1;
					kezdes.setEnabled(true);
					kezdes.setBackground(new Color(100, 149, 237));
					lapotKer.setEnabled(false);
					lapotKer.setBackground(new Color(105, 105, 105));
					passzol.setEnabled(false);
					passzol.setBackground(new Color(105, 105, 105));
					befejez.setEnabled(false);
					befejez.setBackground(new Color(105, 105, 105));
					kiurit.setEnabled(false);
					kiurit.setBackground(new Color(105, 105, 105));
					uzenet1.setText("Az asztal kiürítve!");
					uzenet2.setText("Új játékot lehet kezdeni!");
					hanyadikKor.setText("Még nem kezdõdött el a játék!");
					jatekosSzam.setEnabled(true);
					jatekosSzam.setBackground(new Color(100, 149, 237));
					
					
					switch(jatekosok.size()){ //jatékosok adatainak törlése
					
						case 7: {
						
								hetedikJ.setText("");
								hetedikB.setText("");
								hetedikJBpont.setText("");
								hetedikAk.setText("");
								hetedikAkpont.setText("");
								hetedikJ.setEnabled(false);
					
								}
							
						case 6: {
						
								hatodikJ.setText("");
								hatodikB.setText("");
								hatodikJBpont.setText("");
								hatodikAk.setText("");
								hatodikAkpont.setText("");
								hatodikJ.setEnabled(false);
					
								}
							
						case 5: {
						
								otodikJ.setText("");
								otodikB.setText("");
								otodikJBpont.setText("");
								otodikAk.setText("");
								otodikAkpont.setText("");
								otodikJ.setEnabled(false);
					
								}
							
						case 4: {
					
								negyedikJ.setText("");
								negyedikB.setText("");
								negyedikJBpont.setText("");
								negyedikAk.setText("");
								negyedikAkpont.setText("");
								negyedikJ.setEnabled(false);
				
								}
							
						case 3: {
					
								harmadikJ.setText("");
								harmadikB.setText("");
								harmadikJBpont.setText("");
								harmadikAk.setText("");
								harmadikAkpont.setText("");
								harmadikJ.setEnabled(false);
				
								}
							
						case 2: {
						
								masodikJ.setText("");
								masodikB.setText("");
								masodikJBpont.setText("");
								masodikAk.setText("");
								masodikAkpont.setText("");
								masodikJ.setEnabled(false);
					
								}
								
						case 1: {
							
								elsoJ.setText("");
								elsoB.setText("");
								elsoJBpont.setText("");
								elsoAk.setText("");
								elsoAkpont.setText("");
								elsoJ.setEnabled(false);
							
								}
						
					}
				
					jatekosok.clear();
					return;
					
				}
				
				switch(jatekosok.size()){ //jatekosok büntetõpontjának beírása
				
					case 7: hetedikAkpont.setText("0");
					case 6: hatodikAkpont.setText("0");
					case 5: otodikAkpont.setText("0");
					case 4: negyedikAkpont.setText("0");
					case 3: harmadikAkpont.setText("0");
					case 2: masodikAkpont.setText("0");
					case 1: elsoAkpont.setText("0");
				
				}
				
				for(int i=0;i<jatekosok.size();i++){
					
					jatekosok.get(i).getKartyak().clear();
					
				}
				
				PaklitCsinal();
				
				paklitKever(pakli);
				korokSzama++;
				hanyadikKor.setText("Jelenleg ez a(z) "+korokSzama+". kör.");
				kiurit.setEnabled(false);
				kiurit.setBackground(new Color(105, 105, 105));
				amigKisebbMint11();
				return;
			}
			
			else{ // ha csak a játékos körének van vége
				
				uzenet2.setText("Jelenleg "+jatekosok.get(aktualisJatekos-1).getNev()+" játszik.");
				switch(aktualisJatekos){
				
				case 1: elsoJ.setBackground(new Color(0,255,51));break;
				case 2: masodikJ.setBackground(new Color(0,255,51));break;
				case 3: harmadikJ.setBackground(new Color(0,255,51));break;
				case 4: negyedikJ.setBackground(new Color(0,255,51));break;
				case 5: otodikJ.setBackground(new Color(0,255,51));break;
				case 6: hatodikJ.setBackground(new Color(0,255,51));break;
				case 7: hetedikJ.setBackground(new Color(0,255,51));break;
				
			}
				uzenet1.setText("Kérsz még lapot?");
				amigKisebbMint11();
				kiurit.setEnabled(false);
				kiurit.setBackground(new Color(105, 105, 105));
				lapotKer.setEnabled(true);
				lapotKer.setBackground(new Color(100, 149, 237));
				passzol.setEnabled(true);
				passzol.setBackground(new Color(100, 149, 237));
				
			}
			
		}
	}
	
	public class Passz implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			jatekosok.get(aktualisJatekos-1).paklitKap();
			if(aktualisJatekos==jatekosok.size()){ // Ekkor vége a körnek!
				boolean vanE21=false;
				korVege=true;
				
				for(int i=0;i<jatekosok.size();i++){
					
					if(jatekosok.get(i).getPontszam()==21){
						
						vanE21=true;
						break;
					
					}
					
				}
				
				if(vanE21){
					
					for(int i=0;i<jatekosok.size();i++){
						
						if(jatekosok.get(i).getPontszam()!=21){
							
							jatekosok.get(i).BuntetoPontotKap(jatekosok.get(i).getPontszam());
						
						}
						
					}
					
				}
				else{
					
					int maxPont=0;
					
					for(int i=0;i<jatekosok.size();i++){
						
						if(jatekosok.get(i).getPontszam()<21 && jatekosok.get(i).getPontszam()>maxPont){
							
							maxPont=jatekosok.get(i).getPontszam();
						
						}
						
					}
					
					for(int i=0;i<jatekosok.size();i++){
						
						if(jatekosok.get(i).getPontszam()!=maxPont){
							
							jatekosok.get(i).BuntetoPontotKap(jatekosok.get(i).getPontszam());
						
						}
						
					}
					
				}
				
				//Meg kell nézni vége van-e a játéknak
				for(int i=0;i<jatekosok.size();i++){
					
					if(jatekosok.get(i).getBuntetoPont()>=63){
						
						vege_e=true;
						
					}
					
				}
				String nyertesek="NYERTES(EK): ";
				if(vege_e){ //Ekkor van vége a játéknak!
					boolean nyertek_e=false;

					for(int i=0;i<jatekosok.size();i++){// Meg kell nézni hogy nyertek-e egyáltalán
						
						if(jatekosok.get(i).getBuntetoPont()<63){// ekkor lehet csak nyertes
							
							nyertek_e=true;
							int minpont=jatekosok.get(i).getBuntetoPont(); // Ha nyertek akkor mennyi a legkevesebb büntetõ pont
							for(int j=i+1;j<jatekosok.size();j++){
								
								if(jatekosok.get(j).getBuntetoPont()<minpont){
									
									minpont=jatekosok.get(j).getBuntetoPont();
									
								}
								
							}
							
							for(int j=i;j<jatekosok.size();j++){
								
								if(jatekosok.get(j).getBuntetoPont()==minpont){
									
									nyertesek+=Integer.toString(j+1)+". ";
									
								}
								
							}
							nyertesek+="jatekos(ok).";
							break;
						}
						
					}
					
					if(nyertek_e){
						
						uzenet1.setText(nyertesek);
						
					}
					else{
						
						uzenet1.setText("A játékot mindenki elvesztette!!");
						
					}
					
					uzenet2.setText("Új játék kezdéséhez ki kell üríteni az asztalt!");
					lapotKer.setEnabled(false);
					lapotKer.setBackground(new Color(105, 105, 105));
					passzol.setEnabled(false);
					passzol.setBackground(new Color(105, 105, 105));
					kiurit.setEnabled(true);
					kiurit.setBackground(new Color(100, 149, 237));
					befejez.setEnabled(false);
					befejez.setBackground(new Color(105, 105, 105));
					jatekosSzam.setBackground(new Color(100, 149, 237));
					
					switch(jatekosok.size()){ //jatekosok büntetõpontjának beírása
						
						case 7: hetedikJBpont.setText(Integer.toString(jatekosok.get(6).getBuntetoPont()));
						case 6: hatodikJBpont.setText(Integer.toString(jatekosok.get(5).getBuntetoPont()));
						case 5: otodikJBpont.setText(Integer.toString(jatekosok.get(4).getBuntetoPont()));
						case 4: negyedikJBpont.setText(Integer.toString(jatekosok.get(3).getBuntetoPont()));
						case 3: harmadikJBpont.setText(Integer.toString(jatekosok.get(2).getBuntetoPont()));
						case 2: masodikJBpont.setText(Integer.toString(jatekosok.get(1).getBuntetoPont()));
						case 1: elsoJBpont.setText(Integer.toString(jatekosok.get(0).getBuntetoPont()));break;
						
					}
					
					return;
				}
			
				uzenet1.setText(Integer.toString(aktualisPont)+" pontod van. "+"A körnek vége!!");
				uzenet2.setText("A játék folytatásáshoz ürítsd ki az asztalt!");
				
				lapotKer.setEnabled(false);
				lapotKer.setBackground(new Color(105, 105, 105));
				passzol.setEnabled(false);
				passzol.setBackground(new Color(105, 105, 105));
				kiurit.setEnabled(true);
				kiurit.setBackground(new Color(100, 149, 237));
				
				switch(jatekosok.size()){ //jatekosok büntetõpontjának beírása
				
					case 7: hetedikJBpont.setText(Integer.toString(jatekosok.get(6).getBuntetoPont()));
					case 6: hatodikJBpont.setText(Integer.toString(jatekosok.get(5).getBuntetoPont()));
					case 5: otodikJBpont.setText(Integer.toString(jatekosok.get(4).getBuntetoPont()));
					case 4: negyedikJBpont.setText(Integer.toString(jatekosok.get(3).getBuntetoPont()));
					case 3: harmadikJBpont.setText(Integer.toString(jatekosok.get(2).getBuntetoPont()));
					case 2: masodikJBpont.setText(Integer.toString(jatekosok.get(1).getBuntetoPont()));
					case 1: elsoJBpont.setText(Integer.toString(jatekosok.get(0).getBuntetoPont()));break;
					
				}
				
				return;
			}
			
			uzenet1.setText("A körödet passzoltad!!");
			uzenet2.setText("A játék foltatásához ki kell üríteni az asztalt!!");
			aktualisJatekos++;
			lapotKer.setEnabled(false);
			lapotKer.setBackground(new Color(105, 105, 105));
			passzol.setEnabled(false);
			passzol.setBackground(new Color(105, 105, 105));
			kiurit.setEnabled(true);
			kiurit.setBackground(new Color(100, 149, 237));
			
		}
	}
	
	public class FeleVitel implements MouseListener{

		public void mouseClicked(MouseEvent arg0) {


		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
			if(arg0.getComponent().equals(kezdes) && kezdes.getBackground().equals(new Color(100, 149, 237))){
				kezdes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(0, 255, 255)));
			}
			
			else if(arg0.getComponent().equals(befejez) && befejez.getBackground().equals(new Color(100, 149, 237))){
				befejez.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(0, 255, 255)));
			}
			
			else if(arg0.getComponent().equals(lapotKer) && lapotKer.getBackground().equals(new Color(100, 149, 237))){
				lapotKer.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(0, 255, 255)));
			}
			
			else if(arg0.getComponent().equals(passzol) && passzol.getBackground().equals(new Color(100, 149, 237))){
				passzol.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(0, 255, 255)));
			}
			
			else if(arg0.getComponent().equals(kiurit) && kiurit.getBackground().equals(new Color(100, 149, 237))){
				kiurit.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(0, 255, 255)));
			}
			
			else if(arg0.getComponent().equals(elsoJ) &&  !elsoJ.getText().equals("")){
				elsoJ.setForeground(new Color(102, 51, 0));
			}
			
			else if(arg0.getComponent().equals(masodikJ) && !masodikJ.getText().equals("")){
				masodikJ.setForeground(new Color(102, 51, 0));
			}
			
			else if(arg0.getComponent().equals(harmadikJ) && !harmadikJ.getText().equals("")){
				harmadikJ.setForeground(new Color(102, 51, 0));
			}
			
			else if(arg0.getComponent().equals(negyedikJ) && !negyedikJ.getText().equals("")){
				negyedikJ.setForeground(new Color(102, 51, 0));
			}
			
			else if(arg0.getComponent().equals(otodikJ) && !otodikJ.getText().equals("")){
				otodikJ.setForeground(new Color(102, 51, 0));
			}
			
			else if(arg0.getComponent().equals(hatodikJ) && !hatodikJ.getText().equals("")){
				hatodikJ.setForeground(new Color(102, 51, 0));
			}
			
			else if(arg0.getComponent().equals(hetedikJ) && !hetedikJ.getText().equals("")){
				hetedikJ.setForeground(new Color(102, 51, 0));
			}
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
			if(arg0.getComponent().equals(kezdes)){
				kezdes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
			}
			
			else if(arg0.getComponent().equals(befejez)){
				befejez.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
			}
			
			else if(arg0.getComponent().equals(lapotKer)){
				lapotKer.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
			}
			
			else if(arg0.getComponent().equals(passzol)){
				passzol.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
			}
			
			else if(arg0.getComponent().equals(kiurit)){
				kiurit.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 255)));
			}
			
			else if(arg0.getComponent().equals(elsoJ)){
				
				elsoJ.setForeground(new Color(0, 0, 0));
			}
			
			else if(arg0.getComponent().equals(masodikJ)){
				
				masodikJ.setForeground(new Color(0, 0, 0));
			}
			
			else if(arg0.getComponent().equals(harmadikJ)){
				
				harmadikJ.setForeground(new Color(0, 0, 0));
			}
			
			else if(arg0.getComponent().equals(negyedikJ)){
				
				negyedikJ.setForeground(new Color(0, 0, 0));
			}
			
			else if(arg0.getComponent().equals(otodikJ)){
				
				otodikJ.setForeground(new Color(0, 0, 0));
			}
			
			else if(arg0.getComponent().equals(hatodikJ)){
				
				hatodikJ.setForeground(new Color(0, 0, 0));
			}
			
			else if(arg0.getComponent().equals(hetedikJ)){
				
				hetedikJ.setForeground(new Color(0, 0, 0));
			}
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}
	
	public class Megnez implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			if(e.getActionCommand().equals(elsoJ.getActionCommand())){
				
				
				if(jatekosok.get(0).Korszam()==0){
					uzenet2.setText("Még 1 kört se fejeztél be!");
					return;
				}
				elsoJ.setForeground(new Color(0,0,0));
			}
			else if(e.getActionCommand().equals(masodikJ.getActionCommand())){
				
				
				if(jatekosok.get(1).Korszam()==0){
					uzenet2.setText("Még 1 kört se fejeztél be!");
					return;
				}
				masodikJ.setForeground(new Color(0,0,0));
			}
			else if(e.getActionCommand().equals(harmadikJ.getActionCommand())){
				
				
				if(jatekosok.get(2).Korszam()==0){
					uzenet2.setText("Még 1 kört se fejeztél be!");
					return;
				}
				harmadikJ.setForeground(new Color(0,0,0));
			}
			else if(e.getActionCommand().equals(negyedikJ.getActionCommand())){
				
				
				if(jatekosok.get(3).Korszam()==0){
					uzenet2.setText("Még 1 kört se fejeztél be!");
					return;
				}
				negyedikJ.setForeground(new Color(0,0,0));
			}
			else if(e.getActionCommand().equals(otodikJ.getActionCommand())){
				
				
				if(jatekosok.get(4).Korszam()==0){
					uzenet2.setText("Még 1 kört se fejeztél be!");
					return;
				}
				otodikJ.setForeground(new Color(0,0,0));
			}
			else if(e.getActionCommand().equals(hatodikJ.getActionCommand())){
				
				
				if(jatekosok.get(5).Korszam()==0){
					uzenet2.setText("Még 1 kört se fejeztél be!");
					return;
				}
				hatodikJ.setForeground(new Color(0,0,0));
			}
			else if(e.getActionCommand().equals(hetedikJ.getActionCommand())){
				
				
				if(jatekosok.get(6).Korszam()==0){
					uzenet2.setText("Még 1 kört se fejeztél be!");
					return;
				}
				hetedikJ.setForeground(new Color(0,0,0));
			}
			Kisasztal asztal= new Kisasztal(e.getActionCommand(), jatekosok);
			asztal.setModal(true);
			asztal.setVisible(true);
			
			
		}
		
		
	}
	
	
}
