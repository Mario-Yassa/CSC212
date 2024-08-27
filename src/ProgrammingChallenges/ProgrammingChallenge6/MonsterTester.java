package ProgrammingChallenges.ProgrammingChallenge6;

import painter.SPainter;
import javax.swing.*;

public class MonsterTester {

    public MonsterTester(){
        Monster monster = new Monster();
        SPainter painter = new SPainter("Monster",1000,1000);
        monster.paint(painter);
        System.out.println(monster.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MonsterTester();
            }
        });
    }
}