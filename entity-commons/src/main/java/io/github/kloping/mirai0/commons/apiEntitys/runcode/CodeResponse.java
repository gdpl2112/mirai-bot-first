package io.github.kloping.mirai0.commons.apiEntitys.runcode;

public class CodeResponse {
    private String stdout;
    private String error;
    private String stderr;

    public String getStdout() {
        return this.stdout;
    }

    public CodeResponse setStdout(String stdout) {
        this.stdout = stdout;
        return this;
    }

    public String getError() {
        return this.error;
    }

    public CodeResponse setError(String error) {
        this.error = error;
        return this;
    }

    public String getStderr() {
        return this.stderr;
    }

    public CodeResponse setStderr(String stderr) {
        this.stderr = stderr;
        return this;
    }
}