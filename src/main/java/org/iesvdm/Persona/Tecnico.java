package org.iesvdm.Persona;

public class Tecnico extends Operario {
    private String perfil;

    public Tecnico(String nombre, String apellido, String direccion, String dni, int telefono, int codTaller, String perfil) {
        super(nombre, apellido, direccion, dni, telefono, codTaller);
        this.perfil = perfil;
    }

    public Tecnico() {
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                '}' + super.toString();
    }
}
