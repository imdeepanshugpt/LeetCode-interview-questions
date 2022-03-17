/**
 * @param {string} s
 * @return {number}
 */

// https://leetcode.com/problems/score-of-parentheses
var scoreOfParentheses = function(s) {
    let score = 0;
    let depth = 0;
    [...s].forEach((element, index) => {
        if (element === '(') {
            depth++;
        } else {
            depth--;
        }
        if (element === ')' && s[index - 1] === '(') {
            // console.log('depth -->', depth, index);
            score += Math.pow(2, depth);
        }
        console.log('Depth-->', depth, ' index ', index, element, score);
    });
    return score;
};

console.log(scoreOfParentheses("(()(()))"));