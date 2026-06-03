package pl.edu.agh.mwo;

import java.util.List;

public class PitStopStatistics {

    public int countPitStops(List<PitStop> pitStops) {
        return pitStops.size();
    }

    public PitStop findLongestPitStop(List<PitStop> pitStops) {

        PitStop longestPitStop = pitStops.get(0);
        for (PitStop pitStop : pitStops) {
            if (pitStop.getPitDuration() > longestPitStop.getPitDuration()) {
                longestPitStop = pitStop;
            }
        }
        return longestPitStop;
    }

    public double calculateAveragePitDuration(List<PitStop> pitStops) {

        double sum = 0;
        for (PitStop pitStop : pitStops) {
            sum += pitStop.getPitDuration();
        }
        return sum / pitStops.size();
    }

    public int findFirstLap(List<PitStop> pitStops) {

        int firstLap = pitStops.get(0).getLapNumber();
        for (PitStop pitStop : pitStops) {
            if (pitStop.getLapNumber() < firstLap) {
                firstLap = pitStop.getLapNumber();
            }
        }
        return firstLap;
    }

    public int findLastLap(List<PitStop> pitStops) {

        int lastLap = pitStops.get(0).getLapNumber();
        for (PitStop pitStop : pitStops) {
            if (pitStop.getLapNumber() > lastLap) {
                lastLap = pitStop.getLapNumber();
            }
        }
        return lastLap;
    }
}