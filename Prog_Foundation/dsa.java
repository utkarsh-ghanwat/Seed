package Prog_Foundation;

class dsa {

    public static int Largest_Element(int arr[]) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }

    public static void main(String args[]) {

        int arr[] = { 2, 3, 4, 1, 5, 7 };
        
        System.out.println(Largest_Element(arr));
    }
}  

