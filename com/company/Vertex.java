package com.company;

import java.util.Objects;

/**
 * Vertex class representing a node in the graph.
 *
 * @param <T> The type of data stored in the vertex.
 */
public class Vertex<T> {
    private T data;

    /**
     * Constructor to create a Vertex.
     *
     * @param data The data of the vertex.
     */
    public Vertex(T data) {
        this.data = data;
    }

    /**
     * Gets the data of the vertex.
     *
     * @return The data of the vertex.
     */
    public T getData() {
        return data;
    }

