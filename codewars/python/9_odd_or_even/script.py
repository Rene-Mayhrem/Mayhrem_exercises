def odd_or_even(arr):
    return "odd" if sum(arr) % 2 != 0 else "even" 

print(odd_or_even([1,2,3,4,5]))