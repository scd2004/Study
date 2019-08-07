package t_tok02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
////		WhitePhone wp=new WhitePhone();
////		wp.show();
////		
////		BlackPhone bp = new BlackPhone();
////		bp.show();
////		
////		
////		//생성자 주입 방법
////		Battery newBattery = new Battery("새로 산 배터리");
////		bp.setBattery(newBattery);
////		bp.show();
////		
////		//세터 주입법
////		newBattery.setName("새로산 배터리 - 세터");
////		bp.setBattery(newBattery);
////		bp.show();
//		
//		//스프링 이용한 방법
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BlackPhone newBp = (BlackPhone)context.getBean("blackPhone");
		newBp.show();
		
	}
	
	
	
	
}
