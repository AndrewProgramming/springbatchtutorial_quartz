package com.zhiyueinfo.springbatchtutorial.springbatch.writer;
import java.util.List;
import org.springframework.batch.item.ItemWriter;
import com.zhiyueinfo.springbatchtutorial.springbatch.model.User;

public class MyWriter implements ItemWriter<User> {

	@Override
	public void write(List<? extends User> items) throws Exception {
		for(User user : items){
			System.out.println(user);
		}
	}

}
