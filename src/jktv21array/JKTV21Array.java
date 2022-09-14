/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21array;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class JKTV21Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random random = new Random();
        for (int n = 0; n < 20; n++) {
            myArray[n] = random.nextInt(50) * 2;
        }
        System.out.println("Array: " + Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("Sort Array: " + Arrays.toString(myArray));
        int min = 1;
        while(myArray[min-1] == myArray[min]) ++min;
        int max = myArray.length-2;
        while(myArray[max+1] == myArray[max]) --max;
        int[] myNewArray = new int[max-min+1];
        System.arraycopy(myArray, min, myNewArray, 0, max-min+1);
        System.out.println("New Array: " + Arrays.toString(myNewArray));
        double mid = 0;
        int n = 0;
        for (int x = 0; x < myArray.length; x++) {
            mid = mid + myArray[x];
            ++n;
        }
        mid = mid / n;
        System.out.println("Average: " + mid);
        
        int nArr = 5;
        int[][] newArray = new int[nArr][nArr];
        int[] vArray = new int[nArr];
        int[] hArray = new int[nArr];
        int d1 = 0, d2 = 0;
        for(int i = 0; i < nArr; i++) {
            for(int j = 0; j < nArr; j++) {
                newArray[i][j] = random.nextInt(10);
                System.out.print(newArray[i][j] + " ");
                if(i == j) d1 = d1 + newArray[i][j];
                if(i == j) d2 = d2 + newArray[nArr-i-1][j];
            }
            System.out.println();
        }
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}
