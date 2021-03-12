package HwAnnotationsFromFile;

import java.time.Instant;

public class Runner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<MyService> service = MyService.class;
        inspectService(service);

    }

    private static void inspectService(Class service) throws IllegalAccessException, InstantiationException {
        boolean isAnnotated = service.isAnnotationPresent(MyAnnotation.class);
        if (isAnnotated) {
            MyService service1 = (MyService) service.newInstance();
            service1.setArea("finance");
            service1.setName("Cool Service");
            service1.MyServiceInfo();
        } else {
            System.out.println("Class doesn't contain annotations");
        }
    }
}







