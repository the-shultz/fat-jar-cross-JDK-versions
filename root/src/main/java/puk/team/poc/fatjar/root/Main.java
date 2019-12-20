package puk.team.poc.fatjar.root;

import puk.team.fatjar.dep2.StringToFileProducer;
import puk.team.test.fatjar.dep1.Hello;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Hello hello = new Hello();
        System.out.println(hello.saySomething("world"));

        StringToFileProducer writer = new StringToFileProducer();
        Path fullPath = Paths.get("c:\\test.txt");
        writer.createFileWithDirectories(fullPath,"this is a test");
        System.out.println(writer.readFileContent(fullPath));
        writer.deletePathWhatsoever(fullPath);
    }
}
