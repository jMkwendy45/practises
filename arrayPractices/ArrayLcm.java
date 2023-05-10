package arrayPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLcm {
    public static void main(String[] args) {
        int number = 8;
//        System.out.println(lcmOfNumber(number));
////        System.out.println(Arrays.toString(lcmOfNumber(array)));

          }

      public static int[] lcmOfNumber(int number) {;
          List<Integer> numbers = new ArrayList<>();
          for (int index = 2; index <number; index++) {
                  while (number>0 && number%index ==0){
                      numbers.add(index);
                      number = number/index;
                  }
          }
          int[] arrayToReturn = new int[numbers.size()];
          for (int i = 0; i < arrayToReturn.length; i++) {
              arrayToReturn[i] = numbers.get(i);

          }
          return arrayToReturn;
    }
}


