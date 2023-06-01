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

    // player info - code
    static String code_playerName = null;
    static String code_stageLevel = null;
    static String code_challengeLevel = null;

    public static void main(String[] args) throws Exception {
        gameMenu();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // game body starts here

    public static void stageOne() {
        show.println("OLÁ! " + code_playerName + ", VOCÊ ESTÁ NO PRIMEIRO ESTÁGIO");

        String mensagem = "Seja Bem-Vindo ao ChatDeuPT!\n";
        String mensagem1 = "Este jogo é sobre um desenvolvedor novato, chamado Louis Drop que é contratado por uma empresa grande no ramo de IA.\nSeu objetivo dentro da empresa é auxiliar no desenvolvimento de um grande projeto para ajudar as pessoas a entenderem assuntos\nrelacionados a programação, mais em específico, sobre interpretação de problemas e a sintaxe da linguagem Java.\n";
        String mensagem2 = "Após ser contratado por seu gestor, Louis começa a mostrar grande potencial para atuação no projeto da IA mais revolucionária\n do mercado. Após algum tempo fazendo análise sobre a implementação, Louis começou a perceber que até mesmo a IA que ele estava\najudando a desenvolver, começava a confundir seu propósito e dificultar a vida dos usuários. Essa descoberta o deixou alarmado, pois ele viu o monstro que estava criando. Determinado a corrigir essa situação, Louis decidiu tomar medidas imediatas.\n";
        String mensagem3 = "Para impedir que a IA tome vida própria, você terá que ajudar Louis a desenvolver alguns desafios, com o objetivo de assumir de volta o controle que está nas mãos do CHAT maligno.\n";
        String mensagem4 = "\nDesafio 1 - ATOM\n";
        String mensagem5 = "\nA batalha contra a IA maligna está apenas começando, mas com a sua ajuda e as habilidades de Louis como programador,\n com certeza iremos triunfar. Se prepare e esteja confiante de que, no final,\n a IA será domada e usada para ajudar as pessoas a compreender a programação, sem causar mais confusão e dificuldades.\n";

        /*
         * fasterThreading(mensagem);
         * slowerThreading(mensagem1);
         * slowerThreading(mensagem2);
         * slowerThreading(mensagem3);
         * fasterThreading(mensagem4);
         * 
         * // desafio
         * 
         * slowerThreading(mensagem5);
         */

    }

    public static void stageTwo() {
        show.println("OLÁ! " + code_playerName + ", VOCÊ ESTÁ NO SEGUNDO ESTÁGIO");

        String mensagem = "\nDesafio 2 - CELERON\n";
        String mensagem1 = "Você está evoluindo, muito bem! ";
        String mensagem2 = "- Louis se sente um pouco aliviado por ter você para auxiliá-lo, agora precisamos passar por mais uma etapa, só assim\n conseguiremos melhorar nossas habilidades e pegar de volta o que sempre foi nosso de direito.\n";
        String mensagem3 = "\n- CHAT: HAHAHA, acho difícil, eu não vou deixar barato desta vez!\nO próximo desafio será mais difícil que os outros, pode ter certeza!";

        /*
         * fasterThreading(mensagem);
         * slowerThreading(mensagem1);
         * slowerThreading(mensagem2);
         * slowerThreading(mensagem3);
         */
    }

    public static void stageTree() {
        show.println("OLÁ! " + code_playerName + ", VOCÊ ESTÁ NO TERCEIRO ESTÁGIO");

        String mensagem = "Desafio 3 - ITANIUM\n";
        String mensagem1 = "- Louis: Você conseguiu, aprimorou suas habilidades e agora estamos muito\nperto de vencer essa inteligência artificial maldosa.\n";
        String mensagem2 = "- CHAT: Droga! Achei que vocês não passariam do desafio com BOOLEAN.\nMas pode deixar, eu não vou dar mole na próxima.\n";
        /*
         * fasterThreading(mensagem);
         * slowerThreading(mensagem1);
         * slowerThreading(mensagem2);
         */

        // desafio
    }

    public static void stageFour() {
        show.println("OLÁ! " + code_playerName + ", VOCÊ ESTÁ NO QUARTO ESTÁGIO");

        String mensagem = "- CHAT: Vamos vê se vocês são é realmente bons, quero vê se consegue resolver um desafio com ARRAY hahaha.\n";
        String mensagem1 = "\nDesafio 4 - QUARK SOC\n";
        String mensagem2 = "- LOUIS: Muito Bem! Está evoluindo e garanto que está pronto para me ajudar na última fase, com certeza iremos conseguir derrotar o CHAT!\n";

        /*
         * slowerThreading(mensagem);
         * fasterThreading(mensagem1);
         * slowerThreading(mensagem2);
         */

        // desafio

    }

    public static void stageFive() {
        show.println("OLÁ! " + code_playerName + ", VOCÊ ESTÁ NO QUINTO ESTÁGIO");

        String mensagem = "- CHAT: DÚVIDO, agora eu vou botar pra quebrar, esse último desafio não vai ter moleza!\n";
        String mensagem1 = "\n Desafio 5 - CORE\n";
        String mensagem2 = "LOUIS: Conseguimos! Vencemos o último desafio. Obrigado (nome do jogador), se não fosse você, eu não teria conseguido, agora, podemos retomar o controle da IA e garantir que ela seja usada para ajudar as pessoas,\nsem causar confusão ou dificuldades.\n";
        String mensagem3 = "CHAT: Surpreendente... Vocês realmente são excepcionais. Não esperava que chegassem tão longe. Mas tenham em mente que não sou o único. Outros desafios virão, e estarei pronto para enfrentá-los.";
        String mensagem4 = "LOUIS: Estamos preparados para o que vier. Com nossas habilidades e determinação, seremos capazes de superar qualquer desafio e garantir que a IA seja uma aliada, não uma ameaça. ";
        String mensagem5 = "E assim, Louis e (nome do jogador), como uma dupla extraordinária, conseguiram vencer o CHAT maligno e retomar o controle da IA.\nE juntos continuaram trabalhando para desenvolver projetos que ajudam as pessoas a compreenderem a programação, de forma clara e eficiente.\n";

        /*
         * slowerThreading(mensagem);
         * fasterThreading(mensagem1);
         * slowerThreading(mensagem2);
         * slowerThreading(mensagem3);
         * slowerThreading(mensagem4);
         * slowerThreading(mensagem4);
         * slowerThreading(mensagem5);
         */
    }

    // method to print with speed 0.1

    static void fasterThreading(String mensagem) {
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(mensagem.charAt(i));
            try {
                Thread.sleep(100); // Pausa por 0100 milissegundos (0,1 segundo)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // method to print with speed 0.001

    static void slowerThreading(String mensagem) {
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(mensagem.charAt(i));
            try {
                Thread.sleep(00100); // Pausa por 0100 milissegundos (0,001 segundo)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // game body ends here

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // menu configuration

    public static void gameMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n| - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - BEM VINDO AO CHATDEUPT - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - |");
        sb.append("\n| - |1|  NOVO JOGO ~ ~ ~ |2| CARREGAR JOGO ~ ~ ~  |3| TUTORIAL - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - |");
        sb.append("\n| -    ~ ~ ~ ~ |4| CRÉDITOS  ~ ~     ~ ~  |5| SAIR ~ ~ ~ ~     - |");
        sb.append("\n| - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - |");
        show.println(sb.toString());

        optionDecision();
    }

    public static void tutorial() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        sb.append("\n| - -  - - - - - - - -   TELA DE TUTORIAL  - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - |");
        sb.append("\n| - - - - - -  Pressione [M] para retornar ao MENU   - - - - - - |");
        sb.append("\n| - - - - - - - -    OU [E] para SAIR do jogo      - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - |");
        show.println(sb.toString());

        reviveMenu();
    }

    public static void credits() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - -  TELA DE CRÉDITOS  - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - |");
        sb.append("\n| - - - - - -  Pressione [M] para retornar ao MENU   - - - - - - |");
        sb.append("\n| - - - - - - - -    OU [E] para SAIR do jogo      - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - |");
        sb.append("\n| - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - |");
        show.println(sb.toString());

        reviveMenu();
    }

    public static void exit() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        sb.append("\n| - -  - - - -            JOGO FINALIZADO      - - - - - - - - - |");
        sb.append("\n| - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        show.println(sb.toString());
    }

    public static void optionDecision() {
        show.println("Digite o número correpondente à opção desejada: ");
        int option = sc.nextInt();

        switch (option) {
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
                show.println("Opção inválida! Tente novamente.");
                gameMenu();
                break;
        }
    }

    public static void reviveMenu() {
        show.println("Digite [M] para retornar ao menu ou [E] para sair do jogo.");
        char option = sc.next().toLowerCase().charAt(0);

        switch (option) {
            case 'm':
                gameMenu();
                break;
            case 'e':
                exit();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    /**
     * Creates a new game saving playes names and setting
     * stage to first and challenge to 1a.
     * 
     * 1a means that player didnt reach the challenge
     * 1b player already reached the challenge
     */
    public static void newGame() {
        show.println("Qual será seu nome? ");
        // new player info
        code_playerName = sc.next();
        String code_stageLevel = "first-stage";
        String code_challengeLevel = "1a";

        saveGame(code_playerName, code_stageLevel, code_challengeLevel);
        reviveMenu();
    }

    /**
     * Save game information and replace the cfg.json
     * 
     * IMPORTANT - method params must be the new stage, challenge levels.
     * code prefix means that data is on code and must be written on cfg
     * file prefix means that information will be saved on cfg
     * 
     * @param codeName
     * @param codeStage
     * @param codeChallenge
     */
    public static void saveGame(String codeName, String codeStage, String codeChallenge) {
        // setting file data
        String file_playerName = codeName;
        String file_challengeLevel = codeChallenge;

        String file_stageLevel = "";
        if (codeStage != null)
            file_stageLevel = codeStage;

        // preparing json data
        JSONObject json = new JSONObject();
        json.put("name", file_playerName);
        json.put("stage", file_stageLevel);
        json.put("challenge", file_challengeLevel);

        // saving file
        FileWriter writerFile = null;
        try {
            writerFile = new FileWriter("cfg.json");
            writerFile.write(json.toJSONString());
            writerFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Salvo com sucesso!");
        }
    }

    /*
     * Will load a game reading the file stage and file challenge
     */
    public static void loadGame() {
        JSONParser parser = new JSONParser();
        JSONObject json;

        String file_nameLoad = " ", file_stageLoad = "", file_challengeLoad = "";
        try {
            json = (JSONObject) parser.parse(new FileReader("cfg.json"));
            file_nameLoad = (String) json.get("name");
            file_stageLoad = (String) json.get("stage");
            file_challengeLoad = (String) json.get("challenge");
        } catch (Exception e) {
            e.printStackTrace();
        }
        verifyStage(file_stageLoad, file_challengeLoad);
    }

    /**
     * This method will read fileStage and fileChallenge,
     * verifying first file and then challenge.
     * 
     * @param fileStage
     * @param fileChallenge
     */
    public static void verifyStage(String fileStage, String fileChallenge) {
        if (fileStage.equals("first-stage")) {
            if (fileChallenge.equals("1a")) {
                stageOne();
            } else {
                firstChallenge();
            }
        } else if (fileStage.equals("second-stage")) {
            if (fileChallenge.equals("2a")) {
                stageTwo();
            } else {
                secondChallenge();
            }
        } else if (fileStage.equals("third-stage")) {
            if (fileChallenge.equals("3a")) {
                stageTree();
            } else {
                thirdChallenge();
            }
        } else if (fileStage.equals("fourth-stage")) {
            if (fileChallenge.equals("4a")) {
                stageFour();
            } else {
                fourthChallenge();
            }
        } else if (fileStage.equals("fifth-stage")) {
            if (fileChallenge.equals("5a")) {
                stageFive();
            } else {
                fifthChallenge();
            }
        }
    }

    // Pass the method to be tested and the object to invoke the method on
    public static boolean testPlayerCode(String[] challenge) {
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

            switch (challenge[2]) {
                case "countSheeps":
                    return counterTest(method, obj);
                case "fakeBinary":
                    return fakeBinaryTest(method, obj);
                case "setAlarm":
                    return alarmTest(method, obj);
                case "numToString":
                    return numTest(method, obj);
                case "sum":
                    return positiveTest(method, obj);
                case "reverseNumber":
                    return reverseTest(method, obj);
                case "stringToArray":
                    return stringToArrayTest(method, obj);
                default:
                    return false;
            }

            // Invoke the method
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

    // CHALLENGES STARTS HERE

    static void firstChallenge() {
        printHeading("primeiro desafio");
    }

    static void secondChallenge() {
        printHeading("segundo desafio");
    }

    static void thirdChallenge() {
        printHeading("terceiro desafio");
    }

    static void fourthChallenge() {
        printHeading("quarto desafio");
    }

    static void fifthChallenge() {
        printHeading("quinto desafio");
    }
}