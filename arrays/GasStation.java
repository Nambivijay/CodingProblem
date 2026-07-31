/**
 * Problem: Gas Station
 * Find starting gas station index to complete the circuit.
 * Time: O(n), Space: O(1)
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, currentGas = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) { start = i + 1; currentGas = 0; }
        }
        return totalGas >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        GasStation sol = new GasStation();
        System.out.println(sol.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})); // 3
    }
}