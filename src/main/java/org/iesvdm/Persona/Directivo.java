package org.iesvdm.Persona;

public class Directivo extends Empleado {

    private int codDespacho;

    public Directivo(String nombre, String apellido, String direccion, String dni, int telefono, int codDespacho) {
        super(nombre, apellido, direccion, dni, telefono);
        this.codDespacho = codDespacho;
    }

    public Directivo() {
    }

    public int getCodDespacho() {
        return codDespacho;
    }

    public void setCodDespacho(int codDespacho) {
        this.codDespacho = codDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "codDespacho=" + codDespacho +
                '}' + super.toString();
    }
}
