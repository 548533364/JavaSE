package Demo01_Circulation;

/**
 * continue一旦被执行，立刻跳过当前次循环剩余内容，马上开始下一次循环
 *
 */
public class Demo_Continue {
    public static void main ( String[] args ) {
        for (int i = 1; i <=10 ; i++) {
            if (i==4){//如果当前是第四层
                continue;   //那么跳过当前次循环，马上开始下一次循环
            }
            System.out.println (i+"楼到了。" );
        }
    }
}
