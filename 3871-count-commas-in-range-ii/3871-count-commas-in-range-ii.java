class Solution {
    public long countCommas(long n) {
        if (n < 1000) {
            return 0;
        } else if (n < 1000000) {
            return n - 999L;
        } else if (n < 1000000000L) {
            return (n - 999_999L) * 2L + 999_000L;
        } else if (n < 1_000_000_000_000L) {
            return (n - 999_999_999L) * 3L + 1_998_000_000L + 999_000L;
        } else if (n < 1_000_000_000_000_000L) {
            return (n - 999_999_999_999L) * 4L + 2_997_000_000_000L + 1_998_000_000L + 999_000L;
        } else {
            
            return (n - 999_999_999_999_999L) * 5L + 3_996_000_000_000_000L + 2_997_000_000_000L + 1_998_000_000L + 999_000L;
        }
    }
}