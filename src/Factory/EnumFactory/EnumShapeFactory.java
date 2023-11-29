package Factory.EnumFactory;


public enum EnumShapeFactory {
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

    abstract protected Shape createShape();
}
