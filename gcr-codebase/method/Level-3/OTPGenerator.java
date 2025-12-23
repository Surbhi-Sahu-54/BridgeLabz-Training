public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {

        // generate random number between 100000 and 999999
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }

        return true; // all OTPs are unique
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // generate OTPs 10 times
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // display OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are UNIQUE");
        } else {
            System.out.println("\nSome OTPs are NOT UNIQUE");
        }
    }
}
