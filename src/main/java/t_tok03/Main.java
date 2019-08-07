package t_tok03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			ItemTarget itemtarget = (ItemTarget)context.getBean("itemTarget");
			itemtarget.selectItem();
			System.out.println();
			itemtarget.buyItem();
			System.out.println();
			itemtarget.buyItems();
			
			System.out.println();
			
			GoodsTarget goodsTarget = (GoodsTarget)context.getBean("goodsTarget");
			goodsTarget.buyGoods();
	}

}
