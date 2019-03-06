package com.stackroute

import java.util.*;
import java.lang.*;
import java.io.*;
public class RotateArray {
        /*Function to left rotate arr[] of size n by d*/
        int gcd(int a, int b)
        {
            if (b == 0)
                return a;
            else
                return gcd(b, a % b);
        }
        public int[] leftRotate(int arr[], int d, int n){
            int arrrev[]=null;
        int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
            arrrev= arr;
        }return arrrev;
    }


    }

