function addLength (str) {
  var my_array = []
  words = str.split(' ');
  for (var word of words) {
    my_array.push(`${word} ${word.length}`);
  }
}

addLength("apple ban")