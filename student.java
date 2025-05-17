public class student {
    
    public static void main(String[] args) {
        
        //To find the factorial
        int n = 5;
        int f = 1;

        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        System.out.println("The Factorial of the " + n + " is: " + f);
    }
}
