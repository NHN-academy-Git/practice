public class Add {
    int a;
    int sol;
    int b;
    public Add(int a, int b){
        this.a = a;
        this.b = b;
        sol = this.a+this.b;
    }
    public int plus(){
        return sol;
    }


    public static void main(String[] args) {
        Add number = new Add(2,3);
        int result = number.plus();
        System.out.println(result);
    }
}
