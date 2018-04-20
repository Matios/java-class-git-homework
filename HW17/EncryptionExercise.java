
public class EncryptionExercise {
    public static void main(String[] args) {

        DecryptedString original = new DecryptedString("Secret message of unbelievable importance");

        Encrypter encrypter = (String input) -> {
            char[] chars = input.toCharArray();
            char[] reversed = reverse(chars);
            return new String(reversed).getBytes();
        };

        EncryptedString encrypted = original.encrypt(encrypter);

        Decrypter decrypter = (byte[] input) -> {
            char[] encryptedChars = new String(input).toCharArray();
            char[] reversedBack = reverse(encryptedChars);
            return new String(reversedBack);
        };

        DecryptedString decrypted = encrypted.decrypt(decrypter);
        System.out.println(decrypted.getUnencryted());
    }

    private static char[] reverse(char[] chars) {
        char[] reversed = new char[chars.length];
        for(int i = 0; i < chars.length; i++) {
            reversed[chars.length - 1 - i] = chars[i];
        }
        return reversed;
    }
}

class DecryptedString {

    private String unencryted;
    public DecryptedString(String unencryted) {
        this.unencryted = unencryted;
    }
    public String getUnencryted() {
        return unencryted;
    }

    public EncryptedString encrypt(Encrypter encrypter) {
        return new EncryptedString(encrypter.encrypt(unencryted));
    }
}

class EncryptedString {
    private byte[] encrypted;

    public EncryptedString(byte[] encrypted) {
        this.encrypted = encrypted;
    }

    public DecryptedString decrypt(Decrypter decrypter) {
        return new DecryptedString(decrypter.decrypt(encrypted));
    }
}

