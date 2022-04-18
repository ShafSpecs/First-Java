public class Giza {
  public static void main(String[] args) {
    long weightOfStone = 2_500_000;
    long numberOfYears = 27;
    long numberOfStones = 2_300_000;

    long totalWeight = weightOfStone * numberOfStones;

    float weightPerYear = totalWeight / numberOfYears;
    float weightPerHour = weightPerYear / 8760;
    float weightPerMinute = weightPerHour / 60;

    System.out.printf("The weight of the Giza statue will be %d kilograms after %d years.%n", totalWeight, numberOfYears);
    System.out.printf("The weight of the Giza statue will be %.3f kilograms per year.%n", weightPerYear);
    System.out.printf("The weight of the Giza statue will be %.3f kilograms per hour.%n", weightPerHour);
    System.out.printf("The weight of the Giza statue will be %.3f kilograms per minute.%n", weightPerMinute);
  }
}
