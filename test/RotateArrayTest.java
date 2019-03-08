package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {
    RotateArray obj;
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    @Before
    public void setUp() throws Exception {
         obj = new RotateArray();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void gcd() {
        assertEquals(1,obj.gcd(3,4));
    }

    @Test
    public void leftRotate() {

        int arr[]={1,2,3,4,5};
        int d=3;
        int n=5;
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
        }
        assertEquals(arrrev,obj.leftRotate(arr,d,n));
    }
}
