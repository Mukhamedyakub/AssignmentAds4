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

