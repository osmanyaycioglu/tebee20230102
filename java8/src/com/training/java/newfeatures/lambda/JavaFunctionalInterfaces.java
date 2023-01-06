package com.training.java.newfeatures.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.training.java.oo.CarImBuilder;

public class JavaFunctionalInterfaces {

    public static void main(final String[] args) {
        Consumer<String> consumerLoc1 = s -> System.out.println(s);
        Consumer<String> consumerLoc2 = System.out::println;
        Consumer<Integer> consumerLoc3 = i -> System.out.println("Gelen data : " + i);

        BiConsumer<String, Integer> biConsumerLoc = (s,
                                                     i) -> System.out.println(s + " : " + i);
        IntConsumer intConsumerLoc = pi -> System.out.println("Primitive : " + pi);
        LongConsumer longConsumerLoc = pl -> System.out.println("Primitive : " + pl);
        DoubleConsumer doubleConsumerLoc = pd -> System.out.println("Primitive : " + pd);

        List<String> stringList = Arrays.asList("osman",
                                                "mehmet",
                                                "ali",
                                                "veli");
        for (String stringLoc : stringList) {
            System.out.println(stringLoc);
        }
        System.out.println("-----------------");
        stringList.forEach(System.out::println);

        //--------

        Function<String, Integer> functionLoc1 = s -> Integer.parseInt(s);
        Function<String, CarImBuilder> functionLoc2 = s -> CarImBuilder.getBuilder()
                                                                       .setName(s)
                                                                       .setCapacity(1000)
                                                                       .build();
        BiFunction<String, String, Integer> biFunctionLoc = (s1,
                                                             s2) -> Integer.parseInt(s1) + Integer.parseInt(s2);
        IntFunction<CarImBuilder> intFunctionLoc = pi -> CarImBuilder.getBuilder()
                                                                     .setName("BMW")
                                                                     .setHoursePower(pi)
                                                                     .build();
        Integer applyLoc = functionLoc1.apply("1000");
        Integer apply2Loc = functionLoc2.andThen(cim -> cim.getCapacity())
                                        .apply("BMW");

        UnaryOperator<String> unaryOperatorLoc1 = s -> s + "Test";
        Function<String, String> unaryOperatorLoc2 = s -> s + "Test";

        BinaryOperator<String> binaryOperatorLoc1 = (s1,
                                                     s2) -> s1 + " : " + s2;
        BiFunction<String, String, String> binaryOperatorLoc2 = (s1,
                                                                 s2) -> s1 + " : " + s2;

        //---------
        Predicate<String> predicateLoc1 = s -> s.length() > 8;
        Predicate<Integer> predicateLoc2 = i -> i >= 100;
        BiPredicate<Integer, Integer> biPredicateLoc = (i1,
                                                        i2) -> (i1 * 10) > i2;
        // -------
        Supplier<String> supplierLoc = () -> "osman tulgar yaycıoğlu";

    }
}

