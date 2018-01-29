package lambdaAndLinq;

import java.util.*;
import java.util.stream.Collectors;

public class Camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, List<String>> peopleVehicle = new LinkedHashMap<>();
        LinkedHashMap<String, Long> peopleNights = new LinkedHashMap<>();

        String input = sc.nextLine();

        while (!"end".equals(input)) {
            String[] token = input.split(" ");
            String name = token[0];
            String model = token[1];
            int nights = Integer.parseInt(token[2]);

            if (!peopleVehicle.containsKey(name)) {
                peopleVehicle.put(name, new ArrayList<>());
                peopleNights.put(name, 0L);
            }
            peopleVehicle.get(name).add(model);
            peopleNights.put(name, peopleNights.get(name) + nights);

            input = sc.nextLine();
        }

        peopleVehicle.entrySet().stream()
                .sorted((a, b) -> {
                    int index = Integer.compare(b.getValue().size(), a.getValue().size());
                    if (index == 0) {
                        index = Integer.compare(a.getKey().length(), b.getKey().length());
                    }
                    return index;
                }).forEach(p ->{
            System.out.println(p.getKey() + ": " + p.getValue().size());
            p.getValue().forEach(c -> System.out.println("***"+ c));
            System.out.println("Total stay: " + peopleNights.get(p.getKey()) + " nights");
        });
    }
}

/*
input->
Pesho BigTruck2000 20
Stefan HeliumV100 10
Pesho ILoveRVs100 5
Maria MyPrecious 20
Gesh BigTruck1500 7
Bibi Mercedes 3
Gesh AwesomeCamper1000 12
end
 */