/**
 * @param {number[]} pushed
 * @param {number[]} popped
 * @return {boolean}
 */

// https://leetcode.com/problems/validate-stack-sequences/

var validateStackSequences = function(pushed, popped) {
    let popIndex = 0;
    let length = pushed.length;
    let index = 0;
    let stack = [];
    while (index < length) {
        stack.push(pushed[index]);
        while (stack.length > 0 && popIndex < length && stack[stack.length - 1] === popped[popIndex]) {
            stack = stack.filter((n) => n != popped[popIndex]);
            popIndex++;
        }
        index++;
    }
    return popIndex == length;
};

console.log(validateStackSequences([1, 2, 3, 4, 5], [4, 5, 3, 2, 1]));