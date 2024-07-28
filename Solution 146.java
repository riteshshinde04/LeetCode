class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new LinkedList<>();
        for(int idx=0, t_idx, t_size; idx < words.length; idx++) {
            for(t_idx=0, t_size = words[idx].length(); t_idx < t_size; t_idx++) {
                if(words[idx].charAt(t_idx) == x) {
                    list.add(idx);
                    break;
                }
            }
        }
        return list;
    }
}