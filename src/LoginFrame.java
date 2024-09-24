import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private UsuarioServicio usuarioServicio;

    public LoginFrame() {
        usuarioServicio = new UsuarioServicio();

        // Configuramos la ventana de login
        setTitle("Login de Usuario");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear los componentes de la interfaz
        JLabel labelDocumento = new JLabel("Número de Documento:");
        JLabel labelTelefono = new JLabel("Teléfono:");
        JTextField textDocumento = new JTextField(15);
        JPasswordField textTelefono = new JPasswordField(15); // Campo de contraseña
        JButton buttonLogin = new JButton("Ingresar");

        // Panel para organizar los componentes
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(labelDocumento);
        panel.add(textDocumento);
        panel.add(labelTelefono);
        panel.add(textTelefono);
        panel.add(new JLabel()); // Espacio vacío
        panel.add(buttonLogin);

        // Agregar el panel a la ventana
        add(panel);

        // Acción al presionar el botón de login
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String documento = textDocumento.getText();
                String telefono = new String(textTelefono.getPassword());

                // Validar el usuario
                if (usuarioServicio.validarUsuario(documento, telefono)) {
                    JOptionPane.showMessageDialog(null, "Login exitoso");
                    // Mostrar la ventana principal
                    new PrincipalFrame(documento).setVisible(true);
                    dispose(); // Cerrar la ventana de login
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true); // Mostrar la ventana de login
            }
        });
    }
}
