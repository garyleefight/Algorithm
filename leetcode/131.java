public class Solution {
    public List<List<String>> partition(String s) {
        List<String> input = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        search(res,input,s);
        return res;
    }
    
    private void search(List<List<String>> res, List<String> input, String s){
        if( s == null || s.length() == 0){
            List<String> out = new ArrayList<>(input);
            res.add(out);
            return;
        }
        int length = s.length();
        int t_s = 0;
        int t_e = 0;
        int i=0;
        	for(int j=i;j<length;j++){
	        	if(s.charAt(i) == s.charAt(j)){
	        		t_s = i;
	        		t_e = j;
	        		while(t_e > t_s && s.charAt(t_s) == s.charAt(t_e)){
	        			t_s++;
	        			t_e--;
	        		}

	        		if(t_e <= t_s){
	        			String front = s.substring(i,j+1);
	        			String bottom = null;
	        			if(j + 1< length){
	        				bottom = s.substring(j+1,length);
	        			}
	        			input.add(front);
	        			search(res,input,bottom);
	        			input.remove(input.size()-1);
	        		}
	        	}
        	} 
    }
}