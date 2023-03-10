public class Add {

  int a;
  int b;

  public Add(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int plus() {
    return this.a + this.b;
  }

  public static void main(String[] args) {
        Add number = new Add(2,3);
        int result = number.plus();
        System.out.println(result);
        System.out.println("Hello, world!");
    }