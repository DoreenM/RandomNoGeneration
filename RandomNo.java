import java.util.Random;


public final class RandomNo {
  
  public static void main(String[] args){
    RandomNo number = new RandomNo();
    double MEAN = 100.0f; 
    double VARIANCE = 5.0f;
    for (int idx = 1; idx <= 10; ++idx){
      log("Generated : " + number.getNumber(MEAN, VARIANCE));
    }
  }
    
  private Random fRandom = new Random();
  
  private double getNumber(double aMean, double aVariance){
    return aMean + fRandom.nextNumber() * aVariance;
  }

  private static void log(Object aMsg){
    System.out.println(String.valueOf(aMsg));
  }
} 
