/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function(num) {
    let count=0;
    let temp = num;
    while(temp!=0){
        if(temp%2==0){
            temp = Math.floor(temp/2);
            count++;
        }
        else{
            temp = temp-1;
            count++;
        }    
    }
    return count;
};