import java.io.IOException;

public class peerProcess {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Runtime.getRuntime().exec("touch test");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Hello from the other side\n. Listening at port "+args);
    }
}
