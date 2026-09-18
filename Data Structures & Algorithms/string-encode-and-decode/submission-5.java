class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }

        return res.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Find '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // Get the length before '#'
            int length = Integer.parseInt(s.substring(i, j));

            // Extract the actual string
            res.add(s.substring(j + 1, j + 1 + length));

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return res;
    }
}