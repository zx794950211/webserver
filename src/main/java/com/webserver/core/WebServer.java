package com.webserver.core;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer����
 * 
 * WebServer��ģ��Tomcatʵ�ֵ�һ��Web����
 * 
 * Web��������Ҫְ���ǹ������²���Ķ��webapp
 * ����ͨ��TCPЭ����HTTPЭ�����ͻ��˽������ӣ�
 * ʹ���û�����ͨ���ͻ���(ͨ���������)������
 * �������Ӳ�����webapp�еĹ���
 * 
 * һ��Webapp��Ϊһ������Ӧ�ã�����Ҫ����������
 * ��:��ҳ���زģ��߼�����(java����)�����Լ򵥵�
 * ���Ϊһ��"��վ"����һ��������Web�����ϵ�һ��
 * webapp.
 * 
 * 
 * TCPЭ��:�Ǵ��ڴ�����Э�飬��������̨�����
 * ֮�䴫������ʹ��
 * 
 * HTTPЭ��:����Ӧ�ò��Э�飬����涨��̨�����
 * ֮���Ӧ�ý����ʹ������ݵ����ݣ���ʽ�ȶ��塣
 * 
 * @author ta
 *
 */
public class WebServer {
	private ServerSocket server;
	/**
	 * ���췽����������ʼ�������
	 */
	public WebServer() {
		try {
			System.out.println("�������������...");
			server = new ServerSocket(8088);
			System.out.println("������������!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ����˿�ʼ�����ķ���
	 */
	public void start() {
		try {
			System.out.println("�ȴ��ͻ�������...");
			Socket socket = server.accept();
			System.out.println("һ���ͻ���������!");
			
			InputStream in = socket.getInputStream();
			int d = -1;
			while((d = in.read())!=-1) {
				System.out.print((char)d);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WebServer server = new WebServer();
		server.start();
	}
}









