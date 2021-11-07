package hastable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashTable<T> {
  private int DEFAULT_CAPACITY;
  protected LinkedList[] table;

  // Constructor if the user wants to use the hard-coded default capacity
  public HashTable() {
    this.DEFAULT_CAPACITY = 10;
    this.table = new LinkedList[DEFAULT_CAPACITY];

    // Adds a LinkedList to each index of the HashTable array upon instantiation
    HashTable.addLinkedListsToTable(this.table);
  }

  // Constructor if the user wants to specify their own default capacity
  public HashTable(int DEFAULT_CAPACITY) {
    this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
    this.table = new LinkedList[DEFAULT_CAPACITY];

    // Adds a LinkedList to each index of the HashTable array upon instantiation
    HashTable.addLinkedListsToTable(this.table);
  }

  // Adds a LinkedList to each index of the HashTable array
  protected static void addLinkedListsToTable(LinkedList[] table) {
    for (int i = 0; i < table.length; i++) {
      table[i] = new LinkedList();
    }
  }

  // Adds a node containing a key/value pair to the HashTable
  public void add(String key, T value) {
    int hashedKey = this.getHash(key);
    this.table[hashedKey].append(key, value);
  }

  // Takes in the key and returns the value from key/value pair
  public T find(String key) {
    int hashedKey = this.getHash(key);
    return (T) this.table[hashedKey].findValue(key);
  }

  // Returns true if the input key exists in the HashTable
  public boolean contains(String key) {
    int hashedKey = this.getHash(key);
    return this.table[hashedKey].includes(key);
  }

  // Hashes the key
  protected int getHash(String key) {
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
      hash += key.charAt(i); // Adds the ASCII value of the current character to hash
    }
    return hash % DEFAULT_CAPACITY; // Divides hash by the length of the HashTable's array
  }

  public String repeatedWord(String str){
  String[] words = str.toLowerCase().split(" ");

    HashSet<String> seenWords = new HashSet<>();
    for (String word : words) {
      if (seenWords.contains(word)) {
        return word;
      } else {
        seenWords.add(word);
      }
    }
    return "No repeating words";
  }
}

