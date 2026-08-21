package Leetcode;

import java.util.PriorityQueue;

public class GraphConnectingCities1135 {
    public static class Edge implements Comparable<Edge> {
        int dest, weight;

        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

    public static int cityConnection(int[][] city) {
        int finalCost = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[city.length];

        pq.add(new Edge(0, 0));
        while (!pq.isEmpty()) {
            Edge e = pq.remove();
            if (!vis[e.dest]) {
                vis[e.dest] = true;
                finalCost += e.weight;
                for (int i = 0; i < city[e.dest].length; i++) {
                    if (city[e.dest][i] != 0) {
                        pq.add(new Edge(i, city[e.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }

    public static void main(String[] args) {
        int[][] city = {{0, 1, 2, 3, 4},
                        {1, 0, 5, 0, 7},
                        {2, 5, 0, 6, 0},
                        {3, 0, 6, 0, 0},
                        {4, 7, 0, 0, 0}};
        System.out.println(cityConnection(city));
    }
}
