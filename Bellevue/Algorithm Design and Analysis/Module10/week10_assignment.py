def ford_fulkerson(graph, s, t):
    """
    Implement the Ford-Fulkerson algorithm to compute the maximum flow in the network 'graph' from source 's' to sink 't'.
    Return the value of the maximum flow.
    """
    flow = 0
    parent = [-1] * len(graph)

    def bfs(graph, s, t, parent):
        visited = [False] * len(graph)
        queue = [s]
        visited[s] = True

        while queue:
            u = queue.pop(0)
            for v, capacity in enumerate(graph[u]):
                if not visited[v] and capacity > 0:
                    queue.append(v)
                    visited[v] = True
                    parent[v] = u

        return visited[t]

    while bfs(graph, s, t, parent):
        path_flow = float('inf')
        v = t
        while v!= s:
            u = parent[v]
            path_flow = min(path_flow, graph[u][v])
            v = parent[v]

        v = t
        while v!= s:
            u = parent[v]
            graph[u][v] -= path_flow
            graph[v][u] += path_flow
            v = parent[v]

        flow += path_flow

    return flow
pass