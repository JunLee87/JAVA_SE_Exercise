package unitOne;

/*
 *  ### 求1000以内的水仙花数
 * 中等：打印1000以内所有满足水仙花的数，“水仙花数”是指一个三位数其各位数字的立方和等于该数本身，例如153是“水仙花数”，因为：153 = 1^3 + 5^3 + 3^3
 *
 *      int i=153;
        System.out.println("个位"+i%10);
        System.out.println("十位"+i/10%10);
        System.out.println("百位"+i/100%10);
 */

public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            int sum = 0;
            int temp = 0;
            //百位 是否有值
            if (i / 100 != 0) {
                temp = i / 100 % 10;
                sum = sum + (temp * temp * temp);
            }
            //十位 是否有值
            if (i / 10 != 0) {
                temp = i / 10 % 10;
                sum = sum + (temp * temp * temp);
            }
            //个位 是否有值
            if (i % 10 != 0) {
                temp = i % 10;
                sum = sum + (temp * temp * temp);
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }

    }
}
