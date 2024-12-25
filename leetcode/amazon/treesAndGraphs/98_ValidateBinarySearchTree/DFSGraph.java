import java.util.*;

public class DFSGraph {
    private Map<String, List<Edge>> graph = new HashMap<>();

    // Edge class to represent the conversion rate
    private class Edge {
        String to;
        double rate;

        Edge(String to, double rate) {
            this.to = to;
            this.rate = rate;
        }
    }

    // Function to add a conversion rate to the graph
    public void addConversionRate(String from, String to, double rate) {
        graph.putIfAbsent(from, new ArrayList<>());
        graph.get(from).add(new Edge(to, rate));
    }

    // Function to find the conversion rate using DFS
    public double convert(String from, String to, double amount) {
        Set<String> visited = new HashSet<>();
        return dfs(from, to, amount, visited);
    }

    // Helper function to perform DFS
    private double dfs(String current, String target, double amount, Set<String> visited) {
        if (current.equals(target)) {
            return amount;
        }

        visited.add(current);

        if (!graph.containsKey(current)) {
            return -1; // Conversion path not found
        }

        for (Edge edge : graph.get(current)) {
            if (!visited.contains(edge.to)) {
                double result = dfs(edge.to, target, amount * edge.rate, visited);
                if (result != -1) {
                    return result;
                }
            }
        }

        return -1; // Conversion path not found
    }

    public static void main(String[] args) {
        DFSGraph converter = new DFSGraph();

        // Sample currency conversion rates
        converter.addConversionRate("USD", "EUR", 1.1);
        converter.addConversionRate("GBP", "COP", 23.5);
        converter.addConversionRate("EUR", "GBP", 1.2);
        converter.addConversionRate("EUR", "MXN", 19);

        // Convert 10 USD to COP
        double amountInCOP = converter.convert("USD", "COP", 10);
        if (amountInCOP != -1) {
            System.out.println("10 USD is worth " + amountInCOP + " COP");
        } else {
            System.out.println("Conversion path not found");
        }

        // Convert 3 EUR to MXN
        double amountInMXN = converter.convert("EUR", "MXN", 3);
        if (amountInMXN != -1) {
            System.out.println("3 EUR is worth " + amountInMXN + " MXN");
        } else {
            System.out.println("Conversion path not found");
        }
    }
}

