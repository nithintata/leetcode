// Implement Trie (Prefix Tree)

class Trie {

    /** Initialize your data structure here. */
    Trie[] trie = new Trie[26];
    boolean isleaf;
    public Trie() {
        Arrays.fill(trie, null);
        isleaf = false;
    }
    
   // Trie root = new Trie();
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie a = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (a.trie[index] == null)
                a.trie[index] = new Trie();
            a = a.trie[index];     
        }
        a.isleaf = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie a = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (a.trie[index] == null)
                return false;
            a = a.trie[index];
        }
        return a.isleaf;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie a = this;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (a.trie[index] == null)
                return false;
            a = a.trie[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
