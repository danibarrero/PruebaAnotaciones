package org.iesvdm;

import org.iesvdm.Cargador.Cargador;
import org.iesvdm.Persona.Empresa;
import org.iesvdm.anotaciones.EmpleadoAnotaciones;
import org.iesvdm.enumerado.TipoEnum;

@EmpleadoAnotaciones(
        nombre = "Dani",
        apellido = "Barrero",
        direccion = "Casa1",
        dni = "44444",
        telefono = 545,
        tipo = TipoEnum.DIRECTIVO,
        codDespacho = 1
)

@EmpleadoAnotaciones(
        nombre = "Cesar",
        apellido = "Sin Tarea",
        direccion = "Casa2",
        dni = "5555",
        telefono = 545,
        tipo = TipoEnum.OFICIAL,
        codTaller = 2,
        categoria = "No"
)

@EmpleadoAnotaciones(
        nombre = "Jose",
        apellido = "Si",
        direccion = "Sin",
        dni = "5555",
        telefono = 545,
        tipo = TipoEnum.OPERARIO,
        codTaller = 5
)

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.setNombre("Empresa1");
        empresa.setEmpleados(Cargador.cargadorDeContexto());

        System.out.println(empresa);
    }

}
