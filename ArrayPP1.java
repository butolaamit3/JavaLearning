import java.util.Scanner;

// Practice problem 1-By taking user input initilize them in array and then sum(take values  in float.
public class ArrayPP1 {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which size of array you want: ");
        int num = sc.nextInt();
        float [] values = new float[num];
        for(int i = 0;i<num;i++){                      // to store the values in array
        System.out.print("Enter the value at index "+(i+1)+": ");
        values[i] = sc.nextFloat();
        }
        System.out.println("\nArray elements are");
        for(int i =0;i<values.length;i++){                  // to print the values of array
        System.out.println(values[i]);
        }
        System.out.println("\n");
        float sum = 0;
        for(float elements:values){                  //to add the elements stored in array
        sum = sum+elements;
        }
        System.out.println("Total sum is: "+sum);
    }
}
*/

// ***** Problem 2- to find weather the element present in the array or not **********
/*
        float[] marks = { 2.3f, 34.5f, 36.6f, 23.5f, };
        float num = 36.6f;
        boolean isInArray = false;
        for (float values : marks) {
            if (num == values) {
                isInArray = true;
                break;
                
            }
        }
        if (isInArray) {
            System.out.println("The element is present is in array");
        } else {
            System.out.println("The element is not present is in array");
        }
    }
}
*/


// PP3- Create aprogram to add to matrices of size 2x3
/*
        int [] [] mat1 = {{1,2,3},
                          {4,5,6}};
        int [] [] mat2 = {{1,3,5},
                          {2,4,6}};
        int [] [] result = {{0,0,0},
                            {0,0,0}};

        for(int i = 0; i<mat1.length;i++){ // row number of times
            for(int j =0;j<mat1[i].length;j++){//column number of times
                
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");
                

            }
            System.out.println("");//print a new line
        }
    }
}
*/
  //PP5- Write a program to swap an array
/*
     int [] arr = {1,123,35,67,2,45,86,3,4,5,567,943};
        // int n = Math.floorDiv(arr.length, 2);
        int temp;
        for(int i=0;i<arr.length/2;i++){
            //swap a[] and a[arr.length-1-i]
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        // 1. Print using for each loop
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();

        // 2. Print using For loop
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//PP6- find the largest and smallest element of an array
/*
      int a[]= {10,12,54,6,3,106,34,2,23,34,61,56};
        int max = a[0];  //suppose the element at index 1 is max
        int small = a[0]; //Suppose the element at index 1 is minimum
        for(int i=0;i<a.length;i++){
            if(a[i]>max & a[i]<small){
                max = a[i];
            }
            if(a[i]<small){
                small = a[i];
            }
        }
        System.out.println("largest element = "+max);
        System.out.println("Smallest element = "+small);
    }
}
*/

//PP7-Write a program to short an array
/*        
        int a[] = {1,5,23,2,4534,7423,63,7,12,};
        boolean isSorted = true;
        for(int i =0;i<a.length-1;i++){
            
            if(a[i] > a[i+1]){
                isSorted = false; 
                break;

            }
            
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
*/