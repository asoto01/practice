# Find pairs in an integer array whose sum is equal to the target value (bonus: do it in linear time)

# Function in O(n^2) time
def sumTwo(arr, target):
    sum = 0
    result = []
    for i in arr:
        for j in range(i + 1, len(arr)):
            sum = arr[i] + arr[j]
            if (sum == target):
                result = [i, j]
                return result
    return result

arr = [1, 2, 3,]
target = 5

print(sumTwo(arr, target)) #output should be [1,2]

# Functoin in O(n) time (linear time)
def sumTwo2(arr, target):
    dic = {}
    for i in range(len(arr)):
        if (dic.get(target - arr[i])):
            return [dic.get(i), i]
        dic[arr[i]] = i
    return False

print(sumTwo2(arr,target))
            
    



    
    
    