
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**算法描述：将两个字符串分别存到数组里，从头开始比较，相同的放入list，最后判断list大小输出第一个。
 * 时间复杂度O(n*n)
 * 空间复杂度O(n)
 */
public class GetCommonS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the first str:");
        String str1 = scanner.nextLine();
        System.out.println("input the second str:");
        String str2 = scanner.nextLine();
        scanner.close();
        String cut="\\s+";
        //放入数组
        List newStr1 = Arrays.asList(str1.split(cut));
        List newStr2 = Arrays.asList(str2.split(cut));
        //创建list
        ArrayList<String> list=new ArrayList<>();
        //循环判断
        for (int i = 0; i <newStr1.size() ; i++) {
           if (newStr2.contains(newStr1.get(i))){
               list.add((String) newStr1.get(i));
           }
        }
        //判断是否没有相同的
        if (list.size() == 0){
            System.out.println("NULL");
        }else {
            //输出第一个
            System.out.println(list.get(0));
        }
     }
}
