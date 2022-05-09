package by.academy.lesson17;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<String> streamIntermediate = Stream.generate(()-> new Random().nextInt(1000)+500).limit(1000).skip(100).
                filter(i->i%2==1).sorted().distinct().map(n-> "Строка с номером: " + n).limit(350).collect(Collectors.toList());
        System.out.println(streamIntermediate);

        Optional<Integer> streamIntermediate1 = Stream.generate(()-> new Random().nextInt(1000)+500).limit(1000).skip(100).
                filter(i->i%2==1).sorted().distinct().limit(350).min(Comparator.comparing(Integer::valueOf));

        boolean streamIntermediate2 = Stream.generate(()-> new Random().nextInt(1000)+500).limit(1000).skip(100).
                filter(i->i%2==1).sorted()
                .distinct()
                .limit(350)
                .map(n-> "Строка с номером: " + n)
                .anyMatch("Строка с номером: 501":: equals);
        System.out.println(streamIntermediate1);
        System.out.println(streamIntermediate2);
//System.out.println(streamIntermediate.stream().max(Comparator.comparing(String::valueOf)));

//        System.out.println(streamIntermediate.stream().findAny("Строка с номером: );
    }



    private static List<Integer> generateIntegerList(Integer seed, Integer size) {

        Supplier<Integer> s = () -> new Random().nextInt(seed);

        return Stream.generate(s).limit(size).collect(Collectors.toList());
    }
}

