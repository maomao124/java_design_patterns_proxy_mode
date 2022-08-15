package cglib_proxy;

/**
 * Project name(项目名称)：java设计模式_代理模式
 * Package(包名): cglib_proxy
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 20:41
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation trainStation = proxyFactory.getProxyObject();
        trainStation.sell();
    }
}
