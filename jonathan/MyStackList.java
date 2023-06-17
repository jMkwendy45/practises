package jonathan;

public class MyStackList {
        private final MyArrayLists<Object> arrayList = new MyArrayLists<>();

        public void push(int index){
            arrayList.adds(index);
        }

        public Object peek(){
            return arrayList.get(arrayList.size()-1);
        }

//        public Object pop(){
//            return   arrayList.remove();
//        }
        public int search(Object element){
            int index = (int) arrayList.getTheIndex((Integer) element);
            if (index>=0){
                return arrayList.size()-index;
            }
            return 0;
        }
        public boolean isEmpty(){
            return arrayList.size() == 0;
        }
        public int getSize(){
            return arrayList.size();
        }
    }

