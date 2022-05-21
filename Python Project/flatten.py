"""
The isinstance() function returns True if the specified object is of the specified type, otherwise False.
If the type parameter is a tuple, this function will return True if the object is one of the types in the tuple.
"""

l = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
new_list = []

def flatten(n):
    for i in n:
        if isinstance(i, list):
            flatten(i)
        else:
            new_list.append(i)

flatten(l)
print(new_list)