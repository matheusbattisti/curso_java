package secao26;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // em tempo de execução
@Target(ElementType.METHOD) // aplicada em métodos
@interface Executar {
    int vezes() default 1;
}
