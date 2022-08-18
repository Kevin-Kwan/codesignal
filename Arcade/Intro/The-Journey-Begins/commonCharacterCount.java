int solution(String s1, String s2) {
    int answer = 0;
    Map<Character, Integer> dict1 = new HashMap<Character, Integer>();
    Map<Character, Integer> dict2 = new HashMap<Character, Integer>();
    for (int i=0;i<s1.length();i++) {
        dict1.put(s1.charAt(i),dict1.getOrDefault(s1.charAt(i), 0)+1);
    }
    for (int i=0;i<s2.length();i++) {
        dict2.put(s2.charAt(i),dict2.getOrDefault(s2.charAt(i), 0)+1);
    }
    for (Character key : dict1.keySet()) {
        if (dict2.getOrDefault(key,0)>0) {
            answer += Math.min(dict2.get(key),dict1.get(key));
        }
    }
    return answer;
    
}
