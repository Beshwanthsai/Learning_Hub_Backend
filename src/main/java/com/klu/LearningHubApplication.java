@SpringBootApplication
public class LearningHubApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LearningHubApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningHubApplication.class, args);
    }
}
