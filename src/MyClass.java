
public class MyClass {

    @TestArifm
    public static void mult(int a, int b){
        System.out.println("a*b = " + (a*b));
    }

    @TestArifm
    public static void sum(int a, int b){
        System.out.println("a+b = " + (a+b));

    }

    @TestArifm (a = 10, b = 5)
    public static void diff(int a, int b){
        System.out.println("a-b = " + (a-b));

    }

    @TestArifm (a = 6, b = 2)
    public static void frac(int a, int b){
        System.out.println("a/b = " + (a/b));

    }
}

