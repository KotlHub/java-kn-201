package step.learning.IOC;

import com.google.inject.AbstractModule;
import step.learning.IOC.services.hash.HashService;
import step.learning.IOC.services.hash.MD5HashService;

public class ConfigModule extends AbstractModule {
    @Override
    protected void configure()
    {
        bind(HashService.class).to(MD5HashService.class);
    }
}
