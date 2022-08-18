String[] solution(String[] inputArray) {
    int compareValue = calcLargestLength(inputArray);
    List<String> beforeConvert = new ArrayList<String>();
    for (String theString : inputArray) {
        if (theString.length()==compareValue) {
            beforeConvert.add(theString);
        }
    }
    String[] answer = new String[beforeConvert.size()];
    return beforeConvert.toArray(answer);
}

int calcLargestLength(String[] inputArray) {
    int maxLength = 0;
    for (String theString : inputArray) {
        if (theString.length()>maxLength) {
            maxLength=theString.length();
        }
    }
    return maxLength;
}
