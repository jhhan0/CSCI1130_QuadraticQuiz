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

import java.util.Random;

public class QuadraticQuiz {

    public static void main(String[] args) {
        PanelDisplay PD = new PanelDisplay();
        QuadraticQuestion firstTrial = new QuadraticQuestion("Trial 1", -2, 2);
        String firstStr = firstTrial.getUserInputAnswer("Trial 1");
        while (firstStr == null){
            firstStr = firstTrial.getUserInputAnswer("Trial 1");
        }
        QuadraticQuestion secondTrial = new QuadraticQuestion("Trial 2", -1);
        String secondStr = secondTrial.getUserInputAnswer("Trial 2");
        while (secondStr == null){
            secondStr = secondTrial.getUserInputAnswer("Trial 2");
        }
        QuadraticQuestion thirdTrial = new QuadraticQuestion("Trial 3", 5, 0);
        String thirdStr = thirdTrial.getUserInputAnswer("Trial 3");
        while (thirdStr == null){
            thirdStr = thirdTrial.getUserInputAnswer("Trial 3");
        }
        
        int i;
        
        for (i = 1; i <= 6; i++){
            String sequentialTitle = String.format("Q.%d", i);
            Random roots, r, r1, r2;
            roots = new Random();
            int randomNumOfRoots = roots.nextInt(3);
            
            if (randomNumOfRoots == 0){
                QuadraticQuestion zeroRootRQ = new QuadraticQuestion(sequentialTitle);
                String zeroRootStr = zeroRootRQ.getUserInputAnswer(sequentialTitle);
                while (zeroRootStr == null){
                    zeroRootStr = zeroRootRQ.getUserInputAnswer(sequentialTitle);
                }
                boolean zeroRootB = zeroRootRQ.checkAnswer(zeroRootStr);
                if (zeroRootB == true){
                    int a = PD.getScore();
                    a = a + 1;
                    PD.setScore(a);
                }
            }
            else if (randomNumOfRoots == 1){
                r = new Random();
                int randomR = r.nextInt(11) - 5;
                QuadraticQuestion oneRootRQ = new QuadraticQuestion(sequentialTitle, randomR);
                String oneRootStr = oneRootRQ.getUserInputAnswer(sequentialTitle);
                while (oneRootStr == null){
                    oneRootStr = oneRootRQ.getUserInputAnswer(sequentialTitle);
                }
                boolean oneRootB = oneRootRQ.checkAnswer(oneRootStr);
                if (oneRootB == true){
                    int a = PD.getScore();
                    a = a + 1;
                    PD.setScore(a);
                }
            }
            else if (randomNumOfRoots == 2){
                r1 = new Random();
                r2 = r1;
                int randomR1 = r1.nextInt(11) - 5;
                int randomR2 = r2.nextInt(11) - 5;
                QuadraticQuestion twoRootsRQ = new QuadraticQuestion(sequentialTitle, randomR1, randomR2);
                String twoRootsStr = twoRootsRQ.getUserInputAnswer(sequentialTitle);
                while (twoRootsStr == null){
                    twoRootsStr = twoRootsRQ.getUserInputAnswer(sequentialTitle);
                }
                boolean twoRootsB = twoRootsRQ.checkAnswer(twoRootsStr);
                if (twoRootsB == true){
                    int a = PD.getScore();
                    a = a + 1;
                    PD.setScore(a);
                }
            }
        }
        System.out.println("The End");
    }   
}
