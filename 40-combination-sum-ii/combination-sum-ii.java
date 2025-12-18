class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0, target, candidates, new ArrayList<>());
        return ans;
    }

    private void backtrack(int start, int rem, int[] c, List<Integer> cur) {
        if (rem == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i < c.length; i++) {
            if (i > start && c[i] == c[i - 1]) continue;

            if (c[i] > rem) break;

            cur.add(c[i]);
            backtrack(i + 1, rem - c[i], c, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
