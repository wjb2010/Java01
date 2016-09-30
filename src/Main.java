
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义一个变量
		// 变量类型 变量名 = 初值；
		int a = 0;

		// 变量类型；
		// 整数型（3，-10等）
		byte b = 10;
		short s = 20;
		int c = -5;
		long l = 100;
		// 浮点型（3.1，-10.5等）
		float f = 3.5f;
		double d = 5.5;
		// 文本型（'c',"abc"等）
		// char是字符类型，表示一个字符，使用单引号
		char cc = 'c';
		// String 是字符串类型，可以表示一个字符，也可表示多个
		// 用双引号标注
		String x = "aaa";

		// 变量命名规则 1：字母 数字 下划线 $
		// 数字不能做开头

		// 错误举例
		// int 3ab = 0;

		// 变量命名规则 2：1）不能重名 2）不能与关键字重名
		// int a = 0;
		int $a = 0;

		// 变量命名规则 3:见名知意
		int age = 5;

		// 变量命名规则 4:驼峰命名
		int studentAge = 45;
		int stuAge = 45;

		// "="作用是将右边的值赋值给左边
		a = 3;
		int bb = 5;
		a = bb;

		// 练习:交换两个整形变量的值
		// 1,定义两个整形变量
		int a1 = 3;
		int b1 = 5;

		// 2,交换两个变量值
		System.out.println(a1 + "  " + b1);

		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;

		System.out.println(a1 + "  " + b1);

		// 1除数不能为0
		// 2整数相除结果只取整数部分

		int a2 = 5;
		int b2 = 3;
		int ret = 0;

		ret = a2 / b2;

		System.out.println(ret);

		// a++

		int a3 = 0;
		int b3 = 0;
		// 相当于:
		// 1,b=a;
		// 2,a=a+1;
		b3 = a3++;
		System.out.println(b3);
		// ++a
		int a4 = 0;
		int b4 = 0;
		// 相当于:
		// 1,a=a+1;
		// 2,b=a;
		b4 = ++a4;

		System.out.println(b4);
		
		//定义变量初始值,规范
		int a5=0;
		
		
		
		
		
		
		
		

	}

}