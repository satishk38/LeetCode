package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int[][] account= { {7,1,3},{2,8,7},{1,9,5}};

       System.out.print(maximumWealth(account));

    }

    public static int maximumWealth(int[][] accounts){

        int res = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length;i++)
        {
            int wealth =0;
            for(int j=0; j<accounts[0].length;j++)
            {

                wealth += accounts[i][j];
                if(wealth > res)
                {
                    res = wealth;
                }
            }
        }
        return res;
    }
}