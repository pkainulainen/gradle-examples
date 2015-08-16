package net.petrikainulainen.gradle.springboot;

import com.nitorcreations.junit.runners.NestedRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author Petri Kainulainen
 */
@RunWith(NestedRunner.class)
public class HelloWorldControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController())
                .build();
    }

    public class RenderHelloWorldView {

        @Test
        public void shouldReturnResponseStatusOk() throws Exception {
            mockMvc.perform(get("/"))
                    .andExpect(status().isOk());
        }

        @Test
        public void shouldRenderTheHelloWorldView() throws Exception {
            mockMvc.perform(get("/"))
                    .andExpect(view().name("index"));
        }
    }
}
