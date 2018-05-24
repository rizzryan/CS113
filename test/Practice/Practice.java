
// 1. C
// 2. B
// 3. A
// 4. C
// 5. B
// 6. 1 1 not a number 1
// 7. C
// 8. E
// 9. D
// 10. E

//11.
public class Cylinder extends Circle {
  protected double height;
  protected double radius;

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public void setDimensions(double height) {
    this.height = height;
  }

  public double getDimensions() {
    return this.height;
  }

  public boolean equals(Cylinder a, Cylinder b) {
    if (a.getDimensions() == b.getDimensions()) {
      return true;
    } else {
      return false;
    }
}

//12.
public int[] eStatistics(String[] names) {
  int[] freq = new int[names.length];

  for (int i = 0; i < names.lenght; i++) {
    int counter = 0;
    for (int j = 0; j < names[i].length; j++) {
      if (names[j].charAt(j) == 'e') {
        counter++;
        freq[i] = counter;
      }
    }
  }

  return freq;
}

//13.
public int power(int base, int expo) {
  if (expo == 0) {
    return 1;
  } else {
    return base * power(base, expo - 1);
  }
}
