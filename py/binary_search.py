def binarySearch(arr, num):
    low = 0
    high = len(arr) - 1

    while (low <= high):
        mid = (low + high)//2
        if (num == arr[mid]):
            return num
        elif (num < arr[mid]):
            high = mid - 1
        else:
            low = mid + 1
    
    return False

# Driver 
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(binarySearch(arr, 7))