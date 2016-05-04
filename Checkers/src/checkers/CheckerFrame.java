package checkers;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.*;

public class CheckerFrame extends JFrame implements ActionListener{
    JButton stB=new JButton("Start Game");
    JButton newFeaturesBtn = new JButton("New Features");
    JPanel gmP=new StartPanel();
  
    public CheckerFrame(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this); //changing the appearence of the frame
        }
        catch (Exception e) {
           //no need to handle exception as it only affect the appearence
        }
        setupGUI();
        new PlaySound("Checkers/src//sounds//Start.wav").start();
    }

    private void setupGUI() {
        getContentPane().setLayout(null);
        gmP.setBounds(0,0,508,401);//400,401
        //gmP.imageUpdate(ne, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)
        getContentPane().add(gmP);
        
        newFeaturesBtn.setBounds(21, 437, 111, 23);
        newFeaturesBtn.setFont(new Font("Times new roman",Font.PLAIN,12));
        newFeaturesBtn.addActionListener(this);
        getContentPane().add(newFeaturesBtn);
        stB.setHorizontalAlignment(SwingConstants.LEADING);
        stB.setIcon(new ImageIcon(getClass().getResource("/images/checkersicon.jpg")));
        stB.setBackground(Color.LIGHT_GRAY);
        stB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        stB.setBounds(154,420,200,60);
        stB.setFont(new Font("Times new roman",Font.BOLD,20));
        stB.addActionListener(this);
        stB.setFocusPainted(false);
        getContentPane().add(stB);

        this.setIconImage(new ImageIcon(getClass().getResource("/images/icon.jpg")).getImage());

        setSize(508,520);
        setLocation((int)getToolkit().getScreenSize().getWidth()/2-254,(int)getToolkit().getScreenSize().getHeight()/2-310);
        setResizable(false);
        setVisible(true);
        setTitle("Play Checkers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
    	
        if(e.getActionCommand().equalsIgnoreCase("Start Game")){
            ((JButton)e.getSource()).setText("New Game");
            new PlaySound("Checkers/src//sounds//button.wav").start();
            gmP=new Checkers();
            gmP.setBounds(0,0,508,401);
            this.setContentPane(gmP);
        }
        if (e.getSource() == newFeaturesBtn){
        	JFrame f = new JFrame("New Features");
        	f.setSize(600, 400);
        	JTextPane jtp = new JTextPane();
        	BufferedReader b = null;
			try {
				b = new BufferedReader(new FileReader(new File("Checkers/src//guidance//NewFeatures.txt")));
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
        	String str = "";
        	String text = "";
        	try {
        		while ((str = b.readLine()) != null){
        			text = text + "\n" + str;
        		}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	jtp.setSize(600,400);
        	
        	jtp.setText(text);
        	f.add(jtp);
        	f.setLocationRelativeTo(null);
        	f.setVisible(true);
        	jtp.setVisible(true);
        
        }
    }
}
