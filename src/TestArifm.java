import java.lang.annotation.*;


@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)

public @interface TestArifm {
    int a () default 5;
    int b () default 2;

}
