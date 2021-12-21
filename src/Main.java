import java.io.*;
import scanner.CompilerScanner;
import parser.CodeGen;
import parser.Parser;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputCoolFilePath = "";
        String outputFilePath = "";
        String tablePath = "";
        if (args.length >= 6) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("--input")) {
                    inputCoolFilePath = args[i + 1];
                }
                if (args[i].equals("--output")) {
                    outputFilePath = args[i + 1];
                }
                if (args[i].equals("--table")) {
                    tablePath = args[i + 1];
                }
            }
        } else {
            System.out.println("Run like below:\njava <javaClassFile> --input <inputCoolFilePath> --output <outputFilePath> --table <tablePath>");
            return;
        }

        try {
            CompilerScanner scanner = new CompilerScanner(new FileReader(inputCoolFilePath));
            CodeGen codeGen = new CodeGen();
            Parser parser = new Parser(scanner, codeGen, "src/parser/table.npt");
            parser.parse();

            FileWriter myWriter = new FileWriter(outputFilePath);
            myWriter.write("Syntax is correct!");
            myWriter.close();

        } catch (Exception e) {
            FileWriter myWriter = new FileWriter(outputFilePath);
            myWriter.write("Syntax is wrong!");
            myWriter.close();
            //System.err.println(e);
        }

    }
}