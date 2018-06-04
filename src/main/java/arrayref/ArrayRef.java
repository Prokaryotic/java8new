package arrayref;

import java.util.function.Function;

/**
 * 数组引用
 *
 * @author lijunxue
 * @create 2018-04-26 23:15
 **/
public class ArrayRef {
    public static void main(String[] args) {
        Function<Integer, String[]> fun1 = (x) -> new String[x];
        Function<Integer, String[]> fun2 = String[]::new;
    }
}
