package ProgrammingChallenges.ProgrammingChallenge6;

import painter.SPainter;

import javax.swing.*;

public class MonsterHordTester {
    public MonsterHordTester() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of monsters: "));
        MonsterHorde mon = new MonsterHorde(num);
        SPainter painter = new SPainter("Monster",1800,1000);
        mon.paintHorde(painter);
        System.out.println(mon);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MonsterHordTester();
            }
        });
    }
}
