package step.learning.IOC.services.random;

public interface RandomService {
    void  seed (String iv); // init vector
    String randomHex( int charLength);
}
