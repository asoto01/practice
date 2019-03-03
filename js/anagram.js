// Create a function that takes in two words. If the words are anagrams of eachother return true else return false.
function anagram(word1, word2) {
    let sum1 = 0;
    let sum2 = 0;
    for (let i = 0; i < word1.length; i++) {
        let temp = word1.charCodeAt(i);
        sum1 += temp;
    }
    for (let i = 0; i < word2.length; i++) {
        let temp = word2.charCodeAt(i);
        sum2 += temp;
    }
    if (sum1 === sum2) 
        return true;
    else
        return false;
}

let word1 = "god";
let word2 = "dog";
let word3 = "fog";

console.log(anagram(word1, word2)); // true
console.log(anagram(word1, word3)); // false