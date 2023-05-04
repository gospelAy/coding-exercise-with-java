package Chapter4;

public class Hcf {
  static private int counter;
    public static void main(String[] args){
        methodHcf(23, 32);
    }
    public static int methodHcf(int firstNumber, int secondNumber){
        int sum = 2;
        for (int i = 0; i < sum; i++) {

        }
        if (firstNumber % sum == 0 && secondNumber % sum == 0 ){
           int printOut =  methodHcf(firstNumber, secondNumber);
        }else sum = counter++;
        return 0;
    }
    public int methodHcf2(){
        return 0;
    }
}
