package JE_annotation;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Init {

    boolean suppressException() default false;

}
