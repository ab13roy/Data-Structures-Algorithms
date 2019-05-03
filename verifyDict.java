class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] hashTable = new int[26];
        int i = 0;
        for(char c : order.toCharArray()){
            hashTable[c - 'a'] = i++;
        }
        for(i = 0; i < words.length - 1; i++){
            String word1 = words[i];
            String word2 = words[i + 1];
            int minLen = Math.min(word1.length(), word2.length());
            int j;
            for(j = 0; j < minLen; j++){
                if(word1.charAt(j) != word2.charAt(j)){
                    if(hashTable[word1.charAt(j) - 'a'] > hashTable[word2.charAt(j) - 'a']){
                        return false;
                    }
                    break;
                }
            }
            if(j == minLen && word1.length() > word2.length()){
                return false;
            }
        }
        return true;
    }
}
