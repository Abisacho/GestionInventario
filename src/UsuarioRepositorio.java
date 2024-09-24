import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {
    private static List<Usuario> usuarios = new ArrayList<>();

    // Crear un nuevo usuario
    public void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Modificar un usuario existente
    public void modificarUsuario(int id, Usuario usuarioActualizado) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setNombre(usuarioActualizado.getNombre());
                usuario.setApellido(usuarioActualizado.getApellido());
                usuario.setTipoDocumento(usuarioActualizado.getTipoDocumento());
                usuario.setNumeroDocumento(usuarioActualizado.getNumeroDocumento());
                usuario.setDireccion(usuarioActualizado.getDireccion());
                usuario.setTelefono(usuarioActualizado.getTelefono());
                usuario.setActivo(usuarioActualizado.isActivo());
                break;
            }
        }
    }

    // Obtener un usuario por su número de documento
    public Usuario obtenerUsuarioPorDocumento(String numeroDocumento) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroDocumento().equals(numeroDocumento)) {
                return usuario;
            }
        }
        return null; // Si no encuentra el usuario
    }

    // Obtener la lista de usuarios
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    // Activar un usuario
    public void activarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setActivo(true);
                break;
            }
        }
    }

    // Inactivar un usuario
    public void inactivarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setActivo(false);
                break;
            }
        }
    }
}
