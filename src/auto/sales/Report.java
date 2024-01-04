package auto.sales;

public class Report {
    private static Record[] reports = new Record[1000];
    private static int counter;

    public Report() {
    }

    public void addReport (Record report) {
        Report.reports[counter] = report;
        counter++;
    }
    public void reportNow(String nameManager) {
        double allRevenue = 0;
        double allCost = 0;
        double allProfit = 0;
        System.out.println(nameManager);
        for (int i = 0; i < reports.length; i++) {
            if (reports[i] != null) {
                System.out.printf("%s - %s - %s", reports[i].getModelCar(), reports[i].getPriceSale(),
                        reports[i].getPriceCost());
                System.out.println();
                allRevenue = allRevenue + reports[i].getPriceSale();
                allCost = allCost + reports[i].getPriceCost();
                allProfit = allProfit + reports[i].getProfit();
            }
        }
        System.out.printf("Итоги: доходы %s, расходы %s, прибыль %s", allRevenue, allCost, allProfit);
        System.out.println();
    }

    public Record[] getReports() {
        return reports;
    }

    public int getCounter() {
        return counter;
    }
}
