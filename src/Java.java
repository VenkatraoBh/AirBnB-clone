// HeapSort
// Description
// You are given an array of size n, sort that array in decreasing order using heapsort. Stub provided to you already contains most of the functions prepared, just complete the heapsort() function to get the desired result.

// Input:
//          1. The first line of the input is a positive integer n
//          2. Next, n lines input the elements of the array

// Output:
//          1. The output is the sorted array in decreasing order
 
// Sample Input-1:
// 8
// 55
// 23
// 19
// 14
// 9
// 7
// 10
// 12

// Sample Output-1:
// [55, 23, 19, 14, 12, 10, 9, 7]

// Explanation:
// The first input is the number of elements in the array, n=8. The next 8 lines of input are the elements of the array. The output is sorted array in decreasing order.

// Sample Input-2:
// 9
// -17
// -221
// 111
// 32
// -12
// 15
// 178
// 0
// 111

// Sample Output-2:
// [178, 111, 111, 32, 15, 0, -12, -17, -221]

// Explanation:
// The first input is the number of elements in the array, n=9. The next 9 lines of input are the elements of the array. The output is sorted array in decreasing order. 


import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.Scanner;

class Source{

  
    public static int leftchild(int i) {   
        return (2*i+1);
    }

    public static int rightchild(int i) {   
        return (2*i+2);
    }
    
    public static void heapsort(int[] arr, int n){
        //build heap
        buildHeap(arr);

            
        for (int i=n-1; i>=0; i--)
            {
                
                 
                
    
                // use heapify operation till n-1 elements
            }
        }

    private static void heapify(int[] arr, int i, int n) {
        
        int l = leftchild(i);
        int r = rightchild(i);

        int smallest = i;

        if (l < n && arr[l] < arr[smallest]) {
            smallest = l;
        }

        if (r < n && arr[r] < arr[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            swap(arr,i, smallest);
            heapify(arr,smallest, n);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void buildHeap(int[] arr){
        int i = (arr.length) / 2;
        while (i >= 0) {
            heapify(arr, i, arr.length);
            i--;
        }
        //System.out.println(Arrays.toString(arr));
    }
    public static int[] getArrayInput(int size, Scanner scanner) {
       int array[] = new int[size];
       for (int i = 0; i < size; i++) {
           array[i] = scanner.nextInt();
       }
       return array;
   }

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int sizeArray1 = scanner.nextInt();
       int arr[] = getArrayInput(sizeArray1, scanner);
       int n = arr.length;

        heapsort(arr,n);

        System.out.println(Arrays.toString(arr));
    }
}
