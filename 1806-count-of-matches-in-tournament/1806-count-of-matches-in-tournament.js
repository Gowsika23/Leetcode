/**
 * @param {number} n
 * @return {number}
 */
var numberOfMatches = function(n) {
    let c=0;
    while(n>1){
        let val = Math.floor(n/2);
        if(n%2!==0) n = val+1
        else n= val;
        c+=val;
    }
    return c;
};