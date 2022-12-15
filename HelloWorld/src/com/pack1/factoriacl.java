package com.pack1;

public class factoriacl {
    class Solution
    {
        public int trailingZeroes(int n)
        {
            int tra=0;
            for(int i=5;i<=n;i=i*5)
            {
                tra+=n/i;
            }
            return tra;
        }
    }
}
