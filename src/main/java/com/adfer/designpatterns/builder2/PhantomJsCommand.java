package com.adfer.designpatterns.builder2;

import org.apache.commons.exec.CommandLine;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class PhantomJsCommand {

    private final CommandLine commandLine;
    private final String pathToScript;
    private String scriptArguments;

    private PhantomJsCommand(PhantomJsCommandBuilder builder) {
        this.commandLine = builder.commandLine;
        this.pathToScript = builder.pathToScript;
        this.scriptArguments = builder.scriptArguments;
    }

    public CommandLine getCommandLine() {
        return commandLine;
    }

    public String getPathToScript() {
        return pathToScript;
    }

    public String getScriptArguments() {
        return scriptArguments;
    }

    public static class PhantomJsCommandBuilder {
        private final CommandLine commandLine;
        private final String pathToScript;
        private String scriptArguments;

        public PhantomJsCommandBuilder(CommandLine commandLine, String pathToScript) {
            this.commandLine = commandLine;
            this.pathToScript = pathToScript;
        }

        public PhantomJsCommandBuilder scriptArguments(String scriptArguments) {
            this.scriptArguments = scriptArguments;
            return this;
        }

        public PhantomJsCommand build() {
            return new PhantomJsCommand(this);
        }
    }
}
