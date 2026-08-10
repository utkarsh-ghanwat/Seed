package Prog_Foundation;

import java.util.Scanner;

// public class Selection_stt {
//     public static void main(String[] args) {
//         int a = 13;
//         int b = 2;
//         int c = 1;

//         int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

//         System.out.println(max);
//     }
// }

// public class Selection_stt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the no");
//         int num = sc.nextInt();

//         int result = num < 0 ? Math.abs(num) : num;
//         System.out.println(result);

//         // if(num < 0){
//         //     System.out.println(Math.abs(num));
//         // }else{
//         //     System.out.println(num);
//         // }

//     }
// }

// public class Selection_stt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the character:");
//         char ch = sc.next().charAt(0);

//         if (ch >= 'A' && ch <= 'Z') {
//             ch = (char) (ch + 32);
//             System.out.println("Opposite case:" + ch);
//         } else if (ch >= 'a' && ch <= 'z') {
//             ch = (char) (ch - 32);
//             System.out.println("Opposite case:" + ch);
//         } else {
//             System.out.println("Character is not an alphabet");

//         }

//     }

// }

public class Selection_stt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id:");
        int empId = sc.nextInt();

        System.out.println("Enter the department no:");
        int deptNo = sc.nextInt();

        System.out.println("Enter the design code:");
        char designCode = sc.next().charAt(0);

        String department;
        String designation;

        switch (deptNo) {
            case 10:
                department = "Purchase";
                break;
            case 20:
                department = "Sales";
                break;
            case 30:
                department = "Production";
                break;
            case 40:
                department = "Marketing";
                break;
            case 50:
                department = "Accounts";
                break;
            default:
                department = "Unknown Department";
        }

        switch (designCode) {
            case 'M':
                designation = "Manager";
                break;

            case 'A':
                designation = "Analyst";
                break;

            case 'W':
                designation = "Worker";
                break;

            case 'C':
                designation = "Sales-Person";
                break;

            case 'S':
                designation = "Clerk";
                break;

            default:
                designation = "Unknown Designation";

        }
        System.out.println("Employee with " + empId + " works in " + department + " department as a " + designation);

    }

}
