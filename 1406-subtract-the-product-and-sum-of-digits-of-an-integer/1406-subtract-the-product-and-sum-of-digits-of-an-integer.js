/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let prod=1, sum=0;
    let temp = n;
    let temp2 = n;
    while(temp!=0){
        let dig = temp%10;
        prod = prod*dig;
        temp = Math.floor(temp/10);
    }

    while(temp2!=0){
        let dig = temp2%10;
        sum= sum+dig;
       temp2 = Math.floor(temp2/10);
    }

    return prod-sum;
};