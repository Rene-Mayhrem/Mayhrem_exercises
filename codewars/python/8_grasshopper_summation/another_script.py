# def summation(num):
#     for i in range(0, num + 1, 5): #? (start, stop, step)
#         print(i)

def summation(num):
    return sum(range(1, num+1))
    
print(summation(8))