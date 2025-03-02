package Arrray2D;

import java.util.Scanner;

public class ArrrayDay2 {
    public static void main(String [] args){
        int row,column;
        System.out.print("Input Row : ");
        row=new Scanner(System.in).nextInt();
        System.out.print("Input Column : ");
        column=new Scanner(System.in).nextInt();
        String [][] name=new String[row][column];
        char CharactorCode='A';
        int seatCode=1;
        for(int i=0;i< name.length;i++){
            seatCode=1;
            for(int j=0;j<name[i].length;j++) {
                name[i][j] = CharactorCode + "-" + seatCode+":AV";
                seatCode++;
            }
            CharactorCode++;
        }

        System.out.println("\n\n");

       while (true){

           for(int i=0;i<name.length;i++){
               for(int j=0;j<name[i].length;j++){
                   System.out.print("|"+name[i][j]+"|  ");
               }
               System.out.println();
           }
           System.out.print("Insert code to book (A-1, B-1) : ");
           String code=new Scanner(System.in).nextLine();
           code=code.trim();

           for(int i=0;i<name.length;i++){
               for(int j=0;j<name[i].length;j++){
                   String []SplitCode=name[i][j].split(":");
                   if(SplitCode[0].trim().equalsIgnoreCase(code)){
                       name[i][j]=SplitCode[0]+ ":BO";
                   }
               }
           }

           for(int i=0;i<name.length;i++){
               for(int j=0;j<name[i].length;j++){
                   System.out.print("|"+name[i][j]+"|  ");
               }
               System.out.println();
           }
           System.out.print(">>Press key to continue : ");
           String a=new Scanner(System.in).nextLine();
       }

    }
}
