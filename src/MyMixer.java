import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {         //  V chem logika etogo kontructora&
        this.array = array;
    }

    T[] mix() {
        Random rnd = new Random();
        for (int i = 1; i < array.length; i++) {
            int j = rnd.nextInt(i);
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array ;
    }

}
