def remove_smallest(numbers):
    incredible_dull_things = [] #? new list to return
    if numbers: #? check list is not empty
        minimum = numbers[0] #? minimum value according to the list
        index_minimum = 0
        for index, number in enumerate(numbers):
            #? finding new minimum value
            if minimum > number: 
                minimum = number
                index_minimum = index
        #? mutating the list of numbers
        incredible_dull_things = [new_number for i, new_number in enumerate(numbers) if i != index_minimum]
    return incredible_dull_things

print(remove_smallest([1,2,3,4,5]))