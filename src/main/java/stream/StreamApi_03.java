package stream;

//import com.sun.javafx.image.IntPixelGetter;
//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import modle.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 终止操作
 *
 * 3.1 查找与匹配
 *
 * 3.2 归约
 *
 * 3.3 收集
 *
 * @author lijunxue
 * @create 2018-04-30 0:20
 **/
public class StreamApi_03 {


    public static void main(String[] args) {

        List<TPeople> peoples = Arrays.asList(
                new TPeople("zhangsan",14,3000, TPeople.Status.BUSY),
                new TPeople("lisi",13,33120,TPeople.Status.BUSY),
                new TPeople("wangwu",18,3300 ,TPeople.Status.BUSY),
                new TPeople("tianqi",45,304400, TPeople.Status.FREE),
                new TPeople("luer",41,300330, TPeople.Status.VOCATION)
        );
        /***
         * 3.1 查找与匹配
         *
         * 返回boolean
         * allMatch -- 检查是否匹配所有元素
         * anyMatch --检查是否至少匹配一个元素
         * noneMatch  -- 检查是否没有匹配所有元素
         *
         *
         *返回Optional<TPeople> optional 因为有可能是空值  可以用 optional1.orElse(元素对象)避免获取到空值
         * findFirst -- 返回第一个元素
         * findAny -- 返回流中任意的元素 是随机的
         *
         * 返回 一个long的值
         * count -- 返回流中元素的总个数
         * max -- 返回流中最大值
         * min -- 返回流中最小值
         *
         */
        // TODO allMatch -- 检查是否匹配所有元素
//        boolean b1 = peoples.stream().allMatch(e->e.getStatus().equals(TPeople.Status.BUSY));

        // TODO anyMatch -- 检查是否匹配所有元素
//        boolean b2 = peoples.stream().anyMatch(e->e.getStatus().equals(TPeople.Status.BUSY));

        // TODO noneMatch -- 检查是否匹配所有元素
//        boolean b3 = peoples.stream().noneMatch(e->e.getStatus().equals(TPeople.Status.BUSY));

        // TODO findFirst -- 返回第一个元素 排序的  只要有可能为空 就返回 optional
//        Optional<TPeople> optional1 = peoples.stream().sorted((e1, e2)->Double.compare(e1.getSalary(),e2.getSalary())).findFirst();

        // 如果 optional 里的对象是空的 那么用另一个代替
//        optional1.orElse(new TPeople("luer",41,300330, TPeople.Status.VOCATION));
        // 获取 optional 的对象
//        System.out.println(optional1.get());

        // TODO findAnd -- indAny -- 返回流中任意的元素 是随机的 只要有可能为空 就返回 optional
//        Optional<TPeople> optional2 = peoples.stream().filter(e->e.getStatus().equals(TPeople.Status.BUSY)).findAny();
        // TODO .parallelStream() 默认多线程
//        Optional<TPeople> optional3 = peoples.parallelStream().filter(e->e.getStatus().equals(TPeople.Status.BUSY)).findAny();
//        System.out.println(optional3.get());

        // TODO  count -- 返回流中元素的总个数 返回 一个long的值
//        Long count = peoples.stream().count();
//        System.out.println(count);

        // TODO  max -- 返回流中符合max的最大的元素 是随机的 只要有可能为空 就返回 optional
//        Optional<TPeople> optional4 = peoples.stream().max((e1, e2)->Double.compare(e1.getSalary(),e2.getSalary()));
//        System.out.println(optional4.get());

        // TODO  min -- 返回流中符合max的最大的元素 是随机的 只要有可能为空 就返回 optional
//        Optional<TPeople> optional5 = peoples.stream().max((e1, e2)->Double.compare(e1.getSalary(),e2.getSalary()));
//        System.out.println(optional5.get());


        /***
         *  3.2 归约
         *
         *reduce(T identity , BinaryOperator) / reduce(BinaryOperator)  可以将流中元素反复结合起来 得到一个值
         *
         */

        // TODO reduce(T identity , BinaryOperator) / reduce(BinaryOperator)  可以将流中元素反复结合起来 得到一个值

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        // 他有一个起始值 比如 0 他会先把0 给x 然后从流中取出元素做为y 进行操作吧结果返回给x 进行归约
//        list.stream().reduce(0,(x,y)->x+y);
//
//
//        Optional<Double> optional6 = peoples.stream().map(TPeople::getSalary).reduce(Double::sum);
//
//        System.out.println("sum  salary : " +optional6.get());

        /**
         * 3.3 收集
         * coccect 将流转换为其他形式。 接受一个collector接口的实现 用于给stream中元素做汇总的方法
         */

        // TODO coccect 将流转换为其他形式。 接受一个collector接口的实现 用于给stream中元素做汇总的方法 Collectors.toList()获取List的接口实现
        // TODO  存到list中
//        List<String> list1 = peoples.stream().map(TPeople::getName).collect(Collectors.toList());
//        list1.forEach(System.out::println);
        // TODO  存到set中
//        Set<String> set1 =  peoples.stream().map(TPeople::getName).collect(Collectors.toSet());
//        set1.forEach(System.out::println);
        // TODO  存到 HashSet 中 等等
//        HashSet<String> hashSet1 = peoples.stream().map(TPeople::getName).collect(Collectors.toCollection(HashSet::new));
//        hashSet1.forEach(System.out::println);

        //TODO 总数
//        Long count2 = peoples.stream().collect(Collectors.counting());
//        System.out.println(count2);

        // TODO 平均数
//        Double avg = peoples.stream().collect(Collectors.averagingDouble(TPeople::getSalary));
//        System.out.println(avg);

        // TODO 总和
//        Double sum = peoples.stream().collect(Collectors.summingDouble(TPeople::getSalary));
//        System.out.println(sum);

        // TODO 最大值元素
//        Optional<TPeople> optional7 = peoples.stream().collect(Collectors.maxBy((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())));
//        System.out.println(optional7.get());

        // TODO 最小值
//        Optional<Double> optional8 = peoples.stream().map(TPeople::getSalary).collect(Collectors.minBy(Double::compare));
//        System.out.println(optional8.get());

        // TODO 按照状态分组  返回的结果是一个 Map<bruopby 分类的依据里面的类型 ,List<元素的类型>>
//        Map<TPeople.Status,List<TPeople>> group1 = peoples.stream().collect(Collectors.groupingBy(TPeople::getStatus));

        // TODO 多级分组  返回的结果是一个 Map<bruopby 分类的依据里面的类型 ,List<元素的类型>>
//        Map<TPeople.Status,Map<String,List<TPeople>>> group2= peoples.stream().collect(Collectors.groupingBy(TPeople::getStatus,Collectors.groupingBy(e->{
//            if (((TPeople)e).getAge()<=15){
//                return "青年";
//            } else if (((TPeople)e).getAge()<=30){
//                return "中年";
//            } else{
//                return "老年";
//            }
//        })));



        //TODO  分区 满足条件的一个区不满足条件的一个区
//        Map<Boolean,List<TPeople>> group3 = peoples.stream().collect(Collectors.partitioningBy(e->e.getSalary()>5000));
//        System.out.println(group3);


        // TODO 获取 到统计类方便统计里面的值 DoubleSummaryStatistics
//        DoubleSummaryStatistics dss = peoples.stream().collect(Collectors.summarizingDouble(TPeople::getSalary));
//        System.out.println(dss.getAverage());
//        System.out.println(dss.getCount());
//        System.out.println(dss.getMax());
//        System.out.println(dss.getSum());
//        System.out.println(dss.getMin());

        // TODO 连接 join  把所有的元素按照一定的规则连接起来 连接的时候往里添加字符 返回一个字符串  joining 3个参数分别是 中间连接符 首字符串  尾字符串
        String str = peoples.stream().map(TPeople::getName).collect(Collectors.joining(",","head","tail"));
        System.out.println(str);

    }



}
