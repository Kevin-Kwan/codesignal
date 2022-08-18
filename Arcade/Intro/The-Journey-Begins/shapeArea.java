int solution(int n) {
    if (n==1) {
        return 1;
    }
    return (int) Math.pow(n,2) + (int) Math.pow(n-1,2);
}
