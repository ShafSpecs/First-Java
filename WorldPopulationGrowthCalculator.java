public class WorldPopulationGrowthCalculator {
  public static void main(String[] args) {
    long worldpopulation = 7900000000l;
    double growthRatePercentage = 1.1;
    double estimatedPopulation = 0;

    for (int i = 1; i <= 5; i++) {
      estimatedPopulation += worldpopulation * (growthRatePercentage / 100);
      System.out.println("The world population is " + estimatedPopulation + " in " + i + " years.");
    }
  }
}
