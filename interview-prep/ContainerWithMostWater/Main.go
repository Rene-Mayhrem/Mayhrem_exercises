package containerwithmostwater

func containerMostWater(heights []int) int {
	maxArea := 0
	left := 0
	right := len(heights) - 1
	for left < right {
		base := right - left
		height := min(heights[left], heights[right])
		currentArea := base * height
		maxArea = max(currentArea, maxArea)
		if heights[left] < heights[right] {
			left++
		} else {
			right--
		}
	}
	return maxArea
}

func main() {

}
