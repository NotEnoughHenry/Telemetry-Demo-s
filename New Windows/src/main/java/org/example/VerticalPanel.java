package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VerticalPanel extends JPanel {

    static VerticalPanel instance = new VerticalPanel();
    private JButton buttonA;
    private JButton buttonB;

    private VerticalPanel() {
        super();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(10, 10, 10, 10));

        buttonA = new JButton("Button A");
        buttonA.addActionListener(event -> {
            System.out.println(buttonA.getText());
        });

        buttonB = new JButton("Button B");
        buttonB.addActionListener(event -> {
            System.out.println(buttonB.getText());
        });

        add(buttonA);
        add(buttonB);
    }
}
