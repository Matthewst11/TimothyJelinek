import hashlib

class DynamicArray:
    def __init__(self):
        self.array = [None] * 1  # Initialize array with a certain capacity
        self.count = 0
        self.capacity = 1

    def add(self, item):
        """
        Add item to the dynamic array.
        """
        if self.count == self.capacity:
            self._resize()
        self.array[self.count] = item
        self.count += 1
        pass

    def _resize(self):
        new_capacity = self.capacity * 2
        new_array = [None] * new_capacity
        for i in range(self.count):
            new_array[i] = self.array[i]
        self.array = new_array
        self.capacity = new_capacity
    def get(self, index):
        """
        Get the item at the specified index.
        """
        if index < 0 or index >= self.count:
            raise IndexError("Index out of range")
        return self.array[index]
        pass

    def remove(self, index):
        """
        Remove the item at the specified index.
        """
        if index < 0 or index >= self.count:
            raise IndexError("Index out of range")
        for i in range(index, self.count - 1):
            self.array[i] = self.array[i + 1]
        self.array[self.count - 1] = None
        self.count -= 1
        
class DisjointSet:
    def __init__(self, size):
        """
        Initialize your data structure here.
        """
        self.parent = list(range(size))
        self.rank = [1] * size
        pass

    def find(self, x):
        """
        Find the root of the set in which element x is present.
        """
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])
        return self.parent[x]
        pass

    def union(self, x, y):
        """
        Perform the union of two sets in which elements x and y are present.
        """
        rootX = self.find(x)
        rootY= self.find(y)

        if rootX != rootY:
            if self.rank[rootX] > self.rank[rootY]:
                self.parent[rootY] = rootX
            elif self.rank[rootX] < self.rank[rootY]:
                self.parent[rootX] = rootY
            else:
                self.parent[rootY] = rootX
                self.rank[rootX] += 1
        pass

class BloomFilter:
    def __init__(self, size):
        """
        Initialize your data structure here.
        """
        self.size = size
        self.bit_array = [False] * size  
        pass

    def _hashes(self, item):
        hash1 = int(hashlib.md5(item.encode('utf8')).hexdigest(), 16) % self.size
        hash2 = int(hashlib.sha1(item.encode('utf8')).hexdigest(), 16) % self.size
        return hash1, hash2

    def add(self, item):
        """
        Add an item to the Bloom Filter.
        """
        hash1, hash2 = self._hashes(item)
        self.bit_array[hash1] = True
        self.bit_array[hash2] = True
        pass

    def check(self, item):
        """
        Check if an item is present in the Bloom Filter.
        """
        hash1, hash2 = self._hashes(item)
        return self.bit_array[hash1] and self.bit_array[hash2]
        pass
