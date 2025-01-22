// Java program to find union of two arrays

import java.util.ArrayList;

class GfG {
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        // Traverse through a[] and search
        // every element a[i] in result
        for (int num : a) {

            // check if the element is already in
            // the result to avoid duplicates
            if (!res.contains(num)) {
                res.add(num);
            }
        }

        // Traverse through b[] and search
        // every element b[i] in result
        for (int num : b) {

            // check if the element is already in
            // the result to avoid duplicates
            if (!res.contains(num)) {
                res.add(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
      
        int[] a = { 1, 2, 3, 2, 1 };
        int[] b = { 3, 2, 2, 3, 3, 2 };

        ArrayList<Integer> res = findUnion(a, b);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
