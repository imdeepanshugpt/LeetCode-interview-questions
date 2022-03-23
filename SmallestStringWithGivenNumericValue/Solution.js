/**
 * @param {number} n
 * @param {number} k
 * @return {string}
 */

// https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/

var getSmallestString = function(n, k) {
    let res = '';
    while (n--) {
        const c = k - n > 26 ? 26 : k - n;
        res = String.fromCharCode(96 + c) + res;
        k -= c;
    }
    return res;
};