package jonathan;

import java.util.Arrays;

public class MySecondQueueList<T>{

    private  int defaultCapacity;
    private  int size = 0;
    private Object[] numbers = new Object[7];



    public Object adds(Object number) {
        grow(size+1);
        numbers[size] = number;
        return  ++size;
    }
    private void grow (int minCapacity) {
        int oldCapacity = size();
        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            numbers = Arrays.copyOf(numbers, newCapacity);
        }
    }


    public void remove (int number) {
          int array = size-number-1;
           if (array>0){
               System.arraycopy(numbers,number+1,numbers,number,array);
           }
           }


    @Override
    public String toString() {
        return Arrays.toString(numbers) +
                '}';
    }

    public int size() {
        return size;
    }

    public Object get(int index){
        return numbers[index];
    }




}
