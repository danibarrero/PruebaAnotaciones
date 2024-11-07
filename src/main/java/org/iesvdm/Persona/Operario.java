package org.iesvdm.Persona;

public class Operario extends Empleado {
    private int codTaller;

    public Operario(String nombre, String apellido, String direccion, String dni, int telefono, int codTaller) {
        super(nombre, apellido, direccion, dni, telefono);
        this.codTaller = codTaller;
    }

    public Operario() {
    }

    public int getCodTaller() {
        return codTaller;
    }

    public void setCodTaller(int codTaller) {
        this.codTaller = codTaller;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "codTaller=" + codTaller +
                '}' + super.toString();
    }
}
