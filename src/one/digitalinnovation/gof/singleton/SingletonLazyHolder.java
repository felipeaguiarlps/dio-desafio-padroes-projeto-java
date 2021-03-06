package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {


    private static class InstanceHolder {
        private static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }
    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instacia;
    }
}
