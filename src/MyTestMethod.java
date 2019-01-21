public class MyTestMethod<T extends Number implements Comparable {

    public int calcNum(T[] arr, T maxElem){
        // Посчитать количество элементов, больше или равных maxElem
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getClass()==Integer.class) {
                if (Integer.compare(arr[i].intValue(), maxElem.intValue())>=0) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
