import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int i = 0;
        while(i++ < 3){
            System.out.println("Enter an integer: ");
            try{
                num1 = Integer.parseInt(input.next());
                System.out.println("You entered " + num1);
            } catch(Exception one){
                System.out.println("You have an error.");
            }
        }

    }
}