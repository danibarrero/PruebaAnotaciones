package org.iesvdm.Persona;

public class Oficial extends Operario {
    private String categoria;

    public Oficial(String nombre, String apellido, String direccion, String dni, int telefono, int codTaller, String categoria) {
        super(nombre, apellido, direccion, dni, telefono, codTaller);
        this.categoria = categoria;
    }

    public Oficial() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "categoria='" + categoria + '\'' +
                '}' + super.toString();
    }
}
