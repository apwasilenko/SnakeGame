import javax.swing.*;

public class MainWindows extends JFrame{
    public MainWindows(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindows mv = new MainWindows();
    }

}
