public class App {

  public static int getYearCentury(int year) {
    int century = 0;
    if (year >= 1 && year <= 2005) {
      century = year / 100;
      if (year % 100 == 0) {
        return century;
      }
      century++;
    }
    return century;
  }

  public static void main(String[] args) throws Exception {
    int hola = getYearCentury(1988);
    System.out.println(hola);
  }
}
