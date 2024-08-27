package ProgrammingChallenges.ProgrammingChallenge6;

import painter.SPainter;

import javax.swing.*;
import java.util.ArrayList;

public class MonsterHorde {
    private ArrayList<Monster> monsters = new ArrayList<>();

    public MonsterHorde(int num){
        Monster monster;
        for (int i = 0; i < num; i++) {
            String name = JOptionPane.showInputDialog("Enter the name of the monster: ");
            double size = Double.parseDouble(JOptionPane.showInputDialog("Enter the size of the Monster: "));
            int eyes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of eyes for the monster: "));
            monster = new Monster(name, size, eyes);
            monsters.add(monster);
        }
    }

    public String toString() {
        StringBuilder data = new StringBuilder();
        for(Monster m : monsters)
            data.append(m.toString()).append("\n");
        return data.toString();
    }

    public void paintHorde(SPainter painter){
        Monster m,m1;
        Monster m2 = monsters.get(monsters.size() - 1);
        painter.mlt(600);

        for(int i = 0 ; i < monsters.size() - 1 ; i++){
            m = monsters.get(i);
            m1 = monsters.get(i + 1);
            m.paint(painter);
            painter.mrt(m.space() + m1.space());
        }
        m2.paint(painter);
    }
}
