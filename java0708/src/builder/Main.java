package builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getTextResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getHTMLResult();
            System.out.println("HTML파일 " + filename + "이 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }

    // 사용 방법을 표시한다 
    public static void usage() {
        System.out.println("Usage: java Main text       텍스트로 문서 작성");
        System.out.println("Usage: java Main html       HTML 파일로 문서 작성");
    }
}
