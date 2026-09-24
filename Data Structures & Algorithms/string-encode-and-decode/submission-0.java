class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (String curr : strs) ans.append(curr.length()).append("#").append(curr);
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int curr_len = 0,i = 0;
        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != '#') j++;
            curr_len = Integer.parseInt(str.substring(i,j));
            j++;
            ans.add(str.substring(j,j + curr_len));
            i = j + curr_len;
        }
        return ans;
    }
}
