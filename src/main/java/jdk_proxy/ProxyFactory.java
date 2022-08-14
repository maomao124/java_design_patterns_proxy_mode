package jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Project name(项目名称)：java设计模式_代理模式
 * Package(包名): jdk_proxy
 * Class(类名): ProxyFactory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 22:08
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ProxyFactory
{
    TrainStation trainStation = new TrainStation();

    public SellTickets getProxy()
    {
        return (SellTickets) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), new Class[]{SellTickets.class}, new InvocationHandler()
        {
            @Override
            public Object invoke(Object proxy1, Method method, Object[] args) throws Throwable
            {
                if (method.getName().equals("sell"))
                {
                    System.out.println("代理点收取一些服务费用");
                    return method.invoke(trainStation, args);
                }
                else
                {
                    return method.invoke(trainStation, args);
                }
            }
        });
    }
}
