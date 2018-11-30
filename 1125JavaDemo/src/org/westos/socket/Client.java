package org.westos.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @PROJECT_NAME:Homework
 * @PACKAGE_NAME:org.westos.socket
 * @DESCRIPTION:TODO
 * @AUTHOR:S.H.I.E.L.D.
 * @CREATE_TIME:2018/11/28-18:41
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1024);
        Scanner scanner = new Scanner(System.in);
        OutputStream outputStream = socket.getOutputStream();
        while (scanner.hasNext()) {
            outputStream.write(scanner.next().getBytes());
        }
        byte[] buf = new byte[1024];
        int len = 0;
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len , "utf-8"));
        }
    }
}
