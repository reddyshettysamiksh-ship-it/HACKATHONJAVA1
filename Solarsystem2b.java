import java.util.Scanner;
public class Solarsystem2b 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter energy generated in kwh: ");
        double energy = sc.nextDouble();
        if (energy>=10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
        sc.close();
    }
}
