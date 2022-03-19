/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */

// https://leetcode.com/problems/median-of-two-sorted-arrays/


var findMedianSortedArrays = function(nums1, nums2) {
    var joinedArray = nums1.concat(nums2);
    joinedArray = joinedArray.sort((a, b) => a - b);
    const mid = Math.floor(joinedArray.length / 2);
    return (joinedArray.length % 2 === 0) ?
        (joinedArray[mid - 1] + joinedArray[mid]) / 2 :
        joinedArray[mid];
}