package ewalletapplication;
public class Main{
    public static void main(String[] args) {

        User u1 = new User(
                1,
                "Surbhi",
                new PersonalWallet(2000, true)
        );

        User u2 = new User(
                2,
                "Aman",
                new BusinessWallet(10000)
        );

        System.out.println("Initial Balance (Surbhi): ₹" + u1.getWallet().getBalance());
        System.out.println("Initial Balance (Aman): ₹" + u2.getWallet().getBalance());

        u1.getWallet().transferTo(u2, 1500);
        u2.getWallet().transferTo(u1, 2000);

        System.out.println("Final Balance (Surbhi): ₹" + u1.getWallet().getBalance());
        System.out.println("Final Balance (Aman): ₹" + u2.getWallet().getBalance());
    }
}
