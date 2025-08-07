/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extra) {
    let max = -Infinity;
    for(let i of candies) max = Math.max(max,i);    

    let list = [];
    for(let i of candies){
        list.push(i+extra >= max);
    }
    return list;
};