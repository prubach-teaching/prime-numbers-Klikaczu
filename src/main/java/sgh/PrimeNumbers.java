package sgh;

public class PrimeNumbers {

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primes(int n) {
        int [] array =new int [n];
        int y=0;
        int x=2;
        while(y<n){
            if(isPrime(x)){
                array[y]=x;
                y++;

            }
            x++;
        }

        for(int i=0;i<n;i++) {
            if(i==n-1)
                System.out.printf(array[i] + "\n");
            else
                System.out.print(array[i] + ", ");
        }

    }
    
    public static void main(String[] args){
        primes(4);
    }
}

