import java.util.*;
class BasicGraph {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u); // Undirected graph
        }
        System.out.println("Adjacency List: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int neighbour : adj.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}