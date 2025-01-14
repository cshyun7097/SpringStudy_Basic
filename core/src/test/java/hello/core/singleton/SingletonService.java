package hello.core.singleton;

public class SingletonService {

    private static final SingletonService intance = new SingletonService();

    public static SingletonService getIntance() {
        return intance;
    }

    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 호출!");
    }
}
