package com.app;

import javazoom.jl.player.Player;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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

    static Scanner sc = new Scanner(System.in);
    static PrintStream show = System.out;

    // player info
    static String player_name = null;
    static String file_stage = null;
    static String player_stage = null;

    public static void main(String[] args) throws Exception {
        gameMenu();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // game body starts here

    public static void stageOne() {
        String mensagem = "Seja Bem-Vindo ao ChatDeuPT!\n";
        String mensagem1 = "Este jogo é sobre um desenvolvedor novato, chamado Louis Drop que é contratado por uma empresa grande no ramo de IA.\nSeu objetivo dentro da empresa é auxiliar no desenvolvimento de um grande projeto para ajudar as pessoas a entenderem assuntos\nrelacionados a programação, mais em específico, sobre interpretação de problemas e a sintaxe da linguagem Java.\n";
        String mensagem2 = "Após ser contratado por seu gestor, Louis começa a mostrar grande potencial para atuação no projeto da IA mais revolucionária\n do mercado. Após algum tempo fazendo análise sobre a implementação, Louis começou a perceber que até mesmo a IA que ele estava\najudando a desenvolver, começava a confundir seu propósito e dificultar a vida dos usuários. Essa descoberta o deixou alarmado, pois ele viu o monstro que estava criando. Determinado a corrigir essa situação, Louis decidiu tomar medidas imediatas.\n";
        String mensagem3 = "Para impedir que a IA tome vida própria, você terá que ajudar Louis a desenvolver alguns desafios, com o objetivo de assumir de volta o controle que está nas mãos do CHAT maligno.\n";
        String mensagem4 = "\nDesafio 1 - ATOM\n";
        String mensagem5 = "\nA batalha contra a IA maligna está apenas começando, mas com a sua ajuda e as habilidades de Louis como programador,\n com certeza iremos triunfar. Se prepare e esteja confiante de que, no final,\n a IA será domada e usada para ajudar as pessoas a compreender a programação, sem causar mais confusão e dificuldades.\n";

        Threading1(mensagem);

        Threading(mensagem1);

        Threading(mensagem2);

        Threading(mensagem3);

        Threading1(mensagem4);
        /*
         * desafio
         * desafio
         * desafio
         * desafio
         */

        Threading(mensagem5);

    }

    public static void stageTwo() {
        String mensagem = "Desafio 2 - CELERON";
        String mensagem1 = "Você está evoluindo, muito bem! ";
        String mensagem2 = "Louis se sente um pouco aliviado por ter você para auxiliá-lo, agora precisamos passar por mais uma etapa, só assim conseguiremos melhorar nossas habilidades e pegar de volta o que sempre foi nosso de direito.";
        String mensagem3 = "\n- CHAT: hahaha, acho difícil, eu não vou deixar barato desta vez! O próximo desafio será mais difícil que os outros, pode ter certeza! ";
    }

    public static void stageTree() {
        show.println("Você está no terceiro estágio!");
    }

    public static void stageFour() {
        show.println("Você está no quarto estágio!");
    }

    public static void stageFive() {
        show.println("Você está no quinto estágio!");
    }

     // method to print with speed 0.1

     static void Threading1(String mensagem) {
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(mensagem.charAt(i));
            try {
                Thread.sleep(100); // Pausa por 0100 milissegundos (0,1 segundo)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // method to print with speed 0.01

    static void Threading(String mensagem) {
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(mensagem.charAt(i));
            try {
                Thread.sleep(00100); // Pausa por 0100 milissegundos (0,01 segundo)
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

    public static void newGame() {
        show.println("Qual será seu nome? ");
        player_name = sc.next();
        player_stage = "first-stage";
        saveGame(player_name, player_stage);

        reviveMenu();
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
            System.out.println("Jogo salvo!");
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
            show.println("Carregamento concluído!");
        }
    }

    public static String testPlayerCode() {
        try {
            OutputStream os = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(os);
            PrintStream old = System.out;
            System.setOut(ps);

            // Compile the code
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            int compilationResult = compiler.run(null, null, null, "src/main/java/com/test/Counter.java");
            if (compilationResult != 0) {
                // Compilation failed
                System.setOut(old);
                ps.flush();
                String compilationErrorMessage = "Compilation failed with error code1: " + compilationResult;
                System.out.println(compilationErrorMessage);
                return compilationErrorMessage;
            }
            // Load the Counter class
            ClassLoader classLoader = App.class.getClassLoader();
            Class<?> cls = classLoader.loadClass("com.test.Counter");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method method = cls.getDeclaredMethod("countSheeps", Boolean[].class);

            // Invoke the method
            method.invoke(obj, (Object) array1);
            String result = Integer.toString((int) method.invoke(obj, (Object) array1));
            String result2 = Integer.toString((int) method.invoke(obj, (Object) array2));

            boolean test1 = result.contains("18");
            boolean test2 = result2.contains("17");

            System.setOut(old);
            ps.flush(); // Flush the PrintStream to ensure all captured output is written to the
                        // OutputStream
            System.out.println(os.toString());
            return test1 && test2 ? "Test passed" : "Test failed";
        } catch (Exception e) {
            e.printStackTrace();
            String error = e.getMessage();
            return error;
        }
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