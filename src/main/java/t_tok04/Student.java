package t_tok04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//InitializingBean = 초기화 빈 afterPropertiesSet 구현
//DisposableBean = 소멸 빈 destroy 구현
public class Student implements InitializingBean, DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//어노테이션으로 라이프 사이클 관리방법
	//초기화메소드
	@PostConstruct
	public void postConstruct() {
		if("스프링".equals(name)) {
			System.out.println(name+ "을 정말 열심히 하네요.");
		}else {
			System.out.println(name+"은 몇살인가요???");
		}
	}
	
	@PreDestroy
	public void PreDestroy() {
		if("스프링".equals(name)) {
			System.out.println("감사합니다 열심히 하겠습니다..");
		}else {
			System.out.println("나이는 비밀입니다.");
		}
	}
	
	//빈에서 관리
	//초기화 메소드
	public void init() {
		System.out.println(name +"은 학생인가요?");
	}
	//소멸 메소드
	public void cleanUp() {
	System.out.println(name +"은 학생이 아니었습니다.");
	}
	
	
	
	//인터페이스에서 관리
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean이 소멸될때 호출됩니다. 자원을 반납할 부분이 있다면 여기서 진행합니다.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean이 생성될때 호출됩니다. Bean 생성과  DI이후에 초기화 부분이 있다면 여기서 진행됩니다.");
	}
	
	// 실행 순서는 어노테이션 -> 인터페이스 구현 -> 빈에서 관리 순으로 실행된다.!!!!!!

}
