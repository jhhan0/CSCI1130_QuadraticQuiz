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

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * PanelDisplay for keeping and displaying score and hint
 *
 * @author Michael, YPChui
 */
public class PanelDisplay {

  final private JFrame window;
//    private PieDrawing hintFigure;
  final private JLabel scoreLabel;
  private int score;

  /**
   * Constructor of PanelDisplay
   */
  public PanelDisplay() {
    score = 0;

    window = new JFrame("Score Board");

    JLabel scoreTitle = new JLabel("<html><h1 style='color:red;'>Score</h1></html>");
    scoreTitle.setBounds(20, 0, 150, 100);
    window.getContentPane().add(scoreTitle);

    scoreLabel = new JLabel("<html><h2 style='color:blue;'>&nbsp;&nbsp;&nbsp;&nbsp;" + score + " / 6" + "</h2></html>");
    scoreLabel.setBounds(20, 0, 100, 100);
    window.getContentPane().add(scoreLabel);

    window.setSize(250, 200);
    window.setLocation(50, 20);
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  /** 
   * get score displayed in panel
   * @return an integer of score
   */
  public int getScore() {
    return score;
  }

  /** 
   * set score to be displayed in panel
   * @param newScore an integer of score to be set
   */
  public void setScore(int newScore) {
    //System.out.println(this.getClass().getSimpleName() + " instance method setScore(" + newScore + ")");
    score = newScore;
    scoreLabel.setText("<html><h2 style='color:blue;'>&nbsp;&nbsp;&nbsp;&nbsp;" + +score + " / 6" + "</h2></html>");
  }

}
