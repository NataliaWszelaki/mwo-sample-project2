package pl.edu.agh.mwo;

import org.junit.Before;
import org.junit.Test;
import pl.edu.agh.mwo.PitStop;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PitStopStatisticsTest {

    private List<PitStop> pitStops;
    private PitStopStatistics statistics;

    @Before
    public void setUp() {

        pitStops = new ArrayList<>();
        statistics = new PitStopStatistics();

        PitStop pitStop1 = new PitStop();
        pitStop1.setDriverNumber(1);
        pitStop1.setPitDuration(10.0);
        pitStop1.setLapNumber(1);

        PitStop pitStop2 = new PitStop();
        pitStop2.setDriverNumber(2);
        pitStop2.setPitDuration(20.0);
        pitStop2.setLapNumber(2);

        PitStop pitStop3 = new PitStop();
        pitStop3.setDriverNumber(3);
        pitStop3.setPitDuration(30.0);
        pitStop3.setLapNumber(3);

        pitStops.add(pitStop1);
        pitStops.add(pitStop2);
        pitStops.add(pitStop3);
    }

    @Test
    public void shouldCountPitStops() {
        int result = statistics.countPitStops(pitStops);
        assertEquals(3, result);
    }

    @Test
    public void shouldCalculateAveragePitDuration() {
        double result = statistics.calculateAveragePitDuration(pitStops);
        assertEquals(20.0, result, 0.001);
    }

    @Test
    public void shouldFindLongestPitStop() {
        PitStop result = statistics.findLongestPitStop(pitStops);
        assertEquals(30.0, result.getPitDuration(), 0.001);
        assertEquals(3, result.getDriverNumber());
    }

    @Test
    public void shouldFindFirstLap() {
        int result = statistics.findFirstLap(pitStops);
        assertEquals(1, result);
    }

    @Test
    public void shouldFindLastLap() {
        int result = statistics.findLastLap(pitStops);
        assertEquals(3, result);
    }
}
