
function eraseOverlapIntervals(intervals: number[][]): number {
    intervals.sort((x, y) => x[1] - y[1]);

    let numberOfErasedOverlappingIntervals = 0;
    let endIntervalValue = intervals[0][1];
    let index = 1;

    while (index < intervals.length) {
        if (endIntervalValue > intervals[index][0]) {
            ++numberOfErasedOverlappingIntervals;
        } else {
            endIntervalValue = intervals[index][1];
        }
        ++index;
    }

    return numberOfErasedOverlappingIntervals;
};
