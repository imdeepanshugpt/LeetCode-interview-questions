/**
 * @param {number} startValue
 * @param {number} target
 * @return {number}
 */

// https://leetcode.com/problems/broken-calculator/


var brokenCalc = function(startValue, target) {
    let result = 0;
    while (target > startValue) {
        result++;
        if (target % 2 === 1) {
            target++;
        } else {
            target /= 2;
        }
    }

    return result + startValue - target;

};

brokenCalc(2, 3);