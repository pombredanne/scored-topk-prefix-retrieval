package de.unikoblenz.stpr.ArrayTrie;

import de.unikoblenz.stpr.interfaces.trie.TrieInterface;
import java.util.ArrayList;
import java.util.List;

public class ArrayTrie implements TrieInterface {
	// Variables
        List<Integer> a;
        ArrayTrieNode root;

	// Constructor
	public ArrayTrie() {
		root = new ArrayTrieNode('.');
                a = new ArrayList<Integer>();
	}

	// Methods
	public void add(String s){
		ArrayTrieNode last = root;
		for (int i = 0; i < s.length(); i++ ){
			last = last.addGetChild(s.charAt(i));
		}
	}

	public String toString(){
		return root.toString();
	}
}