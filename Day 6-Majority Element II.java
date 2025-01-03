class Solution {
    public List<Integer> findMajority(int[] nums) {
        int e1 = -1, e2 = -1;
        int c1 = 0, c2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) {
                c1++;
            } else if (nums[i] == e2) {
                c2++;
            } else if (c1 == 0) {
                e1 = nums[i];
                c1 = 1;
            } else if (c2 == 0) {
                e2 = nums[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) {
                c1++;
            } else if (nums[i] == e2) {
                c2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (c1 > nums.length / 3) {
            res.add(e1);
        }
        if (c2 > nums.length / 3) {
            res.add(e2);
        }

        Collections.sort(res);

        return res;
    }
}
