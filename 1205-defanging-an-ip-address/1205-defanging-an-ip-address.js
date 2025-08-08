/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(add) {
    let word = "[.]";
    let ans = "";
    for(let i=0;i<add.length;i++){
        if(add.charAt(i)!=='.') ans+= add.charAt(i);
        else ans+= word;
    }
    return ans;
};