<body>
    <h1>Dijkstra's Algorithm Implementation in Java</h1>
    <p>This repository contains a Java implementation of Dijkstra's Algorithm to find the shortest paths from a source vertex to all other vertices in a weighted graph.</p>  
    <h2>Features</h2>
    <ul>
        <li>User input for the number of vertices and their connections (adjacency matrix).</li>
        <li>Calculates and displays the shortest path from the selected source vertex to all other vertices.</li>
        <li>Can be used to find the shortest paths in any connected, weighted, and undirected graph.</li>
    </ul>
    <h2>Usage</h2>
    <ol>
        <li>Clone the repository using <code>git clone <repository-url></code>.</li>
        <li>Compile and run the <code>Main.java</code> file.</li>
        <li>Input the number of vertices, the adjacency matrix for the graph, and the source vertex when prompted.</li>
        <li>View the calculated shortest paths from the source vertex.</li>
        </ol>
    <h2>Example</h2>
    <pre>
        Enter the number of vertices: 3
        Enter the adjacency matrix (enter 0 for no edge between vertices):
        Enter weight for edge (0, 0): 0
        Enter weight for edge (0, 1): 1
        Enter weight for edge (0, 2): 4
        Enter weight for edge (1, 0): 1
        Enter weight for edge (1, 1): 0
        Enter weight for edge (1, 2): 2
        Enter weight for edge (2, 0): 4
        Enter weight for edge (2, 1): 2
        Enter weight for edge (2, 2): 0
        Enter the source vertex: 0
        Vertex   Distance from Source
        0        0
        1        1
        2        3
    </pre>
    

</body>
</html>
