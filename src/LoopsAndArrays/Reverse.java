package LoopsAndArrays;

public class Reverse {
    public static void main(String[] args) {
        Integer[] intArray = {8, 9, 5, 100, 78};

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}