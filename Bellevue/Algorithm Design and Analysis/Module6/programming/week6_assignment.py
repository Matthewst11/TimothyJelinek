def bfs(graph, start):
    """
    Traverse the graph using Breadth First Search starting from the given node.
    Return the order in which the nodes are visited.
    """
    visited = set()
    queue = [start]
    result = []

    while queue:
        node = queue.pop(0)
        if node not in visited:
            result.append(node)
            visited.add(node)
            queue.extend(neighbor for neighbor in graph[node] if neighbor not in visited)
    return result
    pass

def dfs(graph, start):
    """
    Traverse the graph using Depth First Search starting from the given node.
    Return the order in which the nodes are visited.
    """
    visited = set()
    result = []

    def dfs_recursive(node):
        visited.add(node)
        result.append(node)
        for neighbor in graph[node]:
            if neighbor not in visited:
                dfs_recursive(neighbor)

    dfs_recursive(start)
    return result
    pass

def dijkstra(graph, start):
    """
    Compute the shortest path from the start node to all other nodes in the graph using Dijkstra's algorithm.
    Return a list of minimum distances from the start node to every other node.
    """
    n = len(graph)
    dist = {node: float("inf") for node in graph}
    dist[start] = 0
    unvisited = set(graph.keys())

    while unvisited:
        current = min(unvisited, key=dist.get)
        unvisited.remove(current)

        for neighbor, weight in graph[current].items():
            if weight > 0 and neighbor in unvisited:
                new_dist = dist[current] + weight
                if new_dist < dist[neighbor]:
                    dist[neighbor] = new_dist
    return dist
    pass
