from collections import deque

class Graph:
    """
    Initializing a graph with vertices
    """
    def __init__(self, vertices):
        self.vertices = vertices
        self.graph = [[] for _ in range(vertices)]

    def add_edge(self, u, v):
        """
        Adding edge between vertices u and v
        """
        self.graph[u].append(v)
        self.graph[v].append(u)  # For undirected graph

    def bfs(self, start_vertex):
        """
        Breadth-first search from given vertex
        """
        result = []
        visited = [False] * self.vertices
        queue = deque([start_vertex])
        visited[start_vertex] = True

        while queue:
            current_vertex = queue.popleft()
            result.append(current_vertex)

            for neighbor in self.graph[current_vertex]:
                if not visited[neighbor]:
                    queue.append(neighbor)
                    visited[neighbor] = True

        return result

    def dfs(self, start_vertex):
        """
        Depth-first search from given vertex
        """
        result = []
        visited = [False] * self.vertices
        self._dfs_helper(start_vertex, visited, result)

        return result
    
    def _dfs_helper(self, vertex, visited, result):
        """
        This is a helper function for dfs to recursevly explore all vertices connected to vertex 
        """
        visited[vertex] = True
        result.append(vertex)

        for neighbor in self.graph[vertex]:
            if not visited[neighbor]:
                self._dfs_helper(neighbor, visited, result)

def shortest_path(graph, start_vertex, end_vertex):
    """
    Find shortest path using BFS
    """
    if start_vertex == end_vertex:
        return [start_vertex]
    
    queue = deque([(start_vertex, [start_vertex])])
    visited = [False] * graph.vertices
    visited[start_vertex] = True

    while queue:
        current_vertex, path = queue.popleft()

        for neighbor in graph.graph[current_vertex]:
            if not visited[neighbor]:
                visited[neighbor] = True
                if neighbor == end_vertex:
                    return path + [neighbor]
                queue.append((neighbor, path + [neighbor]))

    return []
