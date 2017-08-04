import java.lang.reflect.Method;

public class Test {
    public static void testSum(Class<?> testClass) {
        try {
            Method[] methods = testClass.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(TestArifm.class)) {
                    TestArifm test = method.getAnnotation(TestArifm.class);
                    System.out.println(method.getName() + " -> a=" + test.a() + "; b=" + test.b());
                    method.invoke(null, test.a(), test.b());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}