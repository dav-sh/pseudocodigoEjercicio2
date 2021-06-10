import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int num = s.nextInt();
        while (num<1){
            System.out.println("next: "+(num+1));
            num++;
        }
    }
}