package Coding_Exam_A;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA {
	public static void main(String[] args) {
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */
		String robots = JOptionPane.showInputDialog("How many robots");
		String color = JOptionPane.showInputDialog("What color");
		String sides = JOptionPane.showInputDialog("How many sides");
		int r = Integer.parseInt(robots);
		int s = Integer.parseInt(sides);
		Robot[] w = new Robot[r];
		Thread q = new Thread(q)->{
				for(int i =0;i<w.length;i++)
				{
					Robot ro = new Robot();
					w[i] = ro;
					w[i].setX(i+(i*w[i].getX()));
					w[i].setY(i+(i*w[i].getY()));
					w[i].penDown();
					w[i].setAngle(360/s);
					w[i].move(10);
				};
		
				
	
	
		{};}}}
	
	

