package Demo01_Circulation;

public class Demo_for {
    public static void main ( String[] args ) {
        /**
         * 循环结构基本组成，可分为四部分
         * 1、初始化语句：在循环嘴唇执行，只执行一次
         * 2、条件判断：如果成立，则循环继续，如果不成立，退出循环
         * 3、循环体：重复要做的事情，若干行语句
         * 4、步进语句：每次循环之后都要进行扫尾工作
         * for语句格式
         * for(初始化语句      布尔表达式： 步进表达式){
         * 循环体;
         * }
         * 执行顺序：初始化语句-->布尔表达式-->循环体-->步进表达式
         */

        for (int i=1;i<=100;i++){
            System.out.println ("我错了"+ i );
        }
        System.out.println ("程序停止" );
    }
}
