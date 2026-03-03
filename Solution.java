class Solution {
    public boolean halvesAreAlike(String s) {
        int fcount=0;
        int scount=0;
       s.toLowerCase();
       int num=s.length();
       int div=num/2;
       String str1=s.substring(0, div);
         String str2=s.substring(div, num);
         for(int i=0;i<div;i++){
                char r = str1.charAt(i);
                if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
                    fcount++;
                }
         }
           for(int i=0;i<div;i++){
                char r = str2.charAt(i);
                if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
                    scount++;
                }
         }

         if(fcount==1&&scount==1){
            return true;
         }
         else{
            return false;
         }
    }
}
