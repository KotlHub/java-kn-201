package step.learning.IOC;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import step.learning.IOC.services.hash.HashService;
import step.learning.IOC.services.hash.MD5HashService;
import step.learning.IOC.services.hash.SHA256;
import step.learning.IOC.services.random.RandomService;
import step.learning.IOC.services.random.RandomServiceV1;

public class ConfigModule extends AbstractModule {
    // освновной метод, в котором производятся настройки служб
    @Override
    protected void configure(){
        bind(HashService.class).to(MD5HashService.class);
        bind(HashService.class).annotatedWith(Names.named("Hash256")).to(SHA256.class);
        bind(HashService.class).annotatedWith(Names.named("Digest-Hash")).to(MD5HashService.class);
        bind(HashService.class).annotatedWith(Names.named("DSA-Hash")).to(SHA256.class);
    }
    private  RandomService randomService;
    @Provides
    private RandomService injectRandomService(){
        if(randomService == null){
            randomService = new RandomServiceV1();
            randomService.seed("0");
        }
        return  randomService;
    }
}
