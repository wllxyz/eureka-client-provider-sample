package example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wll on 17-12-18.
 */
@RestController
public class Hello {

    private static Logger logger = LoggerFactory.getLogger(Hello.class);

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        logger.info("hello " + name);
        return "hello " + name;
    }
}
