import java.util.*;
public class text_2{
public static void main(String[] args){    
// test-1;    
System.out.println('a');
System.out.println('a'+1);

System.out.println("hello"+'a'+1);
System.out.println('a'+1+"hello");
System.out.println("5+5="+5+5);
System.out.println(5+5+"=5+5"+5);
// test-2
int a=0,b,c;
b= 3+(a++)+1;
c= 3+(++a)+1;
System.out.println(b+"///"+c);
a = 10; a += 20; System.out.println(a); 

//test-3
int z=2;
//short s+=s + z +1; (wrong) 
short s=1; s+=z+1;
/*char m = 'm';
System.out.println(m);*/ //(the result is m)
/*char k = 1;
char v = 2;
char o = 0;
o = k + v ;*/ //(wrong)
/*char k =1 ;
char m= 'a' + k; *///(wrong)
char kk = 'a'+1;// (correct)
System.out.println(kk);

}
}
