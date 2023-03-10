public class Add {
    int a;
    int b;

    public Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a + b;
    }

    public static void main(String[] args) {
        Add add = new Add(1,2);
        int result = add.add();
        System.out.println(result);
    }
}
