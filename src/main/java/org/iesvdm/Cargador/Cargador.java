package org.iesvdm.Cargador;

import org.iesvdm.Persona.Directivo;
import org.iesvdm.Persona.Empleado;
import org.iesvdm.Main;
import org.iesvdm.anotaciones.EmpleadoAnotaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cargador {

    public static List<EmpleadoAnotaciones> listaEmpleadoAnotaciones(){
        return Arrays.asList(Main.class.getAnnotationsByType(EmpleadoAnotaciones.class));
    }

    public static List<Empleado> cargadorDeContexto () {
        List <Empleado> empresas = new ArrayList<Empleado>();

        for (EmpleadoAnotaciones emp : listaEmpleadoAnotaciones()) {
            switch (emp.tipo()) {
                case DIRECTIVO:
                    Directivo directivo = new Directivo();
                    directivo.setNombre(emp.nombre());
                    directivo.setApellido(emp.apellido());
                    directivo.setDireccion(emp.direccion());
                    directivo.setDni(emp.dni());
                    directivo.setTelefono(emp.telefono());
                    directivo.setCodDespacho(emp.codDespacho());
                    empresas.add(directivo);
                    break;
            }
        }
        return empresas;
    }
}
