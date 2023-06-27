def summation(num):
    sum = 0
    for i in range(num): #? iteration from 0 to n-1
        sum += (i+1) #? is expected to sum i, but i = iteration number - 1
    return sum
        
print(summation(8))