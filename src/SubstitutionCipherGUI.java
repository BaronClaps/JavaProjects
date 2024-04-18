import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SubstitutionCipherGUI extends JFrame {

    private JTextField plaintextField, ciphertextField, decodedTextField;
    private JButton encodeButton, decodeButton;
    private Map<Character, Character> cipherMap = new HashMap<>();

    public SubstitutionCipherGUI() {
        setTitle("Substitution Cipher");
        setLayout(new GridLayout(3, 2));

        // Encoder section
        add(new JLabel("Plaintext:"));
        plaintextField = new JTextField(20);
        add(plaintextField);

        encodeButton = new JButton("Encode");
        encodeButton.addActionListener(e -> encode());
        add(encodeButton);

        add(new JLabel("Ciphertext:"));
        ciphertextField = new JTextField(20);
        ciphertextField.setEditable(false);
        add(ciphertextField);

        // Decoder section
        add(new JLabel("Ciphertext:"));
        decodedTextField = new JTextField(20);
        add(decodedTextField);

        decodeButton = new JButton("Decode");
        decodeButton.addActionListener(e -> decode());
        add(decodeButton);

        pack();
        setVisible(true);

        generateCipherMap(); // Create the initial cipher map
    }

    private void generateCipherMap() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] shuffled = alphabet.toCharArray();
        Random random = new Random();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }

        // Create the cipher map
        for (int i = 0; i < alphabet.length(); i++) {
            cipherMap.put(alphabet.charAt(i), shuffled[i]);
        }
    }

    private void encode() {
        String plaintext = plaintextField.getText();
        String ciphertext = "";
        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                ciphertext += cipherMap.get(Character.toLowerCase(c));
            } else {
                ciphertext += c;
            }
        }
        ciphertextField.setText(ciphertext);
    }

    private void decode() {
        String ciphertext = decodedTextField.getText();
        String decodedText = "";
        for (char c : ciphertext.toCharArray()) {
            for (Map.Entry<Character, Character> entry : cipherMap.entrySet()) {
                if (entry.getValue() == c) {
                    decodedText += entry.getKey();
                    break;
                }
            }
        }
        ciphertextField.setText(decodedText);
    }

    public static void main(String[] args) {
        new SubstitutionCipherGUI();
    }
}
