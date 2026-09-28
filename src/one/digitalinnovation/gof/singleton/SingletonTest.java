package one.digitalinnovation.gof.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        SingletonLazy lazy2 = SingletonLazy.getInstancia();

        System.out.println("Singleton Lazy:");
        System.out.println(lazy1 == lazy2);

        SingletonEager eager1 = SingletonEager.getInstancia();
        SingletonEager eager2 = SingletonEager.getInstancia();

        System.out.println("Singleton Eager:");
        System.out.println(eager1 == eager2);

        SingletonLazyHolder holder1 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();

        System.out.println("Singleton Lazy Holder:");
        System.out.println(holder1 == holder2);
    }
}