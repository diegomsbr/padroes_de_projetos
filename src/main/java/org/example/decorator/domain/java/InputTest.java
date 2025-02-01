package org.example.decorator.domain.java;

import java.io.*;

public class InputTest {

    public static void main(String[] args)  {

        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("C:\\Users\\diego\\Documents\\Diego\\Estudo\\Projetos\\PadroesDeProjeto\\src\\main\\java\\org\\example\\decorator\\domain\\java\\test.txt")
                    )
            );

            while((c=in.read())>= 0){
                System.out.print((char) c);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
