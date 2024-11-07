package org.iesvdm.anotaciones;

import org.iesvdm.enumerado.TipoEnum;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(EmpeladoValores.class) // Te permite que haya más de un empleado

public @interface EmpleadoAnotaciones {
    String nombre();
    String apellido();
    String direccion();
    String dni();
    int telefono();
    TipoEnum tipo();
    int codDespacho() default 0;
    int codTaller() default 0;
    String perfil() default "";
    String categoria() default "";
}
