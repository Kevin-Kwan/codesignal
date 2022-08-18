int solution(int[] statues) {
    Arrays.sort(statues);
    int total = 0;
    for (int i=0;i<statues.length-1;i++) {
        int diff = statues[i+1]- statues[i];
        if (diff > 1) {
            total += diff-1;
        }
    }
    return total;
}
