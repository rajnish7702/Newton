package com.newton;
import java.util.Scanner;
/*
Tic Tac Toe
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
Game is played in pairs.
If Rick plays against anyone, Rick wins.
If Jerry plays against anyone, Jerry Loses.
A game between any other players is a draw.
Given a pair of players, find who wins the game or if the game is draw.
Input
Input Contains two space separated characters denoting the players that will have the match.
R denotes Rick.
J denotes Jerry.
B denotes Beth.
M denotes Morty.
S denotes Summer.
Output
If the game is draw print 'D', else print the first letter of the name of the player who wins in capital.
Example
Sample Input 1
R S

Sample Output 1
R

Sample Input 2
B J

Sample Output 2
B

Sample Input 3
M S

Sample Output 3
D
 */

public class TicTacToe {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        char p1=sc.next().charAt(0);
        char p2=sc.next().charAt(0);

        if(p1=='R' || p2=='R'){
            System.out.print("R");
        }
        else if(p1=='J'){
            System.out.print(p2);
        }
        else if(p2=='J'){
            System.out.print(p1);
        }
        else{
            System.out.print("D");
        }
    }
}
