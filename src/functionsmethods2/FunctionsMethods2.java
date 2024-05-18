package functionsmethods2;

import java.util.Scanner;


public class FunctionsMethods2 {

    public static void main(String[] args) {
    /*
    Create a function that validates a number between two numbers.
    You are going to need two numerical parameters
    */
        System.out.println(validateNumber (0,10));
    
    public static int validateNumber (int min, int max){
        Scanner sc = new Scanner (System.in);

        if (min > max){
        int aux = min;
        min = max;
        max = aux;
    int number;
    do {
        System.out.println("Write a number:");
        number = sc.nextInt ();
        
        if (!(number>= 0 && number >= 10));
        
        System.out.println("The number "+ number + " it's between "+ min + " and" + max);
    }
}
