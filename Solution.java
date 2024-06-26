
import java.util.Arrays;

public class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> x[1] - y[1]);

        int numberOfErasedOverlappingIntervals = 0;
        int endIntervalValue = intervals[0][1];
        int index = 1;

        while (index < intervals.length) {
            if (endIntervalValue > intervals[index][0]) {
                ++numberOfErasedOverlappingIntervals;
            } else {
                endIntervalValue = intervals[index][1];
            }
            ++index;
        }

        return numberOfErasedOverlappingIntervals;
    }
}
