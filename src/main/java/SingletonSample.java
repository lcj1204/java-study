public class SingletonSample {

    private static SingletonSample singletonSample = new SingletonSample();

    public SingletonSample getInstance() {

        return singletonSample;
    }
}