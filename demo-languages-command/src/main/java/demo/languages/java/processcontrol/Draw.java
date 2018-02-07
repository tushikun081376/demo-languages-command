package demo.languages.java.processcontrol;
/**
 * 把需要打印的菱形放在一个正方形里面，控制台打印出一个a*a的区域，
 * 找出菱形边所在的函数，逢边上的点打印"*"，其他点打印" "。
 */
public class Draw {
	int a, b; // a是要生成的菱形行数
	int h; // h是方法中的参数，也是行数
	int i, j; // i j是循环结构参数

	public void draw(int h) {
		for (i = 1; i <= h; i++) { // 逐行打印
			for (j = 1; j <= h; j++) { // 每行打印个数与行数保持一致
				// 下面语句是菱形四条边的函数，在边上的坐标点，打印*，否则打印空格
				if (j == (h + 3) / 2 - i 
					|| j == (h - 1) / 2 + i
					|| j == i - (h - 1) / 2 
					|| j == (3 * h + 1) / 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // 第 i 行打印完换行
		}
	}

	public static void main(String[] args) { // 静态方法
		Draw b = new Draw(); // 初始化方法
		int a = 35; // 赋值并执行draw方法
		b.draw(a);
	}
}
