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
			System.out.println("���Ϸ���������@��.");
			right = false;
		}else {
			if((mail.indexOf("@") != mail.lastIndexOf("@"))
					|| mail.indexOf(".") != mail.lastIndexOf(".")) {
				
				System.out.println("���Ϸ����������@��.");
				right = false;
			} 
			if(mail.indexOf(".") < mail.indexOf("@")) {
				System.out.println("���Ϸ���.������@֮ǰ");
				right = false;
			}
			String mailName = mail.split("@")[0];
			char[] c = mailName.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if(!(Character.isDigit(c[i]) || Character.isLetter(c[i]))) {
					System.out.println("���Ϸ����û������������ַ�");
					right = false;
					break;
				}
			}
		}
		
		if(right)
			System.out.println("�Ϸ�����");
	}
}
