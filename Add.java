public class AddOnlyInt3 {
    int a;
    int b;
    
    public Add(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int plus() { 
        return this.a + this.b + this.c;
    }

    public static void main(String[] args) {
        Add number = new Add(7,15);
        int result = number.plus();
        System.out.println(result);
    }
}
