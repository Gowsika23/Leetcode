class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> map = new HashMap<>();
        String[] strs = {"M","CM","D", "CD", "C", "XC", "L","XL","X", "IX","V",
        "IV","I"};
        int[] arr = {1000,900,500, 400, 100, 90, 50,40,10,9,5,4,1};

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            if(num==0) break;
            while(num>=arr[i]){
                sb.append(strs[i]);
                num = num-arr[i];
            }
        }

        return sb.toString();

        // map.put(1000, "M");
        // map.put(900, "CM");
        // map.put(500, "D");
        // map.put(400, "CD");
        // map.put(100, "C");
        // map.put(90, "XC");
        // map.put(50, "L");
        // map.put(40, "XL");
        // map.put(10, "X");
        // map.put(9, "IX");
        // map.put(8, "VIII");
        // map.put(7, "VII");
        // map.put(6, "VI");
        // map.put(5, "V");
        // map.put(4, "IV");
        // map.put(3, "III");
        // map.put(2, "II");
        // map.put(1, "I");
        // StringBuilder sb = new StringBuilder();

        // while(num!=0){
        //     if(num>=1000){
        //         int n = num/1000;
        //         sb.append(map.get(1000).repeat(n));
        //         num = num%1000;
        //     }

        //     else if(num>=900){
        //         int n = num/900;
        //         sb.append(map.get(900).repeat(n));
        //         num = num%900;
        //     }

        //      else if(num>=500){
        //         int n = num/500;
        //         sb.append(map.get(500).repeat(n));
        //         num = num%500;
        //     }

        //      else if(num>=400){
        //         int n = num/400;
        //         sb.append(map.get(400).repeat(n));
        //         num = num%400;
        //     }

        //      else if(num>=100){
        //         int n = num/100;
        //         sb.append(map.get(100).repeat(n));
        //         num = num%100;
        //     }

        //      else if(num>=90){
        //         int n = num/90;
        //         sb.append(map.get(90).repeat(n));
        //         num = num%90;
        //     }
        //      else if(num>=50){
        //         int n = num/50;
        //         sb.append(map.get(50).repeat(n));
        //         num = num%50;
        //     }

        //      else if(num>=40){
        //         int n = num/40;
        //         sb.append(map.get(40).repeat(n));
        //         num = num%40;
        //     }

        //      else if(num>=10){
        //         int n = num/10;
        //         sb.append(map.get(10).repeat(n));
        //         num = num%10;
        //     }

        //      else if(num==9){                
        //        sb.append(map.get(9));
        //        break;
        //     }

        //     else if(num==8){                
        //         sb.append(map.get(8));
        //         break;
        //     }

        //     else if(num==7){                
        //         sb.append(map.get(7));
        //         break;
        //     }

        //     else if(num==6){                
        //         sb.append(map.get(6));
        //         break;
        //     }

        //     else if(num==5){                
        //         sb.append(map.get(5));
        //         break;
        //     }

        //     else if(num==4){                
        //        sb.append(map.get(4));
        //        break;
        //     }
        //     else if(num==3){                
        //         sb.append(map.get(3));
        //         break;
        //     }
        //     else if(num==2){                
        //         sb.append(map.get(2));
        //         break;
        //     }
        //     else if(num==1){                
        //         sb.append(map.get(1));
        //         break;
        //     }
        // }

        // return sb.toString();
    }
}