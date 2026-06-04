package pl.edu.agh.mwo;

import java.io.IOException;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java MainApp <json-file> <statistic-type>");
            return;
        }
        String filePath = args[0];
        String statisticType = args[1];

        JsonReader jsonReader = new JsonReader();
        PitStopStatistics statistics = new PitStopStatistics();
        PitStopPrinter printer = new PitStopPrinter();

        try {
            List<PitStop> pitStops = jsonReader.readFromFile(filePath);
            printer.printStatistic(statisticType, pitStops, statistics);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}