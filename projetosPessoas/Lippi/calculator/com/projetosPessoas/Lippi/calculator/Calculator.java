package com.estudosJava.projetosPessoas.Lippi.calculator.com.projetosPessoas.Lippi.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame screen1 = new JFrame("My first screen");
        screen1.setSize(600, 400);
        screen1.setLayout(new FlowLayout());
        screen1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Calculadora");
        JTextField numero1 = new JTextField(10);
        JTextField numero2 = new JTextField(10);
        JButton calcularSoma = new JButton("+");
        JButton calcularSub = new JButton("-");
        JButton calcularMulti = new JButton("*");
        JButton calcularDiv = new JButton("/");


        screen1.add(title);
        screen1.add(numero1);
        screen1.add(numero2);
        screen1.add(calcularSoma);
        screen1.add(calcularSub);
        screen1.add(calcularMulti);
        screen1.add(calcularDiv);

        JLabel resultadoLabel = new JLabel("Resultado");
        screen1.add(resultadoLabel);


        calcularSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numero1.getText());
                    int num2 = Integer.parseInt(numero2.getText());

                    int resultado = num1 + num2;

                    resultadoLabel.setText("Resultado: " + resultado);
                    System.out.println(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(screen1, "Por favor poem a parada direito ai mano pfv");
                }
            }
        });

        calcularSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numero1.getText());
                    int num2 = Integer.parseInt(numero2.getText());

                    int resultado = num1 - num2;

                    resultadoLabel.setText("Resultado: " + resultado);
                    System.out.println(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(screen1, "Por favor poem a parada direito ai mano pfv");
                }

            }
        });

        calcularMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numero1.getText());
                    int num2 = Integer.parseInt(numero2.getText());

                    int resultado = num1 * num2;

                    resultadoLabel.setText("Resultado: " + resultado);
                    System.out.println(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(screen1, "Por favor poem a parada direito ai mano pfv");
                }

            }
        });
        calcularDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numero1.getText());
                    int num2 = Integer.parseInt(numero2.getText());

                    int resultado = num1 / num2;

                    resultadoLabel.setText("Resultado: " + resultado);
                    System.out.println(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(screen1, "Por favor poem a parada direito ai mano pfv");
                }

            }
        });

        screen1.setVisible(true);
    }
}