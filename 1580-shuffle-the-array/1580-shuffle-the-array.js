/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    let res = Array(nums.length);
    let ind=0;
    for(let i=0;i<n;i++){
        res[ind++] = nums[i];
        res[ind++] = nums[i+n];
    }
    return res;
};