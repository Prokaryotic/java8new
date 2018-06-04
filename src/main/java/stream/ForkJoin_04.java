package stream;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

/**
 * @author lijunxue
 * @create 2018-04-30 16:59
 **/
public class ForkJoin_04 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        LongStream.rangeClosed(0,10000).parallel().reduce(0,Long::sum);
        Instant end = Instant.now();
        System.out.println("耗费时间 ："+ Duration.between(start,end).toString());

    }

}
