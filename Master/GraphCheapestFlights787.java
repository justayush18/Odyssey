package Leetcode;

import Graphs.GraphMake;
import Graphs.GraphMake.Edge;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphCheapestFlights787 extends GraphMake {
    public static class Info {
        int vertex, cost, stop;

        public Info(int vertex, int cost, int stop) {
            this.vertex = vertex;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public static void create(int[][] flight, ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int w = flight[i][2];

            Edge e = new Edge(src, dest, w);
            graph[src].add(e);
        }
    }

    public static int cheapFlight(ArrayList<Edge>[] graph, int src, int dest, int stop) {
        //dist[] = Best (latest) record
        int[] dist = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        //Queue = History of all possible journeys
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stop > stop) break;
            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                // We use curr.cost because each queue entry represents a specific path
                if (curr.stop <= stop && (curr.cost + e.weight < dist[e.dest])) {
                    dist[e.dest] = curr.cost + e.weight;
                    q.add(new Info(e.dest, dist[e.dest], (curr.stop + 1)));
                }
            }
        }
        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[4];
        int[][] flight = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        create(flight, graph);
        System.out.println(cheapFlight(graph, 0, 3, 1));
    }
}
