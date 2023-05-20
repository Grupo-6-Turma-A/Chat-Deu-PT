package com.app;

import javazoom.jl.player.Player;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import java.io.*;

import java.util.Scanner;

interface MethodToInvoke {
    boolean execute(Object obj, Method method);
}

class MyMethodToInvoke implements MethodToInvoke {
    @Override
    public boolean execute(Object obj, Method method) {
        try {
            return (boolean) method.invoke(obj, method);
        } catch (Exception e) {
            return false;
        }
    }
}

public class App {
    static Scanner scanner = new Scanner(System.in);

    static Boolean[] array1 = { true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true, true,
            true, true
    };

    static Boolean[] array2 = { true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true, true,
            true
    };

    static String[] counterChallenge = { "src/main/java/com/app/Counter.java", "com.app.Counter", "countSheeps", "0" };
    static String[] binaryChallgenge = { "src/main/java/com/app/Binary.java", "com.app.Binary", "fakeBinary", "4" };
    static String[] alarmChallgenge = { "src/main/java/com/app/Alarm.java", "com.app.Alarm", "setAlarm", "1" };
    static String[] numChallgenge = { "src/main/java/com/app/Num.java", "com.app.Num", "numToString", "4" };
    static String[] positiveChallgenge = { "src/main/java/com/app/Positive.java", "com.app.Positive", "sum", "2" };
    static String[] reverseChallgenge = { "src/main/java/com/app/Reverse.java", "com.app.Reverse", "reverseNumber",
            "3" };
    static String[] stringToArrayChallgenge = { "src/main/java/com/app/StringToArray.java", "com.app.StringToArray",
            "stringToArray", "5" };

    static String binaryTest1 = "45385593107843568";
    static String binaryTest2 = "509321967506747";
    static String binaryTest3 = "366058562030849490134388085";

    static int[] sumTest1 = { 1, 2, 3, 4, 5 };
    static int[] sumTest2 = { 1, -2, 3, 4, 5 };
    static int[] sumTest3 = {};

    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static PrintStream show = System.out;

    // player info
    static String player_name = null;
    static String file_stage = null;
    static String player_stage = null;

    public static void main(String[] args) throws Exception {
        gameMenu();
    }

    // game body starts here

    public static void stageOne() {
        printHeading("STAGE ONE");
        show.println(
                "you're on first stage, you need to write a code to pass this stage go to the file Counter.java and write the code to pass this stage");
        anyKeyToContinue();
        MethodToInvoke methodToInvoke = new MyMethodToInvoke();
        boolean result = testPlayerCode(counterChallenge, methodToInvoke);
        show.println(result ? "you passed the stage" : "you failed the stage");
        if (result) {
            stageTwo();
        } else {
            stageOne();
        }
    }

    public static void stageTwo() {
        show.println("you're on second stage");
    }

    public static void stageTree() {

    }

    public static void stageFour() {

    }

    public static void stageFive() {

    }

    // menu config

    public static void gameMenu() {
        sb.append("\n| - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - -   WELCOME TO CHATDEUPT - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - |");
        sb.append("\n| -    |1|  NEW GAME ~ ~ ~ |2| LOAD GAME ~ ~ ~  |3| TUTORIAL   - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - |");
        sb.append("\n| -   ~ ~ ~ ~  |4| CREDITS  ~ ~ ~ ~ ~  |5| EXIT GAME ~ ~ ~ ~   - |");
        sb.append("\n| - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - |");
        show.println(sb.toString());
        int player_option = sc.nextInt();

        switch (player_option) {
            case 1:
                newGame();
                break;
            case 2:
                loadGame();
                break;
            case 3:
                tutorial();
                break;
            case 4:
                credits();
                break;
            case 5:
                exit();
                break;
            default:
                show.println("invalid option");
                break;
        }
    }

    public static void tutorial() {
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        sb.append("\n| - -  - - - - - - - -   TUTORIAL SCREEN   - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - |");
        sb.append("\n| - - - - - - - -     PRESS M TO RETURN MENU   - - - - - - - - - |");
        sb.append("\n| - - - - - - - - -        OR E TO EXIT        - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - |");
        show.println(sb.toString());
        char player_choice = sc.next().toUpperCase().charAt(0);

        if (player_choice == 'M') {
            gameMenu();
        } else if (player_choice == 'E') {
            exit();
        }
    }

