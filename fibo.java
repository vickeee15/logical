package com.studyopedia;

import java.util.Scanner;

public class fibo {
    public static void main(String args[]){
        int n1=0,n2=1,n3,i;
        Scanner sc = new Scanner(System.in);
                System.out.println("For how many times you want to do the fibonacci series: ");
                        int count=sc.nextInt();
                for(i=0;i<count;++i)
                {
                    n3=n1+n2;
                    System.out.println(""+n3);
                    n1=n2;
                    n2=n3;
                }
    }
}
