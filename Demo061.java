import java.util.Scanner;

 class Demo061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prime numbers you want to print: ");
        int n = sc.nextInt();
        
        int count = 0;
        int num = 2;
        
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
