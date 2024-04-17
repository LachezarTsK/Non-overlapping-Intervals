
#include <ranges>
#include <vector>
using namespace std;

class Solution {

public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) const {
        ranges::sort(intervals, [](const auto& x, const auto& y){return x[1] < y[1];});

        int numberOfErasedOverlappingIntervals = 0;
        int endIntervalValue = intervals[0][1];
        size_t index = 1;

        while (index < intervals.size()) {
            if (endIntervalValue > intervals[index][0]) {
                ++numberOfErasedOverlappingIntervals;
            }
            else {
                endIntervalValue = intervals[index][1];
            }
            ++index;
        }

        return numberOfErasedOverlappingIntervals;
    }
};
