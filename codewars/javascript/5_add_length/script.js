function addLength (str) {
  var my_array = []
  words = str.split(' ');
  for (var word of words) {
    my_array.push(`${word} ${word.length}`);
  }
  
}

// function addLength(str){
//   return str.split(" ").map(s => `${s} ${s.length}`)
// }

addLength("apple ban")
