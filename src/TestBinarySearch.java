package src;

import java.util.Scanner;

public class TestBinarySearch 
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        BinarySearch bb = new BinarySearch();
        int[] array;
        int size, num;
        
        System.out.print("Enter the size of array: ");
        size = read.nextInt();
        
        array = new int[size];
        
        System.out.printf("\nEnter %d numbers in order.\n", size);
        for (int x=0; x<array.length; x++)
        {
            System.out.printf("Number position %d: ", x);
            num = read.nextInt();
            array[x] = num;
        }
        System.out.println("Full Array.");
                
        System.out.print("\nEnter the number to search in array: ");
        num = read.nextInt();
        
        bb.binarySearch(num, array);
    }
}