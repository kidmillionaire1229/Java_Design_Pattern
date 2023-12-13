package Structural.Bridge.Implementation;

/**
 * Implementation
 * 모든 Concrete implementation에 대한 공통적인 인터페이스를 선언
 * [Concrete Implementation]
 * Device interface를 구현하여 플랫폼별 맞춤형 코드를 구체적으로 구현한다.
 */
public interface Device {
    void setVolume(int percent);
    int getVolume();
}
