public class Add {
    int a;
    int b;
    public Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(Add number){
        return number.a+number.b;
    }
}
