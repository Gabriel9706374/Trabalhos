package view;

import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {

    boolean usuario_preenchido = false;
    boolean senha_preenchida = false;

    private javax.swing.JLabel titulo;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_senha;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JButton botao_acessar;

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        titulo = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JTextField();
        campo_senha = new javax.swing.JPasswordField();
        botao_acessar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setBackground(java.awt.Color.GRAY);

        titulo.setFont(new java.awt.Font("Arial", 1, 22));
        titulo.setForeground(java.awt.Color.WHITE);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Login");

        label_nome.setForeground(java.awt.Color.WHITE);
        label_nome.setText("Nome:");
        label_senha.setForeground(java.awt.Color.WHITE);
        label_senha.setText("Senha:");

        botao_acessar.setText("Acessar");
        botao_acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_acessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nome)
                            .addComponent(label_senha))
                        .addGap(15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90)
                        .addComponent(botao_acessar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_senha)
                    .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25)
                .addComponent(botao_acessar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void botao_acessarActionPerformed(java.awt.event.ActionEvent evt) {
        if (campo_usuario.getText().isEmpty()) {
            usuario_preenchido = false;
        } else {
            usuario_preenchido = true;
        }

        if (campo_senha.getPassword().length == 0) {
            senha_preenchida = false;
        } else {
            senha_preenchida = true;
        }

        if (usuario_preenchido && senha_preenchida) {
            JOptionPane.showMessageDialog(this, "Login com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Falha no login!");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
}
