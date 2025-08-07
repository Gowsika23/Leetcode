/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    let x =0;
    for(var s of operations){
        if(s === "--X" || s === "X--") x--;
        else x++;
        
    }
    return x;
};