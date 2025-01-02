package com.Array;
//Write a program to perform matrix addition and subtraction using 2D arrays.
public class array_first 
{
	 public static void main(String[] args) 
	 {
	        int[][] matrixA = 
	        {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrixB = 
	        {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int[][] resultAddition = new int[3][3];
	        int[][] resultSubtraction = new int[3][3];

	        for (int i = 0; i < 3; i++) 
	        {
	            for (int j = 0; j < 3; j++) 
	            {
	                resultAddition[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	        for (int i = 0; i < 3; i++) 
	        {
	            for (int j = 0; j < 3; j++) 
	            {
	                resultSubtraction[i][j] = matrixA[i][j] - matrixB[i][j];
	            }
	        }
	        
	        System.out.println("Matrix Addition:");
	        displayMatrix(resultAddition);

	        System.out.println("Matrix Subtraction:");
	        displayMatrix(resultSubtraction);
	    }

	    public static void displayMatrix(int[][] matrix) 
	    {
	        for (int[] row : matrix) 
	        {
	            for (int element : row) 
	            {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }
}
