
package factorial1al10;


public class Factorial1al10 {


    public static void main(String[] args) {
        
        int aux = 10;
        
        for (int num = 0; num < aux; num++) {    
            long factorial = 1L;
            for (int i = 1; i <= (num+1); i++) {
                if((num+1) == 1){
                    factorial = factorial;
                }else{
                    factorial *= i;
                }
            }
            System.out.println((num+1)+"! = "+factorial);
        }
    }
    
}
