package com.company;

/**
 * VertexDistancePair class representing a vertex and its distance.
 *
 * @param <T> The type of data stored in the vertex.
 */
class VertexDistancePair<T> {
    Vertex<T> vertex;
    double distance;

    /**
     * Constructor to create a VertexDistancePair.
     *
     * @param vertex The vertex.
     * @param distance The distance to the vertex.
     */
    public VertexDistancePair(Vertex<T> vertex, double distance) {
        this.vertex = vertex;
        this.distance = distance;
    }
}
