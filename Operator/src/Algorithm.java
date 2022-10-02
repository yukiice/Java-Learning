public class Algorithm {
    public static void main(String[] args){
        int b = 0,c = 0,d = 0;
        for (int a = 0;a<= 1000;a++){
            b = a / 100;
            c = a / 10 % 10;
            d = a % 10;
            if (Math.pow(b,3) + Math.pow(c,3) + Math.pow(d,3) == a){
                System.out.println(a);
            }
        }

    }
}
