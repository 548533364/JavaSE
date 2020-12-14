package Demo03;

/**
 * 练习题
 * 定义一个方法，定义一个数字是否相同
 *
 */
public class DemoMethodSame {
    public static void main ( String[] args ) {
        System.out.println (isSame ( 10,20 ) );
        System.out.println (isSame ( 20,20 ) );
    }
    //三要素
    //返回值类型
    //方法名称
    //参数列表
    public static boolean isSame(int a, int b){
        //boolean smae;
        /*if (a==b){
            smae = true;
        }else {
            smae = false;vvb
        }*/
        //smae =a == b ? true:false;
       // boolean  smae = a==b;
        return  a==b;
    }
}
