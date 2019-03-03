# Find the most frequent number in an array.
arr = [1, 2, 3, 1, 1]
# O(n^2) 
def findMode1(arr):
    mode = 0
    count = 0
    maxCount = 0
    for num1 in arr:
        currentValue = num
        for num2 + 1 in arr:
            comparedValue = num2
            if currentValue == comparedValue:
                count = count + 1
        if maxCount < count:
            maxCount = count
            mode = currentValue
        count = 0
    return mode

print(findMode1(arr))
