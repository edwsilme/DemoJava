package service;

import model.Contacto;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos = new ArrayList<>();

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto agregado exitosamente.");
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos.");
        } else {
            for (Contacto c : contactos) {
                System.out.println(c);
            }
        }
    }

    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado:\n" + c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el contacto.");
        }
    }

    public void eliminarContacto(String nombre) {
        Contacto eliminar = null;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                eliminar = c;
                break;
            }
        }
        if (eliminar != null) {
            contactos.remove(eliminar);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
}
