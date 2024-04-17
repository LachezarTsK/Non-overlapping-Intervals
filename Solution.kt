
class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        intervals.sortWith { x, y -> x[1] - y[1] }

        var numberOfErasedOverlappingIntervals = 0
        var endIntervalValue = intervals[0][1]
        var index = 1

        while (index < intervals.size) {
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
