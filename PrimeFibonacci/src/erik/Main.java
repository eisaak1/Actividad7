package erik;

import java.io.*;
class PrimeFibonacci{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("M = ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("N = ");
        int n = Integer.parseInt(br.readLine());
        if(m >= n){
            System.out.println("Invalid range!");
            return;
        }
        for(int i = m; i <= n; i++){
            if(!isPrime(i))
                continue;
            int num = 1;
            int result = fibo(num);
            while(result < i){
                num++;
                result = fibo(num);
            }
            if(result == i)
                System.out.print(i + "\t");
        }
        System.out.println();
    }
    public static boolean isPrime(int num){
        int f = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0)
                f++;
        }
        return f == 2;
    }
    public static int fibo(int num){
        if(num == 1)
            return 0;
        else if(num == 2)
            return 1;
        return fibo(num - 1) + fibo(num - 2);
    }
}
