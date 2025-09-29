package main

import "fmt"

func subarraySum(nums []int, k int) int {
	//? counter for valid subarrays
	count := 0
	//? Create currentSum to keep track on prefixSum values
	currentSum := 0
	//? Creating frequency map
	frequencySum := map[int]int{0: 1}
	//? Get prefix sum from nums and fill the map
	for _, num := range nums {
		currentSum += num //! Get prefix sum
		//? Search
		target := currentSum - k
		if val, ok := frequencySum[target]; ok {
			count += val
		}

		frequencySum[currentSum]++
	}

	return count
}

func main() {
	fmt.Println("Hello World")
}
