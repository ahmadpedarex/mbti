import java.util.Scanner;

class MBTIQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int extrovert = 0, introvert = 0;
        int sensing = 0, intuition = 0;
        int thinking = 0, feeling = 0;
        int judging = 0, perceiving = 0;
        
        String[][] questions = {
            {"Do you enjoy social gatherings? (yes/no)", "E"},
            {"Do you prefer to work alone? (yes/no)", "I"},
            {"Do you rely more on facts than intuition? (yes/no)", "S"},
            {"Do you trust your gut feelings more? (yes/no)", "N"},
            {"Do you make decisions based on logic? (yes/no)", "T"},
            {"Do you consider people's feelings when making decisions? (yes/no)", "F"},
            {"Do you like having a clear plan? (yes/no)", "J"},
            {"Do you prefer to keep your options open? (yes/no)", "P"},
            {"Do you enjoy being the center of attention? (yes/no)", "E"},
            {"Do you find small talk exhausting? (yes/no)", "I"}
        };
        
        for (String[] question : questions) {
            System.out.println(question[0]);
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("yes")) {
                switch (question[1]) {
                    case "E": extrovert++; break;
                    case "I": introvert++; break;
                    case "S": sensing++; break;
                    case "N": intuition++; break;
                    case "T": thinking++; break;
                    case "F": feeling++; break;
                    case "J": judging++; break;
                    case "P": perceiving++; break;
                }
            }
        }
        
        String personality = "";
        personality += (extrovert >= introvert) ? "E" : "I";
        personality += (sensing >= intuition) ? "S" : "N";
        personality += (thinking >= feeling) ? "T" : "F";
        personality += (judging >= perceiving) ? "J" : "P";
        
        System.out.println("Your MBTI personality type is: " + personality);
        scanner.close();
    }
}
