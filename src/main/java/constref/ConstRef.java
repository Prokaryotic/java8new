package constref;

import java.util.function.Supplier;

/**
 * 构造器引用
 *
 * 格式：
 * ClassName::new
 * @author lijunxue
 * @create 2018-04-26 23:09
 **/
public class ConstRef {

    public static void main(String[] args) {
        Supplier<String> sup = () -> new String();
        // TODO 构造器引用
        Supplier<String> supplier = String::new;
    }
}
