## Adapter Pattern
### 어댑터 패턴이란? 
- 호완성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들을 어댑터를 통해 함께 작동할 수 있도록 변환 
  - 이미 구축 되어있는 것을 새로운 어떤 것에 사용하려고 할 때, 양 쪽간의 호환성 유지해주기 위해 
### 객체 어댑터 구조 
![img.png](Structural/Adapter/ObjectAdapter.png)
- Client interface 
  - 다른 클래스들이 클라이언트 코드와 공동 작업 시, 해당 프로토콜을 따라야함
  - Client interface 통해서 메소드가 호출되어야함 

- Service 
  - 일반적으로 타사 또는 레거시의 유용한 클래스 
  - Client에서 직접 호출이 불가능하다. 
  - 이를 호출하기 위해 아래의 Adapter을 이용 
- Adapter
  - 클라이언트와 서비스 양쪽에 대해 동작할 수 있는 코드 
  - Service를 주입 받아 Client 대신 호출 
    - Adapter는 Client를 구현한다. 
      - Client의 메소드를 오버라이딩 한다. 
      - 주입 받은 Service의 메소드를 호출하여 작업을 위임한다.
      - Client의 규약을 따르되, Client에서 직접 Service를 호출하지 않고, Adapter를 통해서 호출하게 된다. 
### 클래스 어댑터 구조 
![img.png](Structural/Adapter/ClassAdapter.png)
- 객체 어댑터 구조에서 Service를 주입 받아 수행한 것과 달리, _**Adapter에서 Service를 상속하여**_, Adapter에서 Service 호출 
- 다중 상속을 지원하는 C++같은 언어에서 활용 가능하다. 
  - 자바 소스코드에서는 다중 상속이 불가능하므로 다음과 같이 구현한다. 
    - Client interface는 구현 (implements)
    - Service Class는 상속 (extends)
### 사용 시기
- 새로운 인터페이스가 레거시와 호환이 되지 않을 때 
- 이미 만든 것을 재사용하고자 하나, 수정은 하고 싶지 않을 때 
- 소프트웨어 구 버전과 신 버전을 공존 시키고 싶을 때 
### 예시 
![img.png](Structural/Adapter/AdapterExample.png)
### 장점 
- SRP 준수 
  - 프로그램의 기본 비즈니스 로직에서 ***인터페이스를 분리***할 수 있다. 
- OCP 준수 
  - 기존 클래스 코드를 건들지 않고, _**클라이언트 인터페이스를 통해**_ 어댑터와 작동
- 추가로 필요한 메소드가 있으면 어댑터로 빠르게 구현 가능 
  - 버그가 발생해도 기존의 클래스에는 버그가 없으므로 어댑터만 중점적으로 조사 

### 단점 
- _**새로운 인터페이스와 어댑터를 함께**_ 도입해야 해서 복잡성이 증가  
- 때로는 서비스 (adaptee) 클래스를 변경하는 것이 간단할 수도 있음 
## Bridge Pattern 

### composite pattern

<img width="533" alt="composite" src="https://github.com/kidmillionaire1229/Java_Design_Pattern/assets/101498204/635127ce-c059-40be-a4a5-de9184f609e9">


### Decorator Pattern 

### Facade Pattern 

### Flyweight Pattern 

### Proxy Pattern 