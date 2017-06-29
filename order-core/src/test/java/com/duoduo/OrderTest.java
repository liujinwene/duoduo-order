package com.duoduo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.duoduo.base.core.CoreServerApp;
import com.duoduo.order.cmd.ListOrderCmd;
import com.duoduo.order.service.OrderService;
import com.duoduo.util.GsonUtil;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CoreServerApp.class, webEnvironment=WebEnvironment.RANDOM_PORT)
public class OrderTest {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void test() {
		ListOrderCmd cmd = new ListOrderCmd();
		cmd.setAccount("nxz467@sina.com");
		cmd.setFinalStatus("0");
		for(int i=1; i<=100; i++) {
			cmd.setPageNo(i);
			System.out.println(GsonUtil.toJson(orderService.listOrder(cmd)));
		}
	}

}
