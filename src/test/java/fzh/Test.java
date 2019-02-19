package fzh;

import redis.clients.jedis.Jedis;

public class Test {

	@org.junit.Test
	public void testRedis()throws Exception {
		Jedis jedis=new Jedis("120.24.90.162",6379);
		jedis.set("fzh", "����ţ12121211111111");
		String string = jedis.get("fzh");
		System.out.println("String ="+string);
		jedis.close();
	}
	
}
