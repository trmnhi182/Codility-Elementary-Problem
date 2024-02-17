import java.util.Arrays;
import java.util.Comparator;

/**
 * There are N trees (numbered from 0 to N−1) in a forest. The K-th tree is located at coordinates (X[K], Y[K]).
 * We want to build the widest possible vertical path, such that there is no tree on it. The path must be built
 * somewhere between a leftmost and a rightmost tree, which means that the width of the path cannot be infinite.
 * What is the width of the widest possible path that can be built? Write a function that, given two arrays X and Y
 * consisting of N integers each, denoting the positions of trees, returns the width of the widest possible path that
 * can be built.
 * <p>
 * 1. Given X=[1, 8, 7, 3, 4, 1, 8], Y=[6, 4, 1, 8, 5, 1, 7], the function should return 3.
 * 2. Given X=[5, 5, 5, 7, 7, 7], Y=[3, 4, 5, 1, 3, 7], the function should return 2.
 * 3. Given X=[6, 10, 1, 4, 3], Y=[2, 5, 3, 1, 6], the function should return 4.
 * 4. Given X=[4, 1, 5, 4], Y=[4, 5, 1, 3], the function should return 3.
 */
public class theWidestPath {
    private static class Tree {
        int x, y;

        Tree(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int[] X, int[] Y) {
        int n = X.length;
        Tree[] trees = new Tree[n];
        for (int i = 0; i < n; i++) {
           trees[i] = new Tree(X[i], Y[i]);
        }

        Arrays.sort(trees, Comparator.comparingInt(tree -> tree.x));
        int maxWidth = 0;
        for(int i=0; i<n-1; i++){
            int width = trees[i+1].x - trees[i].x;
            int minY = Math.min(trees[i].y, trees[i+1].y);
            int maxY = Math.max(trees[i].y, trees[i+1].y);
            if(minY <= maxY && width > maxWidth) maxWidth = width;
        }
        return maxWidth;
    }

    public static void main(String[] args){
        int[] x1 ={1,8,7,3,4,1,8};
        int[] y1 ={6,4,1,8,5,1,7};

        int[] x2 ={5,5,5,7,7,7};
        int[] y2={3,4,5,1,3,7};

        int[] x3={6,10,1,4,3};
        int[] y3={2,5,3,1,6};

        int[] x4={4,1,5,4};
        int[] y4={4,5,1,3};

        System.out.println(solution(x1,y1));
        System.out.println(solution(x2,y2));
        System.out.println(solution(x3,y3));
        System.out.println(solution(x4,y4));

    }
}
