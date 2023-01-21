package Streams.ListToMap;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // применяется только к методу
@Retention(RetentionPolicy.RUNTIME) // сохраняется в момент исполнения
public @interface MethodDescription {
    String name() default  "Oleg's annotation sample";
}
