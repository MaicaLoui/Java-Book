public class ExerciseOneEleven {
    public static void main(String[] args) throws Exception {

        int hoursfiveyears = 365 * 24;
        int minutesfiveyears = hoursfiveyears * 60;
        int secondsfiveyears = minutesfiveyears * 60;

        double birthperyear = secondsfiveyears / 7.0;
        double deathperyear = secondsfiveyears / 13.0;
        double immigrantsperyears = secondsfiveyears / 45.0;

        double currentPopulation = 312032486;
        double populationperyear = currentPopulation + birthperyear - deathperyear + immigrantsperyears;

        System.out.println("Population per year " + populationperyear);
        System.out.println("Population in five years " + populationperyear * 5);
    }
}
