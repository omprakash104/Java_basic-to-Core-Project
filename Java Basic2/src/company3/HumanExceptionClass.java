package company3;

import java.io.IOException;

public class HumanExceptionClass {

    private int hand = 1;

    public void showHumanHandCountChecked()  throws IOException {
        System.out.println(this.hand);
    }

    public void showHumanHandCountUnChecked() {
        System.out.println(this.hand);
    }
}
