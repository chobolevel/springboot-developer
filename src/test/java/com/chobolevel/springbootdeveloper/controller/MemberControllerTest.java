//package com.chobolevel.springbootdeveloper.controller;
//
//import com.chobolevel.springbootdeveloper.entity.Member;
//import com.chobolevel.springbootdeveloper.repository.MemberRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//// 테스트용 애플리케이션 컨택스트 구성
//@SpringBootTest
//// MockMvc 생성 및 자동 구성
//@AutoConfigureMockMvc
//class MemberControllerTest {
//
//    @Autowired
//    protected MockMvc mockMvc;
//    @Autowired
//    private WebApplicationContext context;
//    @Autowired
//    private MemberRepository memberRepository;
//
//    @BeforeEach
//    public void mockMvcSetUp() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//    }
//
//    @AfterEach
//    public void cleanUp() {
//        memberRepository.deleteAll();
//    }
//
//    @DisplayName("getAllMembers: 아티클 조회에 성공한다.")
//    @Test
//    public void getAllMembers() throws Exception {
//        // given
//        final String url = "/api/v1/members";
//        Member saveMember = memberRepository.save(new Member(1L, "홍길동"));
//
//        // when
//        final ResultActions result = mockMvc.perform(get(url).accept(MediaType.APPLICATION_JSON));
//
//        // then
//        result
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].id").value(saveMember.getId()))
//                .andExpect(jsonPath("$[0].name").value(saveMember.getName()));
//    }
//
//}