package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;
import java.io.File;
import org.example.SportBag;



public class Program {
    public static void main(String[] args) throws IOException {

        Fabric fabric1 = new Fabric("полиэстер", 600);
        Fabric fabric3 = new Fabric("плащевая ткань", 250);
        Fabric fabric4 = new Fabric("нейлон", 1200);
        Fabric fabric5 = new Fabric("замша", 1500);

        List<String> sp1 = new ArrayList<>();
        Collections.addAll(sp1, "football", "basketball", "volleyball");

        List<String> sp2 = new ArrayList<>();
        Collections.addAll(sp2, "fitness", "jogging");

        List<String> sp3 = new ArrayList<>();
        Collections.addAll(sp2, "ice hockey");

        List<String> sp4 = new ArrayList<>();
        Collections.addAll(sp4, "snowboarding", "skiing");

        List<String> sp5 = new ArrayList<>();
        Collections.addAll(sp5, "tennis", "badminton");

        List<Fabric> out1 = new ArrayList<>();
        Collections.addAll(out1, fabric1);

        List<Fabric> in1 = new ArrayList<>();
        Collections.addAll(in1, fabric1, fabric5);

        List<Fabric> out2 = new ArrayList<>();
        Collections.addAll(out2, fabric1, fabric4, fabric3);

        List<Fabric> in2 = new ArrayList<>();
        Collections.addAll(in2, fabric1, fabric4, fabric3);


        SportBag[] bags = {
                new SportBag(sp1, false, true, 25, "Puma", out1, in1),

                new SportBag(sp1, false, false, 40, "Nike", out1, in1),
                new SportBag(sp1, true, true, 60, "Adidas", out1, in1),
                new SportBag(sp2, true, false, 15, "Puma", out1, in1),

                new SportBag(sp2, true, true, 45, "Nike", out2, in2),
                new SportBag(sp2, true, true, 25, "Demix", out2, in2),
                new SportBag(sp3, true, true, 150, "CCM", out2, in2),
                new SportBag(sp3, true, true, 200, "CCM", out2, in2),

                new SportBag(sp4, true, true, 100, "Kyoto", out2, in2),
                new SportBag(sp4, true, true, 200, "Kyoto", out2, in2),
                new SportBag(sp5, false, true, 30, "Head Core", out2, in1),
                new SportBag(sp5, true, true, 15, "Head Core", out2, in1)

        };

        toJSON(bags);

        for (SportBag object : fromJSON()) {
            System.out.println(object.toString());
        }

    }

    static void toJSON(SportBag[] bags) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File("bags.json"), bags);
    }

    static public SportBag[] fromJSON() throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("bags.json"));
        ObjectMapper mapperBack = new ObjectMapper();
        return mapperBack.readValue(jsonData, SportBag[].class);
    }


}


