package com.estudosJava.projetosPessoas.pokeproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PokedexApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pokédex");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);

            // Criação dos dados de exemplo
            ArrayList<Pokemon> pokemons = new ArrayList<>();
            pokemons.add(new Pokemon("Pikachu", "Elétrico", "Um Pokémon elétrico de cor amarela.", "resources/images/pikachu.png"));
            pokemons.add(new Pokemon("Bulbasaur", "Grama/Veneno", "Um Pokémon com uma planta nas costas.", "resources/images/bulbasaur.png"));

            // Criação do painel e componentes
            JPanel panel = new JPanel(new BorderLayout());

            JList<Pokemon> pokemonList = new JList<>(pokemons.toArray(new Pokemon[0]));
            pokemonList.setCellRenderer(new PokemonRenderer());
            panel.add(new JScrollPane(pokemonList), BorderLayout.WEST);

            JPanel detailsPanel = new JPanel(new BorderLayout());
            JTextArea detailsArea = new JTextArea();
            detailsArea.setEditable(false);
            detailsPanel.add(new JScrollPane(detailsArea), BorderLayout.CENTER);

            JLabel imageLabel = new JLabel();
            detailsPanel.add(imageLabel, BorderLayout.EAST);

            pokemonList.addListSelectionListener(e -> {
                Pokemon selectedPokemon = pokemonList.getSelectedValue();
                if (selectedPokemon != null) {
                    detailsArea.setText("Nome: " + selectedPokemon.getName() + "\nTipo: " + selectedPokemon.getType() + "\nDescrição: " + selectedPokemon.getDescription());
                    // Carregar e exibir a imagem
                    try {
                        Image image = ImageIO.read(new File(selectedPokemon.getImagePath()));
                        image = image.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                        imageLabel.setIcon(new ImageIcon(image));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            });

            panel.add(detailsPanel, BorderLayout.CENTER);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}

// Classe para representar Pokémon
class Pokemon {
    private String name;
    private String type;
    private String description;
    private String imagePath;

    public Pokemon(String name, String type, String description, String imagePath) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Renderizador de células para a lista
class PokemonRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (c instanceof JLabel) {
            JLabel label = (JLabel) c;
            label.setText(((Pokemon) value).getName());
        }
        return c;
    }
}
