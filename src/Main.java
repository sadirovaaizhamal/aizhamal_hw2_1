public class Main {
    public static void main(String[] args) {
        System.out.println(come(150, 150));
        System.out.println(come(20, 200));
        System.out.println(come(250, 500));
        System.out.println(come(300, 3000));
        System.out.println(come(500, 5000));
    }


    public static String come(int age, int teamp) {
        if (age > 20 && age < 45 && teamp > -20 && teamp < 30) {
            return ("можно идти гулять");
        } else if (age < 20 && teamp > 0 && teamp < 28) {
            return ("можно идти гулять");
        } else if (age < 20 && teamp > 0 && teamp < 20) {
            return ("можно идти гулять");
        } else if (age > 45 && teamp > -10 && teamp < 25) {
            return ("можно идти гулять");
        }
        return ("можно идти гулять");
    }
}