package selenium;
import java.io.IOException;
public class RunWindowApplication {
	public static void main(String[] args) throws IOException {
		//here we are calling window application :: calculator.exe
		Runtime r= Runtime.getRuntime();
		r.exec("D:\\calc.exe");
	}
}
