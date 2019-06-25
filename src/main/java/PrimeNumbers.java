import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int numbers = 20;
        System.out.println("20 số nguyên tố đầu tiên là:");
        System.out.println(printPrimeNumbers(numbers));
    }

    public static String printPrimeNumbers(int numbers){
        int count = 0;
        String result = "";
        for(int i = 2; count < numbers; i++){
            int divisible = 0;
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    divisible += 1;
                }
            }
            if(divisible == 1){
                count++;
                result += i + "\t";
            }
        }
        return result;
    }
}
