package Patterns;

import java.io.*;
import java.util.*;

public class codeForce {

    static List<Integer>[] tree;
    static int[] leafCount;

    static void dfs(int u, int parent) {
        boolean isLeaf = true;
        int sum = 0;

        for (int v : tree[u]) {
            if (v == parent) continue;
            isLeaf = false;
            dfs(v, u);
            sum += leafCount[v];
        }

        if (isLeaf) {
            leafCount[u] = 1;
        } else {
            if (sum % 3 == 0) {
                leafCount[u] = 0; 
            } else {
                leafCount[u] = sum;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder output = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();

            tree = new ArrayList[n + 1];
            leafCount = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                tree[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {
                int u = fs.nextInt();
                int v = fs.nextInt();
                tree[u].add(v);
                tree[v].add(u);
            }

            dfs(1, 0);

            if (leafCount[1] == 0) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }

        System.out.print(output.toString());
    }

    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in;

        FastScanner(InputStream in) {
            this.in = in;
        }

        int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sign = 1, val = 0;

            do {
                c = read();
            } while (c <= ' ');

            if (c == '-') {
                sign = -1;
                c = read();
            }

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
}
