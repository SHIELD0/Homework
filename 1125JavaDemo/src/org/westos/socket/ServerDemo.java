package org.westos.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.socket
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/28-18:56
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(104);
        Socket server = serverSocket.accept();
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("已连接".getBytes());
        InputStream inputStream = server.getInputStream();

        new Thread (new Runnable()  {
            @Override
            public void run() {
                byte[] buf = new byte[1024];
                int len = 0;
                try {
                    while ((len = inputStream.read(buf)) != -1) {
                        System.out.println(new String(buf, 0, len));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    e.getMessage();
                }

            }
        });
    }
}
