class Trie:
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.children = {}
        self.is_end_of_word = False
        pass

    def insert(self, word):
        """
        Inserts a word into the trie.
        """
        current = self
        for char in word:
            if char not in current.children:
                current.children[char] = Trie()
            current = current.children[char]
        current.is_end_of_word = True
        pass

    def search(self, word):
        """
        Returns if the word is in the trie.
        """
        current = self
        for char in word:
            if char not in current.children:
                return False
            current = current.children[char]
        return current.is_end_of_word
        pass

    def startsWith(self, prefix):
        """
        Returns if there is any word in the trie that starts with the given prefix.
        """
        current = self
        for char in prefix:
            if char not in current.children:
                return False
            current = current.children[char]
        return True
        pass
