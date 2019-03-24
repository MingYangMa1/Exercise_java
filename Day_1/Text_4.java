import java.util.*;
public class Text_4{
    public static void main(String[] args){
        int a = 0;
        for(int i =1;i<=10;i++){
            if(i==1){
                //continue; // the result is 9
                //break;  // the result is 0
            }
            a+=1;
        }
        System.out.println(a);
    }
}