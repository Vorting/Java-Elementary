package JE_annotation;

import java.security.Provider;

@Init
@Service()
public class LazyService {
    String name = "Very lazy not working service";

    public void lazyInit() {
        System.out.println("running lazyInit method");
    }
}
