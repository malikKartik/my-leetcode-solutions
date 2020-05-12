class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        String sol = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'|| s.charAt(i)=='U'){
                vowels.add(s.charAt(i));
                index.add(i);
            }
        }
        int k = index.size()-1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'|| s.charAt(i)=='U'){
                sol += vowels.get(k);
                k--;
            }else{
                sol += s.charAt(i);
            }
        }
        return sol;
    }
}