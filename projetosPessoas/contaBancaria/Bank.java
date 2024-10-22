package com.estudosJava.projetosPessoas.contaBancaria;

import javax.swing.*; // Importa as classes necessárias para a interface gráfica (Swing)
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Importa classes para capturar eventos de botões

public class Bank {

    // Constantes que definem tamanhos de janela, campos de texto e botões
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 350;
    private static final int FIELD_WIDTH = 165;
    private static final int FIELD_HEIGHT = 25;
    private static final int BUTTON_WIDTH = 150;
    private static final int BUTTON_HEIGHT = 25;

    // Declaração de objetos para o banco, campos de texto e botões
    private Banco banco1;
    private Banco banco2;
    private JTextField saldoField;
    private JTextField valorDepositoField;
    private JTextField valorSaqueField;
    private JTextField valorTransferenciaField;
    private JComboBox<String> contaDestinoComboBox;
    private JTextField saldoConta1Field;
    private JTextField saldoConta2Field;

    // Construtor da classe - inicializa os bancos e cria a interface gráfica
    public BancoInterface() {
        inicializarBancos();
        criarInterface();
    }

    // Método responsável por inicializar as contas bancárias
    private void inicializarBancos() {
        banco1 = new Banco("Banco1", 123456789L, 1001, 0, false); // Cria conta 1
        banco2 = new Banco("Banco2", 987654321L, 1002, 0, false); // Cria conta 2
    }

    // Método que configura a interface gráfica (janela)
    private void criarInterface() {
        JFrame frame = new JFrame("Sistema Bancário"); // Cria a janela principal
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT); // Define o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
        frame.setResizable(false); // Impede que a janela seja redimensionada
        frame.setLocationRelativeTo(null); // Centraliza a janela no meio da tela
        
        JPanel panel = new JPanel(); // Cria um painel para os componentes
        frame.add(panel); // Adiciona o painel à janela
        placeComponents(panel); // Organiza os componentes no painel

