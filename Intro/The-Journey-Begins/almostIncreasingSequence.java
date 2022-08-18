boolean solution(int[] sequence) {
    int needRemoval = 0;
    for (int i = 1; i<sequence.length;i++) {
        if (sequence[i]<=sequence[i-1]) {
            needRemoval++;
        if (needRemoval > 1) {
            return false;
        }
        if (i+1 < sequence.length && i-2 >=0 && i-1 >=0 && sequence[i+1] <= sequence[i-1] && sequence[i]<=sequence[i-2])
        {
            return false;
        }
        }
    }
    return true;
}
