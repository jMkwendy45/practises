package jonathan;

import java.util.Arrays;

public class HugeInteger {

    private long[] arr;

    public HugeInteger(){
        arr=new long[40];
        Arrays.fill(arr, -1);
    }
    public void parse(String number) {
        for (int i = 0; i <number.length() ; i++) {
            char numbers = number.charAt(i);
            arr[i]=Character.getNumericValue(numbers);
        }
    }


    public HugeInteger subtract( HugeInteger secondNumber){
        var longerDigit =  getLongerInteger(this,secondNumber);
        HugeInteger firstNumber =  this;

        int currentIndexInFirstInteger  =    firstNumber.toString().length()-1;
        int currentIndexInSecondInteger =  secondNumber.toString().length()-1;



        int IndexOfTheLastDigitOfLongerInteger =  longerDigit.toString().length()-1;

        for (int index = IndexOfTheLastDigitOfLongerInteger; index >=0 ; index--) {


            currentIndexInFirstInteger = (int) getCurrentNumber(currentIndexInFirstInteger, this);
            currentIndexInSecondInteger  = (int) getCurrentNumber(currentIndexInFirstInteger,secondNumber);






        }


  return  null;
    }




  private  static   long subtractNumber( long borrowedNumber,long longerFirstNumber,long secondNumber) {

           if (longerFirstNumber < secondNumber) {
          return borrowedNumber + longerFirstNumber - secondNumber;
      } else {

          return  longerFirstNumber - secondNumber;
      }
  }







    @Override
    public String toString() {
        return getDigits();
    }

    private String getDigits(){
        String number="";
        for (long digit:this.arr) {
            if (digit!=-1)number+=digit;
        }
        return number;
    }
   public long[] getArrays(){
        return arr;
   }
//    }
//




    public HugeInteger add(HugeInteger second) {
        var longer = getLongerInteger(this, second);
        HugeInteger first = this;
        int currentIndexInFirstInteger=first.toString().length()-1;
        int currentIndexInSecondInteger = second.toString().length()-1;
        long currentDigitInFirst=0L;
        long currentDigitInSecond=0L;
        long remainder = 0l;
        /*
              8888888888
             +9999999999
             ------------
              18888888887
             ------------
             "78888888818"
             "81888888887"
         */

        StringBuilder builder = new StringBuilder();
        int IndexOfLastDigitOfLongerInteger = longer.toString().length()-1;
        for (int index = IndexOfLastDigitOfLongerInteger; index >=0 ; index--) {
            currentDigitInFirst=getCurrentNumber(currentIndexInFirstInteger, this);


            currentDigitInSecond=getCurrentNumber(currentIndexInSecondInteger, second);



            long currentSum = sumIntegers(remainder, currentDigitInFirst, currentDigitInSecond);
            long actual=0;
           if (index>0)actual=currentSum%10;
           else {
               StringBuilder builder1 = new StringBuilder();
               builder1.append(currentSum);
               currentSum=Long.parseLong(builder1.reverse().toString());
               actual = currentSum;
           }
            remainder=currentSum/10;
            builder.append(actual);

            if (currentIndexInFirstInteger>0)currentIndexInFirstInteger--;
            if (currentIndexInSecondInteger>0)currentIndexInSecondInteger--;
        }
        String result = builder.reverse().toString();
        HugeInteger sumOfIntegers = new HugeInteger();
        sumOfIntegers.parse(result);
        this.arr = sumOfIntegers.arr;
        return this;
    }

    private static long sumIntegers(long remainder, long currentDigitInFirst, long currentDigitInSecond) {
        return remainder+currentDigitInFirst+currentDigitInSecond;
    }

    private static long getCurrentNumber(int index, HugeInteger hugeInteger){
        char current =  hugeInteger.toString().charAt(index);
        return Long.parseLong(String.valueOf(current));
    }

    private static HugeInteger getLongerInteger(HugeInteger first, HugeInteger second){
        String secondNumber = second.toString();
        String firstNumber = first.toString();
        int lengthOfFirstNumber = firstNumber.length();
        int lengthOfSecondNumber = secondNumber.length();
        if (lengthOfFirstNumber > lengthOfSecondNumber) return first;
        else return second;
    }








//
//
//
//    public boolean isEqualTo(HugeInteger number) {
//        for (int i = 0; i < arr.length; i++) {
//
//            int firstNUmber = (int) number.arr[i];
//
//            if (firstNUmber == secondNumber) {
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean isNotEqualTo(HugeInteger number) {
//        for (int i = 0; i < arr.length; i++) {
//
//            int firstNUmber = (int) number.arr[i];
//
//            if (firstNUmber != secondNumber) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public String toString() {
//        return "HugeInteger{" +
//                ", arr=" + Arrays.toString(arr) +
//                '}';
    }


