def countdown():
    for i in range(10,-1,0):{
        print(i)
    }

def printreturn(numbers):
    print(numbers[0]) 
    return numbers[1]

def firstpluslength(lst):
    return lst[0] + len(lst)

def values_greater_than_second(lol):
    if len(lol) < 2:
        return False
    
    second_value = lol[1]
    lol2 = [val for val in lol if val > second_value]
    
    print(len(lol2))
    return lol2



