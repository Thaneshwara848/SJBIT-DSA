package graph;
import java.util.*;
public class FriendRecommendation {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B", "G"));
        graph.put("F", Arrays.asList("C"));
        graph.put("G", Arrays.asList("E"));
        String user = "A";
        recommendFriends(graph, user);
    }
    static void recommendFriends(Map<String, List<String>> graph, String user) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(user);
        queue.add(user);

        Set<String> directFriends = new HashSet<>(graph.get(user));

        System.out.println("Friend suggestions for " + user + ":");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            for (String friend : graph.get(current)) {

                if (!visited.contains(friend)) {

                    visited.add(friend);
                    queue.add(friend);

                    if (!directFriends.contains(friend)) {
                        System.out.println(friend);
                    }
                }
            }
        }
    }
} 
//Friend suggestions for A:
//D
//E
//F
//G
//
//Simple idea:
//
//A already knows B and C.
//
//Through B, A may know D and E.
//
//Through C, A may know F.
//
//So BFS recommends nearest friends first.