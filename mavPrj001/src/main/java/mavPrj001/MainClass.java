package mavPrj001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
// 		TODO Auto-generated method stub
//		TransWalk transWalk = new TransWalk();
//		transWalk.move();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransWalk transWalk = ctx.getBean("tWalk",TransWalk.class);
		transWalk.move();
		
		ctx.close();
	}

}
