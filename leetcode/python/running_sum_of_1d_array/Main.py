class Solution:
    def runningSum (self, nums: List[int]) -> List[int]:
        prefix_sum = []
        prefix_sum[0] = nums[0]
        for i in range(1, len(nums)):
            prefix_sum[i] = prefix_sum[i - 1] + nums[i]
        return prefix_sum 
    
    def running_sum_ii (self, nums: list[int]) -> List[int]:
        for i in range(1, len(nums)):
            nums[i] += nums[i - 1]
        return nums