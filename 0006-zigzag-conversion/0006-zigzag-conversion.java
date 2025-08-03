class Solution {
    public String convert(String s, int numRows) {
          int n = s.length();
          if(numRows ==1 || numRows> n) return s;
          int clen = s.length();
          char[][] ch = new char[numRows][clen];
         int row=0, col=0;
         boolean down = true;
          for(char c : s.toCharArray()){
            ch[row][col] = c;
            if(down){              
              
               if(row==numRows-1){
                  down = false;
                  row--;
                  col++;
               }
               else row++;
            }
            else{
                 
               if(row==0) {
                down=true;
                row++;
               }
               else {
                row--;
                col++;
               }
        
            }
          }

          StringBuilder sb = new StringBuilder();
          for(int i=0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(ch[i][j]!='\0') sb.append(ch[i][j]);
            }
          }
           

        return  sb.toString();
    }
} 