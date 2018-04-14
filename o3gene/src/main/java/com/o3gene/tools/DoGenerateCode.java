package com.o3gene.tools;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DoGenerateCode {

	private static int width = 100;// 定义图片的width
	private static int height = 40;// 定义图片的height
	private static int codeCount = 4;// 定义图片上显示验证码的个数
	private static int fontHeight = 28;// 字高
	private static int xx = 15;// 字x轴位置
	private static int codeY = 30;// 字y轴位置
	private static char[] codeSequence = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
			.toCharArray();// 字库

	public static Map<String, Object> generateCodeAndPic() {

		// 定义图像buffer，即定义画纸
		BufferedImage buffImg = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		// Graphics2D gd = buffImg.createGraphics();
		// Graphics2D gd = (Graphics2D) buffImg.getGraphics();

		// 通过画纸获取一个画笔类
		Graphics gd = buffImg.getGraphics();

		// 将图像填充为白色
		gd.setColor(Color.WHITE);// 设置画笔颜色
		// 设置填充位置
		gd.fillRect(0, 0, width, height);

		// 创建字体，字体的大小应该根据图片的高度来定。
		Font font = new Font("Fixedsys", Font.ITALIC, fontHeight);
		gd.setFont(font);// 画笔设置字体。

		// 画边框。
		gd.setColor(Color.BLACK);// 设置画笔颜色
		gd.drawRect(0, 0, width - 1, height - 1);// 绘制边框

		// 得到随机类对象
		Random random = new Random();

		int red = 0, green = 0, blue = 0;

		// randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
		StringBuffer randomCode = new StringBuffer();

		// 随机产生codeCount数字的验证码。
		for (int i = 0; i < codeCount; i++) {
			// 得到随机产生的验证码字符。
			String code = String.valueOf(codeSequence[random.nextInt(36)]);

			// 用随机产生的颜色将验证码绘制到图像中。
			// 随机字符颜色
			red = random.nextInt(255);
			green = random.nextInt(255);
			blue = random.nextInt(255);
			gd.setColor(new Color(red, green, blue));// 设置画笔颜色
			gd.drawString(code, (i + 1) * xx, codeY);// 绘制字符

			// 将产生的四个随机数组合在一起 用于之后的验证
			randomCode.append(code);
		}

		// 绘制干扰线，随机40条干扰线，使图象中的认证码不易被其它程序探测到。
		for (int i = 0; i < 60; i++) {

			green = random.nextInt(255);
			blue = random.nextInt(255);
			gd.setColor(new Color(red, green, blue));// 设置画笔颜色

			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(30);
			int yl = random.nextInt(30);
			gd.drawLine(x, y, x + xl, y + yl);// 画线
		}

		// 获取map实例
		Map<String, Object> map = new HashMap<String, Object>();
		// 存放验证码
		map.put("code", randomCode);
		// 存放生成的验证码BufferedImage对象
		map.put("codePic", buffImg);
		return map;
	}
}
