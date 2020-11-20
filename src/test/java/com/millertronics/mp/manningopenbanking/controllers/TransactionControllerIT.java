package com.millertronics.mp.manningopenbanking.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import com.millertronics.mp.manningopenbanking.ManningOpenBankingApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ManningOpenBankingApplication.class })
@WebAppConfiguration
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TransactionControllerIT {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @BeforeAll
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders
            .webAppContextSetup(context)
            .build();
    }

    @Test
    public void transactionsByAccountNumberEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/transactions/account01"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
