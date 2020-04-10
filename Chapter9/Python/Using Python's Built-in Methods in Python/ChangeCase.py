"""
ChangeCase.py - This program converts a string to lowercase and uppercase.
Input:  Interactive
Output:  Uppercase and lowercase versions of the user-entered string.
"""
def lower(sample):
    #Change lowercase
    return sample.lower()

def upper(sample):
    #Change uppercase
    return sample.upper()

sample = input("Enter a string or done when you want to quit: ")

while sample != "done":
    # Call the lower method here and print the result.

    result = lower(sample)

    print("Lowercase: " + result)
    # Call upper method here and print the result.

    result = upper(sample)

    print("Uppercase: " + result)
    sample = input("Enter a string or done when you want to quit: ")