    public static void credits() {
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - -   CREDITS SCREEN   - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - -     PRESS M TO RETURN MENU   - - - - - - - - - |");
        sb.append("\n| - - - - - - - - -        OR E TO EXIT        - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - |");
        show.println(sb.toString());
        char player_choice = sc.next().toUpperCase().charAt(0);

        if (player_choice == 'M') {
            gameMenu();
        } else if (player_choice == 'E') {
            exit();
        }
    }

    public static void exit() {
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        sb.append("\n| - -  - - - -             GAME FINISHED       - - - - - - - - - |");
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        show.println(sb.toString());
    }

    public static void newGame() {
        show.println("enter your nickname");
        player_name = sc.next();
        player_stage = "first-stage";
        saveGame(player_name, player_stage);

        show.println("E or M");
        char player_choice = sc.next().toUpperCase().charAt(0);

        if (player_choice == 'M') {
            stageOne();
        } else if (player_choice == 'E') {
            exit();
        }
    }

    /**
     * save game on cfg file
     *
     * @param name  player name
     * @param stage actual player stage
     */
    public static void saveGame(String name, String stage) {
        if (stage != null)
            file_stage = stage;

        // preparing json data
        JSONObject json = new JSONObject();
        json.put("name", player_name);
        json.put("stage", file_stage);

        // saving file
        FileWriter writerFile = null;
        try {
            writerFile = new FileWriter("cfg.json");
            writerFile.write(json.toJSONString());
            writerFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Saved!");
        }
    }

    /*
     * load a game using json data then call
     * verifyStage using json_stage as parameter
     */
    public static void loadGame() {
        JSONParser parser = new JSONParser();
        JSONObject json;

        String json_name, json_stage = "";
        try {
            json = (JSONObject) parser.parse(new FileReader("cfg.json"));
            json_name = (String) json.get("name");
            json_stage = (String) json.get("stage");
        } catch (Exception e) {
            e.printStackTrace();
        }
        verifyStage(json_stage);
    }

    /**
     * verify the stage and call the corresponding
     * game body
     * 
     * @param stage thatll be verified
     */
    public static void verifyStage(String stage) {
        if (stage.equals("first-stage")) {
            stageOne();
            show.println("load complete");
        } else if (stage.equals("second-stage")) {
            stageTwo();
            show.println("load complete");
        }
    }

    // Pass the method to be tested and the object to invoke the method on
    public static boolean testPlayerCode(String[] challenge, MethodToInvoke methodToInvoke) {
        Class<?>[] paramTypes = new Class<?>[] {
                Boolean[].class,
                boolean.class,
                int.class,
                int[].class,
                String.class,
                String[].class
        };

        try {
            OutputStream os = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(os);
            System.setOut(ps);

            // Compile the code
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            int compilationResult = compiler.run(null, null, null, challenge[0]);
            if (compilationResult != 0) {
                // Compilation failed
                return false;
            }
            // Load the Counter class
            ClassLoader classLoader = App.class.getClassLoader();
            Class<?> cls = classLoader.loadClass(challenge[1]);
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getDeclaredMethod(challenge[2], paramTypes[Integer.parseInt(challenge[3])]);

            // Invoke the method
            return methodToInvoke.execute(obj, method);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean counterTest(Method metodo, Object obj)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String result = Integer.toString((int) metodo.invoke(obj, (Object) array1));
        String result2 = Integer.toString((int) metodo.invoke(obj, (Object) array2));
        boolean test1 = result.contains("18");
        boolean test2 = result2.contains("17");
        return test1 && test2;
    }

    public static boolean alarmTest(Method metodo, Object obj)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean test1 = metodo.invoke(obj, true, true).equals(false);
        boolean test2 = metodo.invoke(obj, false, true).equals(false);
        boolean test3 = metodo.invoke(obj, false, false).equals(false);
        boolean test4 = metodo.invoke(obj, true, false).equals(true);

        return test1 && test2 && test3 && test4;
    }

