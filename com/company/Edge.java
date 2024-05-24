package com.company;

import java.util.Objects;

/**
 * Edge class representing an edge in the graph.
 *
 * @param <T> The type of data stored in the vertices connected by the edge.
 */
public class Edge<T> {
    private Vertex<T> source;
    private Vertex<T> dest;
    private Double weight;

    /**
     * Constructor to create an Edge.
     *
     * @param source The source vertex.
     * @param dest The destination vertex.
     * @param weight The weight of the edge.
     */
    public Edge(Vertex<T> source, Vertex<T> dest, Double weight) {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    /**
     * Gets the source vertex of the edge.
     *
     * @return The source vertex.
     */
    public Vertex<T> getSource() {
        return source;
    }

    /**
     * Sets the source vertex of the edge.
     *
     * @param source The source vertex.
     */
    public void setSource(Vertex<T> source) {
        this.source = source;
    }

    /**
     * Gets the destination vertex of the edge.
     *
     * @return The destination vertex.
     */
    public Vertex<T> getDest() {
        return dest;
    }

    /**
     * Sets the destination vertex of the edge.
     *
     * @param dest The destination vertex.
     */
    public void setDest(Vertex<T> dest) {
        this.dest = dest;
    }

    /**
     * Gets the weight of the edge.
     *
     * @return The weight of the edge.
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the edge.
     *
     * @param weight The weight of the edge.
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge<?> edge = (Edge<?>) o;
        return Objects.equals(source, edge.source) && Objects.equals(dest, edge.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, dest);
    }

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source +
                ", dest=" + dest +
                ", weight=" + weight +
                '}';
    }
}
