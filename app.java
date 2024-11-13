import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class app extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    private String registeredEmail;
    private String registeredPassword;

    public app() {
        setTitle("Login dan Register");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel loginPanel = new JPanel(new BorderLayout());
        loginPanel.setBackground(Color.WHITE); 

        JLabel loginTitle = new JLabel("USER LOGIN", JLabel.CENTER);
        loginTitle.setOpaque(true);
        loginTitle.setBackground(new Color(255, 255, 255)); 
        loginTitle.setForeground(Color.BLACK);
        loginTitle.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel loginForm = new JPanel(new GridBagLayout());
        loginForm.setBackground(Color.WHITE); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

      
        JLabel lblLoginEmail = new JLabel("Email:");
        lblLoginEmail.setForeground(Color.BLACK); 
        JTextField txtLoginEmail = new JTextField();

        JLabel lblEmailError = new JLabel(" ");
        lblEmailError.setForeground(Color.RED);

        JLabel lblLoginPassword = new JLabel("Password:");
        lblLoginPassword.setForeground(Color.BLACK); 
        JPasswordField txtLoginPassword = new JPasswordField();

        JLabel lblPasswordError = new JLabel(" ");
        lblPasswordError.setForeground(Color.RED);

        JButton btnSubmitLogin = new JButton("LOGIN");
        btnSubmitLogin.setBackground(Color.GREEN); 
        btnSubmitLogin.setForeground(Color.BLACK); 

        gbc.gridx = 0;
        gbc.gridy = 0;
        loginForm.add(lblLoginEmail, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        loginForm.add(txtLoginEmail, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        loginForm.add(lblEmailError, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        loginForm.add(lblLoginPassword, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        loginForm.add(txtLoginPassword, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        loginForm.add(lblPasswordError, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        loginForm.add(btnSubmitLogin, gbc);

        JLabel switchToRegister = new JLabel("Don't Have an Account? Signup", JLabel.CENTER);
        switchToRegister.setForeground(Color.BLACK); 

        loginPanel.add(loginTitle, BorderLayout.NORTH);
        loginPanel.add(loginForm, BorderLayout.CENTER);
        loginPanel.add(switchToRegister, BorderLayout.SOUTH);

        JPanel registerPanel = new JPanel(new BorderLayout());
        registerPanel.setBackground(Color.WHITE); 

        JLabel registerTitle = new JLabel("CREATE YOUR ACCOUNT", JLabel.CENTER);
        registerTitle.setOpaque(true);
        registerTitle.setBackground(new Color(255, 255, 255)); 
        registerTitle.setForeground(Color.BLACK); 
        registerTitle.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel registerForm = new JPanel(new GridBagLayout());
        registerForm.setBackground(Color.WHITE); 
        
        JTextField txtName = new JTextField("Name");
        JLabel lblName = new JLabel("Name:");
        lblName.setForeground(Color.BLACK); 

  
        JTextField txtRegisterEmail = new JTextField("email address");
        JLabel lblRegisterEmail = new JLabel("Email:");
        lblRegisterEmail.setForeground(Color.BLACK); 

   
        JPasswordField txtRegisterPassword = new JPasswordField("password");
        JLabel lblRegisterPassword = new JLabel("Password:");
        lblRegisterPassword.setForeground(Color.BLACK); 

        JPasswordField txtConfirmPassword = new JPasswordField("confirm password");
        JLabel lblConfirmPassword = new JLabel("Confirm Password:");
        lblConfirmPassword.setForeground(Color.BLACK); 

      
        JButton btnSubmitRegister = new JButton("CREATE ACCOUNT");
        btnSubmitRegister.setBackground(Color.GREEN); 
        btnSubmitRegister.setForeground(Color.BLACK); 

        gbc.gridx = 0;
        gbc.gridy = 0;
        registerForm.add(lblName, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        registerForm.add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        registerForm.add(lblRegisterEmail, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        registerForm.add(txtRegisterEmail, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        registerForm.add(lblRegisterPassword, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        registerForm.add(txtRegisterPassword, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        registerForm.add(lblConfirmPassword, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        registerForm.add(txtConfirmPassword, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        registerForm.add(btnSubmitRegister, gbc);

        registerPanel.add(registerTitle, BorderLayout.NORTH);
        registerPanel.add(registerForm, BorderLayout.CENTER);

        JLabel switchToLogin = new JLabel("Already Have an Account? Login", JLabel.CENTER);
        switchToLogin.setForeground(Color.BLACK); 
        registerPanel.add(switchToLogin, BorderLayout.SOUTH);

        mainPanel.add(loginPanel, "Login");
        mainPanel.add(registerPanel, "Register");

        switchToRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(mainPanel, "Register");
            }
        });

        switchToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(mainPanel, "Login");
            }
        });

        btnSubmitLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = txtLoginEmail.getText();
                String password = new String(txtLoginPassword.getPassword());

                boolean valid = true;
                lblEmailError.setText(" ");
                lblPasswordError.setText(" ");

                if (email.isEmpty()) {
                    lblEmailError.setText("Email harus diisi");
                    valid = false;
                }

                if (password.isEmpty()) {
                    lblPasswordError.setText("Password harus diisi");
                    valid = false;
                }

                if (valid) {
                    if (email.equals(registeredEmail) && password.equals(registeredPassword)) {
                        JOptionPane.showMessageDialog(null, "Login Berhasil!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Email atau Password salah.");
                    }
                }
            }
        });

        btnSubmitRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registeredEmail = txtRegisterEmail.getText();
                registeredPassword = new String(txtRegisterPassword.getPassword());

                JOptionPane.showMessageDialog(null, "Registrasi Berhasil!");
                cardLayout.show(mainPanel, "Login");
            }
        });

        add(mainPanel);
        cardLayout.show(mainPanel, "Login");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            app app = new app();
            app.setVisible(true);
        });
    }
}
