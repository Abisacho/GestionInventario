public class UsuarioServicio {
    private UsuarioRepositorio usuarioRepositorio;

    // Constructor que inicializa el repositorio
    public UsuarioServicio() {
        this.usuarioRepositorio = new UsuarioRepositorio();
    }

    // Método para validar usuario (correo y contraseña)
    public boolean validarUsuario(String numeroDocumento, String telefono) {
        Usuario usuario = usuarioRepositorio.obtenerUsuarioPorDocumento(numeroDocumento);
        if (usuario != null && usuario.getTelefono().equals(telefono)) {
            return true; // El usuario y la contraseña coinciden
        }
        return false; // Si no coinciden
    }
}
