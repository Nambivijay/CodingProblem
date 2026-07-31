/**
 * Problem: Implement Trie (Prefix Tree)
 * Implement insert, search, and startsWith operations.
 * Time: O(m) per operation, Space: O(n*m)
 */
public class ImplementTrie {
    private ImplementTrie[] children = new ImplementTrie[26];
    private boolean isEnd = false;
    public void insert(String word) {
        ImplementTrie node = this;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) node.children[c - 'a'] = new ImplementTrie();
            node = node.children[c - 'a'];
        }
        node.isEnd = true;
    }
    public boolean search(String word) {
        ImplementTrie node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
    private ImplementTrie searchPrefix(String word) {
        ImplementTrie node = this;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) return null;
            node = node.children[c - 'a'];
        }
        return node;
    }
    public static void main(String[] args) {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("app")); // false
        System.out.println(trie.startsWith("app")); // true
    }
}