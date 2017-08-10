public class WordDictionary {
	class TreeNode{
		TreeNode[] characters;
		Boolean wordExist;
        public TreeNode(){
            this.characters = new TreeNode[26];
            this.wordExist = false;
        }
	}

	TreeNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TreeNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
    	TreeNode current = root;
        char[] words = word.toCharArray();
        for(char c: words){
        	if(current.characters[c - 'a'] == null){
        		current.characters[c - 'a'] = new TreeNode();       		
        	}
        	current = current.characters[c - 'a'];
        }
        current.wordExist = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TreeNode current){
    	if(index == word.length()){
    		return current.wordExist;
    	}

    	char target = word.charAt(index);
    	if(target != '.'){
    		if(current.characters[target - 'a'] == null){
    			return false;
    		}else{
    			current = current.characters[target - 'a'];
                return dfs(word, index + 1, current);
    		}
    	}else{
    		for(TreeNode node: current.characters){
    			if(node != null && dfs(word, index + 1, node)){
    				return true;
    			}
    		}
    		return false;
    	}
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */