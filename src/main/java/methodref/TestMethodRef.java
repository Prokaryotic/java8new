package methodref;

import javafx.print.Printer;

import java.io.PrintStream;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * java8新特性 方法引用
 *
 * 若lambda 体中的内容 有方法已经实现了 我们可以使用"方法引用"
 *
 * 主要有三种语法格式
 *
 * Lambda 体中调用方法的参数列表于返回值类型一模一样
 *
 * 对象::实例方法名
 *
 * 类::静态方法名
 *
 * 类::实例方法名
 *
 *  lambda 体中调用了第一个参数的实例方法而 且里面的参数是lambda参数列表中的第二个参数时
 *  若只有一个参数也符合当前的设定e.getName() 相当于2个参数一个  第一是e 第二个是没有参数void
 *
 * @author lijunxue
 * @create 2018-04-26 22:33
 **/
public class TestMethodRef {

    public static void main(String[] args) {
        /***********************对象::实例方法名************************/
        Consumer<String> consumer1 = (x)-> System.out.println(x);
        PrintStream p = System.out;
        Consumer<String> consumer2 = (x)-> p.println(x);
        /**-------------------------方法引用-------------------------**/

        Consumer<String> consumer3 =p::print;
        Consumer<String> consumer4 =System.out::print;
        // TODO 这里要注意 函数接口 comsumer 需要实现的方法 和 print 的方法返回值和入参数 顺序 个数 类型一模一样
        /***********************类::静态方法名************************/
        Consumer<String> consumer5 =TestMethodRef::m;

        /***********************类::实例方法名************************/
        // TODO  lambda 体中调用了第一个参数的实例方法 而且里面的参数是lambda参数列表中的第二个参数时
        BiPredicate<String,String> bp1 = (x,y)->x.equals(y);
        BiPredicate<String,String> bp2 = String::equals;
    }

    public static void m(String stirng){ // 返回值和入参顺序个数都要一抹一样
        System.out.println("666");
    }
}
