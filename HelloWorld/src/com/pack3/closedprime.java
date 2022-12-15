package com.pack3;
import java.util.*;
public class closedprime {
    static int max = 100005;
    static Vector<Integer> primeNumber = new Vector<>();
        static void sieveOfEratosthenes()
        {
            boolean prime[] = new boolean[max + 1];
            for (int i = 0; i <= max; i++)
                prime[i] = true;
            for (int p = 2; p * p <= max; p++) {
                if (prime[p] == true) {
                    for (int i = p * p; i <= max; i += p)
                        prime[i] = false;
                }
            }
            for (int i = 2; i <= max; i++) {

                if (prime[i] == true)
                    primeNumber.add(i);
            }
        }

        static int upper_bound(Integer arr[], int low, int high,
                               int X)
        {
            if (low > high)
                return low;
            int mid = low + (high - low) / 2;
            if (arr[mid] <= X) {
                return upper_bound(arr, mid + 1, high, X);
            }
            return upper_bound(arr, low, mid - 1, X);
        }

        public static int closetPrime(int number)
        {
            if (number == 1)
                return 2;
            else {
                sieveOfEratosthenes();

                Integer[] arr = primeNumber.toArray(
                        new Integer[primeNumber.size()]);
                int index = upper_bound(arr, 0, arr.length, number);

                if (arr[index] == number
                        || arr[index - 1] == number)
                    return number;
                else if (Math.abs(arr[index] - number)
                        < Math.abs(arr[index - 1] - number))
                    return arr[index];
                else
                    return arr[index - 1];
            }
        }
        public static void main(String[] args)
        {
            int number = 100;
            System.out.println(closetPrime(number));
        }
    }

