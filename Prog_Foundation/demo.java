package Prog_Foundation;

// public class demo {
//     public static void main(String args[]){
        
//         int i;
//         int j=1;

//         for (i=5; i<50; i++){
//             System.out.print(i + " ");

//             int next = i + j;
//             i =j;
//             j=next;
//         }

//     }
// }



public class demo {
    public static void main(String args[]) {
        int redFlag = 0;
        int divisor = 2;
        int iNum = 16;

        while (divisor <= iNum / 2) {
            if (iNum % divisor == 0) {
                redFlag = 1;
                break;

            }
            divisor++;
        }
        if (redFlag == 0) {
            System.out.println("the number: " + iNum + " is prime");
        } else {
            System.out.println("the number: " + iNum + " is not prime");

        }
    }
}
