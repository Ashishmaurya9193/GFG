class Solution{
    public int splitString(int n, String s){
        int[] pref = new int[26];
        int[] suff = new int[26];
        
        for(int i = 0;i < n; i++){
            suff[s.charAt(i) - 'a']++;
        }
        int ans = 0;
        
        for(int i = 0;i<n;i++){
            pref[s.charAt(i)-'a']++;
            suff[s.charAt(i) - 'a']--;
            int curr = 0;
            for( int j = 0;j<26;j++){
                if(pref[j] != 0 && suff[j] != 0){
                    curr++;
                }
                
            }
            ans = Math.max(ans,curr);
            
        }
        return ans;
    }
}