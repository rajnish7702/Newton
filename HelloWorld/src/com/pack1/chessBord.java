package com.pack1;

import java.util.Scanner;

/*
Chess Board
Medium

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.

More formally, a chessboard like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.

On his birthday, Tom has been gifted a board which is in the form of a N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to paint his board similar to chessboard.
Input
First line contains an integer N, denoting the size of the board
Each of the next N lines contains N space separated integers and each integer being either '0' or '1'
'1' represent black cell
'0' represents white cell

Constraints
1 <= N <= 1000
Output
A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
Example
Input:
3
1 1 1
1 1 1
1 1 1

Output:
4

Explanation:
Convert to
1 0 1
0 1 0
1 0 1
Thus we will have to colour 4 cells.

Input:
3
0 1 0
1 0 1
0 1 0

Output:
0
It already has a chess board like coloring.

 */
public class chessBord {
    public static void main (String[] args){
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = inputTacker.nextInt();
            }
        }
        printChessBordWhiteToBlack(arr,n);
    }
    public static void printChessBordWhiteToBlack(int[][] arr, int n){
        int eCount = 0;
        int oCount = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    eCount++;
                }
                else{
                    oCount++;
                }
            }
        }
        if(eCount==n*n){
            int x=eCount/2;
            System.out.println(x);
        }
        else if(oCount==n*n){
            int y=oCount/2;
            System.out.println(y);
        }
        else if ((eCount+oCount)%2==0) {
            System.out.println(0);
        }
        else if (Math.abs(eCount-oCount)==1) {
            System.out.println(0);
        }
    }
}