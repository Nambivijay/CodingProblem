import java.util.*;
/**
 * Problem: Asteroid Collision
 * Simulate asteroid collisions. Positive = right, negative = left.
 * Time: O(n), Space: O(n)
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int ast : asteroids) {
            boolean alive = true;
            while (alive && ast < 0 && !stack.isEmpty() && stack.peek() > 0) {
                if (stack.peek() < -ast) stack.pop();
                else if (stack.peek() == -ast) { stack.pop(); alive = false; }
                else alive = false;
            }
            if (alive) stack.push(ast);
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) result[i] = stack.pop();
        return result;
    }
    public static void main(String[] args) {
        AsteroidCollision sol = new AsteroidCollision();
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[]{5,10,-5}))); // [5,10]
        System.out.println(Arrays.toString(sol.asteroidCollision(new int[]{8,-8}))); // []
    }
}