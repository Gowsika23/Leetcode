class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String[] arr = title.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<=2) arr[i]=arr[i].toLowerCase();
            else arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
        }
        return String.join(" ",arr);
    }
}