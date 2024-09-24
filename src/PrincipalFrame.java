import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalFrame extends JFrame {

    public PrincipalFrame(String documento) {
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        Usuario usuario = usuarioServicio.usuarioRepositorio.obtenerUsuarioPorDocumento(documento);

        // Configuración de la ventana principal
        setTitle("Pantalla Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Bienvenida al usuario
        JLabel labelBienvenida = new JLabel("Bienvenido, " + usuario.getNombre() + " " + usuario.getApellido());
        JButton buttonCerrarSesion = new JButton("Cerrar Sesión");

        // Panel para organizar los componentes
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(labelBienvenida, BorderLayout.CENTER);
        panel.add(buttonCerrarSesion, BorderLayout.SOUTH);

        add(panel);

        // Acción para cerrar sesión
        buttonCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginFrame().setVisible(true); // Volver a la pantalla de login
                dispose(); // Cerrar la pantalla principal
            }
        });
    }
}
