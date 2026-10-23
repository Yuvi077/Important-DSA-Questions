class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int freq[] =new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        int duplicate=-1;
        int missing=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                duplicate=i;
            }
            else if(freq[i] == 0)
                missing=i;
        }
        return new int[]{duplicate,missing};

    }
}