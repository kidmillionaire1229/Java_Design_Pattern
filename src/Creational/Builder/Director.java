package Creational.Builder;

/**
 * 자주 사용하는 객체의 조합을 함수에 구현
 * 함수 호출시 지정한 변수 조합 대로 객체 생성가능
 */
public class Director {
    public void makeSimpleHouse(Builder builder){
        builder.reset();
        builder.setRoofs(1);
    }

    public void makeComplexHouse(Builder builder){
        builder.reset();
        builder.setRoofs(4).setWalls(4).setWindows(4);
    }
}
