package Prog_Foundation;

import java.util.Scanner;

// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the marks for english");
//         int eng = sc.nextInt();
//         System.out.println("Enter the marks for maths");
//         int mat = sc.nextInt();
//         System.out.println("Enter the marks for science");
//         int sci = sc.nextInt();
//         System.out.println("Enter the marks for history");
//         int his = sc.nextInt();
//         System.out.println("Enter the marks for reasoning");
//         int rea = sc.nextInt();

//         // int sum =  eng + mat + sci + his + rea;

//         float sum = (float) eng + mat + sci + his + rea;

//         float avg = sum / 5;
//         System.out.println("Avg of all subj:" + avg);
//     }

// }

// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n1 = 10;
//         int n2 = 20;
//         int sum = n1 + n2;
//         System.out.println(sum);

//     }

// }

// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = 10;
//         int b = 20;

//         System.out.println("Before Swapping: a=" + a + ", b=" + b);

//         // Using add & sub
//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println("After Swapping: a=" + a + ", b=" + b);

//     }

// }

// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the basic salary of an employee");
//         int basic = sc.nextInt();

//         int hra = 20 * basic / 100;
//         System.out.println("HRA:" + hra);

//         int da = 40 * basic / 100;
//         System.out.println("DA:" + da);

//         int gross = basic + hra + da;
//         System.out.println("GROSS:" + gross);

//         int pf = 10 * gross / 100;
//         System.out.println("PF:" + pf);

//         int net = gross - pf;
//         System.out.println("NET:" + net);
//     }

// }



// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the character");
//         char ch = sc.next().charAt(0);

//         int num = ch;
//         System.out.println(num);

//     }
// }

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum=0;

        while(num > 0){
            int digit = num % 10;
            sum=sum+digit;
            num = num / 10;
        }
        System.out.println("sum:" + sum);
        


        

    }
}