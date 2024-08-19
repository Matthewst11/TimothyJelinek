import heapq

class MinHeap:
    def __init__(self):
        """
        Initialize your data structure here.
        """
        # create empty heap
        self.heap = []
        pass

    def insert(self, element):
        """
        Inserts an element into the heap.
        """
        heapq.heappush(self.heap, element)
        pass

    def extract_min(self):
        """
        Removes and returns the minimum element from the heap.
        """
        if self.heap:
            return heapq.heappop(self.heap)
        else:
            return None
        pass

    def get_min(self):
        """
        Returns the minimum element from the heap without removing it.
        """
        if self.heap:
            return self.heap[0]
        else:
            return None
        pass
