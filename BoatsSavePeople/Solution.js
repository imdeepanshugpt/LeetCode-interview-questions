/**
 * @param {number[]} people
 * @param {number} limit
 * @return {number}
 */

// https://leetcode.com/problems/boats-to-save-people/

var numRescueBoats = function(people, limit) {
    let count = 0;
    let arr = [...people].sort((a, b) => a - b);
    let i = 0;
    let j = arr.length - 1;
    while (i <= j) {
        count++;
        if (arr[i] + arr[j] <= limit) {
            i++;
        }
        j--;
    }
    return count;

};