package com.company;

import java.util.*;

/**
 * BreadthFirstSearch class implementing BFS algorithm.
 *
 * @param <T> The type of data stored in the vertices.
 */
public class BreadthFirstSearch<T> extends Search<T> {
    /**
     * Constructs a BreadthFirstSearch object.
     *
     * @param graph The graph to search.
     * @param source The source vertex.
     */
    public BreadthFirstSearch(MyGraph<T> graph, T source) {
        super(source);
        bfs(graph, this.source);
    }

    private void bfs(MyGraph<T> graph, Vertex<T> current) {
        marked.add(current);
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(current);

        while (!queue.isEmpty()) {
            Vertex<T> v = queue.remove();
            for (Vertex<T> vertex : graph.adjacencyList(v)) {
                if (!marked.contains(vertex)) {
                    marked.add(vertex);
                    edgeTo.put(vertex, v);
                    queue.add(vertex);
                }
            }
        }
    }
}
