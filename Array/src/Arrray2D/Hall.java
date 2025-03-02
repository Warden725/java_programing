package Arrray2D;

import java.util.Scanner;

public class Hall {

    public static String thumnail(){
        return ("""
                1. Set up hall
                2. Start booking
                3. Cancel booked seat
                4. View History
                5. Exit Program
                
                """);
    }

    public static void setupHall(String [][] hall){
        char CharactorCode='A';
        int seatCode=1;
        for(int i=0;i< hall.length;i++){
            seatCode=1;
            for(int j=0;j<hall[i].length;j++) {
                hall[i][j] = CharactorCode + "-" + seatCode+":AV";
                seatCode++;
            }
            CharactorCode++;
        }
    }

    public static void startBooking(String [][] hall){
        System.out.print("Insert code to book (e.g, a-1,b-1,,c-1) : ");
        String code=new Scanner(System.in).nextLine();
        code=code.trim();

        for(int i=0;i<hall.length;i++){
            for(int j=0;j<hall[i].length;j++){
                String []SplitCode=hall[i][j].split(":");
                if(SplitCode[0].trim().equalsIgnoreCase(code)){
                    hall[i][j]=SplitCode[0]+ ":BO";
                }
            }
        }
            System.out.println("Booking successfully!\uD83E\uDD70");
    }

    public static void cancelBookig(String [][] hall){
        System.out.print("Insert code to cancel booking (e.g, a-1,b-1,,c-1) : ");
        String code=new Scanner(System.in).nextLine();
        code=code.trim();

        for(int i=0;i<hall.length;i++){
            for(int j=0;j<hall[i].length;j++){
                String []SplitCode=hall[i][j].split(":");
                if(SplitCode[0].trim().equalsIgnoreCase(code)){
                    hall[i][j]=SplitCode[0]+ ":AV";
                }
            }
        }
        System.out.println("Cancel Booking successfully!\uD83E\uDD70");
    }

    public static void viewHistory(String [][] hall){
        for(int i=0;i<hall.length;i++){
            for(int j=0;j<hall[i].length;j++){
                System.out.print("|"+hall[i][j]+"|  ");
            }
            System.out.println();
        }
    }

    public static void pressKeyToContinue(){
        System.out.print("\n>>Press key to continue : ");
        String a=new Scanner(System.in).nextLine();
        System.out.println();
    }


    public static void main(String [] args){
        String [][]hall=null;
        int op=0;
        do{

            System.out.print(thumnail());
            System.out.print("Please chose option : ");
            op=new Scanner(System.in).nextInt();
            switch (op){
                case 1->{
                    System.out.print("Input row of hall : ");
                    int row=new Scanner(System.in).nextInt();
                    System.out.print("Input column of hall : ");

                    int column=new Scanner(System.in).nextInt();
                    hall=new String[row][column];

                    setupHall(hall);
                    viewHistory(hall);
                }
                case 2 -> startBooking(hall);
                case 3 -> cancelBookig(hall);
                case 4 -> viewHistory(hall);
                case 5 -> {System.out.println("Thank ! ");}
                }

            pressKeyToContinue();

        }while (op!=5);
    }
}
