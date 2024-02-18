public class MaxOfThreeNumbers{
public static void main(String[] args){
int a=5;
int b=10;
int c=3;
if(a>=b && a>=c){
System.out.println("The Maximum is :" + a);
}
else if(b>=a && b>=c){
System.out.println("The Maximum is :" + b);
}
else{
System.out.println("The Maximum is :" + c);
}
}
}