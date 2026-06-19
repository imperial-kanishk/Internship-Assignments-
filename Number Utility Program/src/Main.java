import java.util.*;
public class Main {
    static boolean isPrime (int n){

            if (n <= 1) {
                return false;
            }

            if (n == 2) {
                return true;
            }

            if (n % 2 == 0) {
                return false;
            }

            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;

    }
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversed = (reversed * 10) + lastDigit;
            n = n / 10;
        }

        return original == reversed;
    }
    static long factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    static void fibonacci(int n){
        if(n <= 0){
            System.out.println("Invalid number of terms");
            return;
        }
        int a = 0;
        int b  = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
    static int reverse(int n){
        int rev = 0;
        while(n!=0){
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        return rev;
    }
    static int digitNumber(int n){
        if (n < 0) {
            n = Math.abs(n);
        }
        if(n==0){
            return 1;
        } int count=0;
        while(n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
    static int sumOfDigits(int num){
        num = Math.abs(num);
        if(num==0){
            return 0;
        }
        return num%10+ sumOfDigits(num/10);
    }
    static boolean armstrongCheck(int n){
        if(n < 0){
            return false;
        }
        int num = n;
        if(n==0){
            return true;
        }
        int p=0;
        while(n!=0){
            n=n/10;
            p++;
        }
        return armstrongCalculation(num,p);
    }
    static boolean armstrongCalculation(int num, int  power){
        int sum=0;
        int n=num;
        while(n!=0){
            int digit = n%10;
            n = n/10;
            sum = sum + (int)Math.pow(digit,power);
        }
        if(sum==num){
            return true;
        }else return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Number Utility Program ===");
        int choice;
        do{
            System.out.println("\n1. Check Prime Number");
            System.out.println("2. Check Palindrome Number");
            System.out.println("3. Find Factorial");
            System.out.println("4. Generate Fibonacci Series");
            System.out.println("5. Reverse Number");
            System.out.println("6. Count Digits");
            System.out.println("7. Sum of Digits");
            System.out.println("8. Check Armstrong Number");
            System.out.println("9. Check Even/Odd");
            System.out.println("10. Exit");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter a number: ");
                    int n1 = sc.nextInt();
                    if(isPrime(n1)){
                        System.out.println("The Number is a Prime Number");
                    }
                    else{
                        System.out.println("The Number is not a Prime Number");
                    }
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int n2 = sc.nextInt();
                    if(isPalindrome(n2)){
                        System.out.println("The Number is a Palindrome Number");
                    }
                    else{
                        System.out.println("The Number is not a Palindrome Number");
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int n3 = sc.nextInt();
                    if(n3>=0) {
                        System.out.println("The Factorial of the Number is " + factorial(n3));
                    }
                    else System.out.println("Invalid Input");
                    break;
                case 4:
                    System.out.print("Enter number of terms n: ");
                    int n4 = sc.nextInt();
                    System.out.print("The Fibonacci Series is: ");
                    fibonacci(n4);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Enter the number to be reversed: ");
                    int n5 = sc.nextInt();
                    System.out.print("The reverse is: "+ reverse(n5));
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    int n6 = sc.nextInt();
                    System.out.print("Number of Digits are: "+digitNumber(n6));
                    break;

                case 7:
                    System.out.print("Enter Number to perform Sum of Digits: ");
                    int n7=sc.nextInt();
                    System.out.println("Sum of Digits = "+sumOfDigits(n7));
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    int n8 = sc.nextInt();
                    if (armstrongCheck(n8)){
                        System.out.println("The number is an Armstrong number");
                    } else System.out.println("the number is NOT an Armstrong number");
                    break;

                case 9:
                    System.out.print("Enter a number: ");
                    int n9 = sc.nextInt();
                    if(n9%2==0) System.out.println("The Number is Even");
                    else System.out.println("The Number is Odd");
                    break;

                case 10:
                    System.out.println("Thank you for using the Number Utility Program");
                    break;
                default:
                    System.out.println("Wrong Choice :(");
            }


        }while(choice!=10);
        sc.close();

    }
}