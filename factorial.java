import java.util.Scanner;

public class prac{
    public static void main(String[] args) {
        System.out.println("Enter the the for whom you want factorial of: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int facto = 1;
        for(int i = 1;i<=input;i++)
        {
            facto = i*facto;
        }
        System.out.println("factorial of "+input+" is "+facto);
    }
}  