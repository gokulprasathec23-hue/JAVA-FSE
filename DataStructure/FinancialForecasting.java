class Main{
    public static double estimateCapital(double seedAmount,double annualRise,int durationYears) {
        if (durationYears == 0) {
            return seedAmount;
        }
        double priorEstimate =estimateCapital(seedAmount,annualRise,durationYears - 1);
        return priorEstimate * (1 + annualRise);
    }
    public static void main(String[] args) {
        double seedAmount = 25000.0;
        double annualRise = 0.12;
        int durationYears = 6;
        double projectedWorth =estimateCapital(seedAmount,annualRise,durationYears);
        System.out.printf("Forecasted Amount After %d Years : %.2f",durationYears,projectedWorth);
    }
}
