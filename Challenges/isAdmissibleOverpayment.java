boolean solution(double[] prices, String[] notes, double x) {
    double[] actualPrices = new double[prices.length];
    for (int i=0;i<notes.length;i++) {
        if (notes[i].contains("% higher than in-store")) {
            String textValue = notes[i].substring(0,notes[i].indexOf("%"));
            double actualValue = Double.parseDouble(textValue);
            double percentage = actualValue/100.0;
            double divisor = 1.0+percentage;
            actualPrices[i]=prices[i]*(1/divisor);
        }
        else if (notes[i].contains("% lower than in-store")) {
            String textValue = notes[i].substring(0,notes[i].indexOf("%"));
            double actualValue = Double.parseDouble(textValue);
            double percentage = actualValue/100;
            double divisor = 1-percentage;
            actualPrices[i]=prices[i]/divisor;
        } else {
            actualPrices[i]=prices[i];
            
        }
    }
    double totalCalc=0;
    for (int i=0;i<prices.length;i++) {
        totalCalc+=prices[i]-actualPrices[i];
    }
    return totalCalc<=x;
}
