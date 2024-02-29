package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {

    private JFrame frame;
    private JTextField campoUsuario;
    private JPasswordField campoSenha;

    public TelaLogin() {
        criarGUI();
    }

    private void criarGUI() {
        frame = new JFrame("Tela de Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel(new GridLayout(3, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel labelUsuario = new JLabel("Usuário:");
        campoUsuario = new JTextField(15);

        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField(15);

        JButton botaoLogin = new JButton("Login");
        botaoLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                // Aqui você pode adicionar lógica para verificar as credenciais
                // Por exemplo, comparar com dados armazenados em um banco de dados
                // Este é um exemplo simples, substitua com sua própria lógica
                if (usuario.equals("usuario") && senha.equals("senha")) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
                    // Aqui você pode abrir uma nova janela ou fazer ação desejada após login
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário ou senha inválidos!");
                }
            }
        });

        JButton botaoCadastro = new JButton("Cadastro");
        botaoCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode abrir a tela de cadastro ou fazer ação desejada para cadastro
                JOptionPane.showMessageDialog(frame, "Ir para tela de cadastro...");
            }
        });

        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(botaoLogin);
        painel.add(botaoCadastro);

        frame.getContentPane().add(painel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin());
    }
}
