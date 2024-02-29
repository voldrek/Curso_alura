import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private JFrame frame;
    private JTextField display;

    private double primeiroNumero = 0;
    private String operacaoPendente = "";
    private boolean novoNumero = true;

    public Calculadora() {
        criarGUI();
    }

    private void criarGUI() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

        display = new JTextField(10);
        display.setEditable(false);
        painel.add(display, BorderLayout.NORTH);

        JPanel teclado = new JPanel();
        teclado.setLayout(new GridLayout(4, 4));

        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String txtBotao : botoes) {
            JButton botao = new JButton(txtBotao);
            botao.addActionListener(new BotaoClicado());
            teclado.add(botao);
        }

        painel.add(teclado, BorderLayout.CENTER);

        frame.getContentPane().add(painel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class BotaoClicado implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton botao = (JButton) e.getSource();
            String textoBotao = botao.getText();

            if (textoBotao.matches("[0-9]")) {
                if (novoNumero) {
                    display.setText(textoBotao);
                    novoNumero = false;
                } else {
                    display.setText(display.getText() + textoBotao);
                }
            } else if (textoBotao.equals(".")) {
                if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }
            } else if (textoBotao.equals("=")) {
                calcular();
                operacaoPendente = "";
            } else {
                if (!operacaoPendente.isEmpty()) {
                    calcular();
                }
                operacaoPendente = textoBotao;
                primeiroNumero = Double.parseDouble(display.getText());
                novoNumero = true;
            }
        }
    }

    private void calcular() {
        double segundoNumero = Double.parseDouble(display.getText());
        double resultado = 0;

        switch (operacaoPendente) {
            case "+":
                resultado = primeiroNumero + segundoNumero;
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
                break;
            case "/":
                if (segundoNumero != 0) {
                    resultado = primeiroNumero / segundoNumero;
                } else {
                    JOptionPane.showMessageDialog(frame, "Erro: Divisão por zero");
                }
                break;
        }

        display.setText(String.valueOf(resultado));
        novoNumero = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora());
    }
}
