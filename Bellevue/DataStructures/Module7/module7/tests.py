from module7_assignment import Graph,shortest_path

def test_graph_operations():
    graph = Graph(4)
    graph.add_edge(0, 1)
    graph.add_edge(0, 2)
    graph.add_edge(1, 2)
    graph.add_edge(2, 3)

    bfs_result = graph.bfs(0)
    dfs_result = graph.dfs(0)

    return [
        (bfs_result, [0, 1, 2, 3], "BFS from vertex 0"),  # Test 1
        (dfs_result, [0, 1, 2, 3], "DFS from vertex 0"),  # Test 2
    ]

def test_shortest_path():
    graph = Graph(4)
    graph.add_edge(0, 1)
    graph.add_edge(0, 2)
    graph.add_edge(1, 2)
    graph.add_edge(2, 3)

    shortest_path_result = shortest_path(graph, 0, 3)

    return [
        (shortest_path_result, [0, 2, 3], "Shortest path from 0 to 3"),  # Test 3
    ]
