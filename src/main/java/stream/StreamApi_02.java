package stream;

import modle.TPeople;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 第一步 创建Stream
 *
 * 第二步 中间操作
 *
 * 第三步 终止操作(终端操作)
 *
 * @author lijunxue
 * @create 2018-04-29 22:42
 **/
public class StreamApi_02 {

    public static void main(String[] args) {





        List<TPeople> peoples = Arrays.asList(
                new TPeople("zhangsan",14,3000),
                new TPeople("lisi",13,33120),
                new TPeople("wangwu",18,3300),
                new TPeople("tianqi",45,304400),
                new TPeople("luer",41,300330)
        );
        //TODO 中间操作
        /***
         * 1.0 筛选于切片
         * filter 接受Lambda 从流中排除某些元素
         * limit 截断流 使其蒜素不超过给定数量
         * skip(n) 跳过元素 返回1个扔掉了前n个元素的流 若流中元素不足n个则返回一个空流 与limit(n)正好合起来是一个完整的流
         * distinct 删选 通过流锁生成元素的hashCode() 和equals() 去重复的元素
         *
         */
        // TODO 流的操作是有先后顺序的 .limit(2).skip(1) 和.skip(1).limit(2) 是不一样的
        // TODO filter 接受Lambda 从流中排除某些元素  会在终止操作时执行 没有终止操作就不会执行  惰性求值 内部迭代
//        Stream<TPeople> tPeopleStream01 = peoples.stream().filter(e->e.getAge()>0).limit(2).skip(1);


        // TODO 使其元素不超过内定的数量 有类似的短路操作 满足条件后 后面的元素不在计算
//        peoples.stream().limit(2); // &&和||类似  在filter的时候 只会迭代2个满足条件的 多的就不迭代了

        // TODO 跳过
//        peoples.stream().skip(1);

        // TODO distinct 删选 通过流锁生成元素的
        // TODO hashCode() 和equals() 去重复的元素 需要自定义 equals
//        peoples.stream().distinct();



        /***
         * 2.0 映射
         *
         * map 接受lambda 将元素转换成其他形式或提取信息。接受一个函数作为参数，该函数会被引用到每个元素上
         * 并将其映射成一个新的元素
         *
         * flatMap 扁平化 接收一个函数作为参数 将流中的每个值都换成另一个流 然后把所有的流连接成一个流
         *
         *
         */
        // TODO 在function的时候需要 返回一个新的元素
//        peoples.stream().map((x)->new TPeople(x.getName(),x.getAge()+1, x.getSalary()+1000)).forEach(System.out::println);
//          peoples.stream().map(TPeople::getName).forEach(System.out::println);

          //TODO  flatMap 扁平化 接收一个函数作为参数 将流中的每个值都换成另一个流 然后把所有的流连接成一个流 类似原来List<List<String>> 变成一个List<String>
//        peoples.stream().map(TPeople::getName).flatMap(StreamApi_02::getStream).forEach(System.out::println);



        /***
         * 3.0 排序
         *
         * sorted() -- 自然排序 Comparator 按照元素内部的compareTo 方法排的
         *
         * sorted(Comparator com) --定制排序
         *
         */

        //TODO  自然排序 sorted() -- 自然排序 Comparator 按照元素内部的compareTo 方法排的
//        peoples.stream().sorted().forEach(System.out::println);

        // TODO sorted(Comparator com) --定制排序
//        peoples.stream().sorted((e1,e2)->{
//            if (e1.getAge()==e2.getAge()){
//                return e1.getName().compareTo(e2.getName());
//            } else{
//                return e1.getAge()-e2.getAge(); // 这样是从小到大  1 2 3 5 9
//            }
//        }).forEach(System.out::println);
        // 这个是终止操作
//        tPeopleStream01.forEach(System.out::println);








    }

    public static Stream<Character> getStream(String s){
        List<Character> list = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list.stream();
    }
}
