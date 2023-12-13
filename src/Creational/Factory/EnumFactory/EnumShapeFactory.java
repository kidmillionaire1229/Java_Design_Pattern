package Creational.Factory.EnumFactory;


public enum EnumShapeFactory {
    //enum 클래스의 추상 메소드를 구현
    RECTANGLE{
        @Override
        public Shape createShape(){
            return new Rectangle();
        }
    },
    CIRCLE{
        @Override
        public Shape createShape(){
            return new Circle();
        }
    };

    public Shape create(String color){
        Shape shape = createShape();
        shape.setColor(color);
        return shape;
    }

    //enum은 기본 추상클래스이므로, 추상 메소드 추가 가능
    abstract protected Shape createShape();
}
