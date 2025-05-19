import model.Contacto;
import service.Agenda;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n-- AGENDA DE CONTACTOS --");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpieza de buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    agenda.agregarContacto(new Contacto(nombre, tel, email));
                    break;
                case 2:
                    agenda.mostrarContactos();
                    break;
                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    agenda.buscarContacto(buscar);
                    break;
                case 4:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    agenda.eliminarContacto(eliminar);
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}
