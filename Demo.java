public class Demo {
    public static void main(String[] args) {
        
      int num1 = 10;
        int num2 = 5;  

        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int multiplicationResult = num1 * num2;
        if (num2 != 0) { 
            int divisionResult = num1 / num2;
            System.out.println("Division of " + num1 + " by " + num2 + " is: " + divisionResult);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + multiplicationResult);  
    }
}
