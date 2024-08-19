def naive_string_matching(text, pattern):
    """
    Implement the naive string matching algorithm.
    Return the starting indices of all occurrences of the pattern in the text.
    """
    n = len(text)
    m = len(pattern)
    indices = []

    for i in range(n-m+1):
        if text[i:i+m] == pattern:
            indices.append(i)
    return indices
    pass

def rabin_karp(text, pattern, d, q):
    """
    Implement the Rabin-Karp string matching algorithm.
    'd' is the number of characters in the input alphabet, and 'q' is a prime number.
    Return the starting indices of all occurrences of the pattern in the text.
    """
    n = len(text)
    m = len(pattern)
    h_pattern =sum(ord(c) * (d ** (m-i-1)) for i, c in enumerate(pattern)) %q
    h_text = sum(ord(c) * (d ** (m-i-1)) for i, c in enumerate(text[:m]))%q
    indices = []

    for i in range(n-m+1):
        if h_text==h_pattern:
            if text[i:i+m]==pattern:
                indices.append(i)
        if i<n-m:
             h_text = (d * (h_text - ord(text[i]) * (d ** (m - 1))) + ord(text[i + m])) % q
            
    return indices
    pass

def kmp_pattern_preprocessing(pattern):
    """
    Preprocess the pattern for the KMP string matching algorithm.
    Return the lps (longest proper prefix which is also a suffix) array.
    """
    m=len(pattern)
    lps=[0]*m
    length = 0
    i=1

    while i<m:
        if pattern[i]==pattern[length]:
            length+=1
            lps[i]=length
            i+=1
        else:
            if length!=0:
                length=lps[length-1]
            else:
                lps[i]=0
                i+=1
    return lps
    pass

class TrieNode:
    def __init__(self):
        self.children={}
        self.is_end_of_word=False
def trie_insert(root, key):
    """
    Insert 'key' into the trie rooted at 'root'.
    """
    node=root
    for char in key:
        if char not in node.children:
            node.children[char]=TrieNode()
        node=node.children[char]
    node.is_end_of_word=True
    return root
    pass
