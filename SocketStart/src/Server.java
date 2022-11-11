import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket socket = new ServerSocket(8088)){
            System.out.println("等待客户端链接中");
            System.out.println("地址为"+socket.getInetAddress().getHostAddress());
        }catch (IOException e){
            System.out.println("服务器链接失败");
            e.printStackTrace();
        }
    }
}