        frame.setVisible(true); // Torna a janela visível
    }

    // Método que posiciona os componentes dentro do painel
    private void placeComponents(JPanel panel) {
        panel.setLayout(null); // Define layout nulo para posicionamento absoluto dos componentes

        criarCamposSaldo(panel); // Adiciona o campo de saldo
        criarBotoesOperacoes(panel); // Adiciona os botões de operação (sacar, depositar, etc.)
        criarCamposOperacoes(panel); // Adiciona os campos de entrada para valores de saque e depósito
        criarBotoesAdicionais(panel); // Adiciona botões extras (abrir/fechar conta)
    }

    // Cria o campo que exibe o saldo da conta
    private void criarCamposSaldo(JPanel panel) {
        JLabel saldoLabel = new JLabel("Saldo:"); // Cria o rótulo "Saldo"
        saldoLabel.setBounds(20, 30, 200, FIELD_HEIGHT); // Define a posição e tamanho do rótulo
        panel.add(saldoLabel); // Adiciona o rótulo ao painel

        saldoField = new JTextField(30); // Cria o campo de texto para mostrar o saldo
        saldoField.setBounds(100, 30, FIELD_WIDTH, FIELD_HEIGHT); // Define o tamanho e posição
        saldoField.setEditable(false); // O campo não é editável (somente leitura)
        panel.add(saldoField); // Adiciona o campo ao painel
    }

    // Método que cria os botões para as operações de conta
    private void criarBotoesOperacoes(JPanel panel) {
        // Cria os botões com seus respectivos textos e posições
        JButton abrirContaButton = criarBotao("Abrir Conta", 10, 60, panel);
        JButton verificarSaldoButton = criarBotao("Verificar Saldo", 170, 60, panel);
        JButton depositarButton = criarBotao("Depositar", 10, 100, panel);
        JButton sacarButton = criarBotao("Sacar", 10, 140, panel);
        JButton transferirButton = criarBotao("Transferir", 10, 180, panel);

        // Associa ações a cada botão
        configurarAcoesBotoes(abrirContaButton, verificarSaldoButton, depositarButton, sacarButton, transferirButton);
    }

    // Método auxiliar para criar botões
    private JButton criarBotao(String texto, int x, int y, JPanel panel) {
        JButton botao = new JButton(texto); // Cria o botão com o texto especificado
        botao.setBounds(x, y, BUTTON_WIDTH, BUTTON_HEIGHT); // Define a posição e tamanho do botão
        panel.add(botao); // Adiciona o botão ao painel
        return botao; // Retorna o botão criado
    }

    // Cria os campos de texto para entrada de valores de depósito, saque e transferência
    private void criarCamposOperacoes(JPanel panel) {
        valorDepositoField = criarCampoTexto(170, 100, panel); // Campo de depósito
        valorSaqueField = criarCampoTexto(170, 140, panel); // Campo de saque
        valorTransferenciaField = criarCampoTexto(170, 180, panel); // Campo de transferência

        contaDestinoComboBox = new JComboBox<>(new String[]{"Conta 1", "Conta 2"}); // Seleção de conta destino
        contaDestinoComboBox.setBounds(340, 180, 100, FIELD_HEIGHT); // Posição da caixa de seleção
        panel.add(contaDestinoComboBox); // Adiciona a caixa de seleção ao painel
    }

    // Método auxiliar para criar campos de texto
    private JTextField criarCampoTexto(int x, int y, JPanel panel) {
        JTextField campo = new JTextField(20); // Cria o campo de texto
        campo.setBounds(x, y, FIELD_WIDTH, FIELD_HEIGHT); // Define a posição e o tamanho
        panel.add(campo); // Adiciona o campo ao painel
        return campo; // Retorna o campo criado
    }

    // Cria botões adicionais para fechar e abrir segunda conta
    private void criarBotoesAdicionais(JPanel panel) {
        JButton fecharContaButton = criarBotao("Fechar Conta", 10, 220, panel); // Botão fechar conta
        JButton abrirSegundaContaButton = criarBotao("Abrir Segunda Conta", 170, 220, panel); // Botão abrir segunda conta

        configurarAcoesAdicionais(fecharContaButton, abrirSegundaContaButton); // Associa ações aos botões
    }

    // Associa ações aos botões principais
    private void configurarAcoesBotoes(JButton abrirContaButton, JButton verificarSaldoButton,
                                       JButton depositarButton, JButton sacarButton, JButton transferirButton) {
        abrirContaButton.addActionListener(e -> abrirConta()); // Ação ao clicar em "Abrir Conta"
        verificarSaldoButton.addActionListener(e -> verificarSaldo()); // Ação ao clicar em "Verificar Saldo"
        depositarButton.addActionListener(e -> depositar()); // Ação ao clicar em "Depositar"
        sacarButton.addActionListener(e -> sacar()); // Ação ao clicar em "Sacar"
        transferirButton.addActionListener(e -> transferir()); // Ação ao clicar em "Transferir"
    }

    // Associa ações aos botões adicionais
    private void configurarAcoesAdicionais(JButton fecharContaButton, JButton abrirSegundaContaButton) {
        fecharContaButton.addActionListener(e -> fecharConta()); // Ação ao clicar em "Fechar Conta"
        abrirSegundaContaButton.addActionListener(e -> abrirSegundaConta()); // Ação ao clicar em "Abrir Segunda Conta"
    }

    // Método que abre uma conta (apenas se ainda estiver fechada) :/
    private void abrirConta() {
        if (!banco1.isStatusDaConta()) { // Verifica se a conta 1 está fechada
            banco1.abrirConta(); // Abre a conta
            JOptionPane.showMessageDialog(null, "Conta 1 aberta com sucesso!"); // Mensagem de sucesso
            atualizarSaldoNaInterface(); // Atualiza o saldo mostrado na interface
        } else {
            JOptionPane.showMessageDialog(null, "Conta 1 já está aberta!"); // Mensagem de erro caso já esteja aberta
        }
    }

    // Método para verificar o saldo atual das contas
    private void verificarSaldo() {
        atualizarSaldoNaInterface(); // Atualiza o saldo exibido na interface
    }

    // Método para realizar um depósito na conta 1
    private void depositar() {
        try {
            double valor = Double.parseDouble(valorDepositoField.getText()); // Tenta converter o valor do campo
            if (banco1.isStatusDaConta()) { // Verifica se a conta está aberta
                banco1.depositar(valor); // Realiza o depósito
                atualizarSaldoNaInterface(); // Atualiza o saldo na interface
                JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!"); // Confirma o depósito
            } else {
                JOptionPane.showMessageDialog(null, "Conta 1 não está aberta!"); // Erro caso a conta esteja fechada
            }
            valorDepositoField.setText(""); // Limpa o campo de texto após o depósito
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para depósito."); // Mensagem de erro caso o valor não seja um número
        }
    }

    // Método para realizar um saque da conta 1
    private void sacar() {
        try {
            double valor = Double.parseDouble(valorSaqueField.getText()); // Tenta converter o valor
            if (banco1.isStatusDaConta()) { // Verifica se a conta está aberta
                if (banco1.sacar(valor)) { // Tenta realizar o saque
                    atualizarSaldoNaInterface(); // Atualiza o saldo
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!"); // Confirma o saque
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque!"); // Erro de saldo insuficiente
                }
            } else {
                JOptionPane.showMessageDialog(null, "Conta 1 não está aberta!"); // Erro caso a conta esteja fechada
            }
            valorSaqueField.setText(""); // Limpa o campo de texto após o saque
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para saque."); // Erro de formato inválido
        }
    }

    // Método para realizar uma transferência entre contas
    private void transferir() {
        try {
            double valor = Double.parseDouble(valorTransferenciaField.getText()); // Tenta converter o valor
            String contaDestino = (String) contaDestinoComboBox.getSelectedItem(); // Seleciona a conta de destino
            if ("Conta 1".equals(contaDestino) && banco2.isStatusDaConta()) { // Se a conta destino for Conta 1
                banco2.transferir(valor, banco1); // Transfere de conta 2 para conta 1
            } else if ("Conta 2".equals(contaDestino) && banco1.isStatusDaConta()) { // Se a conta destino for Conta 2
                banco1.transferir(valor, banco2); // Transfere de conta 1 para conta 2
            } else {
                JOptionPane.showMessageDialog(null, "Conta de origem ou destino não está aberta!"); // Erro caso uma das contas esteja fechada
                return;
            }
            atualizarSaldoNaInterface(); // Atualiza o saldo
            valorTransferenciaField.setText(""); // Limpa o campo de texto
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!\nValor: " + valor); // Confirma a transferência
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para transferência."); // Erro caso o valor não seja um número
        }
    }

    // Método para fechar uma das contas
    private void fecharConta() {
        if (banco1.isStatusDaConta()) { // Verifica se a conta 1 está aberta
            banco1.fecharConta(); // Fecha a conta
            JOptionPane.showMessageDialog(null, "Conta 1 fechada com sucesso!"); // Mensagem de sucesso
        } else if (banco2.isStatusDaConta()) { // Verifica se a conta 2 está aberta
            banco2.fecharConta(); // Fecha a conta
            JOptionPane.showMessageDialog(null, "Conta 2 fechada com sucesso!"); // Mensagem de sucesso
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma conta está aberta!"); // Mensagem de erro se nenhuma conta estiver aberta
        }
        atualizarSaldoNaInterface(); // Atualiza o saldo mostrado na interface
    }

    // Método para abrir a segunda conta, caso esteja fechada
    private void abrirSegundaConta() {
        if (!banco2.isStatusDaConta()) { // Verifica se a conta 2 está fechada
            banco2.abrirConta(); // Abre a conta
            JOptionPane.showMessageDialog(null, "Conta 2 aberta com sucesso!"); // Mensagem de sucesso
            atualizarSaldoNaInterface(); // Atualiza o saldo na interface
        } else {
            JOptionPane.showMessageDialog(null, "Conta 2 já está aberta!"); // Mensagem de erro caso já esteja aberta
        }
    }

    // Método que atualiza o saldo das contas na interface
    private void atualizarSaldoNaInterface() {
        // Formata e atualiza o saldo das contas no campo de texto
        saldoField.setText(String.format("Conta 1: %.2f | Conta 2: %.2f", banco1.getSaldo(), banco2.getSaldo()));
    }

    // Método principal para iniciar o programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(BancoInterface::new); // Executa a interface gráfica de forma segura em outra thread
    }
}