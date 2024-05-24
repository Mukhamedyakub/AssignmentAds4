package com.company;

import java.util.*;

/**
 * DepthFirstSearch class implementing DFS algorithm.
 *
 * @param <T> The type of data stored in the vertices.
 */
public class DepthFirstSearch<T> extends Search<T> {
    /**
     * Constructs a DepthFirstSearch object.
     *
     * @param graph The graph to search.
     * @param source The source vertex.
     */
    public DepthFirstSearch(MyGraph<T> graph, T source) {
        super(source);
        dfs(graph, this.source);
    }

    private void dfs(MyGraph<T> graph, Vertex<T> current) {
        marked.add(current);
        for (Vertex<T> v : graph.adjacencyList(current)) {
            if (!marked.contains(v)) {
                edgeTo.put(v, current);
                dfs(graph, v);
            }
        }
    }
}
