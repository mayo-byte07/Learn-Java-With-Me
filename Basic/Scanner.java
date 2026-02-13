import java.util.Scanner;

public class main {
    public static void main ( String[] args){
        int a;
        int b;
        int c;
        
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter value of a: ");
        a = sc.nextInt();
        System.out.print( "Enter value of b: ");
        b = sc.nextInt();
        System.out.print( "Enter value of c: ");
        c = sc.nextInt();
        
    if(a>b && a>c)
    System.out.println(a+ "is greater");
    
    else if(b>a && b>c)
    System.out.println(b+ "is greater");
    
    else 
    System.out.println(c+ "is greater");
    } 
}