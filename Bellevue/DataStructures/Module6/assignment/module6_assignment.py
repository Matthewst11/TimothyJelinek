class HashTable:
    def __init__(self, size=100):
        """
        Initialize your data structure here.
        """
        self.size = size
        self.table = [[] for _ in range(size)]
        pass

    def _hash(self, key):
        """
        Compute hash for given key
        """
        return hash(key) % self.size

    def put(self, key, value):
        """
        Insert a (key, value) pair into the hash table.
        """
        index = self._hash(key)
        for k, v in self.table[index]:
            if k == key:
                # update existing key
                v = value
                return
        self.table[index].append((key, value))
        pass

    def get(self, key):
        """
        Retrieve the value associated with the given key.
        """
        index = self._hash(key)
        for k, v in self.table[index]:
            if k == key:
                return v
        return None
        pass

    def remove(self, key):
        """
        Remove the (key, value) pair associated with the given key.
        """
        index = self._hash(key)
        for i, (k, v) in enumerate(self.table[index]):
            if k == key:
                del self.table[index][i]
                return
        pass

def is_anagram(s1, s2):
    """
    Check if two strings are anagrams of each other.
    """
    return sorted(s1) == sorted(s2)
    pass
