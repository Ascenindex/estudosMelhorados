package com.estudosJava.projetosPessoas.morseProject;

import javax.swing.SwingUtilities;

          public class App {
              public static void main(String[] args) {
                  SwingUtilities.invokeLater(() -> new MorseCodeTranslateGUI().setVisible(true));
              }

              @Override
              public void run() {
                  new MorseCodeTranslateGUI().setVisible(true);
              }
          }
}
