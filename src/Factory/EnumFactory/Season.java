package Factory.EnumFactory;

public enum Season {

    SPRING("봄"),
    SUMMER("여름"),
    FALL("가을"),
    WINTER("겨울");

    private String season;

    //싱글톤 패턴을 적용하여 생성자는 private
    private Season(String season){
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}
