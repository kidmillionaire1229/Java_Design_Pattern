## [Singleton Pattern](Singleton.md)

## [Factory Pattern](FactoryMethod/FactoryMethod.md)

## Abstract Factory Pattern

### 추상 팩토리 패턴이란? 
- 연관 있는 여러 객체(제품) 군(family)의 생성을 추상화한 생성 패턴 
- vs 팩토리 메서드 
  - 팩토리 메서드 : 단일 객체(제품)의 생성을 추상황 
  - 추상 팩토리 메서드 : 관련이 있는 여러 객체(제품)들의 일관된 생성을 추상화
- 연관 있는 제품군의 예시
![img.png](AbstractFactory/연관있는제품예시.png)
- {Chair, Sofa, CoffeeTable}에 대해 _**스타일 별로**_ 각 제품을 일관되게 생성할 필요가 있음 

### 구현
![img.png](AbstractFactory/구현.png)
- 새로운 스타일의 제품 군이 추가되더라도 기존의 코드를 바꾸지 않고 추가가능해야한다. 
- 제품 별로 인터페이스로 추상화 
  - Chair, sofa, CoffeeTable  
- ***모든 추상 제품***에 대한 생성 메소드를 가지는 팩토리로 추상화 
  - FurnitureFactory 
- 팩토리 인터페이스를 구현한 각 서브 팩토리에서는 일관된 스타일의 제품군이 생성될 수 있도록 생성 메소드를 구현 
  - VictorianFurnitureFactory, ModernFurnitureFactory 

 ### 구조
![img.png](AbstractFactory/structure.png)

### 장점 
- 클라이언트 코드와의 결합도 감소. 
  - 객체를 생성하는 코드를 분리
- 제품 군(family)을 쉽게 대체할 수 있다. 
- SRP, OCP를 준수 

### 단점 
- 코드 구조의 복잡성 증가 
  - 제품, 팩토리들의 구체 클래스를 모두 구현해줘야한다. 
- 새로운 제품 추가 시 모든 팩토리 구현 로직에 새로운 생성 함수 추가되어야한다. 
  - 새로운 Furniture 추가시 , createFurniture를 FurnitureFactory와 이를 구현한 구체 팩토리 클래스에 추가해야한다. 
## Builder Pattern

## Prototype Pattern 