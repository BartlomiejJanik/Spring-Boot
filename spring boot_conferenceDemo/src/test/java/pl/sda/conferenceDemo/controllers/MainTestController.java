package pl.sda.conferenceDemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:appTest.properties")
public class MainTestController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldGetMessageFromRestEndpoint() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/rest"))
                .andDo(print()).andExpect(MockMvcResultMatchers.content()
                .string("{message:\"Hello Spring Boot\"}"));
    }

    @Test
    public void shouldAddSpeakerToDB() throws Exception {
        String body = "{\"id\":1,\"firstName\":\"Eustachy\",\"lastName\":\"Motyka\"}";
        String responseBody = this.mockMvc.perform(MockMvcRequestBuilders.post("/rest/saveSpeaker")
                .contentType("application/json").content(body))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);
    }
}
