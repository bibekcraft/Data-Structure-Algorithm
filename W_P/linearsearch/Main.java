public class Main {
    public static void main(String[] args) {
        String name = "";
        char target = 'c';
        System.out.println(findChar(name, target));
    }

    static boolean findChar(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
