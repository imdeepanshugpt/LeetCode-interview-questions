/**
 * @param {string} s
 * @return {number}
 */


// https://leetcode.com/problems/longest-substring-without-repeating-characters/

var lengthOfLongestSubstring = function(s) {
    let best = '';
    let subresult = '';
    [...s].forEach((char, index) => {
        let firstIndex = subresult.indexOf(char);
        if (firstIndex === -1) {
            subresult = subresult + char;
        } else {
            subresult = subresult.substring(firstIndex + 1) + char;
        }
        if (best.length < subresult.length) {
            best = subresult;
        }
    });
    return best.length;
};