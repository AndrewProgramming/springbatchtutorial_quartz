package com.zhiyueinfo.springbatchtutorial.springbatch.processor;
import org.springframework.batch.item.ItemProcessor;
import com.zhiyueinfo.springbatchtutorial.springbatch.model.User;

public class MyProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User item) throws Exception {
		if (Integer.parseInt(item.getAge()) % 2 == 0) {
			return item;
		}
		return null;
	}

}
