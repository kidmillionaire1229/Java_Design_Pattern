## Singleton Pattern 
### 싱글톤 패턴이란? 
- 하나의 클래스가 오직 _**하나의 인스턴스만**_ 가질 수 있도록 하는 패턴 <br/><br/>
- 싱글톤 패턴이 사용되는 맥락 
  - 한 객체가 리소스를 많이 사용하는 경우 
  - 생성 시 시간이 오래 걸리거나 메모리를 많이 쓰는 경우 
  - 객체를 만들 때마다 리소스를 객체 수에 비례해서 사용하게 된다. 
  - 리소스 절약을 위하여 하나의 객체만 만들고 공유해서 쓸 수 있을까? <br/><br/>
- 사용 예시
  - DB 연결 (커넥션 풀), 파일, 스레드풀, 로깅 등 

### 싱글톤 패턴의 표현 
- 싱글톤 패턴은 단일 클래스에 대한 내용이기 때문에 클래스 다이어그램으로 클래스 하나로 간단하게 표현됨 <br/><br/>
   
- 오직 하나의 인스턴스만 가져야한다.<br/><br/>
  - 클래스 내부에서 객체를 만들어 공유해 사용한다. 
  - 생성자를 private으로 지정하여 클라이언트에서 생성자 접근 및 생성자로 객체 생성 제한
    - getInstance 메소드를 통해서 인스턴스를 접근
  - 생성된 객체를 static으로 선언하여 공유
### 싱글톤 패턴의 구현
#### Lazy Initialization
- 실제로 인스턴스를 써야하는 시점에 lazy하게 생성된다. 
- 객체가 사용되지 않는 상황이라면 불필요하게 메모리를 차지 하지 않는다. <br/><br/>
- 문제점 
  - 멀티 스레드 환경에서 여러 인스턴스가 존재할 수 있음. 
    - non thread-safe
      - getInstance() 메소드의 if문에서 동기화 문제 발생 
        - Thread A가 if문을 진입한 상황, new는 아직 수행 안된 상황
        - Thread B가 if문 진입하여, instance가 null임을 확인하여 진입
        - Thread A와 B모두 각자 객체를 생성하여 싱글톤 개념에 위배될 수 있다. 
    
#### Thread-safe Initialization 
- synchronized 키워드 사용하여 한 번에 하나의 thread만 들어오게 제한
  - thread - safe 해짐 
  - synchronization으로 인한 추가적인 overhead 
  
#### Eager Initialization
- 미리 상수 (constant)로 만들어 두고 사용함 
- static final 사용하여 
  - 프로그램 로딩 시점에 객체를 만들어 초기화 한다. 
- 객체 생성 비용이 크다면 당장 사용하지 않을 때 공간을 차지하는 문제 존재
#### Double Checked Locking 
- Lazy 방식으로 생성하고 싶은데 매번 동기화를 하지 않기 위해서, 최초 초기화 할 때만 동기화 수행함 
  - 장점 
    - Lazy initialization이 가능하고 동기화 부담이 적음 
    - 상대적으로 복잡한 코드 구현 
#### Lazy Holder (Bill Pugh's solution)
- 클래스 안에 내부 static 클래스 (holder) 을 두는 방식 
- 내부 클래스는 외부 클래스가 초기화 될 때 메모리에 아직 로딩되지 않음
- 외부 클래스의 getInstance를 호출 시, 내부 클래스가 초기화 되어 객체를 생성하여 초기화한다. <br/><br/>
- 장점 
  - Lazy initialization 
  - thread-safe 
  - 간결한 코드 
- 단점 
  - 클라이언트가 임의로 싱글톤을 파괴 가능 
    - 직렬화 문제 
#### Enum method 
- private으로 선언하여 한 번만 초기화하여 thread-safe하다. 
- 상수 뿐 아니라 변수/메서드 선언에도 사용 가능하다. 
  - 싱글톤 클래스 처럼 사용 가능하다. 

- 단점 
  - 선언하는 순간 Enum 클래스로 인해 생성되어 Lazy하지 않다. 
  - 상속 구현이 불가능함. 


