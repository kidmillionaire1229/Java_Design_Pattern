### composite pattern
<img width="533" alt="composite" src="https://github.com/kidmillionaire1229/Java_Design_Pattern/assets/101498204/635127ce-c059-40be-a4a5-de9184f609e9">

1. Component <br/>
   단일 객체인 Leaf와 복합 객체인 Composite 모두에 공통적인 작업을 설정한다.

2. Leaf<br/>
   트리에서의 기본 요소이며, 대부분의 실제 작업을 수행한다.

3. Composite<br/>
   Component를 자식으로 가지는 복합체이다.
   자식의 구체적인 클래스를 알지 못하며, Component 인터페이스를 통해 하위 객체들과 함께 작동한다.
   작업을 하위 요소인 Component에게 위임하며, 중간 결과물 처리 및 최종 결과를 Client에게 반환한다.

4. Client <br/>
   동일한 Component 인터페이스를 통해서 모든 요소들과 작동한다. 
  