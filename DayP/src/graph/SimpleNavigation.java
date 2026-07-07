package graph;
import java.util.*;

public class SimpleNavigation {

    public static void main(String[] args) {

        int[][] graph = {
                {0, 10, 3, 0},
                {0, 0, 1, 2},
                {0, 4, 0, 8},
                {0, 0, 0, 0}
        };

        int source = 0;
        int n = graph.length;

        int[] distance = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(distance, 9999);
        distance[source] = 0;

        for (int i = 0; i < n; i++) {

            int min = 9999;
            int current = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && distance[j] < min) {
                    min = distance[j];
                    current = j;
                }
            }

            visited[current] = true;

            for (int j = 0; j < n; j++) {
                if (graph[current][j] != 0 && !visited[j]) {

                    int newDistance = distance[current] + graph[current][j];

                    if (newDistance < distance[j]) {
                        distance[j] = newDistance;
                    }
                }
            }
        }

        System.out.println("Shortest distance from Location 0:");

        for (int i = 0; i < n; i++) {
            System.out.println("Location 0 to Location " + i + " = " + distance[i] + " km");
        }
    }
}