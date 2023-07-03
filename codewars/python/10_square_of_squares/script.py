import math

def is_square(number):
    try:
        root_number = math.sqrt(number)
        return root_number == int(root_number)
    except:
        return False