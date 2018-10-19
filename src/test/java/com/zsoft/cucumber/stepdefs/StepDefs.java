package com.zsoft.cucumber.stepdefs;

import com.zsoft.ZsoftApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ZsoftApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
