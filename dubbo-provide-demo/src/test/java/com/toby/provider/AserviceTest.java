package com.toby.provider;


import com.toby.api.dto.HelloDTO;
import com.toby.provider.service.AService;
import com.toby.provider.service.BService;
import com.toby.provider.util.ValidationUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AserviceTest {

    @Autowired
    private AService aService;

    @Autowired
    private BService bService;
    @Test
    public void testBService(){
        HelloDTO helloDTO = new HelloDTO();
        bService.insertUser(helloDTO);
    }
    @Test
    public void testInsertUser() throws Exception {
        HelloDTO helloDTO = new HelloDTO();
        aService.insertUser(helloDTO);
    }

    @Test
    public void testValidationUtils() throws Exception {
        HelloDTO helloDTO = new HelloDTO();
        ValidationUtils.validate(helloDTO);
    }

}
