/*
public class Main {
    public static void main(String[] args) {
        // Inicializar el repositorio de usuarios
        UsuarioRepositorio repositorio = new UsuarioRepositorio();

        // Crear un nuevo usuario
        Usuario usuario1 = new Usuario(1, "Juan", "Pérez", "DNI", "12345678", "Calle Falsa 123", "555-1234", true);
        Usuario usuario2 = new Usuario(2, "María", "Gómez", "Pasaporte", "98765432", "Avenida Siempreviva 456", "555-5678", true);

        // Agregar usuarios al repositorio
        repositorio.crearUsuario(usuario1);
        repositorio.crearUsuario(usuario2);

        // Mostrar todos los usuarios
        System.out.println("Lista de usuarios registrados:");
        for (Usuario usuario : repositorio.obtenerUsuarios()) {
            System.out.println("ID: " + usuario.getId() + " - " + usuario.getNombre() + " " + usuario.getApellido());
        }

        // Buscar usuario por documento
        System.out.println("\nBuscando usuario por documento '12345678':");
        Usuario usuarioBuscado = repositorio.obtenerUsuarioPorDocumento("12345678");
        if (usuarioBuscado != null) {
            System.out.println("Usuario encontrado: " + usuarioBuscado.getNombre() + " " + usuarioBuscado.getApellido());
        } else {
            System.out.println("Usuario no encontrado.");
        }

        // Inactivar usuario
        System.out.println("\nInactivando usuario con ID 1...");
        repositorio.inactivarUsuario(1);

        // Mostrar el estado de los usuarios
        System.out.println("\nEstado de los usuarios después de la inactivación:");
        for (Usuario usuario : repositorio.obtenerUsuarios()) {
            System.out.println("ID: " + usuario.getId() + " - Activo: " + usuario.isActivo());
        }

        // Modificar un usuario
        System.out.println("\nModificando datos del usuario con ID 2...");
        Usuario usuarioModificado = new Usuario(2, "María", "López", "Pasaporte", "98765432", "Avenida Nueva 789", "555-9999", true);
        repositorio.modificarUsuario(2, usuarioModificado);

        // Mostrar los usuarios después de la modificación
        System.out.println("\nUsuarios después de la modificación:");
        for (Usuario usuario : repositorio.obtenerUsuarios()) {
            System.out.println("ID: " + usuario.getId() + " - Nombre: " + usuario.getNombre() + " " + usuario.getApellido() + " - Activo: " + usuario.isActivo());
        }
    }
}
*/

public class Main {
    public static void main(String[] args) {
        UsuarioRepositorio repositorio = new UsuarioRepositorio();

        // Crear un nuevo usuario
        Usuario usuario1 = new Usuario(1, "Juan", "Pérez", "DNI", "12345678", "Calle Falsa 123", "555-1234", true);
        repositorio.crearUsuario(usuario1);

        // Mostrar todos los usuarios
        for (Usuario usuario : repositorio.obtenerUsuarios()) {
            System.out.println(usuario.getNombre() + " " + usuario.getApellido());
        }

        // Inactivar usuario
        repositorio.inactivarUsuario(1);
    }
}

