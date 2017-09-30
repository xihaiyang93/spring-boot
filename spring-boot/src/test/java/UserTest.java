import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demo.springboot.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		/*List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		user.setCreateDate(new Date());
		list.add(user);
		
		user = new User();
		user.setId(2);
		user.setName("王五");
		user.setCreateDate(new Date());
		list.add(user);
		
		Query q = new Query();
		
		try {
			q.parse("select * from "+list.get(0).getClass().getName()+" where id = :id");
			q.setVariable("id", 2);
			List<User> listResult =  q.execute(list).getResults();
			for (int i = 0; i < listResult.size(); i++) {
				System.out.println(listResult.get(i).getName());
			}
		} catch (QueryParseException e) {
			e.printStackTrace();
		} catch (QueryExecutionException e) {
			e.printStackTrace();
		}
		q.setVariable("fromCurrency", 2);*/
		
	
	}

}
