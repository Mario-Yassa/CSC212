package ProgrammingChallenges.ProgrammingChallenge7;

import painter.SPainter;
import javax.swing.*;

    public class MonsterTester {

        public MonsterTester(){
            Monster monster = new Monster("Monster",200,15);
            SPainter painter = new SPainter("Monster",1000,1000);
            monster.paint(painter);
            System.out.println(monster);
        }
        
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                 public void run() {
                     new MonsterTester();
                 }
           });
        }
   }