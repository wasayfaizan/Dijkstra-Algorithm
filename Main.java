import java.util.Scanner;

public class Main {

    // Function to implement Dijkstra's Algorithm
    public static void dijkstra(int graph[][], int source) {
        int numVertices = graph.length;

        // Distance array to store the shortest distance from the source
        int[] distance = new int[numVertices];

        // Boolean array to track visited vertices
        boolean[] visited = new boolean[numVertices];

        // Initialize distances to infinity and visited as false
        for (int i = 0; i < numVertices; i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distance[source] = 0;

        // Main loop for finding the shortest path for each vertex
        for (int count = 0; count < numVertices - 1; count++) {
            // Get the vertex with the minimum distance
            int u = getMinDistanceVertex(distance, visited);

            // Mark the vertex as visited
            visited[u] = true;

            // Update the distance value of adjacent vertices of the picked vertex
            for (int v = 0; v < numVertices; v++) {
                // Update the distance if:
                // 1. v is not visited
                // 2. There is an edge from u to v
                // 3. The current distance to v is greater than the new distance via u
                if (!visited[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE
                        && distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        // Print the shortest distances
        printSolution(distance);
    }

    // Helper function to find the vertex with the minimum distance
    public static int getMinDistanceVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < distance.length; v++) {
            if (!visited[v] && distance[v] < min) {
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Helper function to print the final distances from the source to all vertices
    public static void printSolution(int[] distance) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " \t\t " + distance[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of vertices
        System.out.print("Enter the number of vertices: ");
        int numVertices = scanner.nextInt();

        // Create the graph (adjacency matrix)
        int[][] graph = new int[numVertices][numVertices];

        // Ask user for the edges and their weights
        System.out.println("Enter the adjacency matrix (enter 0 for no edge between vertices):");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print("Enter weight for edge (" + i + ", " + j + "): ");
                graph[i][j] = scanner.nextInt();
            }
        }

        // Ask user for the source vertex
        System.out.print("Enter the source vertex: ");
        int source = scanner.nextInt();

        // Call the Dijkstra algorithm to find the shortest path from source
        dijkstra(graph, source);
        
        scanner.close();
    }
}
