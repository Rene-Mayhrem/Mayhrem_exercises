function squareSum(numbers) {
  // ? variable to hold the sum
  let sum = 0;
  // ? iterating through the numbers
  numbers.forEach(number => {
    sum += Math.pow(number, 2);
  });
  return sum;
}

console.log(squareSum([1, 2, 2]));