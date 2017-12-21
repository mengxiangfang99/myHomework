package com.neusoft.com.gongjulei;

public class Test5 {
	public static void main(String[] args) {
		String mail = "fadf.aiojf2@514.com";
		MailTest.testMail(mail);
	}
}

class MailTest{
	static void testMail(String mail) {
		boolean right = true;
		
		if(!(mail.contains("@") || mail.contains("."))) {
			System.out.println("不合法：不包含@后.");
			right = false;
		}else {
			if((mail.indexOf("@") != mail.lastIndexOf("@"))
					|| mail.indexOf(".") != mail.lastIndexOf(".")) {
				
				System.out.println("不合法：包含多个@或.");
				right = false;
			} 
			if(mail.indexOf(".") < mail.indexOf("@")) {
				System.out.println("不合法：.出现在@之前");
				right = false;
			}
			String mailName = mail.split("@")[0];
			char[] c = mailName.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if(!(Character.isDigit(c[i]) || Character.isLetter(c[i]))) {
					System.out.println("不合法：用户名中有其他字符");
					right = false;
					break;
				}
			}
		}
		
		if(right)
			System.out.println("合法邮箱");
	}
}
