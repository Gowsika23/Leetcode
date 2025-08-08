/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
    let temp = [];
    for(let i=0;i<nums.length;i++){
        temp[i] = nums[nums[i]];
    }

    for(let i=0;i<nums.length;i++){
        nums[i] = temp[i];
    }
    return nums;
};