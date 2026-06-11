import java.util.*;
//Hit = number between 1 to 20

public class Main {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a = 10;
    int b;
    while(true){
        b = sc.nextInt();
        if(b ==a){
            System.out.println("correct");
            break;
        }
        else{
            System.out.println("wrong");
        }
    }
}
}