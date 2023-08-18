package MasaiAssigments;
public class OccTheWord {
    public static void main(String[] args) {

        String str1 = "penmenpkenplen";
        String str2 = "epxynzn";

        int count1 = countPen(str1);
        int count2 = countPen(str2);

        System.out.println(count1); // Correct Output: 3
        System.out.println(count2); // Correct Output: 1
    }

    public static int countPen(String inputstr) {
        int count = 0;
        int index = 0;

        while (index < inputstr.length() - 2) {
            if (inputstr.substring(index, index + 3).equals("pen")) {
                count++;
                index += 3; // Move index past the current "pen" occurrence
            } else {
                index++;
            }
        }

        return count;
    }
}

