package main

func getMaxAvgSubarray(nums []int, k int) float64 {
	currentSum := 0
	for i := 0; i < k; i++ {
		currentSum += nums[i]
	}
	maxAvg := float64(currentSum / k)
	right := k
	left := 0
	for right < len(nums) {
		currentSum += nums[right] - nums[left]
		right++
		left++
		maxAvg = max(maxAvg, float64(currentSum/k))
	}
	return maxAvg
}
