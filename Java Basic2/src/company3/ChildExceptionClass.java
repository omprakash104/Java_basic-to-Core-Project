package company3;

import java.io.IOException;

public class ChildExceptionClass extends  HumanExceptionClass{

    @Override
    public void showHumanHandCountChecked() throws IOException{
        System.out.println("child class called");
    }

    @Override
    public void showHumanHandCountUnChecked() throws ArithmeticException{
        System.out.println("child class called");
    }
}
