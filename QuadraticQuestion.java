/**
 * CSCI1130 Assignment 3 Quadratic Quiz
 * Aim: 1. Practice defining classes, as well as creating and using objects.
 *      2. Practice random number generation.
 * 
 * Task: Generate a quiz question of a quadratic equation base on the given 
 *       integer real root(s), either two real roots, one single root, or no
 *       real roots.
 * 
 * I declare that the assignment here submitted is original
 * except for source material explicitly acknowledged,
 * and that the same or closely related material has not been
 * previously submitted for another course.
 * I also acknowledge that I am aware of University policy and 
 * regulations on honesty in academic work, and of the disciplinary 
 * guidelines and procedures applicable to breaches of such 
 * policy and regulations, as contained in the website.
 * 
 * University Guideline on Academic Honesty:
 *   http://www.cuhk.edu.hk/policy/academichonesty
 * Faculty of Engineering Guidelines to Academic Honesty:
 *   https://www.erg.cuhk.edu.hk/erg/AcademicHonesty
 * 
 * Student Name: HAN, Jihun
 * Student ID  : 1155128719
 * Date        : 1/11/2020
 */

package quadraticquiz;

import javax.swing.JOptionPane;
import java.util.Random;

public class QuadraticQuestion {
    //fields
    int numOfRoots, root1, root2, B, C;
    String strB = null;
    String strC = null;
    
    
    //class QuadraticQuestion Constructors: two roots, one root and no roots.
    public QuadraticQuestion(String title, int r1, int r2){
        numOfRoots = 2; 
        if ((r1 >= -5 && r1 <= 5) && (r2 >= -5 && r2 <= 5)){
            root1 = r1;
            root2 = r2;
        }
        else {
            root1 = 1;
            root2 = 2;
        }
        B = - (r1 + r2);
        C = r1 * r2;
        
        if (B == 0){
            strB = "";
        }
        else if (B == 1){
            strB = "+x";
        }
        else if (B == -1){
            strB = "-x";
        }
        else if (B < 0 && B != -1) {
            strB = B + "x";
        }
        else if (B > 0 && B != 0){
            strB = "+" + B + "x";
        }
        
        if (C == 0){
            strC = "";
        }
        else if (C < 0) {
            strC = C + " ";
        }
        else if (C > 0){
            strC = "+" + C + " ";
        }
        System.out.println("x^2" + strB + strC + "= 0, " + numOfRoots + " real roots: " + r1 + ", " + r2);
    }
    
    public QuadraticQuestion(String title, int r){
        numOfRoots = 1;
        root1 = root2 = r;  
        if (r >= -5 && r <= 5){
            root1 = root2 = r;
        }
        else {
            root1 = root2 = 1;
        }
        B = - (r + r);
        C = r * r;
        
        if (B == 0){
            strB = "";
        }
        else if (B == 1){
            strB = "+x";
        }
        else if (B == -1){
            strB = "-x";
        }
        else if (B < 0 && B != -1) {
            strB = B + "x";
        }
        else if (B > 0 && B != 0){
            strB = "+" + B + "x";
        }
        
        if (C == 0){
            strC = "";
        }
        else if (C < 0) {
            strC = C + " ";
        }
        else if (C > 0){
            strC = "+" + C + " ";
        }
        System.out.println("x^2" + strB + strC + "= 0, " + numOfRoots + " real roots: " + r);
    }
    
    public QuadraticQuestion(String title){
        numOfRoots = 0;
        Random num1, num2;
        num1 = new Random();
        num2 = new Random();
        B = 3;
        C = 1;
        while (((B * B) - (4 * C)) >= 0){
            B = num1.nextInt(21) - 10;
            C = num2.nextInt(50) + 1;
        }
  
        if (B == 0){
            strB = "";
        }
        else if (B == 1){
            strB = "+x";
        }
        else if (B == -1){
            strB = "-x";
        }
        else if (B < 0 && B != 1) {
            strB = B + "x";
        }
        else if (B > 0 && B != 0){
            strB = "+" + B + "x";
        }
        
        if (C == 0){
            strC = "";
        }
        else if (C < 0) {
            strC = C + " ";
        }
        else if (C > 0){
            strC = "+" + C + " ";
        }
        System.out.println("x^2" + strB + strC + "= 0, " + numOfRoots + " real roots.");
    }
    
    
    //method to get user input answer.
    public String getUserInputAnswer(String title){
        return JOptionPane.showInputDialog(null, title + ": x^2" + strB + strC + "= 0", "<type answer [0-2] here>");
    }
    
    
    //method to check whether the input answer is correct or not.
    public boolean checkAnswer(String a){
        int checkIntAnswer;
        checkIntAnswer = Integer.parseInt(a);
        return checkIntAnswer == numOfRoots;
    }
}
