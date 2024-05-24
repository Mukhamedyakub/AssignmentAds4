package com.company;

import java.util.*;

/**
 * WeightedGraph class representing a graph with weighted edges.
 *
 * @param <T> The type of data stored in the vertices.
 */
public class WeightedGraph<T> {
    private final boolean undirected;
    private final Map<Vertex<T>, List<Edge<T>>> map = new HashMap<>();

    /**
     * Constructs an undirected weighted graph.
     */
    public WeightedGraph() {
        this(true);
    }

    /**
     * Constructs a weighted graph.
     *
     * @param undirected True if the graph is undirected, otherwise false.
     */
    public WeightedGraph(boolean undirected) {
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
     * Adds an edge between two vertices with a specified weight.
     *
     * @param source The source vertex data.
     * @param dest The destination vertex data.
     * @param weight The weight of the edge.
     */

