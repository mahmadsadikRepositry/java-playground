
import java.util.Scanner;

//Control statements are used to control the flow of a program.

public class Exercise1{
    public static void main(String[] args) {
        //number from the user and print whether it is positive or negative.

        Scanner in = new Scanner(System.in);
        System.out.println("Input Number"); 
        int inputNumber = in.nextInt();

        if(inputNumber < 0 ){
            System.out.println("Number is negative");
        } else if(inputNumber > 0){
            System.out.println("Number is postive");
        } else {
            System.out.println("Number is zero");

        }

    }
}
