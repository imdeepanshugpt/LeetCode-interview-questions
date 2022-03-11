/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let copyNums = [...nums];
    let numSorted = nums.sort((a, b) => a - b);
    let i = 0;
    let j = numSorted.length - 1;
    let result = [];
    while (i < j) {
        if (numSorted[i] + numSorted[j] === target) {
            result = getIndexs(numSorted[i], numSorted[j], copyNums);
            break;
        } else if (numSorted[i] + numSorted[j] < target) {
            i++;
        } else {
            j--;
        }
    }
    return result;
};

function getIndexs(num1, num2, nums) {
    let indexes = new Set();
    let index1 = nums.indexOf(num1);
    let index2 = nums.indexOf(num2);
    indexes.add(index1);
    if (indexes.has(index2)) {
        index2 = nums.lastIndexOf(num2);
    }
    return [index1, index2];
}