    public static boolean fakeBinaryTest(Method metodo, Object obj)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean test1 = metodo.invoke(obj, binaryTest1).equals("01011110001100111");
        boolean test2 = metodo.invoke(obj, binaryTest2).equals("101000111101101");
        boolean test3 = metodo.invoke(obj, binaryTest3).equals("011011110000101010000011011");

        return test1 && test2 && test3;
    }

    public static boolean numTest(Method metodo, Object obj)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String test1 = ((String) metodo.invoke(obj, 9)).toLowerCase();
        boolean test1_1 = test1.contains("nove");
        String test2 = ((String) metodo.invoke(obj, 8)).toLowerCase();
        boolean test2_1 = test2.contains("oito");
        String test3 = ((String) metodo.invoke(obj, 7)).toLowerCase();
        boolean test3_1 = test3.contains("sete");
        String test4 = ((String) metodo.invoke(obj, 6)).toLowerCase();
        boolean test4_1 = test4.contains("seis");
        String test5 = ((String) metodo.invoke(obj, 5)).toLowerCase();
        boolean test5_1 = test5.contains("cinco");
        String test6 = ((String) metodo.invoke(obj, 4)).toLowerCase();
        boolean test6_1 = test6.contains("quatro");
        String test7 = ((String) metodo.invoke(obj, 3)).toLowerCase();
        boolean test7_1 = test7.contains("tres");
        String test8 = ((String) metodo.invoke(obj, 2)).toLowerCase();
        boolean test8_1 = test8.contains("dois");
        String test9 = ((String) metodo.invoke(obj, 1)).toLowerCase();
        boolean test9_1 = test9.contains("um");

        return test1_1 && test2_1 && test3_1 && test4_1 && test5_1 && test6_1 && test7_1 && test8_1 && test9_1;
    }

    public static boolean positiveTest(Method metodo, Object obj)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean test1 = metodo.invoke(obj, sumTest1).equals(15);
        boolean test2 = metodo.invoke(obj, sumTest2).equals(13);
        boolean test3 = metodo.invoke(obj, sumTest3).equals(0);
        return test1 && test2 && test3;
    }

    public static boolean reverseTest(Method metodo, Object obj)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean test1 = metodo.invoke(obj, 123).equals(new int[] { 3, 2, 1 });
        boolean test2 = metodo.invoke(obj, 1234).equals(new int[] { 4, 3, 2, 1 });
        boolean test3 = metodo.invoke(obj, 12345).equals(new int[] { 5, 4, 3, 2, 1 });
        return test1 && test2 && test3;
    }

    public static boolean stringToArrayTest(Method metodo, Object obj)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean test1 = metodo.invoke(obj, "Robin Singh").equals(new String[] { "Robin", "Singh" });
        boolean test2 = metodo.invoke(obj, "I love arrays they are my favorite")
                .equals(new String[] { "I", "love", "arrays", "they", "are", "my", "favorite" });
        return test1 && test2;
    }

    public static void soundtrack(String song) {
        try {
            FileInputStream file = new FileInputStream(song);
            Player play = new Player(file);
            play.play();
        } catch (javazoom.jl.decoder.JavaLayerException e) {
            System.out.println("javazoom");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
    }

    // This sections if for helper methods

    /**
     * this method is used to clear the terminal
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * this method is used to read a string from the user
     * 
     * @param prompt the message that will be shown to the user
     * @return the string that the user typed
     */

    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Entrada inválida! Informe um número inteiro.");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    /**
     * this method is used to print a separator
     * 
     * @param n the number of times the separator will be printed
     */
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
        // fodase
    }

    /**
     * this method is used to print a heading
     * 
     * @param title the title of the heading
     */
    public static void printHeading(String title) {
        printSeparator(50);
        System.out.println(title);
        printSeparator(50);
    }

    /**
     * this method is used await for the user to press any key
     */
    public static void anyKeyToContinue() {
        System.out.println("Pressione qualquer tecla para continuar...");
        scanner.nextLine();
    }

    public static void printOption(int option, String text) {
        System.out.println("(" + option + ") " + text);
    }
}