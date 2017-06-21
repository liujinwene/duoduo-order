package com.duoduo;

import org.jooq.DSLContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.duoduo.base.core.CoreServerApp;
import com.duoduo.schema.tables.records.ConfigurationRecord;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CoreServerApp.class, webEnvironment=WebEnvironment.RANDOM_PORT)
public class CommonTest {
	
	@Autowired
	private DSLContext dslContext;
	
	@Test
	public void createTest() {
		ConfigurationRecord record = new ConfigurationRecord();
		record.setName("test");
		record.setValue("123");
		dslContext.executeInsert(record);
	}

}
