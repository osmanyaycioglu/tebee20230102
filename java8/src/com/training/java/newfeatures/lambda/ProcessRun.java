package com.training.java.newfeatures.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.java.oo.CarImBuilder;

public class ProcessRun {

    public static void main(final String[] args) {
        List<String> strList = new ArrayList<>();
        Map<String, Integer> mapLoc = new HashMap<>();
        IProcessEx<String, String> exLoc1 = w -> w + " test";
        IProcessEx<Integer, String> exLoc2 = w -> Integer.parseInt(w);
        IProcessEx<CarImBuilder, String> exLoc3 = w -> CarImBuilder.getBuilder()
                                                                   .setName(w)
                                                                   .setCapacity(1000)
                                                                   .build();
        IProcessEx<Double, String> exLoc4 = w -> Double.parseDouble(w);


    }
}
