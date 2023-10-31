import java.util.Scanner;

class java
{
    public static void sum(final int n, final int n2) {
        System.out.print(n + n2);
    }
    
    public static void min(final int n, final int n2) {
        System.out.print(n - n2);
    }
    
    public static void mul(final int n, final int n2) {
        System.out.print(n * n2);
    }
    
    public static void div(final int n, final int n2) {
        System.out.print(n / n2);
    }
    
    public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("First num: ");
        final int nextInt = scanner.nextInt();
        System.out.print("Second num: ");
        final int nextInt2 = scanner.nextInt();
        System.out.print("\n1. ADD\n2. Min\n3. Multifly\n4. Division\nChoose operation: ");
        switch (scanner.nextInt()) {
            case 1: {
                sum(nextInt, nextInt2);
                break;
            }
            case 2: {
                min(nextInt, nextInt2);
                break;
            }
            case 3: {
                mul(nextInt, nextInt2);
                break;
            }
            case 4: {
                div(nextInt, nextInt2);
                break;
            }
            default: {}
        }
    }
}
