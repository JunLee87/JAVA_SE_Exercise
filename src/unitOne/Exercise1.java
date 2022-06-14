package unitOne;

/*
 *  ### 打印九九乘法表
 * 简单：将九九乘法表打印到控制台。
 */

public class Exercise1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}
