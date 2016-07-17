package com.adfer.designpatterns.builder2;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.Executor;

import java.io.IOException;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class PhantomJsCommandMain {
    public static void main(String[] args) {
        CommandLine commandLine = CommandLine.parse("ping www.google.pl");
        String pathToScript = "rasterize.js";
        PhantomJsCommand command = new PhantomJsCommand.PhantomJsCommandBuilder(commandLine, pathToScript).build();

        Executor executor = new DefaultExecutor();
        try {
            executor.execute(commandLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
