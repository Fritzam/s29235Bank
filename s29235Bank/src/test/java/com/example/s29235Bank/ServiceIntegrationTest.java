package com.example.s29235Bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.swing.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ServiceIntegrationTest {

    @MockBean
    private ClientBase clientBase;

    @Autowired
    private Service service;

    @Test
    void ShouldTransferFromClient() {
        //GIVEN;
        clientBase.clientList.add(new Client(22456, 100));
        //WHEN
        service.transferFromClient(22456, 450);
        float clientBalance = clientBase.clientList.get(0).getAccountBalance();
        //THEN
        assertThat(clientBalance).isEqualTo(550);
    }
}
