package com.arrayex.java;

public class Fibbonacci
{
    public static void main(String[] args) {

                int num=10;
                int firstnum=0;
                int secondnum=1;
                System.out.println("Fibbonaci starting 10 number");

                for(int i=1;i<num;i++)

                {
                    System.out.print(firstnum+" ");

                    int nextnum=firstnum+secondnum;
                    firstnum=secondnum;
                    secondnum=nextnum;


                }

            }
        }


