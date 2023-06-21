def remove_smallest(numbers):
    #? Creates a new copy list
    incredible_dull_things = numbers[:]
    #? [:] -> create slice of lists
    #? It means that you create a separate list of the original list with only the values
    #? You can use incredible_dull_things = numbers, but this will mutate the original list
    #? Any modification applied to the new list will not affect the original one
    if incredible_dull_things:
        incredible_dull_things.remove(min(incredible_dull_things))
    return incredible_dull_things

