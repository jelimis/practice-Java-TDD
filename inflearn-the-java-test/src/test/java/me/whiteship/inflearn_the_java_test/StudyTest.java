package me.whiteship.inflearn_the_java_test;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
    @EnabledOnOs({OS.MAC, OS.LINUX})
    @EnabledOnJre({JRE.JAVA_8})
    void create(){
        String test_env = System.getenv("TEST_ENV");
        assumeTrue("LOCAl".equalsIgnoreCase(test_env));
        Study study = new Study();
        assertNotNull(study);
        // 기대하는 값, 실제 값, 메세지
        assertEquals(StudyStatus.DRAFT, study.getStatus(), ()->"스터디를 처음 만들면 상태값이 DRAFT");
    }

    @Test
    void create1(){

        Study study = new Study();
        assertNotNull(study);
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
}