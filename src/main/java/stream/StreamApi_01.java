package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * 第一步 创建Stream
 *
 * 第二步 中间操作
 *
 * 第三步 终止操作(终端操作)
 *
 * @author lijunxue
 * @create 2018-04-29 22:26
 **/
public class StreamApi_01 {

    public static void main(String[] args) {
        // 创建 Stream

        // 1.0 通过 Collection 系列的集合提供的stream() 顺序流 或者parallelStream() 并行流(默认多线程)
        List<String> list = new ArrayList<>();
        Stream<String> stringStream01 = list.stream();

        // 2.0 通过Arrays 中的静态方法stream() 获取数组流
        String[] strings = new String[]{"","",""};
        Stream<String> stringStream02 = Arrays.stream(strings);

        // 3.0 通过Stream类中的静态方法 of()
        Stream<String> stringStream03 = Stream.of(strings);

        // 4.0 创建无限流
        // 4.1迭代
        // 第一个是 种子 第二个是进行相同操作后的 值 比如传进去的是0 他就会 在流里生成 0 2 4 6 8 10...的结果的集合 然后生成流
        Stream<Integer> stringStream04 = Stream.iterate(0,(x)->x+2);

        //4.2生成 直接通过生成集合的流
        Stream.generate(()->Math.random());


    }


    public void test1(){





    }


}
