package com.company;

import java.util.*;

/**
 * MyGraph class representing an unweighted graph.
 *
 * @param <T> The type of data stored in the vertices.
 */
public class MyGraph<T> {
    private final boolean undirected;
    private final Map<Vertex<T>, List<Vertex<T>>> map = new HashMap<>();

    /**
     * Constructs an undirected graph.
     */
    public MyGraph() {
        this(true);
    }

    /**
     * Constructs a graph.
     *
     * @param undirected True if the graph is undirected, otherwise false.
     */
    public MyGraph(boolean undirected) {
        this.undirected = undirected;
    }

    /**
     * Adds a vertex to the graph.
     *
     * @param data The data of the vertex to add.
     */
    public void addVertex(T data) {
        Vertex<T> v = new Vertex<>(data);
        if (hasVertex(v))
            return;
        map.put(v, new LinkedList<>());
    }

    /**
     * Adds an edge between two vertices.
     *
     * @param source The source vertex data.
     * @param dest The destination vertex data.
     */
    public void addEdge(T source, T dest) {
        Vertex<T> v1 = new Vertex<>(source);
        Vertex<T> v2 = new Vertex<>(dest);
        if (!hasVertex(v1))
            addVertex(source);
        if (!hasVertex(v2))
            addVertex(dest);
        if (hasEdge(v1, v2) || v1.equals(v2))
            return; // reject parallels & self-loops
        map.get(v1).add(v2);
        if (undirected)
            map.get(v2).add(v1);
    }

    /**
     * Checks if the graph contains a vertex.
     *
     * @param v The vertex to check.
     * @return True if the vertex is in the graph, otherwise false.
     */
    public boolean hasVertex(Vertex<T> v) {
        return map.containsKey(v);
    }

    /**
     * Checks if there is an edge between two vertices.
     *
     * @param source The source vertex.
     * @param dest The destination vertex.
     * @return True if there is an edge between the vertices, otherwise false.
     */
    public boolean hasEdge(Vertex<T> source, Vertex<T> dest) {
        if (!hasVertex(source)) return false;
        return map.get(source).contains(dest);
    }

    /**
     * Gets the adjacency list of a vertex.
     *
     * @param v The vertex.
     * @return The list of adjacent vertices.
     */
    public List<Vertex<T>> adjacencyList(Vertex<T> v) {
        if (!hasVertex(v)) return null;
        return map.get(v);
    }

    /**
     * Gets the count of vertices in the graph.
     *
     * @return The count of vertices.
     */
    public int getVerticesCount() {
        return map.size();
    }

    /**
     * Gets the count of edges in the graph.
     *
     * @return The count of edges.
     */
    public int getEdgesCount() {
        int count = 0;
        for (Vertex<T> v : map.keySet()) {
            count += map.get(v).size();
        }
        if (undirected)
            count /= 2;
        return count;
    }
}
