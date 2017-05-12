package com.company;

import com.company.myexceptions.VerySeriousException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by adrian on 5/12/17.
 */
public class StringsConverter {

    public String uppcaseString(String source) throws VerySeriousException {

        if (!source.equals("dupa"))
            return source.toUpperCase();
        else
            throw new VerySeriousException(" (from uppcaseString) ...very very bad word !");
    }

    public String convertDocument() throws FileNotFoundException {
        File f = new File("C:\\Users\\RENT\\Desktop\\08.05.2017.txt");
        FileInputStream fileInputStream = new FileInputStream(f);
        return fileInputStream.toString().toUpperCase();
    }
}
