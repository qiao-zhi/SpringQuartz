package cn.qlq.quartz;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import cn.qlq.utils.HttpUtils;

/**
 * 定时任务每5分钟获取一次数据调用接口获取数据
 * 
 * @author Administrator
 *
 */
@Component("fetchData")
public class FetchDataJob {
	/**
	 * 获取数据的方法
	 */
	public void work() {
		Map<String, Object> params = new HashMap<String, Object>();
//		params.put(arg0, arg1)
		System.out.println(HttpUtils.doGetWithParams("http://www.cnblogs.com/qlqwjy/p/8723358.html", params));
		System.out.println("--------------------------------------------------");
	}
}
