package program49;

public class pattern1 {
    public static void main(String[] args){
        String data = "Java";
        for(int i = 3;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(data.charAt(j));
                if (j==i){
                    System.out.println();
                }
            }
        }
    }
}
