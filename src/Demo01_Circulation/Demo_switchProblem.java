package Demo01_Circulation;
/**switch注意事项
 * 1、多个case不可以重复
 * 2、switch后面小括号中只能是下列数据类型
 *          byte/short/char/int
 *          引用类型 ：String字符串、enum枚举
 * 3、switch语句格式可以很灵活，前后顺序可以颠倒，而且break语句还可以省略**/
public class Demo_switchProblem {
    public static void main ( String[] args ) {
        int num = 1;
        switch (num){
            case 2:
                System.out.println ("nihaooooo" );
            case 1:
                System.out.println ("nihao " );
            case 3:
                System.out.println ("jiayou " );
            case 4 :
                System.out.println ("加油" );
            default:
                System.out.println ("错误" );
                break;
        }

    }
}
