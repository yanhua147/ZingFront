import java.util.Scanner;
/**算法思路：任何可以进行分解的整数，必然满足(m+n)(n-m+1)/2的形式，即（首项+末项）*项数/2
 *          暴力循环破解
 * 时间复杂度O(n*n)
 * 空间复杂度O(1)
 */
public class Fenjie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input n:");
        int n = scanner.nextInt();
        int flag = 0;
        int begin, end;
        for (begin = 1; begin < n; begin++) {
            for (end = begin + 1; end < n; end++) {
                int sum = (begin + end) * (end- begin + 1) / 2;
                if (sum == n) {
                    //能分解
                    flag = 1;
                    for (int i = begin; i <= end; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
        }
        //不能分解
        if (flag == 0) {
            System.out.println("NONE");
        }
    }
}
