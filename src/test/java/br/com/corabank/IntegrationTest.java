package br.com.corabank;

import com.fasterxml.jackson.databind.ObjectMapper;
import corabank.Account;
import corabank.CorabankApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {CorabankApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class IntegrationTest {

@Autowired
private ObjectMapper objectMapper;

@Autowired
private MockMvc mvc;

@Test
public void startContext() {
}

@Test
public void deveSalvarUmaContaNova() throws Exception {
    // Salva uma nova conta
    Account postParameter = new Account();
    postParameter.setId(1);
    postParameter.setName("Teste");
    postParameter.setActive(true);
    postParameter.setBalance(10d);

    ResultActions resultActions = mvc.perform(
        get("/corabank")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(postParameter))
    );

    resultActions.andExpect(status().isOk())
        .andExpect(content().string("Teste"));
}
}