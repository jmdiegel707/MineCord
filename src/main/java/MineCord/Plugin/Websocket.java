//package MineCord.Plugin;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.net.SocketAddress;
//
//public class Websocket implements Runnable {
//    static ServerSocket server;
//    private static Socket clientsocket;
//    public static OutputStream client;
//    public static void EnableWS() throws IOException {
//        server = new ServerSocket(Main.Port);
//        Thread thread = new Thread(new Websocket());
//        thread.start();
//    }
//
//    public void run() {
//        try {
//            while (true) {
//                clientsocket = server.accept();
//                client = clientsocket.getOutputStream();
//                Main.server.getLogger().severe("[MineCord] Websocket Client connected");
//            }
//        } catch (IOException e) {
//            Main.server.getLogger().severe("[MineCord] Unable to connect to Websocket Client");
//        }
//    }
//}
//
//
