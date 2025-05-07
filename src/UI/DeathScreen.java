package UI;

import main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeathScreen extends JFrame {

    public DeathScreen() {
        setTitle("Game Over");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("You Died!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton restartButton = new JButton("Restart");
        JButton exitButton = new JButton("Exit");

        // Exit button closes the game
        exitButton.addActionListener(e -> System.exit(0));

        // Restart button starts a new game
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close DeathScreen
                Main.restartGame(); // Call static restart method
            }
        });

        buttonPanel.add(restartButton);
        buttonPanel.add(exitButton);

        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
