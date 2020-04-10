"""
Reverse.py - This program reverses numbers stored in an array.
Input: Interactive.
Output: Original contents of array and the reversed contents of the array.
"""


# Write reverseArray function here.
def reverseArray(array):
    for i in range(len(array)//2):
        array[i], array[len(array)-i-1] = array[len(array)-i-1], array[i]

numbers = [9, 8, 7, 6, 5]

# Print contents of array.
print("Original contents of array:")
print(numbers)
# Call reverseArray function here.
# 
print("Reversed contents of array:")
reverseArray(numbers)

# Print contents of reversed array.
print(numbers)
