import java.util.*;

public class lab01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double g = 10.5;
        for(int y=0; y<50; y++){
            g=(g+x/g)*0.5;
        }
        System.out.println(g);
        
        int count = scan.nextInt();
        
    }
}