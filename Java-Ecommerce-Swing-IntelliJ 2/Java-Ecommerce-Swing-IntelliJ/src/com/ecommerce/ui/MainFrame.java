package com.ecommerce.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("E-Commerce App");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel heading = new JLabel("welcome to e-commerce app", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel buttonPanel = new JPanel();
        JButton productsBtn = new JButton("view products");
        JButton cartBtn = new JButton("view cart");
        buttonPanel.add(productsBtn);
        buttonPanel.add(cartBtn);

        mainPanel.add(heading, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
