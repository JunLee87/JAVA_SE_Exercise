package unitOne;

/*
### 青蛙跳台阶问题
困难：一共有n个台阶，一只青蛙每次只能跳一阶或是两阶，那么一共有多少种跳到顶端的方案？例如n=2，那么一共有两种方案，一次性跳两阶或是每次跳一阶。
1阶，方法1
2阶，方法2
3阶，方法3
4阶，方法5
5阶，方法8
6阶，方法13
…… 当前阶是前两阶方法数的和
 */
public class Exercise3 {
    public static void main(String[] args) {
        int jump1=1;
        int jump2=2;
        int temp=0;
        for (int i=3;i<=10;i++)
        {
            temp=jump2;
            jump2=jump1+jump2;
            jump1=temp;
            System.out.println(i+"阶，方法数："+jump2);
        }

    }
}
