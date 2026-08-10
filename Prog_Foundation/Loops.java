package Prog_Foundation;
import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {

        for (int a = 1; a <= 100; a++) {
            for (int b = a + 1; b <= 100; b++) {
                for (int c = b + 1; c <= 100; c++) {

                    if (a * a + b * b == c * c) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         int original = num;
//         int sum = 0;

//         while(num > 0){
//             int digit = num % 10;
//             sum = sum + (digit * digit * digit);
//             num = num / 10;
//         }

//         if (sum == original) {
//             System.out.println("Armstrong number");
//         } else {
//             System.out.println("Not an Armstrong number");
//         }

//         sc.close();
//     }
// }

// public class Loops {
//     public static void main(String[] args) {

//         for (int num = 0; num <= 1000; num++) {

//             int original = num;
//             int temp = num;
//             int sum = 0;

//             while (temp > 0) {
//                 int digit = temp % 10;
//                 sum = sum + (digit * digit * digit);
//                 temp = temp / 10;
//             }

//             if (sum == original) {
//                 System.out.println(num);
//             }
//         }
//     }
// }

