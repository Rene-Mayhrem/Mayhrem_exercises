class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result = []
        max_value = max(candies)
        for candy in candies:
            result.append((candy + extraCandies) >= max_value)
        return result
