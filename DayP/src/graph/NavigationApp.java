package graph;

import java.util.*;

public class NavigationApp {

    static class Edge {
        int destination;
        int distance;

        Edge(int destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }

    static class Node {
        int location;
        int distance;

        Node(int location, int distance) {
            this.location = location;
            this.distance = distance;
        }
    }

    public static void dijkstra(List<List<Edge>> graph, String[] places, int source) {

        int n = graph.size();
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) -> a.distance - b.distance);

        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {

            Node current = pq.poll();
            int u = current.location;

            if (visited[u])
                continue;

            visited[u] = true;

            for (Edge edge : graph.get(u)) {

                int v = edge.destination;
                int weight = edge.distance;

                if (!visited[v] && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distance from " + places[source] + ":\n");

        for (int i = 0; i < n; i++) {
            System.out.println(places[source] + " -> " + places[i] + " = " + dist[i] + " km");
        }
    }

    public static void main(String[] args) {

        String[] places = {
                "Bangalore",
                "Mysore",
                "Tumkur",
                "Mangalore",
                "Hubli"
        };

        int locations = places.length;

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < locations; i++) {
            graph.add(new ArrayList<>());
        }

        // Road Network
        graph.get(0).add(new Edge(1, 10)); // Bangalore -> Mysore
        graph.get(0).add(new Edge(2, 3));  // Bangalore -> Tumkur

        graph.get(1).add(new Edge(2, 1));  // Mysore -> Tumkur
        graph.get(1).add(new Edge(3, 2));  // Mysore -> Mangalore

        graph.get(2).add(new Edge(1, 4));  // Tumkur -> Mysore
        graph.get(2).add(new Edge(3, 8));  // Tumkur -> Mangalore
        graph.get(2).add(new Edge(4, 2));  // Tumkur -> Hubli

        graph.get(3).add(new Edge(4, 7));  // Mangalore -> Hubli

        graph.get(4).add(new Edge(3, 9));  // Hubli -> Mangalore

        dijkstra(graph, places, 0);
    }
}