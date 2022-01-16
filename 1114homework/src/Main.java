import java.util.Scanner;

/**
 * @author jzh
 * @version 1.0
 * @date 2022/1/14 11:17
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加在控制台进行输入。
 */
public class Main {
    public static void main(String[] args) {
//        {
//            System.out.println("请输入a的值");
//            Scanner scanner = new Scanner(System.in);
//            int a = scanner.nextInt();
//            System.out.println("a的值为" + a);
//            System.out.println("情输入多少个数字相加");
//            int i1 = scanner.nextInt();
//            System.out.println(i1 + "个数字相加");
//            int nums = 0;
//
//            int[] ints = new int[i1];
//            for (int j = 0; j < i1; j++) {
//                nums = (nums * 10) + a;
//                ints[j] = nums;
////            nums+=nums;
//            }
////        System.out.println(nums);
//            int he = 0;
//            for (int i = 0; i < ints.length; i++) {
//                he += ints[i];
//                System.out.println(ints[i]);
//            }
//            System.out.println(i1 + "个" + a + "的和为" + he);
//        }
/*判断101-200之间有多少个素数，并输出所有素数。
一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数
如果能被整除， 则表明此数不是素数，反之是素数。 */

        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j <= i; j++) {
                if ((i % j == 0) && i != j) {
                    break;
                }
                if (j == i) {
                    System.out.println("素数为"+i);
                }
            }
        }


    }
}
