/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
   let c=0;
   let r = [];
   let k=0;
   for(let i=0;i<nums.length;i++){ 
     c=0;
    for(let j=0;j<nums.length;j++){
        if(nums[j]<nums[i]) c++;
    }
    r[k++] = c;
   
   }
   return r;
};