package org.iesvdm.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented

public @interface EmpeladoValores {
    EmpleadoAnotaciones[] value(); // Te permite guardar varios EmpleadoAnotaciones
}
