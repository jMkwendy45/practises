//package ChapterSeven;
//
//public class ArrayPtROUGH {
//
//
//    private static int size = 0;
//    private static int count = 0;
//    private static int defaultCapacity;
//    private static Object[] numbers = new Object[defaultCapacity];
//    private Object[] elementData;
//
//
//    private static  void add(Object number){
//        public  static  void adds(int number) {
//            numbers[count] = number;
//            count+=1;
//
//        }
//
//        public  void remove (int number){
//            int array = size-number-1;
//            if (array>0){
//                System.arraycopy(numbers,number+1,numbers,number,array);
//            }
//
//        }
//


//private void grow (int minCapacity) {
//        int oldCapacity = size();
//        if (minCapacity > oldCapacity) {
//        int newCapacity = oldCapacity + (oldCapacity >> 1);
//        if (newCapacity < minCapacity) {
//        newCapacity = minCapacity;
//        }
//        numbers = Arrays.copyOf(numbers, newCapacity);
//        }
//        }




//private Object[] grow(int minCapacity) {
//        int oldCapacity = elementData.length;
//        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
//        int newCapacity = ArraysSupport.newLength(oldCapacity,
//        minCapacity - oldCapacity, /* minimum growth */
//        oldCapacity >> 1           /* preferred growth */);
//        return elementData = Arrays.copyOf(elementData, newCapacity);
//        } else {
//        return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
//        }
//        }








//private void grow(int minCapacity) {
//        int oldCapacity = queue.length;
//        // Double size if small; else grow by 50%
//        int newCapacity = ArraysSupport.newLength(oldCapacity,
//        minCapacity - oldCapacity, /* minimum growth */
//        oldCapacity < 64 ? oldCapacity + 2 : oldCapacity >> 1
//        /* preferred growth */);
//        queue = Arrays.copyOf(queue, newCapacity);
//        }











////        public void addNumber(Object element) {
//            final int s;
//            Object[] elementData;
//            if ((s = size) == (elementData = this.elementData).length)
//                elementData = grow() ;
//            System.arraycopy(elementData, index,
//                    elementData, index + 1, s - index);
//            elementData[index] = element;
//            size = s + 1;
//        }
//
//        private Object[] grow() {
//            return new int[][]{new int[]{size + 1}};
//        }
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
