import java.util.Random;

public class Main {
  public static void main(String[] args) {
  
    Random random = new Random();

    
    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(10);
    }


    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }

   
    System.out.println("The sum of the numbers is: " + sum);
  }
}