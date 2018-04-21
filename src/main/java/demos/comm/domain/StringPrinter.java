package demos.comm.domain;

public class StringPrinter implements Printer {
    private StringBuffer buffer = new StringBuffer();

    public void print(String message) {
        this.buffer.append(message);
    }
}
