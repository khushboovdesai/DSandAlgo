package Oath.Phone.Interview.Solution;

/**
 * Created by khush on 6/8/2018.
 */

import java.io.*;
import java.util.*;

    public class Solution {
        public static void main(String[] args) {

            Graph sol = new Graph(10); // 0-9

            System.out.println(sol.isConnected(0, 1)); // -> false

            sol.connect(0, 1);

            System.out.println(sol.isConnected(0, 1)); // -> true
            System.out.println(sol.isConnected(0, 0)); // -> true

            sol.connect(2, 3);
            // {0, 1}  {2, 3}

            sol.connect(1, 2);
            // {0,1} {1,2} {2,3}
            System.out.println(sol.isConnected(0, 3)); // -> true
            System.out.println(sol.isConnected(3, 0)); // -> true

            // 0, 1, 2, 3 are all connected
            // hint: graph problem OR as set problem?
        }
    }

