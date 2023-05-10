package ChapterSeven;

public class EvenNumber {
    public static void main(String[] args) {
        int [] arrays = {2,8,8,1,5,2,1,3,6,7};

        int count = 0;
        for(int array:arrays) {
            boolean countIsOdd = count %2!=0;
            if (countIsOdd) System.out.println(array);
            count++;
        }


//        for (int i = 0; i < arrays.length;i++) {
//
//           boolean indexIsEven = i%2==0;
//           if(indexIsEven)continue;
//           System.out.println(arrays[i]+"");

        }
    }

