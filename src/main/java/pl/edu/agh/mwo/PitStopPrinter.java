package pl.edu.agh.mwo;

import java.util.List;

public class PitStopPrinter {

    public void printStatistic(
            String statisticType,
            List<PitStop> pitStops,
            PitStopStatistics statistics) {

        switch (statisticType) {
            case "number":
                System.out.println("Number of pit stops: " + statistics.countPitStops(pitStops));
                break;
            case "longest":
                PitStop longestPitStop = statistics.findLongestPitStop(pitStops);
                System.out.println("Longest pit stop: " + longestPitStop.getPitDuration()
                        + " seconds, driver " + longestPitStop.getDriverNumber());
                break;
            case "average":
                System.out.println("Average pit duration: " + statistics.calculateAveragePitDuration(pitStops));
                break;
            case "first&last":
                System.out.println("First pit stop lap: " + statistics.findFirstLap(pitStops));
                System.out.println("Last pit stop lap: " + statistics.findLastLap(pitStops));
                break;
            default:
                System.out.println("Invalid statistic type. Available values: count, average, longest, first&last");
        }
    }
}