package Prog_Foundation;
import java.util.Scanner;

//public class Arrays_2D {                     // DEC
//	 public static void main (String args[]) {
//		 int arr[][] = {{0,1,2} , {3,4,5} , {6,7,8,}};
//		 System.out.println(arr[1][2]);
//	 }
//}

//public class Arrays_2D {                  // PRINT
//	 public static void main (String args[]) {
//		 Scanner sc = new Scanner(System.in);
//		 
//		 System.out.println("Enter the 3 * 3 matrix");
//		 int arr[][] = new int[3][3];
//		 
//		 for (int i = 0; i < 3; i++) {
//			 for (int j=0; j < 3; j++) {
//				 arr[i][j] = sc.nextInt();
//			 }
//		 }
//		 for (int i = 0; i < 3; i++) {
//			 for (int j=0; j < 3; j++) {
//				 System.out.print(arr[i][j] + "\t");
//			 }
//			 System.out.println();
//		 }
//		 
//	 }
//}

//public class Arrays_2D {                        // ADD OF 2 MAT
//	 public static void main (String args[]) {
//		 Scanner sc = new Scanner(System.in);
//		 
//		 System.out.println("Enter the 3 * 3 matrix");
//		 int a[][] = new int[3][3];
//		 int b[][] = new int[3][3];
//		 int c[][] = new int[3][3];
//
//		 System.out.println("Enter th matrix for 'A'");
//		 for (int i = 0; i < 3; i++) {
//			 for (int j=0; j < 3; j++) {
//				 a[i][j] = sc.nextInt();
//			 }
//
//		 }
//
//		 System.out.println("Enter th matrix for 'B'");
//		 for (int i = 0; i < 3; i++) {
//			 for (int j=0; j < 3; j++) {
//				 b[i][j] = sc.nextInt();
//
//			 }
//		 }
//		 
//		 
//		 for (int i = 0; i < 3; i++) {
//			 for (int j=0; j < 3; j++) {
//				 c[i][j] = a[i][j] + b[i][j];
//				 System.out.print(c[i][j] + "\t");
//			 }
//			 System.out.println();
//		 }
//		 
//	 }
//}

//public class Arrays_2D{                         // SUB OF 2 MAT
//	public static void main(String args[]) {
//		Scanner sc = new Scanner (System.in);
//		
//		int a[][] = new int[3][3];
//		int b[][] = new int[3][3];
//		int c[][] = new int[3][3];
//		
//		System.out.println("Enter the matrix A");
//		for(int i = 0; i < 3; i++) {
//			for (int j= 0; j < 3; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.println("Enter the matrix B");
//		for(int i = 0; i < 3; i++) {
//			for (int j= 0; j <= 3; j++) {
//				b[i][j] = sc.nextInt();
//			}
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			for (int j= 0; j < 3; j++) {
//				c[i][j] = a[i][j] - b[i][j];
//				System.out.print(c[i][j] + "\t");
//			}
//			System.out.println();
//		}
//	
//
//	}
//}

//class Arrays_2D {                                 // DIAGONAL = 0
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        int a[][] = new int[3][3];
//
//        System.err.println("Enter a 3 * 3 matrix");
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (i == j) {
//                    a[i][j] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(a[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

//class Arrays_2D {                             //  UPPER & LOWER
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        int a[][] = new int[3][3];
//
//        System.err.println("Enter a 3 * 3 matrix");
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (i < j) {
//                    a[i][j] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(a[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

//class Arrays_2D {                                    // EVEN & ODD
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        int a[][] = new int[3][3];
//
//        System.err.println("Enter a 3 * 3 matrix");
//
//        int sum=0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if ((i+j) % 2 == 0) {
//                	sum=sum+(i+j);
//                    System.out.println("Even sum:" + sum);
//                }
//            }
//        }
//
//     }
// }


//class Arrays_2D {                             //  REVERSE UPPER & LOWER
//  public static void main(String args[]) {
//      Scanner sc = new Scanner(System.in);
//
//      int a[][] = new int[3][3];
//
//      System.err.println("Enter a 3 * 3 matrix");
//
//      for (int i = 0; i < 3; i++) {
//          for (int j = 0; j < 3; j++) {
//              a[i][j] = sc.nextInt();
//          }
//      }
//
//      for (int i = 0; i < 3; i++) {
//          for (int j = 0; j < 3; j++) {
//              if (i < j) {
//                  a[i][j] = 0;
//              }
//          }
//      }
//
//      for (int i = 0; i < 3; i++) {
//          for (int j = 0; j < 3; j++) {
//              System.out.print(a[i][j] + "\t");
//          }
//          System.out.println();
//      }
//  }
//}


//public class Arrays_2D{                      // REVERSE DIAGONAL
//	public static void main(String args[]) {
//		Scanner sc= new Scanner(System.in);
//		
//		int a[][] = new int[3][3];
//		System.err.println("Enter a 3 * 3 matrix");
//
//		for (int i = 0; i < 3; i++) {
//          for (int j = 0; j < 3; j++) {
//              a[i][j] = sc.nextInt();
//          }
//		}
//		
//		for (int i=0; i < 3; i++) {
//			for(int j=0; j <3; j++) {
//				if (i + j == 2) {
//					a[i][j] = 0;
//					
//				}
//			}
//		}
//		
//		for (int i = 0; i < 3; i++) {
//          for (int j = 0; j < 3; j++) {
//              System.out.print(a[i][j] + "\t");
//          }
//          System.out.println();
//		}
//
//	}
//}


//public class Arrays_2D{                      // 2,4,6,8 = 0
//	public static void main(String args[]) {
//		Scanner sc= new Scanner(System.in);
//		
//		int a[][] = new int[3][3];
//		System.err.println("Enter a 3 * 3 matrix");
//
//		for (int i = 0; i < 3; i++) {
//          for (int j = 0; j < 3; j++) {
//              a[i][j] = sc.nextInt();
//          }
//		}
//		
//		for (int i=0; i < 3; i++) {
//			for(int j=0; j <3; j++) {
//				if (i+j == 1 || i+j == 3 ){
//					a[i][j] = 0;
//					
//				}
//			}
//		}
//		
//		for (int i = 0; i < 3; i++) {
//          for (int j = 0; j < 3; j++) {
//              System.out.print(a[i][j] + "\t");
//          }
//          System.out.println();
//		}
//
//	}
//}

public class Arrays_2D{                      // 1st ROW ZERO
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	
	int a[][] = new int[3][3];
	System.err.println("Enter a 3 * 3 matrix");

	for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
          a[i][j] = sc.nextInt();
      }
	}
	
	for (int i=0; i < 3; i++) {
		for(int j=0; j <3; j++) {
			if (i == 0){
				a[i][j] = 0;
				
			}
		}
	}
	
	for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
          System.out.print(a[i][j] + "\t");
      }
      System.out.println();
	}

	

}
}



