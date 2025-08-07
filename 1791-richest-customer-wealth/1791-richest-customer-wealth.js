/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(acc) {
    let max = -Infinity;
       for(let row of acc) {
        let sum=0;
            for(let i of row){
                sum+= i;
            }
            max = Math.max(max,sum);
       }
       return max;
};