class Vowel {
    String sen;

    Vowel(String s) {
        this.sen = s;
        if (sen.equals(null) || sen.isEmpty()) {
            System.out.println("The sentence is empty.");
        } else {
            int vowelCount = 0;
            for (char c : sen.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            System.out.println("Number of vowels in the sentence: " + vowelCount);
        }
    }

    public void display() {
        System.out.println("The sentence is: " + this.sen);
    }
}

class sentencevowel {
    public static void main(String[] args) {
        Vowel v1 = new Vowel("Hello How Are You");
        v1.display();
        // Vowel v2 = new Vowel("This is a test sentence.");
        // v2.display();
    }
}
