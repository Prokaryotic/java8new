package stream;

import modle.TPeople;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamApi_03Test {


    
    @Test
    public void mm(){

        List<TPeople> peoples = Arrays.asList(
                new TPeople("zhushouming",14,3000),
                new TPeople("lisi",13,33120),
                new TPeople("wangwu",18,3300),
                new TPeople("tianqi",45,304400),
                new TPeople("luer",41,300330)
        );



        var newPeoples = peoples.stream().filter(e->e.getAge()==11).collect(Collectors.toList());




    }
}