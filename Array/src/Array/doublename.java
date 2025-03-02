package Array;

public class doublename {
    public static void main(String[] args){
//        int num[]={312,43,232,4342,554,44,33,22,44,554};
        String [] name={"Khemrak","Minea","Srey ya","Khemrak"};
        for(int i=0;i<name.length;i++){
            for(int j=i+1;j< name.length;j++){
                if(name[i].equalsIgnoreCase(name[j])){
                    System.out.println("Dubplicate : "+name[i]);
                }
            }
        }
    }
}
