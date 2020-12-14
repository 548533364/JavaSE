package Demo01_Circulation;

public class Demo_switch {
    /**
     * switch(表达式){
     *     case 常量值1:
     *     语句体1;
     *     break;
     *     case 常量值2:
     *     语句体2;
     *     break;
     *     .......
     *     default:
     *     语句体n+1;
     *     break;
     * }
     */
    public static void main ( String[] args ) {
        int num = 10;
        switch (num){
            case 1:
                System.out.println ("星期一" );
                break;
            case 2:
                System.out.println ("星期二" );
                break;
            case 3:
                System.out.println ("星期三" );
                break;
            case 4:
                System.out.println ("星期四" );
                break;
            case 5:
                System.out.println ("星期五" );
                break;
            case 6:
                System.out.println ("星期六" );
                break;
            default:
                System.out.println ("数据不合理" );
                break;     //可以省略，但是强烈不建议
        }
    }
}
