package com.example.s29235Bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ClientBaseUnitTest {

    private ClientBase clientBase;

    @BeforeEach
    void startUp() {
        clientBase = new ClientBase();
    }

    @AfterEach
    void cleanUp() {
        clientBase.purgeList();
    }

    @Test
    void shouldBeValid() {
        boolean valid = clientBase.checkValidBalance(1000);
        assertThat(valid).isTrue();
    }

    @Test
    void shouldNotBeValid() {
        boolean notValid = clientBase.checkValidBalance(-120);
        assertThat(notValid).isFalse();
    }
}
