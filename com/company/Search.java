package com.company;

import java.util.*;

/**
 * Search class representing a search algorithm in the graph.
 *
 * @param <T> The type of data stored in the vertices.
 */
public abstract class Search<T> {
    protected Set<Vertex<T>> marked;
    protected Map<Vertex<T>, Vertex<T>> edgeTo;
    protected final Vertex<T> source;

    /**
     * Constructs a Search object.
     *
     * @param source The source vertex.
     */
    public Search(T source) {
        this.source = new Vertex<>(source);
        marked = new HashSet<>();
        edgeTo = new HashMap<>();
    }

    /**
     * Checks if there is a path to the specified vertex.
     *
     * @param v The vertex to check.
     * @return True if there is a path to the vertex, otherwise false.
     */
    public boolean hasPathTo(Vertex<T> v) {
        return marked.contains(v);
    }

    /**
     * Gets the path to the specified vertex.
     *
     * @param v The vertex.
     * @return The iterable path to the vertex.
     */
    public Iterable<T> pathTo(T v) {
        Vertex<T> vertex = new Vertex<>(v);
        if (!hasPathTo(vertex)) return null;
        LinkedList<T> ls = new LinkedList<>();
        for (Vertex<T> i = vertex; i != source; i = edgeTo.get(i)) {
            ls.push(i.getData());
        }
        ls.push(source.getData());
        return ls;
    }
}
