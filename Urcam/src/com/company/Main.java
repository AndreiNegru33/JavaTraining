package com.company;

public class Main {

          public static void main(String []args){
            int x=1;
            int a1;
            int a2;

            while(x==1){
                a1 = (int) (Math.random()*100);
                a2 = (int) (Math.random()*100);
                if(a1==a2){
                    System.out.println(a1+" "+a2);
                    x=0;
                }
            }



        }
    }

