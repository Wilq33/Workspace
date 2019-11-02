import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {

    public Calculator(){

      System.out.println("Calling constructor");

    }


    public void add() {

      System.out.println("Adding numbers");

    }

    public void sub() {

        System.out.println("Subtract numbers");

    }

    public void div() {

        System.out.println("Divide numbers");

    }

    public void mult() {

        System.out.println("Multiply numbers");

    }


    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.add();
        calc.div();
        calc.sub();
        calc.mult();

        new Calculator().add();
        new Calculator().sub();
        new Calculator().div();
        new Calculator().mult();

        FirefoxDriver driverF = new FirefoxDriver();
        ChromeDriver driverCH =  new ChromeDriver();
        driverF.get("http://way2automation.com");
        System.out.print("Test22");
        driverCH.get("http://way2automation.com");

    }

}
