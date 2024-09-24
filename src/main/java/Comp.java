import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        int[] x = {23, 45, 22, 11, 13, 100};
        System.out.println("Enter the number to be searched in the array");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        checkIf(x, m);
    }

    public static void checkIf(int[] a, int m){
        int foundat = -1;
        for (int i =0; i < a.length; i++) {
            if(a[i]==m){
                foundat = i; 
            }
            
        }
        if(foundat == -1){
            System.out.println("Number not found");
        } else{
            System.out.println("found the match in the position found at " + foundat+"th location");
        }
       
    }
}
