package t_tok03;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

//Advice : 부가기능 담당. 로깅을 담당할 클래스
public class LoggingAdvice {
	
	public void beforeAdvice() {
		System.out.println("메소드 실행전에 로그를 선택합니다.");
	}
	
	public void beforeBuyConfirm() {
		System.out.println("구매전 아이템 확인은 필수입니다.");
	}
	
	public void afterAdvice() {
		System.out.println("구매해주셔서 감사합니다.");
	}
	
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		//추가로직
		Signature method = joinPoint.getSignature();
		System.out.println("$$$$$ 내가 실행한 메소드 :::: " + method.getName());
		//실행로직
		joinPoint.proceed();
		
		
		//추가로직
		if("buyGoods".equals(method.getName())) {
			System.out.println("Goods를 구매해 주셔서 감사합니다.");
		} else {
			System.out.println("Item 을 구매해 주셔서 감사합니다.");
		}

	}
	
	
}
