package sktvp20task2irinasiskova;

import java.util.Scanner;


public class SKTVp20Task2IrinaSiskova {

    
    public static void main(String[] args) {
       System.out.println("Ведите трехзначное число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       
        int units = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num /100;
       
        int summ = units + tens + hundreds;
       
        System.out.println("В заданном Вами числе " + units + " единиц(а/ы)");
        System.out.println("В заданном Вами числе " + tens + " десятка(ов)");
        System.out.println("В заданном Вами числе " + hundreds + " сотня(ни/ен)");
        System.out.println("В заданном Вами числе сумма цифр: " + summ);  
       
       
        
    }
    
}
