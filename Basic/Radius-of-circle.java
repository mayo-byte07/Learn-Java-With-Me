import java.util.Scanner; 

public class Main {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the radius:");  
        
        int radius = sc.nextInt(); 
        sc.close();  
        
        double area = Math.PI * radius * radius;  
        System.out.println("Area of the circle is: " + area);  
    }
}
