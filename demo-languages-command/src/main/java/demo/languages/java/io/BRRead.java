package demo.languages.java.io;

import java.io.*;
import java.util.Scanner;

public class BRRead {
	// 使用 BufferedReader 在控制台读取字符
	public static void main(String args[]) throws IOException {
		char c;
		// 使用 System.in 创建 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符, 遇到 'q' 键退出。");
		// 读取字符
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}
	
}
