package Arrray2D;

public class Exercise {
    public static void main(String[] args){
        String [][] name = {{"Khemra"},{"Khemrak","minea","Srey ya"},{"Saven"}};
        System.out.println("Row of matrix : "+name.length);
        System.out.println("Column of first : "+name[0].length);
        System.out.println("Column of Second : "+name[1].length);
        System.out.println("Column of third : "+name[2].length);
        System.out.println("Done");
        for(int i=0;i<name.length;i++){
            for(int j=0;j<name[i].length;j++){
                if(j==0){
                    System.out.print("|");
                }
                System.out.print(name[i][j]+"|");
            }
            System.out.println();
        }
    }
}
