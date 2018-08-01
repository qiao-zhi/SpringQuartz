package cn.qlq.quartz;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstScheduledJob extends QuartzJobBean{
     private SecondBean secondBean;
     public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		//可以获取JobDetail的标识信息
		JobKey key = arg0.getJobDetail().getKey();
		System.out.println("job key:"+"name\t"+key.getName());
		System.out.println("job key:"+"group\t"+key.getGroup());
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("FirstScheduledJob Executes!" + sf.format(date));
		this.secondBean.printMessage();		
	}
}
