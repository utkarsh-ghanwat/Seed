package Prog_Foundation;
import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        int arr[] = {90,80,85,95,100};

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum =sum + arr[i];
        }
        System.out.println(sum);
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
