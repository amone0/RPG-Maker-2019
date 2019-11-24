package com.amone.base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.amone.base.*;
import java.io.*;

@SuppressWarnings("unused")
public class Windows {
	public static void main(String args[])  
    {  
		JFrame mainWindow=new JFrame("RPG Maker 2019");
		JButton bbb000=new JButton("Создать новый проект");
		JButton bbb001=new JButton("Открыть проект");
		bbb000.setBounds(1,15,180,30);
		bbb000.setVisible(true);
		ActionListener b00=new AL001();
		ActionListener b01=new AL002();
		bbb000.addActionListener(b00);
		bbb001.addActionListener(b01);
		bbb001.setBounds(200,15,150,30);
		bbb001.setVisible(true);
		mainWindow.add(bbb000); mainWindow.add(bbb001);
		mainWindow.setLocation(800,540);
		mainWindow.setSize(367,90);
		mainWindow.setLayout(null);
		mainWindow.setVisible(true);
		mainWindow.setResizable(false);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
	public static void newProjWindow()
	{
		JFrame newProjWindow=new JFrame("Создать новый проект");
		JLabel newProjName=new JLabel("Название игры");
		JTextField newProjectName=new JTextField();
		JLabel newProjFolderName=new JLabel("Название папки проекта");
		JTextField newProjectFolderName=new JTextField();
		JLabel newProjPath=new JLabel("Путь проекта");
		JTextField newProjectPath=new JTextField();
		JLabel nPPwarning=new JLabel("В пути / необходимо повторять(например c://Users//)");
		JButton createNewProject=new JButton("Создать новый проект");
		createNewProject.setBounds(65,170,190,30);
		createNewProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String projectPath=newProjectPath.getText();
				String projFilePath=projectPath+"//game.ini";
				File ff=new File(projectPath);
				File fe=new File(projFilePath);
				if(!ff.exists()) {
					ff.mkdir();
					try {
						fe.createNewFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		newProjectPath.setBounds(1,112,300,25);
		newProjPath.setBounds(1,90,285,25);
		nPPwarning.setBounds(1,135,400,25);
		newProjectFolderName.setBounds(1,20,300,25);
		newProjFolderName.setBounds(1,5,190,100);
		newProjName.setBounds(1,-40,190,100);
		newProjectName.setBounds(1,67,300,25);
		newProjWindow.add(createNewProject);
		newProjWindow.add(newProjectPath);
		newProjWindow.add(newProjPath);
		newProjWindow.add(newProjName);
		newProjWindow.add(newProjectName);
		newProjWindow.add(newProjFolderName);
		newProjWindow.add(newProjectFolderName);
		newProjWindow.add(nPPwarning);
		newProjWindow.setLocation(800,540);
		newProjWindow.setSize(330,400);
		newProjWindow.setLayout(null);
		newProjWindow.setVisible(true);
		newProjWindow.setResizable(false);
		String PN=newProjectName.getText();
	}
	public static void openProjWindow() {
		
	}
   }  
