class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0; i< words.length; i++) map.put(words[i], i);
        for(int i=0; i< words.length; i++){
            String w = words[i];
            int in = exists("", map);
            if(palin(w, 0, w.length()-1) && in != -1 && in != i){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(in);
                ans.add(l);
                List<Integer> m = new ArrayList<>();
                m.add(in);
                m.add(i);
                ans.add(m);
            }
            StringBuilder s = new StringBuilder();
            for(int j=0; j<w.length(); j++){
                s.append(w.charAt(j));
                StringBuilder rev = new StringBuilder(s);
                rev.reverse();
                int ind = exists(rev.toString(), map);
                if(ind != -1 && ind != i && palin(w, j+1, w.length()-1) ){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(ind);
                    ans.add(l);
                }
            }
        }
        for(int i=0; i< words.length; i++){
            StringBuilder w = new StringBuilder(words[i]);
            StringBuilder s = new StringBuilder();
            for(int j=w.length()-1; j>=0; j--){
                s.append(w.charAt(j));
                w.deleteCharAt(j);
                int ind = exists(s.toString(), map);
                if(ind != -1 && ind != i && palin(w.toString(), 0, w.length()-1) ){
                    List<Integer> l = new ArrayList<>();
                    l.add(ind);
                    l.add(i);
                    ans.add(l);
                }
            }
        }
        Set<List<Integer>> set = new HashSet(ans);
        ans.clear();
        ans.addAll(set);
        return ans;
    }

    public int exists(String a, HashMap<String, Integer> map){
        if(map.containsKey(a)) return map.get(a);
        else return -1;
    }

    public boolean palin(String str, int s, int e){
        if(str.equals("")) return true;
        int k=0;
        for (int i = s; i <= (s+e)/2 ; i++){
            if (str.charAt(i) != str.charAt(e-k))
                return false;
            k++;
        }
        return true;
    }

}