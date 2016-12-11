package com.sd.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiceRollerGUI {
    static JFrame frameOne = new JFrame("Dice Roller");
    public static void main(String[] args) {
        frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DiceGUI GUI = new DiceGUI();
        frameOne.add(GUI);

        Button b = new Button("Roll");
        b.addActionListener(new ButtonAction());
        frameOne.add(b);
        frameOne.setLayout(new GridLayout(1, 2));
        frameOne.setSize(400, 250);
        frameOne.setResizable(false);
        frameOne.setVisible(true);
    }
}

class ButtonAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        DiceRollerGUI.frameOne.setVisible(false);
        JFrame frameTwo = new JFrame("Dice Roller");
        frameTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTwo.setSize(400, 250);
        frameTwo.setResizable(false);
        ResultGUI resultGUI = new ResultGUI();
        frameTwo.add(resultGUI);
        frameTwo.setVisible(true);
    }
}
