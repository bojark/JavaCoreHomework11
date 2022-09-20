public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        //Работать не будет потому, что деление на 0:
        int a = calc.plus.apply(1, 2); //3
        int b = calc.minus.apply(1, 1); //0
        int c = calc.devide.apply(a, b); // 3 / 0 — деление на 0.
        // Ошибку можно решить, если не делить на 0. Чтобы программа не прерывалась, можно перехватить ошибку или
        // вернуть из devide какое-нибудь число постоянное число, нарпимер, 0 (метод должен возвращать число).
        // Не до конца понял, что именно нужно было сделать, поэтому переписал метод devide с условием про деление на 0.
        calc.println.accept(c);
    }
}