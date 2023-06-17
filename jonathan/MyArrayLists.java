package jonathan;

import java.util.Arrays;

public class MyArrayLists<T>{
    private  int size = 0;
    private  int index = 0;
    private int count = 0;
    private  int defaultCapacity;
    private Object[] numbers;
    private Object[] elementDatas;
     public  MyArrayLists(){
        numbers = new Object[defaultCapacity];
        size = 0;
    }
    public Object adds(Object number) {
        grow(size+1);
        numbers[size] = number;
         return  ++size;
    }
    private void grow (int minCapacity) {
        int oldCapacity = size();
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            numbers = Arrays.copyOf(numbers, newCapacity);
        }
    }
    public Object get(int index){
         return numbers[index];
    }
    public void remove (int number) {
      numbers[number] = numbers[number+1];
      size--;

    }
    public int size() {
        return size;
    }
    public Object getTheIndex( int index){
        return numbers[index];
    }
   public boolean contains (Object elementDatas){
       for (int i = 0; i <numbers.length; i++) {
           if (numbers[i].equals(elementDatas)){
               return  true;
           }
       }
       return  false;
    }
}