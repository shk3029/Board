package demos.comm.domain.SpringBookEx2VO;

import demos.comm.domain.SpringBookEx2VO.Printer;

public class StringPrinter implements Printer {
    private StringBuffer buffer = new StringBuffer();

    public void print(String message) {
        this.buffer.append(message);
    }
}
