// Given an array of integers find the most frequent integer in the array.
const arr = [1, 2, 1, 3, 1, 2, 2, 2, 2, 0, 1, 1];

function findMode(arr) {
    let mode = 0;
    let count = 0;
    let highestCount = 0;
    for (let i = 0; i < arr.length; i++) {
        let currentValue = arr[i];
        let compareValue;
        for (let j = i + 1; j < arr.length; j++) {
            compareValue = arr[j];
            if (currentValue === compareValue) 
                count++;
        }
        if (highestCount < count) {
            highestCount = count;
            mode = currentValue;
        }
        count = 0;
    }
    return mode;
}

console.log(findMode(arr));