# Graphs
Learning a new data structure: graphs.

## Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
* AddNode() - Adds a new node to the graph - Takes in the value of that node - Returns the added node
* AddEdge() - Adds a new edge between two nodes in the graph - Include the ability to have a “weight” - Takes in the two nodes to be connected by the edge - Both nodes should already be in the Graph
* GetNodes() - Returns all of the nodes in the graph as a collection (set, list, or similar)
* GetNeighbors() - Returns a collection of nodes connected to the given node, include the weight of the connection in the returned collection
* Size() - Returns the total number of nodes in the graph
* breadthFirst(value) - Returns array of the BFS order

## Approach & Efficiency

* addNode: O(1) space and time
* addEdge: O(1) space and time
* getNodes: O(n) space and time
* getNeighbors: O(n) space and time
* size: O(1) space O(n) time
*breadthFirst(value) space O(1) time O(n^2)

![img](img/ch36.png)
