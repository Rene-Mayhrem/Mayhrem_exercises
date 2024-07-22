function sum (numbers) {
  var sum = 0;
  for(var number of numbers) {
    sum += number;
  }
  return sum;
};

console.log(sum([1, 2, 3, 4, -1]));