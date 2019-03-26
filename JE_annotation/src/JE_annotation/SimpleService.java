package JE_annotation;

@Init()
@Service()
public class SimpleService {
    String name = "SuperSimpleService";

    public void initService() {
        System.out.println("running initService method");
    }
}
