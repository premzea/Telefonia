package ui;
import java.util.Scanner;
import model.CompanyController;

public class Main {
    private Scanner sc;
    private CompanyController controller;

    public Main(){
        sc = new Scanner(System.in);
        controller = new CompanyController();
    }

    public static void main(String[] args){
        Main main = new Main();
        System.out.println("Start Application");
        // main.run();
    }

    public void calculateLocalPayment(){

    }
}
