package org.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class CustomWebApplicationServer {
    private final int port;


    public CustomWebApplicationServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println(port);

            Socket clientSocket;
            
            while((clientSocket = serverSocket.accept()) != null) {
                // null 이 아니기 때문에 while문 안으로 들어옴
                System.out.println("클라이언트와 연결됨!");

                try(InputStream in = clientSocket.getInputStream(); OutputStream out = clientSocket.getOutputStream()) {
                    DataOutputStream dos = new DataOutputStream(out);

                    String line;
                    
                }
            }
        }
    }
}
