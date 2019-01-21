import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyTuple<String, Integer, Long> obj1 = new MyTuple<>("Ivanov", 5, 1000L);
	    MyTuple<Double,String,String> obj2 = new MyTuple<>(5.5, "aaa", "bbb");
        obj1.setA("hello");
        obj2.setC("qerer");

        MyMixer<String> m = new MyMixer<>(new String[]{"Ivanov", "Petrov", "Sidorov"});
        String[] arr = m.mix();
        System.out.println(Arrays.toString(arr));
    }
}
