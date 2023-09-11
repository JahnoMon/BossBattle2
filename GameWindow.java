import javax.swing.JFrame;

public class GameWindow extends JFrame{
    GameWindow(){

        this.add(new GamePanel());
        this.setTittle("Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelative(null);
    }
}
