package auto.sales;

public class Report {
    private static final Record[] reports = new Record[1000];
    private static int counter;

    public Report() {
    }

    public void addReport(Record report) {
        Report.reports[counter] = report;
        counter++;
    }

    public void reportNow() {
        for (Record report : reports) {
            if (report != null) {
                System.out.printf("Менеджер: %s, Модель: %s, Цена машины: %s",
                        report.getNameManager(), report.getModelCar(), report.getPriceSale());
                System.out.println();
            }
        }
    }

    public Record[] getReports() {
        return reports;
    }

    public int getCounter() {
        return counter;
    }
}
